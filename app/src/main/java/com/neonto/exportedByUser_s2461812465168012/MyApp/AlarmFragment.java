/*
*/

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.util.*;
import android.view.*;
import android.webkit.WebView;
import android.widget.*;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.neonto.exportedByUser_s2461812465168012.MyApp.R;

public class AlarmFragment extends Fragment {

    private AlarmBackgroundShapeView mBackgroundShape;
    private ImageButton mIconButton;
    private ListView mList;
    private AlarmListAdapter mListAdapter;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public AlarmFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_alarm, container, false);
                
        mBackgroundShape = (AlarmBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mList = (ListView) rootView.findViewById(R.id.mList);
        final AlarmFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mIconButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SetAlarmActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        
        final AlarmListAdapter alarmListAdapter = new AlarmListAdapter(this);
        alarmListAdapter.setDataSheet(AppData.alarmSaveDataSheet);
        mList.setAdapter(alarmListAdapter);
        mListAdapter = alarmListAdapter;
        
        AppData.alarmSaveDataSheet.addListener(new DataSheet.OnChangeListener() {
           @Override
           public void dataSheetUpdated(DataSheet sheet) {
               alarmListAdapter.notifyDataSetChanged();
           }
        });

        
        try {
            Bundle bundle = getActivity().getIntent().getExtras();
            final DataSheet dataSheet = AppData.getDataSheetByName(bundle.getString("dataSheetName"));
            final int dataSheetRowIndex = bundle.getInt("dataSheetRowIndex");
            takeValuesFromDataSheet(dataSheet, dataSheetRowIndex);
        } catch (Exception e) {}
        
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                repositionElements();
            }
        });
        
        setHasOptionsMenu(true);
        
        return rootView;
    }

    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        
        ActionBar actionBar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
    }

    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        
        final View rootView = getView();
        if (rootView != null) {
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    if (android.os.Build.VERSION.SDK_INT >= 16) {
                        rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    repositionElements();
                }
            });
        }
    }

    public void takeValuesFromDataSheet(DataSheet dataSheet, int rowIndex) {
        HashMap<String, HashMap<String, Object>> row = dataSheet.getRows().get(rowIndex);
        HashMap<String, Object> val;
        
        // Clear pending listeners that were waiting data for the previous values.
        for (AppData.OnLoadingDrawableFinishedListener listener : mPendingLoadImageListeners) {
            mDataSheet.invalidateLoadImageListener(listener);
        }
        mPendingLoadImageListeners = new ArrayList<>();
        
        {
            val = row.get("list");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("json") && (value instanceof org.json.JSONArray)) {
                    DataSheet sheet = new DataSheet(getActivity(), getClass().getSimpleName());
                
                    sheet.takeRowsFromJSONArray((org.json.JSONArray) value);
                
                    ((AlarmListAdapter) mList.getAdapter()).setDataSheet(sheet);
                    ((AlarmListAdapter) mList.getAdapter()).notifyDataSetChanged();
                }
            }
        }
        
        mDataSheet = dataSheet;
        mDataSheetRowIndex = rowIndex;
    }

    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    public void setOverrideElementLayoutDescriptors(HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> d)
    {
        mOverrideElementLayoutDescriptors = d;
        repositionElements();
    }

    private static LayoutDesc layoutDescInListForFormat(List<LayoutDesc> layoutDescs, int format) {
        for (LayoutDesc ld : layoutDescs) {
            if (ld.format == format)
                return ld;
        }
        return null;
    }

    private void applyLayoutToView(View v, DisplayMetrics dm, List<LayoutDesc> layoutDescs, boolean affectW, boolean affectH) {
        int winW = dm.widthPixels;
        int winH = dm.heightPixels;
        int dpi = dm.densityDpi;
        boolean isPortrait = winH > winW;

        LayoutDesc ld = null;
        float scale = 1.0f;
        float verticalScale = 1.0f;
        float flowOffset = 0.0f;
        if (isPortrait) {
            if (winW > 768 && dpi < 320 && (ld = layoutDescInListForFormat(layoutDescs, 12)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1080.0f;
                verticalScale = winH / 1920.0f;
                flowOffset = -125.0f;
            } else if (winW > 480 && (ld = layoutDescInListForFormat(layoutDescs, 10)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 720.0f;
                verticalScale = winH / 1280.0f;
                flowOffset = -109.0f;
            } else if (winW > 240 && (ld = layoutDescInListForFormat(layoutDescs, 8)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 480.0f;
                verticalScale = winH / 800.0f;
                flowOffset = -92.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 2);
                scale = winW / 240.0f;
                verticalScale = winH / 320.0f;
                flowOffset = -76.0f;
            }
        } else {
            if (winW > 1280 && (ld = layoutDescInListForFormat(layoutDescs, 11)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1920.0f;
                verticalScale = winH / 1080.0f;
                flowOffset = -125.0f;
            } else if (winW > 800.0 && (ld = layoutDescInListForFormat(layoutDescs, 9)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 1280.0f;
                verticalScale = winH / 720.0f;
                flowOffset = -109.0f;
            } else if (winW > 320.0 && (ld = layoutDescInListForFormat(layoutDescs, 7)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 800.0f;
                verticalScale = winH / 480.0f;
                flowOffset = -92.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 1);
                scale = winW / 320.0f;
                verticalScale = winH / 240.0f;
                flowOffset = -76.0f;
            }
        }
        if (ld == null) {
            Log.d("Fragment", String.format("could not find suitable layout for view %d, window %d*%d", v.getId(), winW, winH));
            return;
        }

        int lx = (int) (ld.x * scale);
        int lt = (ld.t != LayoutDesc.NO_VALUE) ? (int) (ld.t * scale) : -1;
        if (ld.offsetToHorizontalKeylineT != LayoutDesc.NO_VALUE) {
            lt = (int)((ld.t + ld.offsetToHorizontalKeylineT) * verticalScale - ld.offsetToHorizontalKeylineT * scale);
        }
        int lb = (ld.b != LayoutDesc.NO_VALUE) ? (int) (ld.b * scale) : -1;
        if (ld.offsetToHorizontalKeylineB != LayoutDesc.NO_VALUE) {
            lb = (int)((ld.b - ld.offsetToHorizontalKeylineB) * verticalScale + ld.offsetToHorizontalKeylineB * scale);
        }
        int lw = (int) (ld.w * scale);
        int lh = 0;
        if (lt != -1 && lb != -1) {
            // determine height dynamically if it's aligned from both
            // top and bottom
            lh = winH - lb - lt;
        } else {
            if (affectH) {
                lh = (int) (ld.h * scale);
            } else {
                // ensure we are using proper value for layout calculations with dynamically updatable views (e.g. expanding text element)
                v.measure(View.MeasureSpec.makeMeasureSpec(lw, View.MeasureSpec.EXACTLY), View.MeasureSpec.UNSPECIFIED);
                lh = v.getMeasuredHeight();
            }
        }

        if (v.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = lt;
            lp.bottomMargin = lb;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        } else if (v.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = (int) ld.offsetInFlow;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        } else if (v.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) v.getLayoutParams();
            lp.topMargin = lt;
            lp.bottomMargin = lb;
            lp.leftMargin = lx;
            if (affectW) {
                lp.width = lw;
            }
            if (affectH) {
                lp.height = lh;
            }
            v.setLayoutParams(lp);
        }

        Method m = null;
        try {
            m = v.getClass().getMethod("applyLayoutAndContentTransform", Integer.TYPE, Integer.TYPE, String.class, Float.TYPE);
        } catch (Exception e) {
            // doesn't implement this method, we can safely ignore this exception
        }
        if (m != null) {
            try {
                m.invoke(v, lw, lh, ld.contentTransformMatricesString, scale);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void repositionElements() {
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        
        View rootView = getView();
        if (rootView != null) {
            // use actual layout dimensions if available.
            if (rootView.getWidth() > 0) dm.widthPixels = rootView.getWidth();
            if (rootView.getHeight() > 0) dm.heightPixels = rootView.getHeight();
        }
        
        ArrayList<LayoutDesc> layoutDescs_mBackgroundShape = new ArrayList<LayoutDesc>();
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, -157.0f, 0.0f, 720.0f, 1437.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, -80.0f, 0.0f, 240.0f, 400.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, -185.0f, 0.0f, 1080.0f, 2105.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, -151.0f, 0.0f, 480.0f, 951.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackgroundShape = mOverrideElementLayoutDescriptors.get("backgroundShape");
            if (override_mBackgroundShape != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackgroundShape.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackgroundShape = layoutDescs;
                }
            }
        }
        applyLayoutToView(mBackgroundShape, dm, layoutDescs_mBackgroundShape, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 309.0f, 992.6f, LayoutDesc.NO_VALUE, 102.01f, 102.01f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 98.0f, 243.2f, LayoutDesc.NO_VALUE, 44.34f, 44.34f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 476.0f, 1494.0f, LayoutDesc.NO_VALUE, 128.66f, 128.66f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 204.0f, 618.2f, LayoutDesc.NO_VALUE, 72.34f, 72.34f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton = mOverrideElementLayoutDescriptors.get("iconButton");
            if (override_mIconButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mIconButton, dm, layoutDescs_mIconButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mList = new ArrayList<LayoutDesc>();
        layoutDescs_mList.add(new LayoutDesc(10, 0.0f, 58.55f, 285.45f, 720.0f, 936.0f));  // 720*1280 px
        layoutDescs_mList.add(new LayoutDesc(2, 0.0f, -6.4f, 75.4f, 240.0f, 251.0f));  // 240*320 px
        layoutDescs_mList.add(new LayoutDesc(12, 0.0f, 109.5f, 424.5f, 1080.0f, 1386.0f));  // 1080*1920 px
        layoutDescs_mList.add(new LayoutDesc(8, 0.0f, 27.35f, 180.65f, 480.0f, 592.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mList = mOverrideElementLayoutDescriptors.get("list");
            if (override_mList != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mList.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mList = layoutDescs;
                }
            }
        }
        layoutDescs_mList.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mList.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mList.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mList.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mList, dm, layoutDescs_mList, true, true);
        if (mOverrideElementLayoutDescriptors != null) {
            mListAdapter.setOverrideElementLayoutDescriptors((HashMap) mOverrideElementLayoutDescriptors.get("list_contentOverrides"));
        }

    }

}

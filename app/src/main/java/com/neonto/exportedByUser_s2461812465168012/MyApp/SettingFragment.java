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

public class SettingFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private SettingBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private SettingRectangleView mRectangle;
    private SettingRectangleCopyView mRectangleCopy;
    private SettingRectangleCopy2View mRectangleCopy2;
    private Button mStopwatch_TimerSettingsButton;
    private Button mAlarmSettingsButton;
    private Button mGeneralSettingsButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public SettingFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
                
        mBackgroundShape = (SettingBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mRectangle = (SettingRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (SettingRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (SettingRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mStopwatch_TimerSettingsButton = (Button) rootView.findViewById(R.id.mStopwatch_TimerSettingsButton);
        mAlarmSettingsButton = (Button) rootView.findViewById(R.id.mAlarmSettingsButton);
        mGeneralSettingsButton = (Button) rootView.findViewById(R.id.mGeneralSettingsButton);
        final SettingFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_setting_text_327992", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_setting_text2_956996", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_setting_text3_223855", ""));

        
        mStopwatch_TimerSettingsButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), StopWatchTimerSettingsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        
        mAlarmSettingsButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AlarmSettingActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        
        mGeneralSettingsButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GeneralSettingActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
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
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon715937);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                getActivity().finish();
                return true;
        }
        return false;
    }

    public void updateLocalizedValues() {
        // needs to be run on UI thread
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_setting_text_327992", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_setting_text2_956996", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_setting_text3_223855", ""));
                }
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        
        AppData.localizationSheetDataSheet.removeListener(mLocalizationSheetChangeListener);
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
            val = row.get("text");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText.setText((String) value);
                    mDataSheetUpdatedElems.add(mText);
                }
            }
        }
        {
            val = row.get("text 2");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText2.setText((String) value);
                    mDataSheetUpdatedElems.add(mText2);
                }
            }
        }
        {
            val = row.get("text 3");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText3.setText((String) value);
                    mDataSheetUpdatedElems.add(mText3);
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
            // determine height dynamically if it's aligned from both top and bottom
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

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 22.0f, 54.81f, LayoutDesc.NO_VALUE, 698.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 7.0f, -6.08f, LayoutDesc.NO_VALUE, 233.0f, 38.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 32.0f, 104.9f, LayoutDesc.NO_VALUE, 1048.0f, 98.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 14.0f, 26.17f, LayoutDesc.NO_VALUE, 466.0f, 58.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        layoutDescs_mText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 22.0f, 184.14f, LayoutDesc.NO_VALUE, 698.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 7.0f, 28.48f, LayoutDesc.NO_VALUE, 233.0f, 38.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 32.0f, 296.6f, LayoutDesc.NO_VALUE, 1048.0f, 98.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 14.0f, 107.98f, LayoutDesc.NO_VALUE, 466.0f, 58.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        layoutDescs_mText2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 22.0f, 313.47f, LayoutDesc.NO_VALUE, 698.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 7.0f, 63.04f, LayoutDesc.NO_VALUE, 233.0f, 38.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 32.0f, 488.3f, LayoutDesc.NO_VALUE, 1048.0f, 98.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 14.0f, 189.79f, LayoutDesc.NO_VALUE, 466.0f, 58.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        layoutDescs_mText3.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 159.14f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 20.48f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 258.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 90.98f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle = mOverrideElementLayoutDescriptors.get("rectangle");
            if (override_mRectangle != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangle, dm, layoutDescs_mRectangle, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 288.47f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 55.04f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 450.3f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 172.79f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy = mOverrideElementLayoutDescriptors.get("rectangleCopy");
            if (override_mRectangleCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy, dm, layoutDescs_mRectangleCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 417.8f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 89.6f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 642.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 254.6f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy2 = mOverrideElementLayoutDescriptors.get("rectangleCopy2");
            if (override_mRectangleCopy2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy2 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy2.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy2, dm, layoutDescs_mRectangleCopy2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStopwatch_TimerSettingsButton = new ArrayList<LayoutDesc>();
        layoutDescs_mStopwatch_TimerSettingsButton.add(new LayoutDesc(10, 0.0f, 288.47f, 861.2f, 720.0f, 130.33f));  // 720*1280 px
        layoutDescs_mStopwatch_TimerSettingsButton.add(new LayoutDesc(2, 0.0f, 55.04f, 229.4f, 240.0f, 35.56f));  // 240*320 px
        layoutDescs_mStopwatch_TimerSettingsButton.add(new LayoutDesc(12, 0.0f, 450.3f, 1277.0f, 1080.0f, 192.7f));  // 1080*1920 px
        layoutDescs_mStopwatch_TimerSettingsButton.add(new LayoutDesc(8, 0.0f, 172.79f, 544.4f, 480.0f, 82.81f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStopwatch_TimerSettingsButton = mOverrideElementLayoutDescriptors.get("stopwatch_TimerSettingsButton");
            if (override_mStopwatch_TimerSettingsButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStopwatch_TimerSettingsButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStopwatch_TimerSettingsButton = layoutDescs;
                }
            }
        }
        layoutDescs_mStopwatch_TimerSettingsButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatch_TimerSettingsButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mStopwatch_TimerSettingsButton, dm, layoutDescs_mStopwatch_TimerSettingsButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmSettingsButton = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmSettingsButton.add(new LayoutDesc(10, 0.0f, 159.14f, 990.53f, 720.0f, 130.33f));  // 720*1280 px
        layoutDescs_mAlarmSettingsButton.add(new LayoutDesc(2, 0.0f, 20.48f, 263.96f, 240.0f, 35.56f));  // 240*320 px
        layoutDescs_mAlarmSettingsButton.add(new LayoutDesc(12, 0.0f, 258.6f, 1468.7f, 1080.0f, 192.7f));  // 1080*1920 px
        layoutDescs_mAlarmSettingsButton.add(new LayoutDesc(8, 0.0f, 90.98f, 626.21f, 480.0f, 82.81f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmSettingsButton = mOverrideElementLayoutDescriptors.get("alarmSettingsButton");
            if (override_mAlarmSettingsButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmSettingsButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmSettingsButton = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmSettingsButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmSettingsButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mAlarmSettingsButton, dm, layoutDescs_mAlarmSettingsButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mGeneralSettingsButton = new ArrayList<LayoutDesc>();
        layoutDescs_mGeneralSettingsButton.add(new LayoutDesc(10, 0.0f, 29.81f, 1119.86f, 720.0f, 130.33f));  // 720*1280 px
        layoutDescs_mGeneralSettingsButton.add(new LayoutDesc(2, 0.0f, -14.08f, 298.52f, 240.0f, 35.56f));  // 240*320 px
        layoutDescs_mGeneralSettingsButton.add(new LayoutDesc(12, 0.0f, 66.9f, 1660.4f, 1080.0f, 192.7f));  // 1080*1920 px
        layoutDescs_mGeneralSettingsButton.add(new LayoutDesc(8, 0.0f, 9.17f, 708.02f, 480.0f, 82.81f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mGeneralSettingsButton = mOverrideElementLayoutDescriptors.get("generalSettingsButton");
            if (override_mGeneralSettingsButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mGeneralSettingsButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mGeneralSettingsButton = layoutDescs;
                }
            }
        }
        layoutDescs_mGeneralSettingsButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGeneralSettingsButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mGeneralSettingsButton, dm, layoutDescs_mGeneralSettingsButton, true, true);

    }

    private static void applyFadeMaskToTextView(final TextView textView) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (android.os.Build.VERSION.SDK_INT >= 16) {
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    textView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                
                if (textView.getLineCount() * textView.getLineHeight() > textView.getHeight()) {
                    ViewGroup.LayoutParams lp = textView.getLayoutParams();
                    android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0, lp.height * 0.5f, 0, lp.height,
                            new int[]{textView.getPaint().getColor(), android.graphics.Color.TRANSPARENT},
                            null, android.graphics.Shader.TileMode.CLAMP);
                    textView.getPaint().setShader(linearGradient);
                }
            }
        });
    }

}

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

import com.neonto.exportedByUser_s2461812465168012.MyApp.R;

public class StopWatchListItemView extends FrameLayout implements AdapterView {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private StopWatchListItemBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private TextView mText2;
    private TextView mTextCopy;
    private StopWatchListItemRectangleView mRectangle;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();
    private OnContentChangeListener mOnContentChangeListener;
    private Fragment mOwner;
    
    public StopWatchListItemView(Fragment owner) {
        super(owner.getActivity());
        mOwner = owner;
        init();
    }
    
    public Activity getActivity() {
        return (Activity) getContext();
    }
    
    public FragmentManager getFragmentManager() {
        return getActivity().getFragmentManager();
    }
    
    public View getView() {
        return getChildAt(0);
    }
    
    public void init() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        addView(createView(inflater, this, null));
    }

    public View createView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.view_stop_watch_list_item, container, false);
                
        mBackgroundShape = (StopWatchListItemBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mTextCopy = (TextView) rootView.findViewById(R.id.mTextCopy);
        mRectangle = (StopWatchListItemRectangleView) rootView.findViewById(R.id.mRectangle);

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_stencil4_text_881267", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_stencil4_text2_692563", ""));

        
        mTextCopy.setText(AppData.getLocalizedString("neonto_stencil4_text2_137876", ""));

        
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
        
        return rootView;
    }

    public void updateLocalizedValues() {
        // needs to be run on UI thread
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_stencil4_text_881267", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_stencil4_text2_692563", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTextCopy)) {
                    mTextCopy.setText(AppData.getLocalizedString("neonto_stencil4_text2_137876", ""));
                }
            }
        });
    }

    public void onDestroy() {
        
        AppData.localizationSheetDataSheet.removeListener(mLocalizationSheetChangeListener);
    }

    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        
        repositionElements();
    }

    public void sizeToFitContentHeight() {
        // Intentionally left empty.
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
            val = row.get("LapNo");
            if (val == null) val = row.get("lapno");  // check lowercase version too
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
            val = row.get("TotalTime");
            if (val == null) val = row.get("totaltime");  // check lowercase version too
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
            val = row.get("IntervalTime");
            if (val == null) val = row.get("intervaltime");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTextCopy.setText((String) value);
                    mDataSheetUpdatedElems.add(mTextCopy);
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
        
        View rootView = getChildAt(0);
        int layoutH = rootView.getLayoutParams().height;

        LayoutDesc ld = null;
        float scale = 1.0f;
        float verticalScale = 1.0f;
        float flowOffset = 0.0f;
        if (isPortrait) {
            if (winW > 768 && dpi < 320 && (ld = layoutDescInListForFormat(layoutDescs, 12)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1080.0f;
                verticalScale = winH / 1920.0f;
                flowOffset = 0.0f;
            } else if (winW > 480 && (ld = layoutDescInListForFormat(layoutDescs, 10)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 720.0f;
                verticalScale = winH / 1280.0f;
                flowOffset = 0.0f;
            } else if (winW > 240 && (ld = layoutDescInListForFormat(layoutDescs, 8)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 480.0f;
                verticalScale = winH / 800.0f;
                flowOffset = 0.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 2);
                scale = winW / 240.0f;
                verticalScale = winH / 320.0f;
                flowOffset = 0.0f;
            }
        } else {
            if (winW > 1280 && (ld = layoutDescInListForFormat(layoutDescs, 11)) != null) {
                // use layout 'large phone FullHD'
                scale = winW / 1920.0f;
                verticalScale = winH / 1080.0f;
                flowOffset = 0.0f;
            } else if (winW > 800.0 && (ld = layoutDescInListForFormat(layoutDescs, 9)) != null) {
                // use layout 'mid-size phone 720p'
                scale = winW / 1280.0f;
                verticalScale = winH / 720.0f;
                flowOffset = 0.0f;
            } else if (winW > 320.0 && (ld = layoutDescInListForFormat(layoutDescs, 7)) != null) {
                // use layout 'mid-size phone 480p'
                scale = winW / 800.0f;
                verticalScale = winH / 480.0f;
                flowOffset = 0.0f;
            } else {
                // use layout 'small phone 240p'
                ld = layoutDescInListForFormat(layoutDescs, 1);
                scale = winW / 320.0f;
                verticalScale = winH / 240.0f;
                flowOffset = 0.0f;
            }
        }
        if (ld == null) {
            Log.d("Fragment", String.format("could not find suitable layout for view %d, window %d*%d", v.getId(), winW, winH));
            return;
        }

        int lx = (int) (ld.x * scale);
        int lt = (ld.t != LayoutDesc.NO_VALUE) ? (int) (ld.t * scale) : -1;
        int lb = (ld.b != LayoutDesc.NO_VALUE) ? (int) (ld.b * scale) : -1;
        int lw = (int) (ld.w * scale);
        int lh = 0;
        if (lt != -1 && lb != -1) {
            // determine height dynamically if it's aligned from both top and bottom
            lh = layoutH - lb - lt;
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
        
        ArrayList<LayoutDesc> layoutDescs_mBackgroundShape = new ArrayList<LayoutDesc>();
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 216.0f, 96.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 94.0f, 42.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 273.0f, 121.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 153.0f, 68.0f));  // 480*800 px
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
        layoutDescs_mText.add(new LayoutDesc(10, 4.0f, 0.0f, LayoutDesc.NO_VALUE, 127.51f, 58.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 2.0f, 0.0f, LayoutDesc.NO_VALUE, 55.42f, 29.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 5.0f, 0.0f, LayoutDesc.NO_VALUE, 160.83f, 71.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 3.0f, 0.0f, LayoutDesc.NO_VALUE, 90.42f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText = mOverrideElementLayoutDescriptors.get("text");
            if (override_mText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText, dm, layoutDescs_mText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 128.0f, 0.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 55.0f, 0.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 161.0f, 0.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 90.0f, 0.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText2 = mOverrideElementLayoutDescriptors.get("text2");
            if (override_mText2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText2 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTextCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mTextCopy.add(new LayoutDesc(10, -39.02f, 0.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs_mTextCopy.add(new LayoutDesc(2, -16.84f, 0.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs_mTextCopy.add(new LayoutDesc(12, -48.65f, 0.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs_mTextCopy.add(new LayoutDesc(8, -27.85f, 0.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTextCopy = mOverrideElementLayoutDescriptors.get("textCopy");
            if (override_mTextCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTextCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTextCopy = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTextCopy, dm, layoutDescs_mTextCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 60.0f, LayoutDesc.NO_VALUE, 216.0f, 2.13f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 26.0f, LayoutDesc.NO_VALUE, 94.0f, 0.92f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 75.0f, LayoutDesc.NO_VALUE, 273.0f, 2.68f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 42.0f, LayoutDesc.NO_VALUE, 153.0f, 1.51f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle = mOverrideElementLayoutDescriptors.get("rectangle");
            if (override_mRectangle != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle = layoutDescs;
                }
            }
        }
        applyLayoutToView(mRectangle, dm, layoutDescs_mRectangle, true, true);

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

    public void setOnContentChangeListener(OnContentChangeListener l) {
        mOnContentChangeListener = l;
    }

}

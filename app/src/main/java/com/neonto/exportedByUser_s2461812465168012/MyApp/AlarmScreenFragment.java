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

public class AlarmScreenFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private AlarmScreenImageView mImage;
    private Button mBackButton;
    private Button mDimissButton;
    private Button mSnoozeButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public AlarmScreenFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_alarm_screen, container, false);
                
        mImage = (AlarmScreenImageView) rootView.findViewById(R.id.mImage);
        mBackButton = (Button) rootView.findViewById(R.id.mBackButton);
        mDimissButton = (Button) rootView.findViewById(R.id.mDimissButton);
        mSnoozeButton = (Button) rootView.findViewById(R.id.mSnoozeButton);

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mBackButton.setText(AppData.getLocalizedString("neonto_alarmscreen_backbutton_303634", ""));
        mBackButton.setTransformationMethod(null);

        
        mDimissButton.setText(AppData.getLocalizedString("neonto_alarmscreen_button_9392", ""));
        mDimissButton.setTransformationMethod(null);

        
        mSnoozeButton.setText(AppData.getLocalizedString("neonto_alarmscreen_button2_271395", ""));
        mSnoozeButton.setTransformationMethod(null);

        
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
                if ( !mDataSheetUpdatedElems.contains(mBackButton)) {
                    mBackButton.setText(AppData.getLocalizedString("neonto_alarmscreen_backbutton_303634", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mDimissButton)) {
                    mDimissButton.setText(AppData.getLocalizedString("neonto_alarmscreen_button_9392", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSnoozeButton)) {
                    mSnoozeButton.setText(AppData.getLocalizedString("neonto_alarmscreen_button2_271395", ""));
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
            val = row.get("image");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("image")) {
                    String url = (String) value;
                    final boolean isWebUrl = url.startsWith("http");
                    mImage.setVisibility((isWebUrl) ? View.INVISIBLE : View.VISIBLE);  // Prevent flash of old content when loading from a web url
                    AppData.OnLoadingDrawableFinishedListener listener = new AppData.OnLoadingDrawableFinishedListener() {
                        @Override
                        public void onLoadingDrawableFinished(Drawable d, boolean isAsync) {
                            mImage.setImageDrawable(d);
                            if (getView() != null) {  // prevent if layout is not ready yet (i.e. when called from onCreateView()).
                                repositionElements();
                            }
                            if (isWebUrl) {
                                mImage.setVisibility(View.VISIBLE);
                            }
                            mPendingLoadImageListeners.remove(this);
                        }
                    };
                    mPendingLoadImageListeners.add(listener);
                    dataSheet.loadImage("image", rowIndex, listener);
                } else {
                    mImage.setImageDrawable(null);
                }
            }
        }
        {
            val = row.get("back button");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mBackButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mBackButton);
                }
            }
        }
        {
            val = row.get("DimissButton");
            if (val == null) val = row.get("dimissbutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mDimissButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mDimissButton);
                }
            }
        }
        {
            val = row.get("SnoozeButton");
            if (val == null) val = row.get("snoozebutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSnoozeButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mSnoozeButton);
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
        
        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 1280.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 320.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 1920.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 800.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.812698413, 0.0, 0.0, 0.812698413, -66.666666667, 0.0]; [0.812698413, 0.0, 0.0, 0.812698413, -66.666666667, 0.0]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.228571429, 0.0, 0.0, 0.228571429, 0.0, -20.0]; [0.228571429, 0.0, 0.0, 0.228571429, 0.0, -20.0]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[1.219047619, 0.0, 0.0, 1.219047619, -100.0, 0.0]; [1.219047619, 0.0, 0.0, 1.219047619, -100.0, 0.0]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.507936508, 0.0, 0.0, 0.507936508, -26.666666667, 0.0]; [0.507936508, 0.0, 0.0, 0.507936508, -26.666666667, 0.0]";
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton.add(new LayoutDesc(10, 232.0f, 576.0f, LayoutDesc.NO_VALUE, 255.02f, 127.51f));  // 720*1280 px
        layoutDescs_mBackButton.add(new LayoutDesc(2, 65.0f, 144.0f, LayoutDesc.NO_VALUE, 110.84f, 55.42f));  // 240*320 px
        layoutDescs_mBackButton.add(new LayoutDesc(12, 379.0f, 864.0f, LayoutDesc.NO_VALUE, 321.65f, 160.83f));  // 1080*1920 px
        layoutDescs_mBackButton.add(new LayoutDesc(8, 150.0f, 360.0f, LayoutDesc.NO_VALUE, 180.85f, 90.42f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton = mOverrideElementLayoutDescriptors.get("backButton");
            if (override_mBackButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton, dm, layoutDescs_mBackButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDimissButton = new ArrayList<LayoutDesc>();
        layoutDescs_mDimissButton.add(new LayoutDesc(10, 254.0f, 896.0f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mDimissButton.add(new LayoutDesc(2, 74.0f, 224.0f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mDimissButton.add(new LayoutDesc(12, 406.0f, 1344.0f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mDimissButton.add(new LayoutDesc(8, 165.0f, 560.0f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDimissButton = mOverrideElementLayoutDescriptors.get("dimissButton");
            if (override_mDimissButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDimissButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDimissButton = layoutDescs;
                }
            }
        }
        layoutDescs_mDimissButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDimissButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDimissButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDimissButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mDimissButton, dm, layoutDescs_mDimissButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSnoozeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSnoozeButton.add(new LayoutDesc(10, 254.0f, 1024.0f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mSnoozeButton.add(new LayoutDesc(2, 74.0f, 256.0f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mSnoozeButton.add(new LayoutDesc(12, 406.0f, 1536.0f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mSnoozeButton.add(new LayoutDesc(8, 165.0f, 640.0f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSnoozeButton = mOverrideElementLayoutDescriptors.get("snoozeButton");
            if (override_mSnoozeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSnoozeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSnoozeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSnoozeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSnoozeButton, dm, layoutDescs_mSnoozeButton, true, true);

    }

}

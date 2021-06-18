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

public class ContactUsFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private ContactUsBackgroundShapeView mBackgroundShape;
    private TextView mText2;
    private EditText mField;
    private EditText mTextarea;
    private TextView mText;
    private Button mButton;
    private ContactUsRectangle2View mRectangle2;
    private ContactUsRectangle3View mRectangle3;
    private ContactUsRectangleView mRectangle;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public ContactUsFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);
                
        mBackgroundShape = (ContactUsBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mField = (EditText) rootView.findViewById(R.id.mField);
        mTextarea = (EditText) rootView.findViewById(R.id.mTextarea);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        mRectangle2 = (ContactUsRectangle2View) rootView.findViewById(R.id.mRectangle2);
        mRectangle3 = (ContactUsRectangle3View) rootView.findViewById(R.id.mRectangle3);
        mRectangle = (ContactUsRectangleView) rootView.findViewById(R.id.mRectangle);

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText2.setText(AppData.getLocalizedString("neonto_contactus_text2_1047847", ""));

        
        mField.setBackgroundColor(android.graphics.Color.WHITE);

        
        mTextarea.setBackgroundColor(android.graphics.Color.WHITE);

        
        mText.setText(AppData.getLocalizedString("neonto_contactus_text_834729", ""));

        
        mButton.setText(AppData.getLocalizedString("neonto_contactus_button_1043061", ""));
        mButton.setTransformationMethod(null);

        
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon78880);
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
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_contactus_text2_1047847", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_contactus_text_834729", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mButton)) {
                    mButton.setText(AppData.getLocalizedString("neonto_contactus_button_1043061", ""));
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
            val = row.get("field");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mField.setText((String) value);
                }
            }
        }
        {
            val = row.get("textarea");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTextarea.setText((String) value);
                }
            }
        }
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
            val = row.get("button");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mButton);
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

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 14.0f, 58.55f, 1142.45f, 706.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 5.0f, -6.4f, 299.4f, 235.0f, 27.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 22.0f, 109.5f, 1696.5f, 1058.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 10.0f, 27.35f, 719.65f, 470.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText2.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText2.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText2.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText2, dm, layoutDescs_mText2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mField = new ArrayList<LayoutDesc>();
        layoutDescs_mField.add(new LayoutDesc(10, 14.0f, 130.4f, LayoutDesc.NO_VALUE, 706.0f, 63.76f));  // 720*1280 px
        layoutDescs_mField.add(new LayoutDesc(2, 5.0f, 12.8f, LayoutDesc.NO_VALUE, 235.0f, 27.71f));  // 240*320 px
        layoutDescs_mField.add(new LayoutDesc(12, 22.0f, 216.0f, LayoutDesc.NO_VALUE, 1058.0f, 80.41f));  // 1080*1920 px
        layoutDescs_mField.add(new LayoutDesc(8, 10.0f, 72.8f, LayoutDesc.NO_VALUE, 470.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mField = mOverrideElementLayoutDescriptors.get("field");
            if (override_mField != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mField.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mField = layoutDescs;
                }
            }
        }
        layoutDescs_mField.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mField.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mField.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mField.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mField, dm, layoutDescs_mField, true, false);

        ArrayList<LayoutDesc> layoutDescs_mTextarea = new ArrayList<LayoutDesc>();
        layoutDescs_mTextarea.add(new LayoutDesc(10, 14.0f, 331.58f, 286.4f, 692.0f, 662.02f));  // 720*1280 px
        layoutDescs_mTextarea.add(new LayoutDesc(2, 5.0f, 66.56f, 75.8f, 230.0f, 177.64f));  // 240*320 px
        layoutDescs_mTextarea.add(new LayoutDesc(12, 22.0f, 514.2f, 425.0f, 1036.0f, 980.8f));  // 1080*1920 px
        layoutDescs_mTextarea.add(new LayoutDesc(8, 10.0f, 200.06f, 180.8f, 460.0f, 419.14f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTextarea = mOverrideElementLayoutDescriptors.get("textarea");
            if (override_mTextarea != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTextarea.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTextarea = layoutDescs;
                }
            }
        }
        layoutDescs_mTextarea.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextarea.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mTextarea.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextarea.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mTextarea.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextarea.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mTextarea.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextarea.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mTextarea, dm, layoutDescs_mTextarea, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 14.0f, 259.73f, 941.27f, 706.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 5.0f, 47.36f, 245.64f, 235.0f, 27.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 22.0f, 407.7f, 1398.3f, 1058.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 10.0f, 154.61f, 592.39f, 470.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText, dm, layoutDescs_mText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 254.0f, 1028.6f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 74.0f, 255.2f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 406.0f, 1548.0f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 165.0f, 642.2f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        layoutDescs_mButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mButton, dm, layoutDescs_mButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle2.add(new LayoutDesc(10, 14.0f, 331.58f, 286.4f, 692.0f, 662.02f));  // 720*1280 px
        layoutDescs_mRectangle2.add(new LayoutDesc(2, 5.0f, 66.56f, 75.8f, 230.0f, 177.64f));  // 240*320 px
        layoutDescs_mRectangle2.add(new LayoutDesc(12, 22.0f, 514.2f, 425.0f, 1036.0f, 980.8f));  // 1080*1920 px
        layoutDescs_mRectangle2.add(new LayoutDesc(8, 10.0f, 200.06f, 180.8f, 460.0f, 419.14f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle2 = mOverrideElementLayoutDescriptors.get("rectangle2");
            if (override_mRectangle2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle2 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mRectangle2, dm, layoutDescs_mRectangle2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle3 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle3.add(new LayoutDesc(10, 14.0f, 137.4f, LayoutDesc.NO_VALUE, 706.0f, 63.76f));  // 720*1280 px
        layoutDescs_mRectangle3.add(new LayoutDesc(2, 5.0f, 14.8f, LayoutDesc.NO_VALUE, 235.0f, 27.71f));  // 240*320 px
        layoutDescs_mRectangle3.add(new LayoutDesc(12, 22.0f, 227.0f, LayoutDesc.NO_VALUE, 1058.0f, 80.41f));  // 1080*1920 px
        layoutDescs_mRectangle3.add(new LayoutDesc(8, 10.0f, 77.8f, LayoutDesc.NO_VALUE, 470.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle3 = mOverrideElementLayoutDescriptors.get("rectangle3");
            if (override_mRectangle3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle3 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle3.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle3.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangle3, dm, layoutDescs_mRectangle3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 259.73f, LayoutDesc.NO_VALUE, 720.0f, 2.13f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 47.36f, LayoutDesc.NO_VALUE, 240.0f, 0.92f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 407.7f, LayoutDesc.NO_VALUE, 1080.0f, 2.68f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 154.61f, LayoutDesc.NO_VALUE, 480.0f, 1.51f));  // 480*800 px
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

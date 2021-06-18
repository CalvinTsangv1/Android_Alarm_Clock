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

public class GeneralSettingFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private GeneralSettingBackgroundShapeView mBackgroundShape;
    private GeneralSettingRectangleView mRectangle;
    private GeneralSettingRectangleCopyView mRectangleCopy;
    private GeneralSettingRectangleCopy2View mRectangleCopy2;
    private GeneralSettingRectangleCopy3View mRectangleCopy3;
    private GeneralSettingRectangleCopy4View mRectangleCopy4;
    private GeneralSettingRectangleCopy5View mRectangleCopy5;
    private TextView mText9;
    private TextView mText10;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private TextView mText7;
    private TextView mText8;
    private TextView mLanguageText;
    private android.support.v7.widget.SwitchCompat mPhonespeakerSwitch;
    private android.support.v7.widget.SwitchCompat mN24hourformatSwitch;
    private android.support.v7.widget.SwitchCompat mAlarmScreenSwitch;
    private Button mBackgroundButton;
    private Button mLanguageButton;
    private android.support.v7.widget.SwitchCompat mNotificationSwitch;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public GeneralSettingFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_general_setting, container, false);
                
        mBackgroundShape = (GeneralSettingBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (GeneralSettingRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (GeneralSettingRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (GeneralSettingRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (GeneralSettingRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mRectangleCopy4 = (GeneralSettingRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangleCopy5 = (GeneralSettingRectangleCopy5View) rootView.findViewById(R.id.mRectangleCopy5);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mLanguageText = (TextView) rootView.findViewById(R.id.mLanguageText);
        mPhonespeakerSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mPhonespeakerSwitch);
        mN24hourformatSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mN24hourformatSwitch);
        mAlarmScreenSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mAlarmScreenSwitch);
        mBackgroundButton = (Button) rootView.findViewById(R.id.mBackgroundButton);
        mLanguageButton = (Button) rootView.findViewById(R.id.mLanguageButton);
        mNotificationSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mNotificationSwitch);

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText9.setText(AppData.getLocalizedString("neonto_generalsetting_text9_712200", ""));

        
        mText10.setText(AppData.getLocalizedString("neonto_generalsetting_text10_969724", ""));

        
        mText.setText(AppData.getLocalizedString("neonto_generalsetting_text_291376", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_generalsetting_text2_158284", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_generalsetting_text3_833644", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_generalsetting_text4_655673", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_generalsetting_text5_1042671", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_generalsetting_text6_258256", ""));

        
        mText7.setText(AppData.getLocalizedString("neonto_generalsetting_text7_812651", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_generalsetting_text8_376242", ""));

        
        mLanguageText.setText(AppData.getLocalizedString("neonto_generalsetting_text11_818058", ""));

        

        

        
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon815262);
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
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_generalsetting_text9_712200", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText10)) {
                    mText10.setText(AppData.getLocalizedString("neonto_generalsetting_text10_969724", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_generalsetting_text_291376", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_generalsetting_text2_158284", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_generalsetting_text3_833644", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_generalsetting_text4_655673", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_generalsetting_text5_1042671", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_generalsetting_text6_258256", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_generalsetting_text7_812651", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_generalsetting_text8_376242", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mLanguageText)) {
                    mLanguageText.setText(AppData.getLocalizedString("neonto_generalsetting_text11_818058", ""));
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
            val = row.get("text 9");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText9.setText((String) value);
                    mDataSheetUpdatedElems.add(mText9);
                }
            }
        }
        {
            val = row.get("text 10");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText10.setText((String) value);
                    mDataSheetUpdatedElems.add(mText10);
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
        {
            val = row.get("text 4");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText4.setText((String) value);
                    mDataSheetUpdatedElems.add(mText4);
                }
            }
        }
        {
            val = row.get("text 5");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText5.setText((String) value);
                    mDataSheetUpdatedElems.add(mText5);
                }
            }
        }
        {
            val = row.get("text 6");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText6.setText((String) value);
                    mDataSheetUpdatedElems.add(mText6);
                }
            }
        }
        {
            val = row.get("text 7");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText7.setText((String) value);
                    mDataSheetUpdatedElems.add(mText7);
                }
            }
        }
        {
            val = row.get("text 8");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText8.setText((String) value);
                    mDataSheetUpdatedElems.add(mText8);
                }
            }
        }
        {
            val = row.get("LanguageText");
            if (val == null) val = row.get("languagetext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mLanguageText.setText((String) value);
                    mDataSheetUpdatedElems.add(mLanguageText);
                }
            }
        }
        {
            val = row.get("PhonespeakerSwitch");
            if (val == null) val = row.get("phonespeakerswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mPhonespeakerSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("24hourformatSwitch");
            if (val == null) val = row.get("24hourformatswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mN24hourformatSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("AlarmScreenSwitch");
            if (val == null) val = row.get("alarmscreenswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mAlarmScreenSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("NotificationSwitch");
            if (val == null) val = row.get("notificationswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mNotificationSwitch.setChecked(v.equals("true") || v.equals("1"));
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 317.21f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 62.72f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 492.9f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 190.97f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 475.28f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 104.96f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 727.2f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 290.96f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy3 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 633.35f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 147.2f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 961.5f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 390.95f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy3 = mOverrideElementLayoutDescriptors.get("rectangleCopy3");
            if (override_mRectangleCopy3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy3 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy3.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy3.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy3, dm, layoutDescs_mRectangleCopy3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy4 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 791.42f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 189.44f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 1195.8f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 490.94f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy4 = mOverrideElementLayoutDescriptors.get("rectangleCopy4");
            if (override_mRectangleCopy4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy4 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy4.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy4.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy4.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy4.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy4, dm, layoutDescs_mRectangleCopy4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy5 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(10, 0.0f, 949.49f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(2, 0.0f, 231.68f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(12, 0.0f, 1430.1f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(8, 0.0f, 590.93f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy5 = mOverrideElementLayoutDescriptors.get("rectangleCopy5");
            if (override_mRectangleCopy5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy5 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy5.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy5.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy5.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy5.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy5, dm, layoutDescs_mRectangleCopy5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 14.0f, 561.28f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 5.0f, 133.96f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 22.0f, 857.2f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 10.0f, 348.96f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText9 = mOverrideElementLayoutDescriptors.get("text9");
            if (override_mText9 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText9.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText9 = layoutDescs;
                }
            }
        }
        layoutDescs_mText9.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText9, dm, layoutDescs_mText9, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 14.0f, 719.35f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 5.0f, 176.2f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 22.0f, 1091.5f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 10.0f, 448.95f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText10 = mOverrideElementLayoutDescriptors.get("text10");
            if (override_mText10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText10 = layoutDescs;
                }
            }
        }
        layoutDescs_mText10.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 14.0f, 58.81f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 5.0f, -4.08f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 22.0f, 109.9f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 10.0f, 28.17f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 14.0f, 177.14f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 5.0f, 26.48f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 22.0f, 285.6f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 10.0f, 102.98f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText3.add(new LayoutDesc(10, 14.0f, 335.21f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 5.0f, 68.72f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 22.0f, 519.9f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 10.0f, 202.97f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 14.0f, 493.28f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 5.0f, 110.96f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 22.0f, 754.2f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 10.0f, 302.96f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        layoutDescs_mText4.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 9.0f, 651.35f, LayoutDesc.NO_VALUE, 711.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 4.0f, 153.2f, LayoutDesc.NO_VALUE, 236.0f, 34.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 11.0f, 988.5f, LayoutDesc.NO_VALUE, 1069.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 6.0f, 402.95f, LayoutDesc.NO_VALUE, 474.0f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        layoutDescs_mText5.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 9.0f, 809.42f, LayoutDesc.NO_VALUE, 711.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 4.0f, 195.44f, LayoutDesc.NO_VALUE, 236.0f, 34.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 11.0f, 1222.8f, LayoutDesc.NO_VALUE, 1069.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 6.0f, 502.94f, LayoutDesc.NO_VALUE, 474.0f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        layoutDescs_mText6.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 14.0f, 245.14f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 5.0f, 49.48f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 22.0f, 388.6f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 10.0f, 148.98f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        layoutDescs_mText7.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 14.0f, 403.21f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 5.0f, 91.72f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 22.0f, 622.9f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 10.0f, 248.97f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        layoutDescs_mText8.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLanguageText = new ArrayList<LayoutDesc>();
        layoutDescs_mLanguageText.add(new LayoutDesc(10, 14.0f, 877.42f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mLanguageText.add(new LayoutDesc(2, 5.0f, 218.44f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mLanguageText.add(new LayoutDesc(12, 22.0f, 1325.8f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mLanguageText.add(new LayoutDesc(8, 10.0f, 548.94f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLanguageText = mOverrideElementLayoutDescriptors.get("languageText");
            if (override_mLanguageText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLanguageText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLanguageText = layoutDescs;
                }
            }
        }
        layoutDescs_mLanguageText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mLanguageText, dm, layoutDescs_mLanguageText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPhonespeakerSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mPhonespeakerSwitch.add(new LayoutDesc(10, 602.0f, 202.14f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mPhonespeakerSwitch.add(new LayoutDesc(2, 191.0f, 34.48f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mPhonespeakerSwitch.add(new LayoutDesc(12, 927.0f, 323.6f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mPhonespeakerSwitch.add(new LayoutDesc(8, 398.0f, 119.98f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mPhonespeakerSwitch = mOverrideElementLayoutDescriptors.get("phonespeakerSwitch");
            if (override_mPhonespeakerSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mPhonespeakerSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mPhonespeakerSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mPhonespeakerSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhonespeakerSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhonespeakerSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhonespeakerSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mPhonespeakerSwitch, dm, layoutDescs_mPhonespeakerSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mN24hourformatSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mN24hourformatSwitch.add(new LayoutDesc(10, 602.0f, 58.81f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mN24hourformatSwitch.add(new LayoutDesc(2, 191.0f, -4.08f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mN24hourformatSwitch.add(new LayoutDesc(12, 927.0f, 109.9f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mN24hourformatSwitch.add(new LayoutDesc(8, 398.0f, 28.17f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mN24hourformatSwitch = mOverrideElementLayoutDescriptors.get("n24hourformatSwitch");
            if (override_mN24hourformatSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mN24hourformatSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mN24hourformatSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mN24hourformatSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mN24hourformatSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mN24hourformatSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mN24hourformatSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mN24hourformatSwitch, dm, layoutDescs_mN24hourformatSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmScreenSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmScreenSwitch.add(new LayoutDesc(10, 602.0f, 360.21f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mAlarmScreenSwitch.add(new LayoutDesc(2, 191.0f, 76.72f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mAlarmScreenSwitch.add(new LayoutDesc(12, 927.0f, 557.9f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mAlarmScreenSwitch.add(new LayoutDesc(8, 398.0f, 219.97f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmScreenSwitch = mOverrideElementLayoutDescriptors.get("alarmScreenSwitch");
            if (override_mAlarmScreenSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmScreenSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmScreenSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmScreenSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmScreenSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmScreenSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmScreenSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mAlarmScreenSwitch, dm, layoutDescs_mAlarmScreenSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackgroundButton = new ArrayList<LayoutDesc>();
        layoutDescs_mBackgroundButton.add(new LayoutDesc(10, 0.0f, 633.35f, 487.58f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mBackgroundButton.add(new LayoutDesc(2, 0.0f, 147.2f, 129.56f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mBackgroundButton.add(new LayoutDesc(12, 0.0f, 961.5f, 723.2f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mBackgroundButton.add(new LayoutDesc(8, 0.0f, 390.95f, 308.06f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackgroundButton = mOverrideElementLayoutDescriptors.get("backgroundButton");
            if (override_mBackgroundButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackgroundButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackgroundButton = layoutDescs;
                }
            }
        }
        layoutDescs_mBackgroundButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackgroundButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mBackgroundButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackgroundButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mBackgroundButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackgroundButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mBackgroundButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackgroundButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mBackgroundButton, dm, layoutDescs_mBackgroundButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLanguageButton = new ArrayList<LayoutDesc>();
        layoutDescs_mLanguageButton.add(new LayoutDesc(10, 0.0f, 791.42f, 329.51f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mLanguageButton.add(new LayoutDesc(2, 0.0f, 189.44f, 87.32f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mLanguageButton.add(new LayoutDesc(12, 0.0f, 1195.8f, 488.9f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mLanguageButton.add(new LayoutDesc(8, 0.0f, 490.94f, 208.07f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLanguageButton = mOverrideElementLayoutDescriptors.get("languageButton");
            if (override_mLanguageButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLanguageButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLanguageButton = layoutDescs;
                }
            }
        }
        layoutDescs_mLanguageButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mLanguageButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mLanguageButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mLanguageButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLanguageButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mLanguageButton, dm, layoutDescs_mLanguageButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mNotificationSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mNotificationSwitch.add(new LayoutDesc(10, 602.0f, 518.28f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mNotificationSwitch.add(new LayoutDesc(2, 191.0f, 118.96f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mNotificationSwitch.add(new LayoutDesc(12, 927.0f, 792.2f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mNotificationSwitch.add(new LayoutDesc(8, 398.0f, 319.96f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mNotificationSwitch = mOverrideElementLayoutDescriptors.get("notificationSwitch");
            if (override_mNotificationSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mNotificationSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mNotificationSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mNotificationSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNotificationSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNotificationSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNotificationSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mNotificationSwitch, dm, layoutDescs_mNotificationSwitch, true, true);

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

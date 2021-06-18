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

public class StopWatchTimerSettingsFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private StopWatchTimerSettingsBackgroundShapeView mBackgroundShape;
    private StopWatchTimerSettingsRectangleView mRectangle;
    private StopWatchTimerSettingsRectangleCopyView mRectangleCopy;
    private StopWatchTimerSettingsRectangleCopy2View mRectangleCopy2;
    private StopWatchTimerSettingsRectangleCopy3View mRectangleCopy3;
    private StopWatchTimerSettingsRectangleCopy4View mRectangleCopy4;
    private StopWatchTimerSettingsRectangleCopy5View mRectangleCopy5;
    private StopWatchTimerSettingsRectangleCopy6View mRectangleCopy6;
    private TextView mText;
    private TextView mText2;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private TextView mText7;
    private TextView mText9;
    private TextView mTextCopy;
    private TextView mTextCopy2;
    private TextView mTimervolume;
    private TextView mRingtoneText;
    private android.support.v7.widget.SwitchCompat mVibrateSwitch;
    private android.support.v7.widget.SwitchCompat mTimerScreenOnSwitch;
    private android.support.v7.widget.SwitchCompat mStopwatchScreenOnSwitch;
    private Button mRingtoneButton;
    private Button mMaxtimervolumeButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public StopWatchTimerSettingsFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_stop_watch_timer_settings, container, false);
                
        mBackgroundShape = (StopWatchTimerSettingsBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (StopWatchTimerSettingsRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (StopWatchTimerSettingsRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (StopWatchTimerSettingsRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (StopWatchTimerSettingsRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mRectangleCopy4 = (StopWatchTimerSettingsRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangleCopy5 = (StopWatchTimerSettingsRectangleCopy5View) rootView.findViewById(R.id.mRectangleCopy5);
        mRectangleCopy6 = (StopWatchTimerSettingsRectangleCopy6View) rootView.findViewById(R.id.mRectangleCopy6);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mTextCopy = (TextView) rootView.findViewById(R.id.mTextCopy);
        mTextCopy2 = (TextView) rootView.findViewById(R.id.mTextCopy2);
        mTimervolume = (TextView) rootView.findViewById(R.id.mTimervolume);
        mRingtoneText = (TextView) rootView.findViewById(R.id.mRingtoneText);
        mVibrateSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mVibrateSwitch);
        mTimerScreenOnSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mTimerScreenOnSwitch);
        mStopwatchScreenOnSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mStopwatchScreenOnSwitch);
        mRingtoneButton = (Button) rootView.findViewById(R.id.mRingtoneButton);
        mMaxtimervolumeButton = (Button) rootView.findViewById(R.id.mMaxtimervolumeButton);

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text_873519", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text2_192589", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text4_888487", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text5_645711", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text6_304014", ""));

        
        mText7.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text7_664485", ""));

        
        mText9.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text9_125031", ""));

        
        mTextCopy.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text5_1006415", ""));

        
        mTextCopy2.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text6_769739", ""));

        
        mTimervolume.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text8_199808", ""));

        
        mRingtoneText.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text3_753190", ""));

        

        

        
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon341751);
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
                    mText.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text_873519", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text2_192589", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text4_888487", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text5_645711", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text6_304014", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text7_664485", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text9_125031", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTextCopy)) {
                    mTextCopy.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text5_1006415", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTextCopy2)) {
                    mTextCopy2.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text6_769739", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTimervolume)) {
                    mTimervolume.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text8_199808", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mRingtoneText)) {
                    mRingtoneText.setText(AppData.getLocalizedString("neonto_stopwatchtimersettings_text3_753190", ""));
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
            val = row.get("text copy");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTextCopy.setText((String) value);
                    mDataSheetUpdatedElems.add(mTextCopy);
                }
            }
        }
        {
            val = row.get("text copy 2");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTextCopy2.setText((String) value);
                    mDataSheetUpdatedElems.add(mTextCopy2);
                }
            }
        }
        {
            val = row.get("timervolume");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTimervolume.setText((String) value);
                    mDataSheetUpdatedElems.add(mTimervolume);
                }
            }
        }
        {
            val = row.get("RingtoneText");
            if (val == null) val = row.get("ringtonetext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mRingtoneText.setText((String) value);
                    mDataSheetUpdatedElems.add(mRingtoneText);
                }
            }
        }
        {
            val = row.get("VibrateSwitch");
            if (val == null) val = row.get("vibrateswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mVibrateSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("TimerScreenOnSwitch");
            if (val == null) val = row.get("timerscreenonswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mTimerScreenOnSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("StopwatchScreenOnSwitch");
            if (val == null) val = row.get("stopwatchscreenonswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mStopwatchScreenOnSwitch.setChecked(v.equals("true") || v.equals("1"));
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
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 116.03f, LayoutDesc.NO_VALUE, 720.0f, 4.25f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 8.96f, LayoutDesc.NO_VALUE, 240.0f, 1.85f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 194.7f, LayoutDesc.NO_VALUE, 1080.0f, 5.36f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 63.71f, LayoutDesc.NO_VALUE, 480.0f, 3.01f));  // 480*800 px
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 403.43f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 85.76f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 620.7f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 245.51f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 561.5f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 128.0f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 855.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 345.5f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 676.46f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 158.72f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 1025.4f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 418.22f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 777.05f, LayoutDesc.NO_VALUE, 720.0f, 4.25f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 185.6f, LayoutDesc.NO_VALUE, 240.0f, 1.85f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 1174.5f, LayoutDesc.NO_VALUE, 1080.0f, 5.36f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 481.85f, LayoutDesc.NO_VALUE, 480.0f, 3.01f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy6 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(10, 0.0f, 274.1f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(2, 0.0f, 51.2f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(12, 0.0f, 429.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(8, 0.0f, 163.7f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy6 = mOverrideElementLayoutDescriptors.get("rectangleCopy6");
            if (override_mRectangleCopy6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy6 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy6.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy6.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy6.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy6.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy6, dm, layoutDescs_mRectangleCopy6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 14.0f, 36.81f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 5.0f, -12.08f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 22.0f, 77.9f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 10.0f, 14.17f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 14.0f, 130.03f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 5.0f, 13.96f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 22.0f, 216.7f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 10.0f, 73.71f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 14.0f, 310.1f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 5.0f, 63.2f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 22.0f, 483.0f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 10.0f, 187.7f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText5.add(new LayoutDesc(10, 14.0f, 417.43f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 5.0f, 90.76f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 22.0f, 642.7f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 10.0f, 255.51f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText6.add(new LayoutDesc(10, 14.0f, 489.43f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 5.0f, 114.76f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 22.0f, 750.7f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 10.0f, 303.51f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
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
        layoutDescs_mText7.add(new LayoutDesc(10, 14.0f, 590.5f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 5.0f, 138.0f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 22.0f, 898.0f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 10.0f, 364.5f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 14.0f, 698.46f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 5.0f, 165.72f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 22.0f, 1057.4f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 10.0f, 432.22f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mTextCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mTextCopy.add(new LayoutDesc(10, 14.0f, 791.05f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mTextCopy.add(new LayoutDesc(2, 5.0f, 190.6f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mTextCopy.add(new LayoutDesc(12, 22.0f, 1196.5f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mTextCopy.add(new LayoutDesc(8, 10.0f, 491.85f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTextCopy = mOverrideElementLayoutDescriptors.get("textCopy");
            if (override_mTextCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTextCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTextCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mTextCopy.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTextCopy, dm, layoutDescs_mTextCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTextCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mTextCopy2.add(new LayoutDesc(10, 14.0f, 863.05f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mTextCopy2.add(new LayoutDesc(2, 5.0f, 214.6f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mTextCopy2.add(new LayoutDesc(12, 22.0f, 1304.5f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mTextCopy2.add(new LayoutDesc(8, 10.0f, 539.85f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTextCopy2 = mOverrideElementLayoutDescriptors.get("textCopy2");
            if (override_mTextCopy2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTextCopy2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTextCopy2 = layoutDescs;
                }
            }
        }
        layoutDescs_mTextCopy2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTextCopy2.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTextCopy2, dm, layoutDescs_mTextCopy2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimervolume = new ArrayList<LayoutDesc>();
        layoutDescs_mTimervolume.add(new LayoutDesc(10, 259.71f, 590.5f, LayoutDesc.NO_VALUE, 446.29f, 70.0f));  // 720*1280 px
        layoutDescs_mTimervolume.add(new LayoutDesc(2, 41.02f, 138.0f, LayoutDesc.NO_VALUE, 193.98f, 34.0f));  // 240*320 px
        layoutDescs_mTimervolume.add(new LayoutDesc(12, 495.10f, 898.0f, LayoutDesc.NO_VALUE, 562.90f, 87.0f));  // 1080*1920 px
        layoutDescs_mTimervolume.add(new LayoutDesc(8, 153.52f, 364.5f, LayoutDesc.NO_VALUE, 316.48f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimervolume = mOverrideElementLayoutDescriptors.get("timervolume");
            if (override_mTimervolume != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimervolume.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimervolume = layoutDescs;
                }
            }
        }
        layoutDescs_mTimervolume.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimervolume.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimervolume.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimervolume.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTimervolume, dm, layoutDescs_mTimervolume, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRingtoneText = new ArrayList<LayoutDesc>();
        layoutDescs_mRingtoneText.add(new LayoutDesc(10, 14.0f, 202.03f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(2, 5.0f, 37.96f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(12, 22.0f, 324.7f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(8, 10.0f, 121.71f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRingtoneText = mOverrideElementLayoutDescriptors.get("ringtoneText");
            if (override_mRingtoneText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRingtoneText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRingtoneText = layoutDescs;
                }
            }
        }
        layoutDescs_mRingtoneText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRingtoneText, dm, layoutDescs_mRingtoneText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mVibrateSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mVibrateSwitch.add(new LayoutDesc(10, 610.0f, 310.1f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mVibrateSwitch.add(new LayoutDesc(2, 193.0f, 63.2f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mVibrateSwitch.add(new LayoutDesc(12, 937.0f, 483.0f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mVibrateSwitch.add(new LayoutDesc(8, 402.0f, 187.7f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVibrateSwitch = mOverrideElementLayoutDescriptors.get("vibrateSwitch");
            if (override_mVibrateSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVibrateSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVibrateSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mVibrateSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mVibrateSwitch, dm, layoutDescs_mVibrateSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimerScreenOnSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mTimerScreenOnSwitch.add(new LayoutDesc(10, 610.0f, 453.43f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mTimerScreenOnSwitch.add(new LayoutDesc(2, 193.0f, 102.76f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mTimerScreenOnSwitch.add(new LayoutDesc(12, 937.0f, 696.7f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mTimerScreenOnSwitch.add(new LayoutDesc(8, 402.0f, 279.51f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimerScreenOnSwitch = mOverrideElementLayoutDescriptors.get("timerScreenOnSwitch");
            if (override_mTimerScreenOnSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimerScreenOnSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimerScreenOnSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mTimerScreenOnSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimerScreenOnSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimerScreenOnSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimerScreenOnSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTimerScreenOnSwitch, dm, layoutDescs_mTimerScreenOnSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStopwatchScreenOnSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mStopwatchScreenOnSwitch.add(new LayoutDesc(10, 610.0f, 827.05f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mStopwatchScreenOnSwitch.add(new LayoutDesc(2, 193.0f, 202.6f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mStopwatchScreenOnSwitch.add(new LayoutDesc(12, 937.0f, 1250.5f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mStopwatchScreenOnSwitch.add(new LayoutDesc(8, 402.0f, 515.85f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStopwatchScreenOnSwitch = mOverrideElementLayoutDescriptors.get("stopwatchScreenOnSwitch");
            if (override_mStopwatchScreenOnSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStopwatchScreenOnSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStopwatchScreenOnSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mStopwatchScreenOnSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatchScreenOnSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatchScreenOnSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopwatchScreenOnSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mStopwatchScreenOnSwitch, dm, layoutDescs_mStopwatchScreenOnSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRingtoneButton = new ArrayList<LayoutDesc>();
        layoutDescs_mRingtoneButton.add(new LayoutDesc(10, 0.0f, 116.03f, 1004.9f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(2, 0.0f, 8.96f, 267.8f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(12, 0.0f, 194.7f, 1490.0f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(8, 0.0f, 63.71f, 635.3f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRingtoneButton = mOverrideElementLayoutDescriptors.get("ringtoneButton");
            if (override_mRingtoneButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRingtoneButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRingtoneButton = layoutDescs;
                }
            }
        }
        layoutDescs_mRingtoneButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRingtoneButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRingtoneButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRingtoneButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRingtoneButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mRingtoneButton, dm, layoutDescs_mRingtoneButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMaxtimervolumeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mMaxtimervolumeButton.add(new LayoutDesc(10, 0.0f, 561.5f, 602.54f, 720.0f, 115.96f));  // 720*1280 px
        layoutDescs_mMaxtimervolumeButton.add(new LayoutDesc(2, 0.0f, 128.0f, 160.28f, 240.0f, 31.72f));  // 240*320 px
        layoutDescs_mMaxtimervolumeButton.add(new LayoutDesc(12, 0.0f, 855.0f, 893.6f, 1080.0f, 171.4f));  // 1080*1920 px
        layoutDescs_mMaxtimervolumeButton.add(new LayoutDesc(8, 0.0f, 345.5f, 380.78f, 480.0f, 73.72f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMaxtimervolumeButton = mOverrideElementLayoutDescriptors.get("maxtimervolumeButton");
            if (override_mMaxtimervolumeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMaxtimervolumeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMaxtimervolumeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mMaxtimervolumeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxtimervolumeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mMaxtimervolumeButton, dm, layoutDescs_mMaxtimervolumeButton, true, true);

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

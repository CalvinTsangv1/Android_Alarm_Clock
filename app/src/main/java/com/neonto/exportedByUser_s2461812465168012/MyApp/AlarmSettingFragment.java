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

public class AlarmSettingFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private AlarmSettingBackgroundShapeView mBackgroundShape;
    private AlarmSettingRectangleView mRectangle;
    private AlarmSettingRectangleCopyView mRectangleCopy;
    private AlarmSettingRectangleCopy2View mRectangleCopy2;
    private AlarmSettingRectangleCopy3View mRectangleCopy3;
    private AlarmSettingRectangleCopy4View mRectangleCopy4;
    private AlarmSettingRectangleCopy5View mRectangleCopy5;
    private AlarmSettingRectangleCopy6View mRectangleCopy6;
    private TextView mText;
    private TextView mText2;
    private TextView mText4;
    private TextView mText6;
    private TextView mText8;
    private TextView mText9;
    private AlarmSettingImageView mImage;
    private TextView mText3;
    private TextView mSnoozeAlarmText;
    private TextView mMaxSnoozeText;
    private TextView mSnoozeDurationText;
    private TextView mText10;
    private android.support.v7.widget.SwitchCompat mSilentModeSwitch;
    private Button mDIsmissAlarmTypeButton;
    private Button mMaxSnoozesButton;
    private Button mSnoozeDurationButton;
    private Button mSnoozeAlarmTypeButton;
    private Button mPhotoPickerButton;
    private AlarmSettingPhotopickerView mPhotopicker;
    private TextView mAlarmText;
    private Button mAlarmTypeButtonCopy;
    private AlarmSettingRectangleCopy7View mRectangleCopy7;
    private AppData.IDataSlotChangeListener mDataSlotChangeListener;
    private HashSet<String> mDeferredDataSlotUpdates = new HashSet<String>();
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public AlarmSettingFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_alarm_setting, container, false);
                
        mBackgroundShape = (AlarmSettingBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (AlarmSettingRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (AlarmSettingRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (AlarmSettingRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (AlarmSettingRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mRectangleCopy4 = (AlarmSettingRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangleCopy5 = (AlarmSettingRectangleCopy5View) rootView.findViewById(R.id.mRectangleCopy5);
        mRectangleCopy6 = (AlarmSettingRectangleCopy6View) rootView.findViewById(R.id.mRectangleCopy6);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mImage = (AlarmSettingImageView) rootView.findViewById(R.id.mImage);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mSnoozeAlarmText = (TextView) rootView.findViewById(R.id.mSnoozeAlarmText);
        mMaxSnoozeText = (TextView) rootView.findViewById(R.id.mMaxSnoozeText);
        mSnoozeDurationText = (TextView) rootView.findViewById(R.id.mSnoozeDurationText);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mSilentModeSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mSilentModeSwitch);
        mDIsmissAlarmTypeButton = (Button) rootView.findViewById(R.id.mDIsmissAlarmTypeButton);
        mMaxSnoozesButton = (Button) rootView.findViewById(R.id.mMaxSnoozesButton);
        mSnoozeDurationButton = (Button) rootView.findViewById(R.id.mSnoozeDurationButton);
        mSnoozeAlarmTypeButton = (Button) rootView.findViewById(R.id.mSnoozeAlarmTypeButton);
        mPhotoPickerButton = (Button) rootView.findViewById(R.id.mPhotoPickerButton);
        mPhotopicker = (AlarmSettingPhotopickerView) rootView.findViewById(R.id.mPhotopicker);
        mAlarmText = (TextView) rootView.findViewById(R.id.mAlarmText);
        mAlarmTypeButtonCopy = (Button) rootView.findViewById(R.id.mAlarmTypeButtonCopy);
        mRectangleCopy7 = (AlarmSettingRectangleCopy7View) rootView.findViewById(R.id.mRectangleCopy7);
        final AlarmSettingFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_alarmsetting_text_773082", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_alarmsetting_text2_629350", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_alarmsetting_text4_178251", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_alarmsetting_text6_797215", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_alarmsetting_text8_966594", ""));

        
        mText9.setText(AppData.getLocalizedString("neonto_alarmsetting_text9_271950", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_alarmsetting_text3_420780", ""));

        
        mSnoozeAlarmText.setText(AppData.getLocalizedString("neonto_alarmsetting_text3_919310", ""));

        
        mMaxSnoozeText.setText(AppData.getLocalizedString("neonto_alarmsetting_text5_268901", ""));

        
        mSnoozeDurationText.setText(AppData.getLocalizedString("neonto_alarmsetting_text7_553961", ""));

        
        mText10.setText(AppData.getLocalizedString("neonto_alarmsetting_text10_895938", ""));

        

        

        

        

        
        mPhotoPickerButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Perform action 'Take a photo' on element 'photopicker'
                                mPhotopicker.takePicture(fragment, new Object() {
                                    public void onPictureTaken(android.graphics.Bitmap bitmap) {
                                        if (bitmap != null) {
                                            AppData.dataSlot_PhotoPicker = bitmap;  AppData.notifyDataSlotModified("PhotoPicker");
                                            actionSequencer.resume();
                                        } else {
                                            actionSequencer.cancel();
                                        }
                                    }
                                });
                                return false;
                            }
                        },
                });
        
           }
        });

        
        mPhotopicker.showsPhoto = true;
        

        
        mAlarmText.setText(AppData.getLocalizedString("neonto_alarmsetting_snoozealarmtext_227003", ""));

        

        
        // init values from data slots
        dataSlotUpdated("PhotoPicker");
        
        mDataSlotChangeListener = new AppData.IDataSlotChangeListener() {
            @Override
            public void dataSlotUpdated(final String name) {
                // needs to be run on UI thread
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (mDeferredDataSlotUpdates.contains(name))
                            return;
                            
                        AlarmSettingFragment.this.dataSlotUpdated(name);
                    }
                });
           }
        };
        AppData.addListener(mDataSlotChangeListener);
        
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon417431);
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

    public void dataSlotUpdated(String name) {
        if (name.equals("PhotoPicker")) {  // content update for 'image'
            android.graphics.drawable.BitmapDrawable d = null;
            if (AppData.dataSlot_PhotoPicker != null) {
                d = new android.graphics.drawable.BitmapDrawable(getResources(), AppData.dataSlot_PhotoPicker);
            }
            mImage.setImageDrawable(d);
        }

    }

    public void updateLocalizedValues() {
        // needs to be run on UI thread
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_alarmsetting_text_773082", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_alarmsetting_text2_629350", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_alarmsetting_text4_178251", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_alarmsetting_text6_797215", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_alarmsetting_text8_966594", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_alarmsetting_text9_271950", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_alarmsetting_text3_420780", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSnoozeAlarmText)) {
                    mSnoozeAlarmText.setText(AppData.getLocalizedString("neonto_alarmsetting_text3_919310", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mMaxSnoozeText)) {
                    mMaxSnoozeText.setText(AppData.getLocalizedString("neonto_alarmsetting_text5_268901", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSnoozeDurationText)) {
                    mSnoozeDurationText.setText(AppData.getLocalizedString("neonto_alarmsetting_text7_553961", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText10)) {
                    mText10.setText(AppData.getLocalizedString("neonto_alarmsetting_text10_895938", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mAlarmText)) {
                    mAlarmText.setText(AppData.getLocalizedString("neonto_alarmsetting_snoozealarmtext_227003", ""));
                }
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        
        if (mDeferredDataSlotUpdates.size() > 0) {
            for (String name : mDeferredDataSlotUpdates) {
                dataSlotUpdated(name);
            }
            mDeferredDataSlotUpdates.clear();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        
        AppData.localizationSheetDataSheet.removeListener(mLocalizationSheetChangeListener);
        
        AppData.removeListener(mDataSlotChangeListener);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
        mPhotopicker.onActivityResult(requestCode, resultCode, data);
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
            val = row.get("SnoozeAlarmText");
            if (val == null) val = row.get("snoozealarmtext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSnoozeAlarmText.setText((String) value);
                    mDataSheetUpdatedElems.add(mSnoozeAlarmText);
                }
            }
        }
        {
            val = row.get("MaxSnoozeText");
            if (val == null) val = row.get("maxsnoozetext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mMaxSnoozeText.setText((String) value);
                    mDataSheetUpdatedElems.add(mMaxSnoozeText);
                }
            }
        }
        {
            val = row.get("SnoozeDurationText");
            if (val == null) val = row.get("snoozedurationtext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSnoozeDurationText.setText((String) value);
                    mDataSheetUpdatedElems.add(mSnoozeDurationText);
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
            val = row.get("SilentModeSwitch");
            if (val == null) val = row.get("silentmodeswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mSilentModeSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("AlarmText");
            if (val == null) val = row.get("alarmtext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mAlarmText.setText((String) value);
                    mDataSheetUpdatedElems.add(mAlarmText);
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
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 1165.04f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 289.28f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 1749.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 727.28f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 1035.71f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 254.72f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 1557.9f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 645.47f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 877.64f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 212.48f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 1323.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 545.48f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 719.57f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 170.24f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 1089.3f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 445.49f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(10, 0.0f, 561.5f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(2, 0.0f, 128.0f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(12, 0.0f, 855.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(8, 0.0f, 345.5f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(10, 0.0f, 216.62f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(2, 0.0f, 35.84f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(12, 0.0f, 343.8f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(8, 0.0f, 127.34f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mText.add(new LayoutDesc(10, 14.0f, 51.81f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 5.0f, -7.08f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 22.0f, 98.9f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 10.0f, 23.17f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 14.0f, 234.62f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 5.0f, 41.84f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 22.0f, 370.8f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 10.0f, 139.34f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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
        layoutDescs_mText4.add(new LayoutDesc(10, 14.0f, 575.5f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 5.0f, 133.0f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 22.0f, 877.0f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 10.0f, 355.5f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 14.0f, 733.57f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 5.0f, 175.24f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 22.0f, 1111.3f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 10.0f, 455.49f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 14.0f, 891.64f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 5.0f, 217.48f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 22.0f, 1345.6f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 10.0f, 555.48f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 14.0f, 1071.71f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 5.0f, 266.72f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 22.0f, 1611.9f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 10.0f, 669.47f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 556.0f, 29.81f, 1069.19f, 128.0f, 181.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 172.0f, -14.08f, 285.08f, 56.0f, 49.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 865.0f, 66.9f, 1586.1f, 161.0f, 267.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 365.0f, 9.17f, 675.83f, 91.0f, 115.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.121904762, 0.0, 0.0, 0.121904762, 0.0, -5.5]; [0.121904762, 0.0, 0.0, 0.121904762, 0.0, -5.5]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.053333333, 0.0, 0.0, 0.053333333, 0.0, -17.5]; [0.053333333, 0.0, 0.0, 0.053333333, 0.0, -17.5]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.169523810, 0.0, 0.0, 0.169523810, -8.5, 0.0]; [0.169523810, 0.0, 0.0, 0.169523810, -8.5, 0.0]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.086666667, 0.0, 0.0, 0.086666667, 0.0, -10.750]; [0.086666667, 0.0, 0.0, 0.086666667, 0.0, -10.750]";
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 14.0f, 407.06f, LayoutDesc.NO_VALUE, 706.0f, 70.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 5.0f, 87.92f, LayoutDesc.NO_VALUE, 235.0f, 34.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 22.0f, 626.4f, LayoutDesc.NO_VALUE, 1058.0f, 87.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 10.0f, 248.42f, LayoutDesc.NO_VALUE, 470.0f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mSnoozeAlarmText = new ArrayList<LayoutDesc>();
        layoutDescs_mSnoozeAlarmText.add(new LayoutDesc(10, 14.0f, 302.62f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mSnoozeAlarmText.add(new LayoutDesc(2, 5.0f, 64.84f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mSnoozeAlarmText.add(new LayoutDesc(12, 22.0f, 473.8f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mSnoozeAlarmText.add(new LayoutDesc(8, 10.0f, 185.34f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSnoozeAlarmText = mOverrideElementLayoutDescriptors.get("snoozeAlarmText");
            if (override_mSnoozeAlarmText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSnoozeAlarmText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSnoozeAlarmText = layoutDescs;
                }
            }
        }
        layoutDescs_mSnoozeAlarmText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSnoozeAlarmText, dm, layoutDescs_mSnoozeAlarmText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMaxSnoozeText = new ArrayList<LayoutDesc>();
        layoutDescs_mMaxSnoozeText.add(new LayoutDesc(10, 14.0f, 805.57f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mMaxSnoozeText.add(new LayoutDesc(2, 5.0f, 199.24f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mMaxSnoozeText.add(new LayoutDesc(12, 22.0f, 1219.3f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mMaxSnoozeText.add(new LayoutDesc(8, 10.0f, 503.49f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMaxSnoozeText = mOverrideElementLayoutDescriptors.get("maxSnoozeText");
            if (override_mMaxSnoozeText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMaxSnoozeText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMaxSnoozeText = layoutDescs;
                }
            }
        }
        layoutDescs_mMaxSnoozeText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozeText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozeText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozeText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mMaxSnoozeText, dm, layoutDescs_mMaxSnoozeText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSnoozeDurationText = new ArrayList<LayoutDesc>();
        layoutDescs_mSnoozeDurationText.add(new LayoutDesc(10, 14.0f, 647.5f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mSnoozeDurationText.add(new LayoutDesc(2, 5.0f, 157.0f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mSnoozeDurationText.add(new LayoutDesc(12, 22.0f, 985.0f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mSnoozeDurationText.add(new LayoutDesc(8, 10.0f, 403.5f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSnoozeDurationText = mOverrideElementLayoutDescriptors.get("snoozeDurationText");
            if (override_mSnoozeDurationText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSnoozeDurationText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSnoozeDurationText = layoutDescs;
                }
            }
        }
        layoutDescs_mSnoozeDurationText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSnoozeDurationText, dm, layoutDescs_mSnoozeDurationText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 14.0f, 971.64f, LayoutDesc.NO_VALUE, 446.29f, 49.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 5.0f, 243.48f, LayoutDesc.NO_VALUE, 193.98f, 25.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 22.0f, 1463.6f, LayoutDesc.NO_VALUE, 562.90f, 60.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 10.0f, 607.48f, LayoutDesc.NO_VALUE, 316.48f, 37.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mSilentModeSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mSilentModeSwitch.add(new LayoutDesc(10, 610.0f, 1071.71f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mSilentModeSwitch.add(new LayoutDesc(2, 193.0f, 266.72f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mSilentModeSwitch.add(new LayoutDesc(12, 937.0f, 1611.9f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mSilentModeSwitch.add(new LayoutDesc(8, 402.0f, 669.47f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSilentModeSwitch = mOverrideElementLayoutDescriptors.get("silentModeSwitch");
            if (override_mSilentModeSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSilentModeSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSilentModeSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mSilentModeSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSilentModeSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSilentModeSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSilentModeSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSilentModeSwitch, dm, layoutDescs_mSilentModeSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDIsmissAlarmTypeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mDIsmissAlarmTypeButton.add(new LayoutDesc(10, 0.0f, 877.64f, 243.29f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mDIsmissAlarmTypeButton.add(new LayoutDesc(2, 0.0f, 212.48f, 64.28f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mDIsmissAlarmTypeButton.add(new LayoutDesc(12, 0.0f, 1323.6f, 361.1f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mDIsmissAlarmTypeButton.add(new LayoutDesc(8, 0.0f, 545.48f, 153.53f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDIsmissAlarmTypeButton = mOverrideElementLayoutDescriptors.get("DIsmissAlarmTypeButton");
            if (override_mDIsmissAlarmTypeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDIsmissAlarmTypeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDIsmissAlarmTypeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mDIsmissAlarmTypeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDIsmissAlarmTypeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mDIsmissAlarmTypeButton, dm, layoutDescs_mDIsmissAlarmTypeButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMaxSnoozesButton = new ArrayList<LayoutDesc>();
        layoutDescs_mMaxSnoozesButton.add(new LayoutDesc(10, 0.0f, 719.57f, 401.36f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mMaxSnoozesButton.add(new LayoutDesc(2, 0.0f, 170.24f, 106.52f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mMaxSnoozesButton.add(new LayoutDesc(12, 0.0f, 1089.3f, 595.4f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mMaxSnoozesButton.add(new LayoutDesc(8, 0.0f, 445.49f, 253.52f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMaxSnoozesButton = mOverrideElementLayoutDescriptors.get("maxSnoozesButton");
            if (override_mMaxSnoozesButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMaxSnoozesButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMaxSnoozesButton = layoutDescs;
                }
            }
        }
        layoutDescs_mMaxSnoozesButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMaxSnoozesButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mMaxSnoozesButton, dm, layoutDescs_mMaxSnoozesButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSnoozeDurationButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSnoozeDurationButton.add(new LayoutDesc(10, 0.0f, 561.5f, 559.43f, 720.0f, 159.07f));  // 720*1280 px
        layoutDescs_mSnoozeDurationButton.add(new LayoutDesc(2, 0.0f, 128.0f, 148.76f, 240.0f, 43.24f));  // 240*320 px
        layoutDescs_mSnoozeDurationButton.add(new LayoutDesc(12, 0.0f, 855.0f, 829.7f, 1080.0f, 235.3f));  // 1080*1920 px
        layoutDescs_mSnoozeDurationButton.add(new LayoutDesc(8, 0.0f, 345.5f, 353.51f, 480.0f, 100.99f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSnoozeDurationButton = mOverrideElementLayoutDescriptors.get("snoozeDurationButton");
            if (override_mSnoozeDurationButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSnoozeDurationButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSnoozeDurationButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSnoozeDurationButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeDurationButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mSnoozeDurationButton, dm, layoutDescs_mSnoozeDurationButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSnoozeAlarmTypeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSnoozeAlarmTypeButton.add(new LayoutDesc(10, 0.0f, 216.62f, 889.94f, 720.0f, 173.44f));  // 720*1280 px
        layoutDescs_mSnoozeAlarmTypeButton.add(new LayoutDesc(2, 0.0f, 35.84f, 237.08f, 240.0f, 47.08f));  // 240*320 px
        layoutDescs_mSnoozeAlarmTypeButton.add(new LayoutDesc(12, 0.0f, 343.8f, 1319.6f, 1080.0f, 256.6f));  // 1080*1920 px
        layoutDescs_mSnoozeAlarmTypeButton.add(new LayoutDesc(8, 0.0f, 127.34f, 562.58f, 480.0f, 110.08f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSnoozeAlarmTypeButton = mOverrideElementLayoutDescriptors.get("snoozeAlarmTypeButton");
            if (override_mSnoozeAlarmTypeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSnoozeAlarmTypeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSnoozeAlarmTypeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSnoozeAlarmTypeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSnoozeAlarmTypeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mSnoozeAlarmTypeButton, dm, layoutDescs_mSnoozeAlarmTypeButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPhotoPickerButton = new ArrayList<LayoutDesc>();
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(10, 0.0f, 29.81f, 1062.38f, 720.0f, 187.81f));  // 720*1280 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(2, 0.0f, -14.08f, 283.16f, 240.0f, 50.92f));  // 240*320 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(12, 0.0f, 66.9f, 1575.2f, 1080.0f, 277.9f));  // 1080*1920 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(8, 0.0f, 9.17f, 671.66f, 480.0f, 119.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mPhotoPickerButton = mOverrideElementLayoutDescriptors.get("photoPickerButton");
            if (override_mPhotoPickerButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mPhotoPickerButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mPhotoPickerButton = layoutDescs;
                }
            }
        }
        layoutDescs_mPhotoPickerButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhotoPickerButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPhotoPickerButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhotoPickerButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPhotoPickerButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhotoPickerButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPhotoPickerButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPhotoPickerButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mPhotoPickerButton, dm, layoutDescs_mPhotoPickerButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPhotopicker = new ArrayList<LayoutDesc>();
        layoutDescs_mPhotopicker.add(new LayoutDesc(10, -650.0f, 342.0f, LayoutDesc.NO_VALUE, 306.02f, 306.02f));  // 720*1280 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(2, -282.0f, 137.0f, LayoutDesc.NO_VALUE, 133.01f, 133.01f));  // 240*320 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(12, -819.0f, 445.0f, LayoutDesc.NO_VALUE, 385.99f, 385.99f));  // 1080*1920 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(8, -461.0f, 203.0f, LayoutDesc.NO_VALUE, 217.02f, 217.02f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mPhotopicker = mOverrideElementLayoutDescriptors.get("photopicker");
            if (override_mPhotopicker != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mPhotopicker.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mPhotopicker = layoutDescs;
                }
            }
        }
        applyLayoutToView(mPhotopicker, dm, layoutDescs_mPhotopicker, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmText = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmText.add(new LayoutDesc(10, 14.0f, 475.06f, LayoutDesc.NO_VALUE, 706.0f, 62.0f));  // 720*1280 px
        layoutDescs_mAlarmText.add(new LayoutDesc(2, 5.0f, 110.92f, LayoutDesc.NO_VALUE, 235.0f, 31.0f));  // 240*320 px
        layoutDescs_mAlarmText.add(new LayoutDesc(12, 22.0f, 729.4f, LayoutDesc.NO_VALUE, 1058.0f, 76.0f));  // 1080*1920 px
        layoutDescs_mAlarmText.add(new LayoutDesc(8, 10.0f, 294.42f, LayoutDesc.NO_VALUE, 470.0f, 46.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmText = mOverrideElementLayoutDescriptors.get("alarmText");
            if (override_mAlarmText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmText = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mAlarmText, dm, layoutDescs_mAlarmText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmTypeButtonCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmTypeButtonCopy.add(new LayoutDesc(10, 0.0f, 389.06f, 717.5f, 720.0f, 173.44f));  // 720*1280 px
        layoutDescs_mAlarmTypeButtonCopy.add(new LayoutDesc(2, 0.0f, 81.92f, 191.0f, 240.0f, 47.08f));  // 240*320 px
        layoutDescs_mAlarmTypeButtonCopy.add(new LayoutDesc(12, 0.0f, 599.4f, 1064.0f, 1080.0f, 256.6f));  // 1080*1920 px
        layoutDescs_mAlarmTypeButtonCopy.add(new LayoutDesc(8, 0.0f, 236.42f, 453.5f, 480.0f, 110.08f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmTypeButtonCopy = mOverrideElementLayoutDescriptors.get("alarmTypeButtonCopy");
            if (override_mAlarmTypeButtonCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmTypeButtonCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmTypeButtonCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmTypeButtonCopy.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTypeButtonCopy.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mAlarmTypeButtonCopy, dm, layoutDescs_mAlarmTypeButtonCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy7 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(10, 0.0f, 389.06f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(2, 0.0f, 81.92f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(12, 0.0f, 599.4f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(8, 0.0f, 236.42f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy7 = mOverrideElementLayoutDescriptors.get("rectangleCopy7");
            if (override_mRectangleCopy7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy7 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy7.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy7.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy7.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy7.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy7, dm, layoutDescs_mRectangleCopy7, true, true);

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

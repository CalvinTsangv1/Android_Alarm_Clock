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

public class Stencil3View extends FrameLayout implements AdapterView {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private Stencil3BackgroundShapeView mBackgroundShape;
    private Stencil3RectangleView mRectangle;
    private Stencil3EllipseView mEllipse;
    private Stencil3ImageView mImage;
    private android.support.v7.widget.SwitchCompat mAlarmSwitch;
    private TextView mTitleText;
    private TextView mTimeText;
    private TextView mAm_PmText;
    private TextView mMondayText;
    private TextView mTuesdayText;
    private TextView mWednesdayText;
    private TextView mThurdayText;
    private TextView mFridayText;
    private TextView mSaturdayText;
    private TextView mSundayText;
    private ImageButton mMusicEnableicon;
    private ImageButton mVibreateEnableicon;
    private Button mAlarmColorEditButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();
    private OnContentChangeListener mOnContentChangeListener;
    private Fragment mOwner;
    
    public Stencil3View(Fragment owner) {
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
        final View rootView = inflater.inflate(R.layout.view_stencil3, container, false);
                
        mBackgroundShape = (Stencil3BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (Stencil3RectangleView) rootView.findViewById(R.id.mRectangle);
        mEllipse = (Stencil3EllipseView) rootView.findViewById(R.id.mEllipse);
        mImage = (Stencil3ImageView) rootView.findViewById(R.id.mImage);
        mAlarmSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mAlarmSwitch);
        mTitleText = (TextView) rootView.findViewById(R.id.mTitleText);
        mTimeText = (TextView) rootView.findViewById(R.id.mTimeText);
        mAm_PmText = (TextView) rootView.findViewById(R.id.mAm_PmText);
        mMondayText = (TextView) rootView.findViewById(R.id.mMondayText);
        mTuesdayText = (TextView) rootView.findViewById(R.id.mTuesdayText);
        mWednesdayText = (TextView) rootView.findViewById(R.id.mWednesdayText);
        mThurdayText = (TextView) rootView.findViewById(R.id.mThurdayText);
        mFridayText = (TextView) rootView.findViewById(R.id.mFridayText);
        mSaturdayText = (TextView) rootView.findViewById(R.id.mSaturdayText);
        mSundayText = (TextView) rootView.findViewById(R.id.mSundayText);
        mMusicEnableicon = (ImageButton) rootView.findViewById(R.id.mMusicEnableicon);
        mVibreateEnableicon = (ImageButton) rootView.findViewById(R.id.mVibreateEnableicon);
        mAlarmColorEditButton = (Button) rootView.findViewById(R.id.mAlarmColorEditButton);
        final Fragment fragment = mOwner;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mTitleText.setText(AppData.getLocalizedString("neonto_stencil3_text_371431", ""));

        
        mTimeText.setText(AppData.getLocalizedString("neonto_stencil3_text2_38017", ""));

        
        mAm_PmText.setText(AppData.getLocalizedString("neonto_stencil3_text3_832386", ""));

        
        mMondayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_611837", ""));

        
        mTuesdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_828838", ""));

        
        mWednesdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_611360", ""));

        
        mThurdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_731487", ""));

        
        mFridayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_629373", ""));

        
        mSaturdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_18834", ""));

        
        mSundayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_417146", ""));

        

        

        
        mAlarmColorEditButton.setOnClickListener(new View.OnClickListener() {
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
                if ( !mDataSheetUpdatedElems.contains(mTitleText)) {
                    mTitleText.setText(AppData.getLocalizedString("neonto_stencil3_text_371431", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTimeText)) {
                    mTimeText.setText(AppData.getLocalizedString("neonto_stencil3_text2_38017", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mAm_PmText)) {
                    mAm_PmText.setText(AppData.getLocalizedString("neonto_stencil3_text3_832386", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mMondayText)) {
                    mMondayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_611837", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTuesdayText)) {
                    mTuesdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_828838", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mWednesdayText)) {
                    mWednesdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_611360", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mThurdayText)) {
                    mThurdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_731487", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mFridayText)) {
                    mFridayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_629373", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSaturdayText)) {
                    mSaturdayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_18834", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSundayText)) {
                    mSundayText.setText(AppData.getLocalizedString("neonto_stencil3_text4_417146", ""));
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
                                if (isAsync) {
                                    mOnContentChangeListener.onContentChange();
                                }
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
            val = row.get("AlarmSwitch");
            if (val == null) val = row.get("alarmswitch");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mAlarmSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("Title");
            if (val == null) val = row.get("title");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTitleText.setText((String) value);
                    mDataSheetUpdatedElems.add(mTitleText);
                }
            }
        }
        {
            val = row.get("TimeText");
            if (val == null) val = row.get("timetext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTimeText.setText((String) value);
                    mDataSheetUpdatedElems.add(mTimeText);
                }
            }
        }
        {
            val = row.get("Am_PmText");
            if (val == null) val = row.get("am_pmtext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mAm_PmText.setText((String) value);
                    mDataSheetUpdatedElems.add(mAm_PmText);
                }
            }
        }
        {
            val = row.get("MondayText");
            if (val == null) val = row.get("mondaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mMondayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mMondayText);
                }
            }
        }
        {
            val = row.get("TuesdayText");
            if (val == null) val = row.get("tuesdaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTuesdayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mTuesdayText);
                }
            }
        }
        {
            val = row.get("WednesdayText");
            if (val == null) val = row.get("wednesdaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mWednesdayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mWednesdayText);
                }
            }
        }
        {
            val = row.get("ThurdayText");
            if (val == null) val = row.get("thurdaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mThurdayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mThurdayText);
                }
            }
        }
        {
            val = row.get("FridayText");
            if (val == null) val = row.get("fridaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mFridayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mFridayText);
                }
            }
        }
        {
            val = row.get("SaturdayText");
            if (val == null) val = row.get("saturdaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSaturdayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mSaturdayText);
                }
            }
        }
        {
            val = row.get("SundayText");
            if (val == null) val = row.get("sundaytext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSundayText.setText((String) value);
                    mDataSheetUpdatedElems.add(mSundayText);
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
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 290.0f, 287.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 126.0f, 125.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 366.0f, 362.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 206.0f, 203.0f));  // 480*800 px
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
        layoutDescs_mRectangle.add(new LayoutDesc(10, 43.0f, 13.0f, LayoutDesc.NO_VALUE, 234.0f, 161.51f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 18.0f, 6.0f, LayoutDesc.NO_VALUE, 102.0f, 70.20f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 54.0f, 16.0f, LayoutDesc.NO_VALUE, 296.0f, 203.71f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 30.0f, 9.0f, LayoutDesc.NO_VALUE, 167.0f, 114.54f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mEllipse = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipse.add(new LayoutDesc(10, 9.0f, 4.0f, LayoutDesc.NO_VALUE, 182.76f, 182.76f));  // 720*1280 px
        layoutDescs_mEllipse.add(new LayoutDesc(2, 4.0f, 2.0f, LayoutDesc.NO_VALUE, 79.44f, 79.44f));  // 240*320 px
        layoutDescs_mEllipse.add(new LayoutDesc(12, 11.0f, 5.0f, LayoutDesc.NO_VALUE, 230.52f, 230.52f));  // 1080*1920 px
        layoutDescs_mEllipse.add(new LayoutDesc(8, 6.0f, 3.0f, LayoutDesc.NO_VALUE, 129.61f, 129.61f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipse = mOverrideElementLayoutDescriptors.get("ellipse");
            if (override_mEllipse != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipse.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipse = layoutDescs;
                }
            }
        }
        applyLayoutToView(mEllipse, dm, layoutDescs_mEllipse, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 19.0f, 17.0f, LayoutDesc.NO_VALUE, 158.0f, 158.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 8.0f, 7.0f, LayoutDesc.NO_VALUE, 69.0f, 69.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 24.0f, 21.0f, LayoutDesc.NO_VALUE, 199.0f, 199.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 14.0f, 12.0f, LayoutDesc.NO_VALUE, 112.0f, 112.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.150476190, 0.0, 0.0, 0.150476190, 0.0, -39.5]; [0.150476190, 0.0, 0.0, 0.150476190, 2.407619048, -7.147619048]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.065714286, 0.0, 0.0, 0.065714286, 0.0, -17.250]; [0.065714286, 0.0, 0.0, 0.065714286, 1.051428571, -3.121428571]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.189523810, 0.0, 0.0, 0.189523810, 0.0, -49.750]; [0.189523810, 0.0, 0.0, 0.189523810, 3.032380952, -9.002380952]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.106666667, 0.0, 0.0, 0.106666667, 0.0, -28.0]; [0.106666667, 0.0, 0.0, 0.106666667, 1.706666667, -5.066666667]";
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmSwitch.add(new LayoutDesc(10, 173.0f, 64.0f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mAlarmSwitch.add(new LayoutDesc(2, 75.0f, 28.0f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mAlarmSwitch.add(new LayoutDesc(12, 218.0f, 80.0f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mAlarmSwitch.add(new LayoutDesc(8, 123.0f, 45.0f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmSwitch = mOverrideElementLayoutDescriptors.get("alarmSwitch");
            if (override_mAlarmSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmSwitch = layoutDescs;
                }
            }
        }
        applyLayoutToView(mAlarmSwitch, dm, layoutDescs_mAlarmSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTitleText = new ArrayList<LayoutDesc>();
        layoutDescs_mTitleText.add(new LayoutDesc(10, 191.0f, 15.0f, LayoutDesc.NO_VALUE, 297.52f, 45.0f));  // 720*1280 px
        layoutDescs_mTitleText.add(new LayoutDesc(2, 83.0f, 6.0f, LayoutDesc.NO_VALUE, 129.32f, 23.0f));  // 240*320 px
        layoutDescs_mTitleText.add(new LayoutDesc(12, 241.0f, 19.0f, LayoutDesc.NO_VALUE, 375.26f, 55.0f));  // 1080*1920 px
        layoutDescs_mTitleText.add(new LayoutDesc(8, 136.0f, 11.0f, LayoutDesc.NO_VALUE, 210.99f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTitleText = mOverrideElementLayoutDescriptors.get("titleText");
            if (override_mTitleText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTitleText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTitleText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTitleText, dm, layoutDescs_mTitleText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimeText = new ArrayList<LayoutDesc>();
        layoutDescs_mTimeText.add(new LayoutDesc(10, 213.0f, 51.0f, LayoutDesc.NO_VALUE, 199.77f, 83.0f));  // 720*1280 px
        layoutDescs_mTimeText.add(new LayoutDesc(2, 92.0f, 22.0f, LayoutDesc.NO_VALUE, 86.83f, 40.0f));  // 240*320 px
        layoutDescs_mTimeText.add(new LayoutDesc(12, 268.0f, 64.0f, LayoutDesc.NO_VALUE, 251.96f, 103.0f));  // 1080*1920 px
        layoutDescs_mTimeText.add(new LayoutDesc(8, 151.0f, 36.0f, LayoutDesc.NO_VALUE, 141.66f, 61.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimeText = mOverrideElementLayoutDescriptors.get("timeText");
            if (override_mTimeText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimeText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimeText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTimeText, dm, layoutDescs_mTimeText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAm_PmText = new ArrayList<LayoutDesc>();
        layoutDescs_mAm_PmText.add(new LayoutDesc(10, 404.0f, 60.0f, LayoutDesc.NO_VALUE, 76.51f, 49.0f));  // 720*1280 px
        layoutDescs_mAm_PmText.add(new LayoutDesc(2, 176.0f, 26.0f, LayoutDesc.NO_VALUE, 33.25f, 25.0f));  // 240*320 px
        layoutDescs_mAm_PmText.add(new LayoutDesc(12, 509.0f, 75.0f, LayoutDesc.NO_VALUE, 96.50f, 60.0f));  // 1080*1920 px
        layoutDescs_mAm_PmText.add(new LayoutDesc(8, 286.0f, 42.0f, LayoutDesc.NO_VALUE, 54.25f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAm_PmText = mOverrideElementLayoutDescriptors.get("am_PmText");
            if (override_mAm_PmText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAm_PmText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAm_PmText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mAm_PmText, dm, layoutDescs_mAm_PmText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMondayText = new ArrayList<LayoutDesc>();
        layoutDescs_mMondayText.add(new LayoutDesc(10, 174.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mMondayText.add(new LayoutDesc(2, 76.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mMondayText.add(new LayoutDesc(12, 220.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mMondayText.add(new LayoutDesc(8, 124.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMondayText = mOverrideElementLayoutDescriptors.get("mondayText");
            if (override_mMondayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMondayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMondayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mMondayText, dm, layoutDescs_mMondayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTuesdayText = new ArrayList<LayoutDesc>();
        layoutDescs_mTuesdayText.add(new LayoutDesc(10, 223.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mTuesdayText.add(new LayoutDesc(2, 97.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mTuesdayText.add(new LayoutDesc(12, 281.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mTuesdayText.add(new LayoutDesc(8, 158.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTuesdayText = mOverrideElementLayoutDescriptors.get("tuesdayText");
            if (override_mTuesdayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTuesdayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTuesdayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTuesdayText, dm, layoutDescs_mTuesdayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mWednesdayText = new ArrayList<LayoutDesc>();
        layoutDescs_mWednesdayText.add(new LayoutDesc(10, 272.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mWednesdayText.add(new LayoutDesc(2, 118.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mWednesdayText.add(new LayoutDesc(12, 343.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mWednesdayText.add(new LayoutDesc(8, 193.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mWednesdayText = mOverrideElementLayoutDescriptors.get("wednesdayText");
            if (override_mWednesdayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mWednesdayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mWednesdayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mWednesdayText, dm, layoutDescs_mWednesdayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mThurdayText = new ArrayList<LayoutDesc>();
        layoutDescs_mThurdayText.add(new LayoutDesc(10, 319.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mThurdayText.add(new LayoutDesc(2, 139.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mThurdayText.add(new LayoutDesc(12, 402.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mThurdayText.add(new LayoutDesc(8, 226.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mThurdayText = mOverrideElementLayoutDescriptors.get("thurdayText");
            if (override_mThurdayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mThurdayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mThurdayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mThurdayText, dm, layoutDescs_mThurdayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFridayText = new ArrayList<LayoutDesc>();
        layoutDescs_mFridayText.add(new LayoutDesc(10, 366.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mFridayText.add(new LayoutDesc(2, 159.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mFridayText.add(new LayoutDesc(12, 461.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mFridayText.add(new LayoutDesc(8, 259.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFridayText = mOverrideElementLayoutDescriptors.get("fridayText");
            if (override_mFridayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFridayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFridayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mFridayText, dm, layoutDescs_mFridayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSaturdayText = new ArrayList<LayoutDesc>();
        layoutDescs_mSaturdayText.add(new LayoutDesc(10, 412.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mSaturdayText.add(new LayoutDesc(2, 179.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mSaturdayText.add(new LayoutDesc(12, 520.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mSaturdayText.add(new LayoutDesc(8, 292.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSaturdayText = mOverrideElementLayoutDescriptors.get("saturdayText");
            if (override_mSaturdayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSaturdayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSaturdayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mSaturdayText, dm, layoutDescs_mSaturdayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSundayText = new ArrayList<LayoutDesc>();
        layoutDescs_mSundayText.add(new LayoutDesc(10, 463.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs_mSundayText.add(new LayoutDesc(2, 201.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs_mSundayText.add(new LayoutDesc(12, 584.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs_mSundayText.add(new LayoutDesc(8, 329.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSundayText = mOverrideElementLayoutDescriptors.get("sundayText");
            if (override_mSundayText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSundayText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSundayText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mSundayText, dm, layoutDescs_mSundayText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMusicEnableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(10, 81.75f, 98.0f, LayoutDesc.NO_VALUE, 38.25f, 38.25f));  // 720*1280 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(2, 35.37f, 42.0f, LayoutDesc.NO_VALUE, 16.63f, 16.63f));  // 240*320 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(12, 103.75f, 123.0f, LayoutDesc.NO_VALUE, 48.25f, 48.25f));  // 1080*1920 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(8, 57.87f, 69.0f, LayoutDesc.NO_VALUE, 27.13f, 27.13f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMusicEnableicon = mOverrideElementLayoutDescriptors.get("musicEnableicon");
            if (override_mMusicEnableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMusicEnableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMusicEnableicon = layoutDescs;
                }
            }
        }
        applyLayoutToView(mMusicEnableicon, dm, layoutDescs_mMusicEnableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mVibreateEnableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(10, 119.75f, 98.0f, LayoutDesc.NO_VALUE, 38.25f, 38.25f));  // 720*1280 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(2, 52.37f, 42.0f, LayoutDesc.NO_VALUE, 16.63f, 16.63f));  // 240*320 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(12, 151.75f, 123.0f, LayoutDesc.NO_VALUE, 48.25f, 48.25f));  // 1080*1920 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(8, 85.87f, 69.0f, LayoutDesc.NO_VALUE, 27.13f, 27.13f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVibreateEnableicon = mOverrideElementLayoutDescriptors.get("vibreateEnableicon");
            if (override_mVibreateEnableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVibreateEnableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVibreateEnableicon = layoutDescs;
                }
            }
        }
        applyLayoutToView(mVibreateEnableicon, dm, layoutDescs_mVibreateEnableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmColorEditButton = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmColorEditButton.add(new LayoutDesc(10, 85.0f, 13.0f, LayoutDesc.NO_VALUE, 77.0f, 161.51f));  // 720*1280 px
        layoutDescs_mAlarmColorEditButton.add(new LayoutDesc(2, 37.0f, 6.0f, LayoutDesc.NO_VALUE, 34.0f, 70.20f));  // 240*320 px
        layoutDescs_mAlarmColorEditButton.add(new LayoutDesc(12, 107.0f, 16.0f, LayoutDesc.NO_VALUE, 98.0f, 203.71f));  // 1080*1920 px
        layoutDescs_mAlarmColorEditButton.add(new LayoutDesc(8, 60.0f, 9.0f, LayoutDesc.NO_VALUE, 56.0f, 114.54f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmColorEditButton = mOverrideElementLayoutDescriptors.get("alarmColorEditButton");
            if (override_mAlarmColorEditButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmColorEditButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmColorEditButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mAlarmColorEditButton, dm, layoutDescs_mAlarmColorEditButton, true, true);

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

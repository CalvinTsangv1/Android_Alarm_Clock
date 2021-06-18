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

public class RecordStopwatchListItemView extends FrameLayout implements AdapterView {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private RecordStopwatchListItemBackgroundShapeView mBackgroundShape;
    private TextView mText3;
    private TextView mText5;
    private TextView mText6;
    private TextView mText8;
    private Button mEnterButton;
    private RecordStopwatchListItemImageView mImage;
    private TextView mTitleTextoutput;
    private TextView mDateTextoutput;
    private TextView mTimeTextoutput;
    private TextView mEventTypeTextoutput;
    private TextView mDecriptionTextoutput;
    private TextView mTotalTimeTextoutput;
    private TextView mLapNoTextouput;
    private ImageButton mIconButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();
    private OnContentChangeListener mOnContentChangeListener;
    private Fragment mOwner;
    
    public RecordStopwatchListItemView(Fragment owner) {
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
        final View rootView = inflater.inflate(R.layout.view_record_stopwatch_list_item, container, false);
                
        mBackgroundShape = (RecordStopwatchListItemBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mEnterButton = (Button) rootView.findViewById(R.id.mEnterButton);
        mImage = (RecordStopwatchListItemImageView) rootView.findViewById(R.id.mImage);
        mTitleTextoutput = (TextView) rootView.findViewById(R.id.mTitleTextoutput);
        mDateTextoutput = (TextView) rootView.findViewById(R.id.mDateTextoutput);
        mTimeTextoutput = (TextView) rootView.findViewById(R.id.mTimeTextoutput);
        mEventTypeTextoutput = (TextView) rootView.findViewById(R.id.mEventTypeTextoutput);
        mDecriptionTextoutput = (TextView) rootView.findViewById(R.id.mDecriptionTextoutput);
        mTotalTimeTextoutput = (TextView) rootView.findViewById(R.id.mTotalTimeTextoutput);
        mLapNoTextouput = (TextView) rootView.findViewById(R.id.mLapNoTextouput);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        final Fragment fragment = mOwner;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText3.setText(AppData.getLocalizedString("neonto_recordlistitem_text3_649308", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_recordlistitem_text5_759437", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_recordlistitem_text6_202406", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_recordlistitem_text8_911068", ""));

        
        mEnterButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RecordDetailActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        
        mTitleTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text7_860760", ""));

        
        mDateTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text_491121", ""));

        
        mTimeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text2_797776", ""));

        
        mEventTypeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text4_886133", ""));

        
        mDecriptionTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text9_201370", ""));

        
        mTotalTimeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text10_919284", ""));

        
        mLapNoTextouput.setText(AppData.getLocalizedString("neonto_recordlistitem_text11_784308", ""));

        

        
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
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_recordlistitem_text3_649308", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_recordlistitem_text5_759437", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_recordlistitem_text6_202406", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_recordlistitem_text8_911068", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTitleTextoutput)) {
                    mTitleTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text7_860760", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mDateTextoutput)) {
                    mDateTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text_491121", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTimeTextoutput)) {
                    mTimeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text2_797776", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mEventTypeTextoutput)) {
                    mEventTypeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text4_886133", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mDecriptionTextoutput)) {
                    mDecriptionTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text9_201370", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTotalTimeTextoutput)) {
                    mTotalTimeTextoutput.setText(AppData.getLocalizedString("neonto_recordlistitem_text10_919284", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mLapNoTextouput)) {
                    mLapNoTextouput.setText(AppData.getLocalizedString("neonto_recordlistitem_text11_784308", ""));
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
            val = row.get("Title");
            if (val == null) val = row.get("title");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTitleTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mTitleTextoutput);
                }
            }
        }
        {
            val = row.get("RecordDate");
            if (val == null) val = row.get("recorddate");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mDateTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mDateTextoutput);
                }
            }
        }
        {
            val = row.get("RecordTime");
            if (val == null) val = row.get("recordtime");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTimeTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mTimeTextoutput);
                }
            }
        }
        {
            val = row.get("EventType");
            if (val == null) val = row.get("eventtype");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mEventTypeTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mEventTypeTextoutput);
                }
            }
        }
        {
            val = row.get("Description");
            if (val == null) val = row.get("description");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mDecriptionTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mDecriptionTextoutput);
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
                    mTotalTimeTextoutput.setText((String) value);
                    mDataSheetUpdatedElems.add(mTotalTimeTextoutput);
                }
            }
        }
        {
            val = row.get("BestTime");
            if (val == null) val = row.get("besttime");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mLapNoTextouput.setText((String) value);
                    mDataSheetUpdatedElems.add(mLapNoTextouput);
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
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 0.0f, 0.0f, 89.0f, 180.0f, 297.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 0.0f, 0.0f, 39.0f, 78.0f, 129.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 0.0f, 0.0f, 113.0f, 227.0f, 374.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 0.0f, 0.0f, 63.0f, 128.0f, 211.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 128.0f, 13.0f, LayoutDesc.NO_VALUE, 85.01f, 41.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 55.0f, 6.0f, LayoutDesc.NO_VALUE, 36.95f, 21.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 161.0f, 16.0f, LayoutDesc.NO_VALUE, 107.22f, 49.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 90.0f, 9.0f, LayoutDesc.NO_VALUE, 60.28f, 31.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText3 = mOverrideElementLayoutDescriptors.get("text3");
            if (override_mText3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText3 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 128.0f, 132.0f, LayoutDesc.NO_VALUE, 85.01f, 45.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 55.0f, 57.0f, LayoutDesc.NO_VALUE, 36.95f, 23.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 161.0f, 166.0f, LayoutDesc.NO_VALUE, 107.22f, 55.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 90.0f, 93.0f, LayoutDesc.NO_VALUE, 60.28f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText5 = mOverrideElementLayoutDescriptors.get("text5");
            if (override_mText5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText5 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 357.0f, 132.0f, LayoutDesc.NO_VALUE, 140.26f, 45.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 155.0f, 57.0f, LayoutDesc.NO_VALUE, 60.96f, 23.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 450.0f, 166.0f, LayoutDesc.NO_VALUE, 176.91f, 55.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 253.0f, 93.0f, LayoutDesc.NO_VALUE, 99.47f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText6 = mOverrideElementLayoutDescriptors.get("text6");
            if (override_mText6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText6 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 4.0f, 166.0f, LayoutDesc.NO_VALUE, 212.52f, 49.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 2.0f, 72.0f, LayoutDesc.NO_VALUE, 92.37f, 25.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 5.0f, 209.0f, LayoutDesc.NO_VALUE, 268.05f, 60.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 3.0f, 118.0f, LayoutDesc.NO_VALUE, 150.71f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText8 = mOverrideElementLayoutDescriptors.get("text8");
            if (override_mText8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText8 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEnterButton = new ArrayList<LayoutDesc>();
        layoutDescs_mEnterButton.add(new LayoutDesc(10, 0.0f, 0.0f, 89.0f, 61.0f, 297.0f));  // 720*1280 px
        layoutDescs_mEnterButton.add(new LayoutDesc(2, 0.0f, 0.0f, 39.0f, 26.0f, 129.0f));  // 240*320 px
        layoutDescs_mEnterButton.add(new LayoutDesc(12, 0.0f, 0.0f, 113.0f, 77.0f, 374.0f));  // 1080*1920 px
        layoutDescs_mEnterButton.add(new LayoutDesc(8, 0.0f, 0.0f, 63.0f, 44.0f, 211.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEnterButton = mOverrideElementLayoutDescriptors.get("enterButton");
            if (override_mEnterButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEnterButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEnterButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mEnterButton, dm, layoutDescs_mEnterButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 13.0f, 13.0f, LayoutDesc.NO_VALUE, 107.0f, 107.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 6.0f, 6.0f, LayoutDesc.NO_VALUE, 47.0f, 47.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 16.0f, 16.0f, LayoutDesc.NO_VALUE, 135.0f, 135.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 9.0f, 9.0f, LayoutDesc.NO_VALUE, 76.0f, 76.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.101904762, 0.0, 0.0, 0.101904762, 0.0, -26.750]; [0.101904762, 0.0, 0.0, 0.082128794, 1.324761905, -3.515714286]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.044761905, 0.0, 0.0, 0.044761905, 0.0, -11.750]; [0.044761905, 0.0, 0.0, 0.036075264, 0.581904762, -1.544285714]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.128571429, 0.0, 0.0, 0.128571429, 0.0, -33.750]; [0.128571429, 0.0, 0.0, 0.103620440, 1.671428571, -4.435714286]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.072380952, 0.0, 0.0, 0.072380952, 0.0, -19.0]; [0.072380952, 0.0, 0.0, 0.058334470, 0.940952381, -2.497142857]";
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTitleTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mTitleTextoutput.add(new LayoutDesc(10, 208.0f, 13.0f, LayoutDesc.NO_VALUE, 382.53f, 41.0f));  // 720*1280 px
        layoutDescs_mTitleTextoutput.add(new LayoutDesc(2, 91.0f, 6.0f, LayoutDesc.NO_VALUE, 166.27f, 21.0f));  // 240*320 px
        layoutDescs_mTitleTextoutput.add(new LayoutDesc(12, 263.0f, 16.0f, LayoutDesc.NO_VALUE, 482.48f, 49.0f));  // 1080*1920 px
        layoutDescs_mTitleTextoutput.add(new LayoutDesc(8, 148.0f, 9.0f, LayoutDesc.NO_VALUE, 271.27f, 31.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTitleTextoutput = mOverrideElementLayoutDescriptors.get("titleTextoutput");
            if (override_mTitleTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTitleTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTitleTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTitleTextoutput, dm, layoutDescs_mTitleTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDateTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mDateTextoutput.add(new LayoutDesc(10, 128.0f, 55.0f, LayoutDesc.NO_VALUE, 127.51f, 45.0f));  // 720*1280 px
        layoutDescs_mDateTextoutput.add(new LayoutDesc(2, 55.0f, 24.0f, LayoutDesc.NO_VALUE, 55.42f, 23.0f));  // 240*320 px
        layoutDescs_mDateTextoutput.add(new LayoutDesc(12, 161.0f, 70.0f, LayoutDesc.NO_VALUE, 160.83f, 55.0f));  // 1080*1920 px
        layoutDescs_mDateTextoutput.add(new LayoutDesc(8, 90.0f, 39.0f, LayoutDesc.NO_VALUE, 90.42f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDateTextoutput = mOverrideElementLayoutDescriptors.get("dateTextoutput");
            if (override_mDateTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDateTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDateTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mDateTextoutput, dm, layoutDescs_mDateTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimeTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mTimeTextoutput.add(new LayoutDesc(10, 255.0f, 55.0f, LayoutDesc.NO_VALUE, 148.76f, 45.0f));  // 720*1280 px
        layoutDescs_mTimeTextoutput.add(new LayoutDesc(2, 111.0f, 24.0f, LayoutDesc.NO_VALUE, 64.66f, 23.0f));  // 240*320 px
        layoutDescs_mTimeTextoutput.add(new LayoutDesc(12, 322.0f, 70.0f, LayoutDesc.NO_VALUE, 187.63f, 55.0f));  // 1080*1920 px
        layoutDescs_mTimeTextoutput.add(new LayoutDesc(8, 181.0f, 39.0f, LayoutDesc.NO_VALUE, 105.49f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimeTextoutput = mOverrideElementLayoutDescriptors.get("timeTextoutput");
            if (override_mTimeTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimeTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimeTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTimeTextoutput, dm, layoutDescs_mTimeTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEventTypeTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mEventTypeTextoutput.add(new LayoutDesc(10, 128.0f, 89.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs_mEventTypeTextoutput.add(new LayoutDesc(2, 55.0f, 39.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs_mEventTypeTextoutput.add(new LayoutDesc(12, 161.0f, 113.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs_mEventTypeTextoutput.add(new LayoutDesc(8, 90.0f, 63.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEventTypeTextoutput = mOverrideElementLayoutDescriptors.get("eventTypeTextoutput");
            if (override_mEventTypeTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEventTypeTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEventTypeTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mEventTypeTextoutput, dm, layoutDescs_mEventTypeTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDecriptionTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mDecriptionTextoutput.add(new LayoutDesc(10, 64.0f, 204.0f, LayoutDesc.NO_VALUE, 116.0f, 92.0f));  // 720*1280 px
        layoutDescs_mDecriptionTextoutput.add(new LayoutDesc(2, 28.0f, 89.0f, LayoutDesc.NO_VALUE, 50.0f, 43.0f));  // 240*320 px
        layoutDescs_mDecriptionTextoutput.add(new LayoutDesc(12, 80.0f, 257.0f, LayoutDesc.NO_VALUE, 147.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mDecriptionTextoutput.add(new LayoutDesc(8, 45.0f, 145.0f, LayoutDesc.NO_VALUE, 83.0f, 67.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDecriptionTextoutput = mOverrideElementLayoutDescriptors.get("decriptionTextoutput");
            if (override_mDecriptionTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDecriptionTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDecriptionTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mDecriptionTextoutput, dm, layoutDescs_mDecriptionTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTotalTimeTextoutput = new ArrayList<LayoutDesc>();
        layoutDescs_mTotalTimeTextoutput.add(new LayoutDesc(10, 204.0f, 132.0f, LayoutDesc.NO_VALUE, 148.76f, 45.0f));  // 720*1280 px
        layoutDescs_mTotalTimeTextoutput.add(new LayoutDesc(2, 89.0f, 57.0f, LayoutDesc.NO_VALUE, 64.66f, 23.0f));  // 240*320 px
        layoutDescs_mTotalTimeTextoutput.add(new LayoutDesc(12, 257.0f, 166.0f, LayoutDesc.NO_VALUE, 187.63f, 55.0f));  // 1080*1920 px
        layoutDescs_mTotalTimeTextoutput.add(new LayoutDesc(8, 145.0f, 93.0f, LayoutDesc.NO_VALUE, 105.49f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTotalTimeTextoutput = mOverrideElementLayoutDescriptors.get("totalTimeTextoutput");
            if (override_mTotalTimeTextoutput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTotalTimeTextoutput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTotalTimeTextoutput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTotalTimeTextoutput, dm, layoutDescs_mTotalTimeTextoutput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLapNoTextouput = new ArrayList<LayoutDesc>();
        layoutDescs_mLapNoTextouput.add(new LayoutDesc(10, 489.0f, 132.0f, LayoutDesc.NO_VALUE, 170.01f, 45.0f));  // 720*1280 px
        layoutDescs_mLapNoTextouput.add(new LayoutDesc(2, 212.0f, 57.0f, LayoutDesc.NO_VALUE, 73.90f, 23.0f));  // 240*320 px
        layoutDescs_mLapNoTextouput.add(new LayoutDesc(12, 617.0f, 166.0f, LayoutDesc.NO_VALUE, 214.44f, 55.0f));  // 1080*1920 px
        layoutDescs_mLapNoTextouput.add(new LayoutDesc(8, 347.0f, 93.0f, LayoutDesc.NO_VALUE, 120.56f, 34.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLapNoTextouput = mOverrideElementLayoutDescriptors.get("lapNoTextouput");
            if (override_mLapNoTextouput != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLapNoTextouput.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLapNoTextouput = layoutDescs;
                }
            }
        }
        applyLayoutToView(mLapNoTextouput, dm, layoutDescs_mLapNoTextouput, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 96.49f, 15.0f, LayoutDesc.NO_VALUE, 76.51f, 76.51f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 41.75f, 7.0f, LayoutDesc.NO_VALUE, 33.25f, 33.25f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 121.50f, 19.0f, LayoutDesc.NO_VALUE, 96.50f, 96.50f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 68.75f, 11.0f, LayoutDesc.NO_VALUE, 54.25f, 54.25f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton = mOverrideElementLayoutDescriptors.get("iconButton");
            if (override_mIconButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mIconButton, dm, layoutDescs_mIconButton, true, true);

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

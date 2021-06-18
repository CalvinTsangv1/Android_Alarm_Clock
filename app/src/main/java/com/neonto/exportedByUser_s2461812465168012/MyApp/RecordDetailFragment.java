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

public class RecordDetailFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private RecordDetailBackgroundShapeView mBackgroundShape;
    private RecordDetailImageView mImage;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private RecordDetailRectangleView mRectangle;
    private RecordDetailRectangleCopyView mRectangleCopy;
    private TextView mText7;
    private TextView mText8;
    private TextView mText9;
    private TextView mText10;
    private TextView mText11;
    private RecordDetailRectangleCopy2View mRectangleCopy2;
    private RecordDetailRectangleCopy3View mRectangleCopy3;
    private ListView mList;
    private RecordDetailListAdapter mListAdapter;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public RecordDetailFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_record_detail, container, false);
                
        mBackgroundShape = (RecordDetailBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mImage = (RecordDetailImageView) rootView.findViewById(R.id.mImage);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mRectangle = (RecordDetailRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (RecordDetailRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mText11 = (TextView) rootView.findViewById(R.id.mText11);
        mRectangleCopy2 = (RecordDetailRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (RecordDetailRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mList = (ListView) rootView.findViewById(R.id.mList);
        final RecordDetailFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_recorddetail_text_1013367", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_recorddetail_text2_770021", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_recorddetail_text3_553321", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_recorddetail_text4_387883", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_recorddetail_text5_273990", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_recorddetail_text6_553960", ""));

        
        mText7.setText(AppData.getLocalizedString("neonto_recorddetail_text7_645769", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_recorddetail_text8_213808", ""));

        
        mText9.setText(AppData.getLocalizedString("neonto_recorddetail_text9_1016663", ""));

        
        mText10.setText(AppData.getLocalizedString("neonto_recorddetail_text10_52295", ""));

        
        mText11.setText(AppData.getLocalizedString("neonto_recorddetail_text11_288536", ""));

        
        final RecordDetailListAdapter recordDetailListAdapter = new RecordDetailListAdapter(this);
        recordDetailListAdapter.setDataSheet(AppData.stopwatchSaveDataSheet);
        mList.setAdapter(recordDetailListAdapter);
        mListAdapter = recordDetailListAdapter;
        
        AppData.stopwatchSaveDataSheet.addListener(new DataSheet.OnChangeListener() {
           @Override
           public void dataSheetUpdated(DataSheet sheet) {
               recordDetailListAdapter.notifyDataSetChanged();
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon797239);
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
                    mText.setText(AppData.getLocalizedString("neonto_recorddetail_text_1013367", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_recorddetail_text2_770021", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_recorddetail_text3_553321", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_recorddetail_text4_387883", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_recorddetail_text5_273990", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_recorddetail_text6_553960", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_recorddetail_text7_645769", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_recorddetail_text8_213808", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_recorddetail_text9_1016663", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText10)) {
                    mText10.setText(AppData.getLocalizedString("neonto_recorddetail_text10_52295", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText11)) {
                    mText11.setText(AppData.getLocalizedString("neonto_recorddetail_text11_288536", ""));
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
            val = row.get("RecordDate");
            if (val == null) val = row.get("recorddate");  // check lowercase version too
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
            val = row.get("RecordTime");
            if (val == null) val = row.get("recordtime");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText11.setText((String) value);
                    mDataSheetUpdatedElems.add(mText11);
                }
            }
        }
        {
            val = row.get("list");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("json") && (value instanceof org.json.JSONArray)) {
                    DataSheet sheet = new DataSheet(getActivity(), getClass().getSimpleName());
                
                    sheet.takeRowsFromJSONArray((org.json.JSONArray) value);
                
                    ((RecordDetailListAdapter) mList.getAdapter()).setDataSheet(sheet);
                    ((RecordDetailListAdapter) mList.getAdapter()).notifyDataSetChanged();
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

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 29.0f, 58.55f, LayoutDesc.NO_VALUE, 149.0f, 149.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 10.0f, -6.4f, LayoutDesc.NO_VALUE, 65.0f, 65.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 43.0f, 109.5f, LayoutDesc.NO_VALUE, 188.0f, 188.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 19.0f, 27.35f, LayoutDesc.NO_VALUE, 106.0f, 106.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.141904762, 0.0, 0.0, 0.141904762, 0.0, -37.250]; [0.139246641, 0.0, 0.0, 0.113652321, 0.0, -5.179523810]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.061904762, 0.0, 0.0, 0.061904762, 0.0, -16.250]; [0.060745179, 0.0, 0.0, 0.049579872, 0.0, -2.259523810]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.179047619, 0.0, 0.0, 0.179047619, 0.0, -47.0]; [0.175693748, 0.0, 0.0, 0.143400244, 0.0, -6.535238095]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.100952381, 0.0, 0.0, 0.100952381, 0.0, -26.5]; [0.099061369, 0.0, 0.0, 0.080853329, 0.0, -3.684761905]";
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 237.6f, 58.55f, LayoutDesc.NO_VALUE, 482.4f, 62.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 79.2f, -6.4f, LayoutDesc.NO_VALUE, 160.8f, 31.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 356.4f, 109.5f, LayoutDesc.NO_VALUE, 723.6f, 76.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 158.4f, 27.35f, LayoutDesc.NO_VALUE, 321.6f, 46.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 237.6f, 116.03f, 1098.97f, 446.29f, 65.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 79.2f, 8.96f, 288.04f, 193.98f, 23.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 356.4f, 194.7f, 1632.3f, 562.90f, 93.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 158.4f, 63.71f, 692.29f, 316.48f, 44.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 0.0f, 892.01f, 322.99f, 361.0f, 65.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 0.0f, 216.32f, 80.68f, 121.0f, 23.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 0.0f, 1344.9f, 482.1f, 541.0f, 93.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 0.0f, 554.57f, 201.43f, 241.0f, 44.0f));  // 480*800 px
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
        layoutDescs_mText3.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText3.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText3.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText3, dm, layoutDescs_mText3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 360.0f, 892.01f, 322.99f, 360.0f, 65.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 120.0f, 216.32f, 80.68f, 120.0f, 23.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 540.0f, 1344.9f, 482.1f, 540.0f, 93.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 240.0f, 554.57f, 201.43f, 240.0f, 44.0f));  // 480*800 px
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
        layoutDescs_mText4.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText4.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText4.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText4.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText4.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 0.0f, 949.49f, 251.51f, 361.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 0.0f, 231.68f, 61.32f, 121.0f, 27.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 0.0f, 1430.1f, 375.9f, 541.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 0.0f, 590.93f, 156.07f, 241.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText5.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText5.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText5.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText5.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText5.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText5, dm, layoutDescs_mText5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText6 = new ArrayList<LayoutDesc>();
        layoutDescs_mText6.add(new LayoutDesc(10, 360.0f, 949.49f, 251.51f, 360.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 120.0f, 231.68f, 61.32f, 120.0f, 27.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 540.0f, 1430.1f, 375.9f, 540.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 240.0f, 590.93f, 156.07f, 240.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText6.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText6.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText6.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText6.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText6.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText6, dm, layoutDescs_mText6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 892.01f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 216.32f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 1344.9f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 554.57f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 1021.34f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 250.88f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 1536.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 636.38f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 0.0f, 1021.34f, 193.66f, 361.0f, 65.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 0.0f, 250.88f, 46.12f, 121.0f, 23.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 0.0f, 1536.6f, 290.4f, 541.0f, 93.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 0.0f, 636.38f, 119.62f, 241.0f, 44.0f));  // 480*800 px
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
        layoutDescs_mText7.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText7.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText7.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText7.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText7.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 360.0f, 1021.34f, 193.66f, 360.0f, 65.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 120.0f, 250.88f, 46.12f, 120.0f, 23.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 540.0f, 1536.6f, 290.4f, 540.0f, 93.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 240.0f, 636.38f, 119.62f, 240.0f, 44.0f));  // 480*800 px
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
        layoutDescs_mText8.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText8.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText8.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText8.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText8.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText8, dm, layoutDescs_mText8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 0.0f, 1078.82f, 122.18f, 361.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 0.0f, 266.24f, 26.76f, 121.0f, 27.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 0.0f, 1621.8f, 184.2f, 541.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 0.0f, 672.74f, 74.26f, 241.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText9.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText9.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText9.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText9.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText9.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText9, dm, layoutDescs_mText9, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 360.0f, 1078.82f, 122.18f, 360.0f, 79.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 120.0f, 266.24f, 26.76f, 120.0f, 27.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 540.0f, 1621.8f, 184.2f, 540.0f, 114.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 240.0f, 672.74f, 74.26f, 240.0f, 53.0f));  // 480*800 px
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
        layoutDescs_mText10.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText10.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText10.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText10.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText10.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText11 = new ArrayList<LayoutDesc>();
        layoutDescs_mText11.add(new LayoutDesc(10, 237.6f, 173.51f, 1041.49f, 446.29f, 65.0f));  // 720*1280 px
        layoutDescs_mText11.add(new LayoutDesc(2, 79.2f, 24.32f, 272.68f, 193.98f, 23.0f));  // 240*320 px
        layoutDescs_mText11.add(new LayoutDesc(12, 356.4f, 279.9f, 1547.1f, 562.90f, 93.0f));  // 1080*1920 px
        layoutDescs_mText11.add(new LayoutDesc(8, 158.4f, 100.07f, 655.93f, 316.48f, 44.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText11 = mOverrideElementLayoutDescriptors.get("text11");
            if (override_mText11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText11 = layoutDescs;
                }
            }
        }
        layoutDescs_mText11.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText11.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText11.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText11.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText11.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText11.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mText11.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText11.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mText11, dm, layoutDescs_mText11, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 1150.67f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 285.44f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 1728.3f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 718.19f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 288.47f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 55.04f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 450.3f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 172.79f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mList = new ArrayList<LayoutDesc>();
        layoutDescs_mList.add(new LayoutDesc(10, 22.0f, 317.21f, 386.79f, 676.0f, 576.0f));  // 720*1280 px
        layoutDescs_mList.add(new LayoutDesc(2, 7.0f, 62.72f, 102.28f, 226.0f, 155.0f));  // 240*320 px
        layoutDescs_mList.add(new LayoutDesc(12, 32.0f, 492.9f, 574.1f, 1016.0f, 853.0f));  // 1080*1920 px
        layoutDescs_mList.add(new LayoutDesc(8, 14.0f, 190.97f, 244.03f, 452.0f, 365.0f));  // 480*800 px
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

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

public class MoreFragment extends Fragment {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private MoreBackgroundShapeView mBackgroundShape;
    private MoreRectangleView mRectangle;
    private MoreRectangleCopyView mRectangleCopy;
    private MoreRectangleCopy2View mRectangleCopy2;
    private MoreRectangleCopy4View mRectangleCopy4;
    private MoreRectangleCopy5View mRectangleCopy5;
    private MoreRectangleCopy6View mRectangleCopy6;
    private MoreRectangleCopy7View mRectangleCopy7;
    private MoreRectangleCopy8View mRectangleCopy8;
    private ImageButton mBackButton;
    private ImageButton mBackButton2;
    private ImageButton mBackButton3;
    private ImageButton mBackButton4;
    private ImageButton mBackButton5;
    private ImageButton mBackButton6;
    private ImageButton mBackButton7;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private TextView mText7;
    private Button mFAQButton;
    private Button mContactusButton;
    private Button mUpgradeButton;
    private Button mRemoveadsButton;
    private Button mRateusButton;
    private Button mShareButton;
    private Button mSettingButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public MoreFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_more, container, false);
                
        mBackgroundShape = (MoreBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (MoreRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (MoreRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (MoreRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy4 = (MoreRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangleCopy5 = (MoreRectangleCopy5View) rootView.findViewById(R.id.mRectangleCopy5);
        mRectangleCopy6 = (MoreRectangleCopy6View) rootView.findViewById(R.id.mRectangleCopy6);
        mRectangleCopy7 = (MoreRectangleCopy7View) rootView.findViewById(R.id.mRectangleCopy7);
        mRectangleCopy8 = (MoreRectangleCopy8View) rootView.findViewById(R.id.mRectangleCopy8);
        mBackButton = (ImageButton) rootView.findViewById(R.id.mBackButton);
        mBackButton2 = (ImageButton) rootView.findViewById(R.id.mBackButton2);
        mBackButton3 = (ImageButton) rootView.findViewById(R.id.mBackButton3);
        mBackButton4 = (ImageButton) rootView.findViewById(R.id.mBackButton4);
        mBackButton5 = (ImageButton) rootView.findViewById(R.id.mBackButton5);
        mBackButton6 = (ImageButton) rootView.findViewById(R.id.mBackButton6);
        mBackButton7 = (ImageButton) rootView.findViewById(R.id.mBackButton7);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mFAQButton = (Button) rootView.findViewById(R.id.mFAQButton);
        mContactusButton = (Button) rootView.findViewById(R.id.mContactusButton);
        mUpgradeButton = (Button) rootView.findViewById(R.id.mUpgradeButton);
        mRemoveadsButton = (Button) rootView.findViewById(R.id.mRemoveadsButton);
        mRateusButton = (Button) rootView.findViewById(R.id.mRateusButton);
        mShareButton = (Button) rootView.findViewById(R.id.mShareButton);
        mSettingButton = (Button) rootView.findViewById(R.id.mSettingButton);
        final MoreFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mBackButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton3.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton4.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton5.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton6.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mBackButton7.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mText.setText(AppData.getLocalizedString("neonto_more_text_363029", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_more_text2_728139", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_more_text3_895533", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_more_text4_42769", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_more_text5_946278", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_more_text6_499994", ""));

        
        mText7.setText(AppData.getLocalizedString("neonto_more_text7_137219", ""));

        

        
        mContactusButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ContactUsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        

        

        

        

        
        mSettingButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
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
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
    }

    public void updateLocalizedValues() {
        // needs to be run on UI thread
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_more_text_363029", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_more_text2_728139", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_more_text3_895533", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_more_text4_42769", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_more_text5_946278", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_more_text6_499994", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_more_text7_137219", ""));
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
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 166.32f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 22.4f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 269.25f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 95.53f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 302.84f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 58.88f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 471.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 181.88f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 439.35f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 95.36f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 673.95f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 268.23f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy4 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 575.87f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 131.84f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 876.3f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 354.59f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(10, 0.0f, 712.38f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(2, 0.0f, 168.32f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(12, 0.0f, 1078.65f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(8, 0.0f, 440.94f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(10, 0.0f, 848.9f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(2, 0.0f, 204.8f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(12, 0.0f, 1281.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(8, 0.0f, 527.3f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy7 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(10, 0.0f, 985.41f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(2, 0.0f, 241.28f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(12, 0.0f, 1483.35f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(8, 0.0f, 613.66f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy8 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy8.add(new LayoutDesc(10, 0.0f, 166.32f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy8.add(new LayoutDesc(2, 0.0f, 22.4f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy8.add(new LayoutDesc(12, 0.0f, 269.25f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy8.add(new LayoutDesc(8, 0.0f, 95.53f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangleCopy8 = mOverrideElementLayoutDescriptors.get("rectangleCopy8");
            if (override_mRectangleCopy8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangleCopy8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangleCopy8 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangleCopy8.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy8.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy8.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangleCopy8.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRectangleCopy8, dm, layoutDescs_mRectangleCopy8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton.add(new LayoutDesc(10, 36.0f, 36.81f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton.add(new LayoutDesc(2, 12.0f, -12.08f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton.add(new LayoutDesc(12, 54.0f, 77.9f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton.add(new LayoutDesc(8, 24.0f, 14.17f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mBackButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton2.add(new LayoutDesc(10, 36.0f, 173.32f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton2.add(new LayoutDesc(2, 12.0f, 24.4f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton2.add(new LayoutDesc(12, 54.0f, 280.25f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton2.add(new LayoutDesc(8, 24.0f, 100.53f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton2 = mOverrideElementLayoutDescriptors.get("backButton2");
            if (override_mBackButton2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton2 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton2.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton2, dm, layoutDescs_mBackButton2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton3 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton3.add(new LayoutDesc(10, 36.0f, 309.84f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton3.add(new LayoutDesc(2, 12.0f, 60.88f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton3.add(new LayoutDesc(12, 54.0f, 482.6f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton3.add(new LayoutDesc(8, 24.0f, 186.88f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton3 = mOverrideElementLayoutDescriptors.get("backButton3");
            if (override_mBackButton3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton3 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton3.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton3.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton3, dm, layoutDescs_mBackButton3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton4 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton4.add(new LayoutDesc(10, 36.0f, 446.35f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton4.add(new LayoutDesc(2, 12.0f, 97.36f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton4.add(new LayoutDesc(12, 54.0f, 684.95f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton4.add(new LayoutDesc(8, 24.0f, 273.23f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton4 = mOverrideElementLayoutDescriptors.get("backButton4");
            if (override_mBackButton4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton4 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton4.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton4.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton4.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton4.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton4, dm, layoutDescs_mBackButton4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton5 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton5.add(new LayoutDesc(10, 36.0f, 582.87f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton5.add(new LayoutDesc(2, 12.0f, 133.84f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton5.add(new LayoutDesc(12, 54.0f, 887.3f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton5.add(new LayoutDesc(8, 24.0f, 359.59f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton5 = mOverrideElementLayoutDescriptors.get("backButton5");
            if (override_mBackButton5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton5 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton5.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton5.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton5.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton5.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton5, dm, layoutDescs_mBackButton5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton6 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton6.add(new LayoutDesc(10, 36.0f, 719.38f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton6.add(new LayoutDesc(2, 12.0f, 170.32f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton6.add(new LayoutDesc(12, 54.0f, 1089.65f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton6.add(new LayoutDesc(8, 24.0f, 445.94f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton6 = mOverrideElementLayoutDescriptors.get("backButton6");
            if (override_mBackButton6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton6 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton6.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton6.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton6.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton6.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton6, dm, layoutDescs_mBackButton6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBackButton7 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton7.add(new LayoutDesc(10, 36.0f, 855.9f, LayoutDesc.NO_VALUE, 85.01f, 85.01f));  // 720*1280 px
        layoutDescs_mBackButton7.add(new LayoutDesc(2, 12.0f, 206.8f, LayoutDesc.NO_VALUE, 36.95f, 36.95f));  // 240*320 px
        layoutDescs_mBackButton7.add(new LayoutDesc(12, 54.0f, 1292.0f, LayoutDesc.NO_VALUE, 107.22f, 107.22f));  // 1080*1920 px
        layoutDescs_mBackButton7.add(new LayoutDesc(8, 24.0f, 532.3f, LayoutDesc.NO_VALUE, 60.28f, 60.28f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBackButton7 = mOverrideElementLayoutDescriptors.get("backButton7");
            if (override_mBackButton7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBackButton7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBackButton7 = layoutDescs;
                }
            }
        }
        layoutDescs_mBackButton7.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton7.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton7.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBackButton7.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBackButton7, dm, layoutDescs_mBackButton7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 165.6f, 58.81f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 55.2f, -4.08f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 248.4f, 109.9f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 110.4f, 28.17f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 165.6f, 195.32f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 55.2f, 32.4f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 248.4f, 312.25f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 110.4f, 114.53f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText3.add(new LayoutDesc(10, 165.6f, 331.84f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 55.2f, 68.88f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 248.4f, 514.6f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 110.4f, 200.88f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText4.add(new LayoutDesc(10, 165.6f, 468.35f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 55.2f, 105.36f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 248.4f, 716.95f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 110.4f, 287.23f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText5.add(new LayoutDesc(10, 165.6f, 604.87f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 55.2f, 141.84f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 248.4f, 919.3f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 110.4f, 373.59f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText6.add(new LayoutDesc(10, 165.6f, 741.38f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 55.2f, 178.32f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 248.4f, 1121.65f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 110.4f, 459.94f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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
        layoutDescs_mText7.add(new LayoutDesc(10, 165.6f, 877.9f, LayoutDesc.NO_VALUE, 446.29f, 75.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 55.2f, 214.8f, LayoutDesc.NO_VALUE, 193.98f, 36.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 248.4f, 1324.0f, LayoutDesc.NO_VALUE, 562.90f, 92.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 110.4f, 546.3f, LayoutDesc.NO_VALUE, 316.48f, 55.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mFAQButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFAQButton.add(new LayoutDesc(10, 0.0f, 848.9f, 293.59f, 720.0f, 137.51f));  // 720*1280 px
        layoutDescs_mFAQButton.add(new LayoutDesc(2, 0.0f, 204.8f, 77.72f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mFAQButton.add(new LayoutDesc(12, 0.0f, 1281.0f, 435.65f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mFAQButton.add(new LayoutDesc(8, 0.0f, 527.3f, 185.34f, 480.0f, 87.36f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFAQButton = mOverrideElementLayoutDescriptors.get("FAQButton");
            if (override_mFAQButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFAQButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFAQButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFAQButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFAQButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mFAQButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFAQButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mFAQButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFAQButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mFAQButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFAQButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mFAQButton, dm, layoutDescs_mFAQButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mContactusButton = new ArrayList<LayoutDesc>();
        layoutDescs_mContactusButton.add(new LayoutDesc(10, 0.0f, 712.38f, 430.1f, 720.0f, 137.51f));  // 720*1280 px
        layoutDescs_mContactusButton.add(new LayoutDesc(2, 0.0f, 168.32f, 114.2f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mContactusButton.add(new LayoutDesc(12, 0.0f, 1078.65f, 638.0f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mContactusButton.add(new LayoutDesc(8, 0.0f, 440.94f, 271.7f, 480.0f, 87.36f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mContactusButton = mOverrideElementLayoutDescriptors.get("contactusButton");
            if (override_mContactusButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mContactusButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mContactusButton = layoutDescs;
                }
            }
        }
        layoutDescs_mContactusButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mContactusButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mContactusButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mContactusButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mContactusButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mContactusButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mContactusButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mContactusButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mContactusButton, dm, layoutDescs_mContactusButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mUpgradeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mUpgradeButton.add(new LayoutDesc(10, 0.0f, 575.87f, 566.62f, 720.0f, 137.51f));  // 720*1280 px
        layoutDescs_mUpgradeButton.add(new LayoutDesc(2, 0.0f, 131.84f, 150.68f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mUpgradeButton.add(new LayoutDesc(12, 0.0f, 876.3f, 840.35f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mUpgradeButton.add(new LayoutDesc(8, 0.0f, 354.59f, 358.06f, 480.0f, 87.35f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mUpgradeButton = mOverrideElementLayoutDescriptors.get("upgradeButton");
            if (override_mUpgradeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mUpgradeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mUpgradeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mUpgradeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mUpgradeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mUpgradeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mUpgradeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mUpgradeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mUpgradeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mUpgradeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mUpgradeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mUpgradeButton, dm, layoutDescs_mUpgradeButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRemoveadsButton = new ArrayList<LayoutDesc>();
        layoutDescs_mRemoveadsButton.add(new LayoutDesc(10, 0.0f, 439.35f, 703.13f, 720.0f, 137.52f));  // 720*1280 px
        layoutDescs_mRemoveadsButton.add(new LayoutDesc(2, 0.0f, 95.36f, 187.16f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mRemoveadsButton.add(new LayoutDesc(12, 0.0f, 673.95f, 1042.7f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mRemoveadsButton.add(new LayoutDesc(8, 0.0f, 268.23f, 444.41f, 480.0f, 87.36f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRemoveadsButton = mOverrideElementLayoutDescriptors.get("removeadsButton");
            if (override_mRemoveadsButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRemoveadsButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRemoveadsButton = layoutDescs;
                }
            }
        }
        layoutDescs_mRemoveadsButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRemoveadsButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRemoveadsButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRemoveadsButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRemoveadsButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRemoveadsButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRemoveadsButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRemoveadsButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mRemoveadsButton, dm, layoutDescs_mRemoveadsButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRateusButton = new ArrayList<LayoutDesc>();
        layoutDescs_mRateusButton.add(new LayoutDesc(10, 0.0f, 302.84f, 839.65f, 720.0f, 137.51f));  // 720*1280 px
        layoutDescs_mRateusButton.add(new LayoutDesc(2, 0.0f, 58.88f, 223.64f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mRateusButton.add(new LayoutDesc(12, 0.0f, 471.6f, 1245.05f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mRateusButton.add(new LayoutDesc(8, 0.0f, 181.88f, 530.77f, 480.0f, 87.35f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRateusButton = mOverrideElementLayoutDescriptors.get("rateusButton");
            if (override_mRateusButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRateusButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRateusButton = layoutDescs;
                }
            }
        }
        layoutDescs_mRateusButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRateusButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRateusButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRateusButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRateusButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRateusButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRateusButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRateusButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mRateusButton, dm, layoutDescs_mRateusButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mShareButton = new ArrayList<LayoutDesc>();
        layoutDescs_mShareButton.add(new LayoutDesc(10, 0.0f, 164.32f, 976.16f, 720.0f, 139.52f));  // 720*1280 px
        layoutDescs_mShareButton.add(new LayoutDesc(2, 0.0f, 21.4f, 260.12f, 240.0f, 38.48f));  // 240*320 px
        layoutDescs_mShareButton.add(new LayoutDesc(12, 0.0f, 266.25f, 1447.4f, 1080.0f, 206.35f));  // 1080*1920 px
        layoutDescs_mShareButton.add(new LayoutDesc(8, 0.0f, 93.53f, 617.12f, 480.0f, 89.35f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mShareButton = mOverrideElementLayoutDescriptors.get("shareButton");
            if (override_mShareButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mShareButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mShareButton = layoutDescs;
                }
            }
        }
        layoutDescs_mShareButton.get(0).offsetToHorizontalKeylineT = 2.16f;
        layoutDescs_mShareButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mShareButton.get(1).offsetToHorizontalKeylineT = 0.94f;
        layoutDescs_mShareButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mShareButton.get(2).offsetToHorizontalKeylineT = 2.73f;
        layoutDescs_mShareButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mShareButton.get(3).offsetToHorizontalKeylineT = 1.53f;
        layoutDescs_mShareButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mShareButton, dm, layoutDescs_mShareButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSettingButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSettingButton.add(new LayoutDesc(10, 0.0f, 29.81f, 1112.68f, 720.0f, 137.51f));  // 720*1280 px
        layoutDescs_mSettingButton.add(new LayoutDesc(2, 0.0f, -14.08f, 296.6f, 240.0f, 37.48f));  // 240*320 px
        layoutDescs_mSettingButton.add(new LayoutDesc(12, 0.0f, 66.9f, 1649.75f, 1080.0f, 203.35f));  // 1080*1920 px
        layoutDescs_mSettingButton.add(new LayoutDesc(8, 0.0f, 9.17f, 703.48f, 480.0f, 87.36f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSettingButton = mOverrideElementLayoutDescriptors.get("settingButton");
            if (override_mSettingButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSettingButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSettingButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSettingButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSettingButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSettingButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSettingButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSettingButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSettingButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mSettingButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSettingButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mSettingButton, dm, layoutDescs_mSettingButton, true, true);

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

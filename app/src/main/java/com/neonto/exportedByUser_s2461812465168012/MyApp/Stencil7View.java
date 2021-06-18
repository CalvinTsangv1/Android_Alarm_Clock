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

public class Stencil7View extends FrameLayout implements AdapterView {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private Stencil7BackgroundShapeView mBackgroundShape;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private ImageButton mIconButton;
    private TextView mText7;
    private TextView mText8;
    private TextView mText9;
    private TextView mText10;
    private Button mHotspot;
    private Stencil7RectangleView mRectangle;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();
    private OnContentChangeListener mOnContentChangeListener;
    private Fragment mOwner;
    
    public Stencil7View(Fragment owner) {
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
        final View rootView = inflater.inflate(R.layout.view_stencil7, container, false);
                
        mBackgroundShape = (Stencil7BackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mIconButton = (ImageButton) rootView.findViewById(R.id.mIconButton);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mText10 = (TextView) rootView.findViewById(R.id.mText10);
        mHotspot = (Button) rootView.findViewById(R.id.mHotspot);
        mRectangle = (Stencil7RectangleView) rootView.findViewById(R.id.mRectangle);
        final Fragment fragment = mOwner;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_stencil7_text_1009544", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_stencil7_text2_31039", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_stencil7_text3_804066", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_stencil7_text4_599857", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_stencil7_text5_134500", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_stencil7_text6_609726", ""));

        
        mIconButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Show question popup' action
                                new android.app.AlertDialog.Builder(getActivity())
                                .setMessage("Do you really want to delete?")
                                .setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        actionSequencer.resume();
                                    }
                                })
                                .setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        actionSequencer.cancel();
                                    }
                                })
                                .show();
                                return false;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Delete entry' action
                                if (mDataSheet != null) {
                                    mDataSheet.deleteRow(mDataSheetRowIndex);
                                    mDataSheet.notifyRowsModified();
                                }
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mText7.setText(AppData.getLocalizedString("neonto_stencil7_text7_374410", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_stencil7_text8_182757", ""));

        
        mText9.setText(AppData.getLocalizedString("neonto_stencil7_text9_735452", ""));

        
        mText10.setText(AppData.getLocalizedString("neonto_stencil7_text10_524850", ""));

        

        
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
                    mText.setText(AppData.getLocalizedString("neonto_stencil7_text_1009544", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_stencil7_text2_31039", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_stencil7_text3_804066", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_stencil7_text4_599857", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_stencil7_text5_134500", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_stencil7_text6_609726", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_stencil7_text7_374410", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_stencil7_text8_182757", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_stencil7_text9_735452", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText10)) {
                    mText10.setText(AppData.getLocalizedString("neonto_stencil7_text10_524850", ""));
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
            val = row.get("RecordDate");
            if (val == null) val = row.get("recorddate");  // check lowercase version too
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
        layoutDescs_mBackgroundShape.add(new LayoutDesc(10, 2.0f, 0.0f, 116.0f, 223.0f, 569.0f));  // 720*1280 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(2, 1.0f, 0.0f, 51.0f, 97.0f, 247.0f));  // 240*320 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(12, 3.0f, 0.0f, 147.0f, 280.0f, 717.0f));  // 1080*1920 px
        layoutDescs_mBackgroundShape.add(new LayoutDesc(8, 2.0f, 0.0f, 83.0f, 157.0f, 403.0f));  // 480*800 px
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
        layoutDescs_mText.add(new LayoutDesc(10, 34.0f, 14.0f, LayoutDesc.NO_VALUE, 212.52f, 49.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 15.0f, 6.0f, LayoutDesc.NO_VALUE, 92.37f, 25.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 43.0f, 17.0f, LayoutDesc.NO_VALUE, 268.05f, 60.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 24.0f, 10.0f, LayoutDesc.NO_VALUE, 150.71f, 37.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 0.0f, 383.0f, LayoutDesc.NO_VALUE, 114.5f, 49.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 0.0f, 166.0f, LayoutDesc.NO_VALUE, 50.5f, 25.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 0.0f, 482.0f, LayoutDesc.NO_VALUE, 144.0f, 60.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 0.0f, 271.0f, LayoutDesc.NO_VALUE, 81.5f, 37.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 0.0f, 476.0f, LayoutDesc.NO_VALUE, 114.5f, 49.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 0.0f, 207.0f, LayoutDesc.NO_VALUE, 50.5f, 25.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 0.0f, 600.0f, LayoutDesc.NO_VALUE, 144.0f, 60.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 0.0f, 338.0f, LayoutDesc.NO_VALUE, 81.5f, 37.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText4 = new ArrayList<LayoutDesc>();
        layoutDescs_mText4.add(new LayoutDesc(10, 113.5f, 476.0f, LayoutDesc.NO_VALUE, 113.5f, 49.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 49.5f, 207.0f, LayoutDesc.NO_VALUE, 49.5f, 25.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 143.0f, 600.0f, LayoutDesc.NO_VALUE, 143.0f, 60.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 80.5f, 338.0f, LayoutDesc.NO_VALUE, 80.5f, 37.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText4 = mOverrideElementLayoutDescriptors.get("text4");
            if (override_mText4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText4 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText4, dm, layoutDescs_mText4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 113.5f, 383.0f, LayoutDesc.NO_VALUE, 113.5f, 49.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 49.5f, 166.0f, LayoutDesc.NO_VALUE, 49.5f, 25.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 143.0f, 482.0f, LayoutDesc.NO_VALUE, 143.0f, 60.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 80.5f, 271.0f, LayoutDesc.NO_VALUE, 80.5f, 37.0f));  // 480*800 px
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
        layoutDescs_mText6.add(new LayoutDesc(10, 34.0f, 51.0f, LayoutDesc.NO_VALUE, 296.33f, 49.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 15.0f, 22.0f, LayoutDesc.NO_VALUE, 128.80f, 25.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 43.0f, 64.0f, LayoutDesc.NO_VALUE, 373.76f, 60.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 24.0f, 36.0f, LayoutDesc.NO_VALUE, 210.14f, 37.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 149.24f, 21.0f, LayoutDesc.NO_VALUE, 63.76f, 63.76f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 65.29f, 9.0f, LayoutDesc.NO_VALUE, 27.71f, 27.71f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 188.59f, 26.0f, LayoutDesc.NO_VALUE, 80.41f, 80.41f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 105.79f, 15.0f, LayoutDesc.NO_VALUE, 45.21f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText7 = new ArrayList<LayoutDesc>();
        layoutDescs_mText7.add(new LayoutDesc(10, 0.0f, 425.0f, LayoutDesc.NO_VALUE, 114.5f, 58.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 0.0f, 185.0f, LayoutDesc.NO_VALUE, 50.5f, 29.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 0.0f, 536.0f, LayoutDesc.NO_VALUE, 144.0f, 71.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 0.0f, 301.0f, LayoutDesc.NO_VALUE, 81.5f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText7 = mOverrideElementLayoutDescriptors.get("text7");
            if (override_mText7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText7 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText7, dm, layoutDescs_mText7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 113.5f, 425.0f, LayoutDesc.NO_VALUE, 113.5f, 58.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 49.5f, 185.0f, LayoutDesc.NO_VALUE, 49.5f, 29.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 143.0f, 536.0f, LayoutDesc.NO_VALUE, 143.0f, 71.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 80.5f, 301.0f, LayoutDesc.NO_VALUE, 80.5f, 43.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText9 = new ArrayList<LayoutDesc>();
        layoutDescs_mText9.add(new LayoutDesc(10, 0.0f, 519.0f, LayoutDesc.NO_VALUE, 114.5f, 58.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 0.0f, 225.0f, LayoutDesc.NO_VALUE, 50.5f, 29.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 0.0f, 654.0f, LayoutDesc.NO_VALUE, 144.0f, 71.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 0.0f, 368.0f, LayoutDesc.NO_VALUE, 81.5f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText9 = mOverrideElementLayoutDescriptors.get("text9");
            if (override_mText9 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText9.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText9 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText9, dm, layoutDescs_mText9, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText10 = new ArrayList<LayoutDesc>();
        layoutDescs_mText10.add(new LayoutDesc(10, 113.5f, 519.0f, LayoutDesc.NO_VALUE, 113.5f, 58.0f));  // 720*1280 px
        layoutDescs_mText10.add(new LayoutDesc(2, 49.5f, 225.0f, LayoutDesc.NO_VALUE, 49.5f, 29.0f));  // 240*320 px
        layoutDescs_mText10.add(new LayoutDesc(12, 143.0f, 654.0f, LayoutDesc.NO_VALUE, 143.0f, 71.0f));  // 1080*1920 px
        layoutDescs_mText10.add(new LayoutDesc(8, 80.5f, 368.0f, LayoutDesc.NO_VALUE, 80.5f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText10 = mOverrideElementLayoutDescriptors.get("text10");
            if (override_mText10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText10 = layoutDescs;
                }
            }
        }
        applyLayoutToView(mText10, dm, layoutDescs_mText10, true, true);

        ArrayList<LayoutDesc> layoutDescs_mHotspot = new ArrayList<LayoutDesc>();
        layoutDescs_mHotspot.add(new LayoutDesc(10, 1.0f, 94.0f, LayoutDesc.NO_VALUE, 225.0f, 276.27f));  // 720*1280 px
        layoutDescs_mHotspot.add(new LayoutDesc(2, 0.0f, 41.0f, LayoutDesc.NO_VALUE, 99.0f, 120.08f));  // 240*320 px
        layoutDescs_mHotspot.add(new LayoutDesc(12, 1.0f, 118.0f, LayoutDesc.NO_VALUE, 284.0f, 348.46f));  // 1080*1920 px
        layoutDescs_mHotspot.add(new LayoutDesc(8, 1.0f, 66.0f, LayoutDesc.NO_VALUE, 159.0f, 195.92f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mHotspot = mOverrideElementLayoutDescriptors.get("hotspot");
            if (override_mHotspot != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mHotspot.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mHotspot = layoutDescs;
                }
            }
        }
        applyLayoutToView(mHotspot, dm, layoutDescs_mHotspot, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 2.0f, 476.0f, LayoutDesc.NO_VALUE, 223.0f, 1.28f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 1.0f, 207.0f, LayoutDesc.NO_VALUE, 97.0f, 0.55f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 3.0f, 600.0f, LayoutDesc.NO_VALUE, 280.0f, 1.61f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 2.0f, 338.0f, LayoutDesc.NO_VALUE, 157.0f, 0.90f));  // 480*800 px
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

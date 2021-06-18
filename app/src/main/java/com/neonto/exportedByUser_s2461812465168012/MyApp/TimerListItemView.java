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

public class TimerListItemView extends FrameLayout implements AdapterView {

    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private TimerListItemRectangleView mRectangle;
    private Button mResetButton;
    private Button mStartButton;
    private Button mStopButton;
    private Button mAddMinuteButton;
    private TextView mNoText;
    private TextView mTimerText;
    private ImageButton mDeleteButton;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();
    private OnContentChangeListener mOnContentChangeListener;
    private Fragment mOwner;
    
    public TimerListItemView(Fragment owner) {
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
        final View rootView = inflater.inflate(R.layout.view_timer_list_item, container, false);
                
        mRectangle = (TimerListItemRectangleView) rootView.findViewById(R.id.mRectangle);
        mResetButton = (Button) rootView.findViewById(R.id.mResetButton);
        mStartButton = (Button) rootView.findViewById(R.id.mStartButton);
        mStopButton = (Button) rootView.findViewById(R.id.mStopButton);
        mAddMinuteButton = (Button) rootView.findViewById(R.id.mAddMinuteButton);
        mNoText = (TextView) rootView.findViewById(R.id.mNoText);
        mTimerText = (TextView) rootView.findViewById(R.id.mTimerText);
        mDeleteButton = (ImageButton) rootView.findViewById(R.id.mDeleteButton);
        final Fragment fragment = mOwner;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mResetButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button_120346", ""));
        mResetButton.setTransformationMethod(null);

        
        mStartButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button2_719994", ""));
        mStartButton.setTransformationMethod(null);
        mStartButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'StartButton'
                                mStartButton.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ResetButton'
                                mResetButton.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'StopButton'
                                mStopButton.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'AddMinuteButton'
                                mAddMinuteButton.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        mStopButton.setVisibility(View.INVISIBLE);
        
        mStopButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button3_392524", ""));
        mStopButton.setTransformationMethod(null);
        mStopButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'StartButton'
                                mStartButton.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ResetButton'
                                mResetButton.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'StopButton'
                                mStopButton.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'AddMinuteButton'
                                mAddMinuteButton.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        mAddMinuteButton.setVisibility(View.INVISIBLE);
        
        mAddMinuteButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button4_701033", ""));
        mAddMinuteButton.setTransformationMethod(null);

        
        mNoText.setText(AppData.getLocalizedString("neonto_timerlistitem_text_932611", ""));

        
        mTimerText.setText(AppData.getLocalizedString("neonto_timerlistitem_text2_589073", ""));

        
        mDeleteButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Show question popup' action
                                new android.app.AlertDialog.Builder(getActivity())
                                .setMessage("Do you really wnat to delete?")
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
                if ( !mDataSheetUpdatedElems.contains(mResetButton)) {
                    mResetButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button_120346", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mStartButton)) {
                    mStartButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button2_719994", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mStopButton)) {
                    mStopButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button3_392524", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mAddMinuteButton)) {
                    mAddMinuteButton.setText(AppData.getLocalizedString("neonto_timerlistitem_button4_701033", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mNoText)) {
                    mNoText.setText(AppData.getLocalizedString("neonto_timerlistitem_text_932611", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTimerText)) {
                    mTimerText.setText(AppData.getLocalizedString("neonto_timerlistitem_text2_589073", ""));
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
            val = row.get("ResetButton");
            if (val == null) val = row.get("resetbutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mResetButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mResetButton);
                }
            }
        }
        {
            val = row.get("StartButton");
            if (val == null) val = row.get("startbutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mStartButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mStartButton);
                }
            }
        }
        {
            val = row.get("StopButton");
            if (val == null) val = row.get("stopbutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mStopButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mStopButton);
                }
            }
        }
        {
            val = row.get("AddMinuteButton");
            if (val == null) val = row.get("addminutebutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mAddMinuteButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mAddMinuteButton);
                }
            }
        }
        {
            val = row.get("NoText");
            if (val == null) val = row.get("notext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mNoText.setText((String) value);
                    mDataSheetUpdatedElems.add(mNoText);
                }
            }
        }
        {
            val = row.get("TimerText");
            if (val == null) val = row.get("timertext");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTimerText.setText((String) value);
                    mDataSheetUpdatedElems.add(mTimerText);
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
        
        ArrayList<LayoutDesc> layoutDescs_mRectangle = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 208.0f, 212.52f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 91.0f, 92.37f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 263.0f, 268.05f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 148.0f, 150.71f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mResetButton = new ArrayList<LayoutDesc>();
        layoutDescs_mResetButton.add(new LayoutDesc(10, 0.0f, 149.0f, LayoutDesc.NO_VALUE, 105.0f, 63.76f));  // 720*1280 px
        layoutDescs_mResetButton.add(new LayoutDesc(2, 0.0f, 65.0f, LayoutDesc.NO_VALUE, 46.5f, 27.71f));  // 240*320 px
        layoutDescs_mResetButton.add(new LayoutDesc(12, 0.0f, 188.0f, LayoutDesc.NO_VALUE, 132.5f, 80.41f));  // 1080*1920 px
        layoutDescs_mResetButton.add(new LayoutDesc(8, 0.0f, 105.0f, LayoutDesc.NO_VALUE, 75.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mResetButton = mOverrideElementLayoutDescriptors.get("resetButton");
            if (override_mResetButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mResetButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mResetButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mResetButton, dm, layoutDescs_mResetButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStartButton = new ArrayList<LayoutDesc>();
        layoutDescs_mStartButton.add(new LayoutDesc(10, 104.0f, 149.0f, LayoutDesc.NO_VALUE, 104.0f, 63.76f));  // 720*1280 px
        layoutDescs_mStartButton.add(new LayoutDesc(2, 45.5f, 65.0f, LayoutDesc.NO_VALUE, 45.5f, 27.71f));  // 240*320 px
        layoutDescs_mStartButton.add(new LayoutDesc(12, 131.5f, 188.0f, LayoutDesc.NO_VALUE, 131.5f, 80.41f));  // 1080*1920 px
        layoutDescs_mStartButton.add(new LayoutDesc(8, 74.0f, 105.0f, LayoutDesc.NO_VALUE, 74.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStartButton = mOverrideElementLayoutDescriptors.get("startButton");
            if (override_mStartButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStartButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStartButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mStartButton, dm, layoutDescs_mStartButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStopButton = new ArrayList<LayoutDesc>();
        layoutDescs_mStopButton.add(new LayoutDesc(10, 104.0f, 149.0f, LayoutDesc.NO_VALUE, 104.0f, 63.76f));  // 720*1280 px
        layoutDescs_mStopButton.add(new LayoutDesc(2, 45.5f, 65.0f, LayoutDesc.NO_VALUE, 45.5f, 27.71f));  // 240*320 px
        layoutDescs_mStopButton.add(new LayoutDesc(12, 131.5f, 188.0f, LayoutDesc.NO_VALUE, 131.5f, 80.41f));  // 1080*1920 px
        layoutDescs_mStopButton.add(new LayoutDesc(8, 74.0f, 105.0f, LayoutDesc.NO_VALUE, 74.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStopButton = mOverrideElementLayoutDescriptors.get("stopButton");
            if (override_mStopButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStopButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStopButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mStopButton, dm, layoutDescs_mStopButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAddMinuteButton = new ArrayList<LayoutDesc>();
        layoutDescs_mAddMinuteButton.add(new LayoutDesc(10, 0.0f, 149.0f, LayoutDesc.NO_VALUE, 105.0f, 63.76f));  // 720*1280 px
        layoutDescs_mAddMinuteButton.add(new LayoutDesc(2, 0.0f, 65.0f, LayoutDesc.NO_VALUE, 46.5f, 27.71f));  // 240*320 px
        layoutDescs_mAddMinuteButton.add(new LayoutDesc(12, 0.0f, 188.0f, LayoutDesc.NO_VALUE, 132.5f, 80.41f));  // 1080*1920 px
        layoutDescs_mAddMinuteButton.add(new LayoutDesc(8, 0.0f, 105.0f, LayoutDesc.NO_VALUE, 75.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAddMinuteButton = mOverrideElementLayoutDescriptors.get("addMinuteButton");
            if (override_mAddMinuteButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAddMinuteButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAddMinuteButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mAddMinuteButton, dm, layoutDescs_mAddMinuteButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mNoText = new ArrayList<LayoutDesc>();
        layoutDescs_mNoText.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 170.01f, 58.0f));  // 720*1280 px
        layoutDescs_mNoText.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 73.90f, 29.0f));  // 240*320 px
        layoutDescs_mNoText.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 214.44f, 71.0f));  // 1080*1920 px
        layoutDescs_mNoText.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 120.56f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mNoText = mOverrideElementLayoutDescriptors.get("noText");
            if (override_mNoText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mNoText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mNoText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mNoText, dm, layoutDescs_mNoText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimerText = new ArrayList<LayoutDesc>();
        layoutDescs_mTimerText.add(new LayoutDesc(10, 4.0f, 21.0f, LayoutDesc.NO_VALUE, 200.0f, 134.0f));  // 720*1280 px
        layoutDescs_mTimerText.add(new LayoutDesc(2, 2.0f, 9.0f, LayoutDesc.NO_VALUE, 87.0f, 62.0f));  // 240*320 px
        layoutDescs_mTimerText.add(new LayoutDesc(12, 5.0f, 27.0f, LayoutDesc.NO_VALUE, 253.0f, 167.0f));  // 1080*1920 px
        layoutDescs_mTimerText.add(new LayoutDesc(8, 3.0f, 15.0f, LayoutDesc.NO_VALUE, 142.0f, 97.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimerText = mOverrideElementLayoutDescriptors.get("timerText");
            if (override_mTimerText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimerText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimerText = layoutDescs;
                }
            }
        }
        applyLayoutToView(mTimerText, dm, layoutDescs_mTimerText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDeleteButton = new ArrayList<LayoutDesc>();
        layoutDescs_mDeleteButton.add(new LayoutDesc(10, 127.49f, 43.0f, LayoutDesc.NO_VALUE, 76.51f, 76.51f));  // 720*1280 px
        layoutDescs_mDeleteButton.add(new LayoutDesc(2, 55.75f, 18.0f, LayoutDesc.NO_VALUE, 33.25f, 33.25f));  // 240*320 px
        layoutDescs_mDeleteButton.add(new LayoutDesc(12, 161.50f, 54.0f, LayoutDesc.NO_VALUE, 96.50f, 96.50f));  // 1080*1920 px
        layoutDescs_mDeleteButton.add(new LayoutDesc(8, 90.75f, 30.0f, LayoutDesc.NO_VALUE, 54.25f, 54.25f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDeleteButton = mOverrideElementLayoutDescriptors.get("deleteButton");
            if (override_mDeleteButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDeleteButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDeleteButton = layoutDescs;
                }
            }
        }
        applyLayoutToView(mDeleteButton, dm, layoutDescs_mDeleteButton, true, true);

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

/*
*/

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

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

public class StopWatchFragment extends Fragment {

    private SharedPreferences sharedPreferences;
    private int ContinueCallback=0;
    private long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;
    private Handler handler;
    private int Seconds, Minutes, MilliSeconds, Hours ;
    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private StopWatchBackgroundShapeView mBackgroundShape;
    private TextView mText;
    private ImageButton mSaveButton;
    private Button mResetButton;
    private Button mStartButton;
    private Button mLapButton;
    private Button mStopButton;
    private ListView mList;
    private StopWatchListAdapter mListAdapter;
    
    private MenuItem.OnMenuItemClickListener mNavBarButtonClickListener;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public StopWatchFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_stop_watch, container, false);
                
        mBackgroundShape = (StopWatchBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mSaveButton = (ImageButton) rootView.findViewById(R.id.mSaveButton);
        mResetButton = (Button) rootView.findViewById(R.id.mResetButton);
        mStartButton = (Button) rootView.findViewById(R.id.mStartButton);
        mLapButton = (Button) rootView.findViewById(R.id.mLapButton);
        mStopButton = (Button) rootView.findViewById(R.id.mStopButton);
        mList = (ListView) rootView.findViewById(R.id.mList);
        final StopWatchFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        mNavBarButtonClickListener = new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(getActivity(), RecordStopwatchListActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
                return true;
            }
        };

        handler = new Handler() ;

        
        mText.setText(AppData.getLocalizedString("neonto_stopwatch_text_831472", ""));

        
        mSaveButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RecordSaveActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
           }
        });

        
        mResetButton.setText(AppData.getLocalizedString("neonto_stopwatch_button_196356", ""));
        mResetButton.setTransformationMethod(null);
        mResetButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                MillisecondTime = 0L ;
                StartTime = 0L ;
                TimeBuff = 0L ;
                UpdateTime = 0L ;
                Seconds = 0 ;
                Minutes = 0 ;
                MilliSeconds = 0 ;

                mText.setText("0:00:00.00");

                AppData.stopwatchBufferSaveDataSheet.removeRows();
                AppData.stopwatchBufferSaveDataSheet.notifyRowsModified();
            }
        });

        
        mStartButton.setText(AppData.getLocalizedString("neonto_stopwatch_button2_10087", ""));
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
                                // Reveal or hide element 'LapButton'
                                mLapButton.setVisibility(View.VISIBLE);
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
                                StartTime = SystemClock.uptimeMillis();
                                handler.postDelayed(runnable, 80);
                                return true;
                            }
                        },
                });
        
           }
        });

        mLapButton.setVisibility(View.INVISIBLE);
        
        mLapButton.setText(AppData.getLocalizedString("neonto_stopwatch_button3_475981", ""));
        mLapButton.setTransformationMethod(null);
        mLapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                StopWatchFragment.super.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        final ActionSequencer actionSequencer = new ActionSequencer();
                        actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                                new ActionSequencer.Action() {
                                    @Override
                                    public boolean execute() {
                                        String TimetoTime = null;
                                        int OldTotal;
                                        int newTotal;
                                        if (AppData.stopwatchBufferSaveDataSheet.RowsIndexCheck() == 0) {
                                            TimetoTime = mText.getText().toString();
                                        }
                                        if (AppData.stopwatchBufferSaveDataSheet.RowsIndexCheck() >= 1) {
                                            String Oldtime =AppData.stopwatchBufferSaveDataSheet.CheckRows(0,"TotalTime");
                                            String Newtime =mText.getText().toString();
                                            String[] part1 =Oldtime.split(":");
                                            String[] part2 =Newtime.split(":");
                                            OldTotal=Integer.parseInt(part1[0])*60*60*1000+Integer.parseInt(part1[1])*60*1000+Integer.parseInt(part1[2])*1000+Integer.parseInt(part1[3]);
                                            newTotal=Integer.parseInt(part2[0])*60*60*1000+Integer.parseInt(part2[1])*60*1000+Integer.parseInt(part2[2])*1000+Integer.parseInt(part2[3]);
                                            int Total =newTotal-OldTotal;
                                            TimetoTime=String.format("%01d:%02d:%02d:%03d", TimeUnit.MILLISECONDS.toHours(Total),
                                                    TimeUnit.MILLISECONDS.toMinutes(Total) - TimeUnit.HOURS.toMinutes(
                                                            TimeUnit.MILLISECONDS.toHours(Total)),
                                                    TimeUnit.MILLISECONDS.toSeconds(Total) - TimeUnit.MINUTES.toSeconds(
                                                            TimeUnit.MILLISECONDS.toMinutes(Total)), TimeUnit.MILLISECONDS.toMillis(Total)-TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(Total)));
                                        }

                                        HashMap<String,Object> values = new HashMap<String, Object>();
                                        values.put("NoLap","Lap"+AppData.stopwatchBufferSaveDataSheet.RowsIndexCheck());
                                        values.put("TotalTime",mText.getText().toString());
                                        values.put("StopTime",TimetoTime);
                                        int index=AppData.stopwatchBufferSaveDataSheet.getRows().size();
                                        AppData.stopwatchBufferSaveDataSheet.updateRow(index,values);
                                        AppData.stopwatchBufferSaveDataSheet.notifyRowsModified();
                                        return false;
                                    }
                                },
                        });
                    }
                });
            }
        });

        mStopButton.setVisibility(View.INVISIBLE);
        
        mStopButton.setText(AppData.getLocalizedString("neonto_stopwatch_button4_1035560", ""));
        mStopButton.setTransformationMethod(null);
        mStopButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                TimeBuff += MillisecondTime;
                                handler.removeCallbacks(runnable);
                                return true;
                            }
                        },
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
                                // Reveal or hide element 'LapButton'
                                mLapButton.setVisibility(View.INVISIBLE);
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
                });
        
           }
        });

        
        final StopWatchListAdapter stopWatchListAdapter = new StopWatchListAdapter(this);
        stopWatchListAdapter.setDataSheet(AppData.stopwatchBufferSaveDataSheet);
        mList.setAdapter(stopWatchListAdapter);
        mListAdapter = stopWatchListAdapter;
        
        AppData.stopwatchBufferSaveDataSheet.addListener(new DataSheet.OnChangeListener() {
           @Override
           public void dataSheetUpdated(DataSheet sheet) {
               stopWatchListAdapter.notifyDataSetChanged();
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
    public void onStart(){
        super.onStart();
        sharedPreferences= getActivity().getPreferences(Context.MODE_PRIVATE);
        System.out.println(sharedPreferences.getAll());
        if(sharedPreferences.getAll()==null) {
            mText.setText(sharedPreferences.getString("TimeText", null));
            Log.d("Timer", sharedPreferences.getString("TimeText", null));
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        getView().setOnKeyListener(new View.OnKeyListener(){
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event){
                if(event.getAction()==KeyEvent.ACTION_UP && keyCode==KeyEvent.KEYCODE_BACK){
                    new android.app.AlertDialog.Builder(getActivity())
                            .setMessage("Do you really want to leave?")
                            .setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getActivity(),"App has been closed",Toast.LENGTH_SHORT).show();
                                    getActivity().finish();
                                }
                            })
                            .setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            })
                            .show();
                    return false;
                }
                return true;
            }
        });
    }


    @Override
    public void onPause() {
        int RUNNING = 10;
        handler.sendEmptyMessage(RUNNING);
        ContinueCallback++;
        if(handler.hasMessages(RUNNING)&&ContinueCallback<100){
            onResume();
            handler.removeMessages(RUNNING);
        }else{
            handler.removeCallbacks(runnable);
        }
        super.onPause();
    }

    private Runnable runnable = new Runnable() {

        public void run() {
            MillisecondTime = SystemClock.uptimeMillis() - StartTime;

            UpdateTime = TimeBuff + MillisecondTime;

            Seconds = (int) (UpdateTime / 1000);

            Hours = Seconds / 60 / 60;

            Minutes = Seconds / 60;

            Seconds = Seconds % 60;

            MilliSeconds = (int) (UpdateTime % 100);

            mText.setText(String.format("%02d:%02d:%02d:%02d",Hours,Minutes-Hours*60,Seconds,MilliSeconds));

            mStopButton.setEnabled(true);

            handler.postDelayed(this,80);

            mLapButton.setVisibility(View.VISIBLE);
            mStopButton.setVisibility(View.VISIBLE);
            mStartButton.setVisibility(View.INVISIBLE);
            mResetButton.setVisibility(View.INVISIBLE);

        }

    };

    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        
        ActionBar actionBar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        
        // Nav bar button.
        MenuItem item = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, null);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        item.setIcon(R.drawable.button_icon661383);
        item.setOnMenuItemClickListener(mNavBarButtonClickListener);
    }

    public void updateLocalizedValues() {
        // needs to be run on UI thread
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_stopwatch_text_831472", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mResetButton)) {
                    mResetButton.setText(AppData.getLocalizedString("neonto_stopwatch_button_196356", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mStartButton)) {
                    mStartButton.setText(AppData.getLocalizedString("neonto_stopwatch_button2_10087", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mLapButton)) {
                    mLapButton.setText(AppData.getLocalizedString("neonto_stopwatch_button3_475981", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mStopButton)) {
                    mStopButton.setText(AppData.getLocalizedString("neonto_stopwatch_button4_1035560", ""));
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
            val = row.get("LapButton");
            if (val == null) val = row.get("lapbutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mLapButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mLapButton);
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
            val = row.get("list");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("json") && (value instanceof org.json.JSONArray)) {
                    DataSheet sheet = new DataSheet(getActivity(), getClass().getSimpleName());
                
                    sheet.takeRowsFromJSONArray((org.json.JSONArray) value);
                
                    ((StopWatchListAdapter) mList.getAdapter()).setDataSheet(sheet);
                    ((StopWatchListAdapter) mList.getAdapter()).notifyDataSetChanged();
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

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 0.0f, 87.29f, LayoutDesc.NO_VALUE, 720.0f, 164.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 0.0f, 1.28f, LayoutDesc.NO_VALUE, 240.0f, 75.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 0.0f, 152.1f, LayoutDesc.NO_VALUE, 1080.0f, 205.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 0.0f, 45.53f, LayoutDesc.NO_VALUE, 480.0f, 118.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mSaveButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSaveButton.add(new LayoutDesc(10, 633.74f, 302.84f, LayoutDesc.NO_VALUE, 72.26f, 72.26f));  // 720*1280 px
        layoutDescs_mSaveButton.add(new LayoutDesc(2, 203.59f, 58.88f, LayoutDesc.NO_VALUE, 31.41f, 31.41f));  // 240*320 px
        layoutDescs_mSaveButton.add(new LayoutDesc(12, 966.86f, 471.6f, LayoutDesc.NO_VALUE, 91.14f, 91.15f));  // 1080*1920 px
        layoutDescs_mSaveButton.add(new LayoutDesc(8, 418.76f, 181.88f, LayoutDesc.NO_VALUE, 51.24f, 51.25f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSaveButton = mOverrideElementLayoutDescriptors.get("saveButton");
            if (override_mSaveButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSaveButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSaveButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSaveButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSaveButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSaveButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSaveButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSaveButton, dm, layoutDescs_mSaveButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mResetButton = new ArrayList<LayoutDesc>();
        layoutDescs_mResetButton.add(new LayoutDesc(10, 118.48f, 389.06f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mResetButton.add(new LayoutDesc(2, 17.63f, 81.92f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mResetButton.add(new LayoutDesc(12, 228.95f, 599.4f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mResetButton.add(new LayoutDesc(8, 70.29f, 236.42f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mResetButton = mOverrideElementLayoutDescriptors.get("resetButton");
            if (override_mResetButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mResetButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mResetButton = layoutDescs;
                }
            }
        }
        layoutDescs_mResetButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mResetButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mResetButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mResetButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mResetButton, dm, layoutDescs_mResetButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStartButton = new ArrayList<LayoutDesc>();
        layoutDescs_mStartButton.add(new LayoutDesc(10, 389.0f, 389.06f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mStartButton.add(new LayoutDesc(2, 130.0f, 81.92f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mStartButton.add(new LayoutDesc(12, 583.0f, 599.4f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mStartButton.add(new LayoutDesc(8, 259.0f, 236.42f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStartButton = mOverrideElementLayoutDescriptors.get("startButton");
            if (override_mStartButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStartButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStartButton = layoutDescs;
                }
            }
        }
        layoutDescs_mStartButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStartButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStartButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStartButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mStartButton, dm, layoutDescs_mStartButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mLapButton = new ArrayList<LayoutDesc>();
        layoutDescs_mLapButton.add(new LayoutDesc(10, 118.48f, 389.06f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mLapButton.add(new LayoutDesc(2, 17.63f, 81.92f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mLapButton.add(new LayoutDesc(12, 228.95f, 599.4f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mLapButton.add(new LayoutDesc(8, 70.29f, 236.42f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mLapButton = mOverrideElementLayoutDescriptors.get("lapButton");
            if (override_mLapButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mLapButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mLapButton = layoutDescs;
                }
            }
        }
        layoutDescs_mLapButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLapButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLapButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mLapButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mLapButton, dm, layoutDescs_mLapButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mStopButton = new ArrayList<LayoutDesc>();
        layoutDescs_mStopButton.add(new LayoutDesc(10, 389.0f, 389.06f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mStopButton.add(new LayoutDesc(2, 130.0f, 81.92f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mStopButton.add(new LayoutDesc(12, 583.0f, 599.4f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mStopButton.add(new LayoutDesc(8, 259.0f, 236.42f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mStopButton = mOverrideElementLayoutDescriptors.get("stopButton");
            if (override_mStopButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mStopButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mStopButton = layoutDescs;
                }
            }
        }
        layoutDescs_mStopButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mStopButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mStopButton, dm, layoutDescs_mStopButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mList = new ArrayList<LayoutDesc>();
        layoutDescs_mList.add(new LayoutDesc(10, 0.0f, 518.39f, -0.39f, 720.0f, 762.0f));  // 720*1280 px
        layoutDescs_mList.add(new LayoutDesc(2, 0.0f, 116.48f, -0.48f, 240.0f, 204.0f));  // 240*320 px
        layoutDescs_mList.add(new LayoutDesc(12, 0.0f, 791.1f, -0.1f, 1080.0f, 1129.0f));  // 1080*1920 px
        layoutDescs_mList.add(new LayoutDesc(8, 0.0f, 318.23f, -0.23f, 480.0f, 482.0f));  // 480*800 px
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
        layoutDescs_mList.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mList.get(3).offsetToHorizontalKeylineT = 0.0f;
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

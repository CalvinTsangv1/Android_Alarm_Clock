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

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;
import com.neonto.exportedByUser_s2461812465168012.MyApp.R;

public class RecordSaveFragment extends Fragment {

    private AccessToken accessToken;
    CallbackManager callbackManager;
    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private RecordSaveBackgroundShapeView mBackgroundShape;
    private RecordSaveRectangle2View mRectangle2;
    private TextView mText;
    private Button mBackButton2;
    private TextView mText2;
    private TextView mText4;
    private TextView mText3;
    private TextView mText5;
    private RecordSaveRectangleCopyView mRectangleCopy;
    private RecordSaveRectangleCopy2View mRectangleCopy2;
    private RecordSaveRectangleCopy3View mRectangleCopy3;
    private RecordSaveRectangleCopy4View mRectangleCopy4;
    private RecordSaveRectangleView mRectangle;
    private RecordSavePhotopickerView mPhotopicker;
    private EditText mTitleEditText;
    private RecordSaveDatePickerView mDatePicker;
    private RecordSaveTimePickerView mTimePicker;
    private RecordSaveEventTypePickerView mEventTypePicker;
    private EditText mDescriptionEditText;
    private Button mSaveButton;
    private Button mPhotoPickerButton;
    private RecordSaveImageView mImage;
    private LoginButton mIconButton;
    private AppData.IDataSlotChangeListener mDataSlotChangeListener;
    private HashSet<String> mDeferredDataSlotUpdates = new HashSet<String>();
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public RecordSaveFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

        FacebookSdk.sdkInitialize(getActivity().getApplicationContext());
        callbackManager = CallbackManager.Factory.create();

        final View rootView = inflater.inflate(R.layout.fragment_record_save, container, false);
                
        mBackgroundShape = (RecordSaveBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle2 = (RecordSaveRectangle2View) rootView.findViewById(R.id.mRectangle2);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mBackButton2 = (Button) rootView.findViewById(R.id.mBackButton2);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mRectangleCopy = (RecordSaveRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (RecordSaveRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (RecordSaveRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mRectangleCopy4 = (RecordSaveRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangle = (RecordSaveRectangleView) rootView.findViewById(R.id.mRectangle);
        mPhotopicker = (RecordSavePhotopickerView) rootView.findViewById(R.id.mPhotopicker);
        mTitleEditText = (EditText) rootView.findViewById(R.id.mTitleEditText);
        mDatePicker = (RecordSaveDatePickerView) rootView.findViewById(R.id.mDatePicker);
        mTimePicker = (RecordSaveTimePickerView) rootView.findViewById(R.id.mTimePicker);
        mEventTypePicker = (RecordSaveEventTypePickerView) rootView.findViewById(R.id.mEventTypePicker);
        mDescriptionEditText = (EditText) rootView.findViewById(R.id.mDescriptionEditText);
        mSaveButton = (Button) rootView.findViewById(R.id.mSaveButton);
        mPhotoPickerButton = (Button) rootView.findViewById(R.id.mPhotoPickerButton);
        mImage = (RecordSaveImageView) rootView.findViewById(R.id.mImage);
        mIconButton = (LoginButton) rootView.findViewById(R.id.mIconButton);
        final RecordSaveFragment fragment = this;

        final Context context = getActivity().getBaseContext();
        
        
        mLocalizationSheetChangeListener = new DataSheet.OnChangeListener() {
            @Override
            public void dataSheetUpdated(DataSheet sheet) {
                updateLocalizedValues();
            }
        };
        AppData.localizationSheetDataSheet.addListener(mLocalizationSheetChangeListener);
        
        mText.setText(AppData.getLocalizedString("neonto_recordsave_text_469493", ""));

        
        mBackButton2.setText(AppData.getLocalizedString("neonto_recordsave_backbutton2_188994", ""));
        mBackButton2.setTransformationMethod(null);
        mBackButton2.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                getActivity().finish();
        
           }
        });

        
        mText2.setText(AppData.getLocalizedString("neonto_recordsave_text2_928885", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_recordsave_text4_265829", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_recordsave_text3_144322", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_recordsave_text5_917431", ""));

        
        mPhotopicker.showsPhoto = true;
        

        
        mTitleEditText.setBackgroundColor(android.graphics.Color.WHITE);

        

        

        
        mEventTypePicker.setDataSheet(AppData.pikcerDataSheet);

        
        mDescriptionEditText.setBackgroundColor(android.graphics.Color.WHITE);


        mIconButton.setFragment(fragment);
        mIconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   /* LoginManager manager = LoginManager.getInstance();
                    manager.logInWithPublishPermissions(fragment,Arrays.asList("publish_actions"));
                    manager.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                        @Override
                        public void onSuccess(LoginResult loginResult) {
                            accessToken = loginResult.getAccessToken();
                            System.out.println(accessToken);

                        }

                        @Override
                        public void onCancel() {

                        }

                        @Override
                        public void onError(FacebookException error) {

                        }
                    });*/
            }
        });



        mSaveButton.setText(AppData.getLocalizedString("neonto_recordsave_button_933231", ""));
        mSaveButton.setTransformationMethod(null);
        mSaveButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                Thread thread = new Thread() {
                                    @Override
                                    public void run() {
                                        // 'values' stores the data collected from the UI
                                        HashMap<String, Object> values = new HashMap<>();
                                        values.put("image", ((android.graphics.drawable.BitmapDrawable) mImage.getDrawable()).getBitmap());
                                        values.put("description", mDescriptionEditText.getText().toString());
                                        values.put("eventtype", mEventTypePicker.getCurrentValue());
                                        values.put("time", mTimePicker.getCurrentValue());
                                        values.put("date", mDatePicker.getCurrentValue());
                                        values.put("title", mTitleEditText.getText().toString());
                                
                                        final DataSheet dataSheet = AppData.stopwatchSaveDataSheet;
                                        if (dataSheet == mDataSheet) {
                                            mDataSheet.updateRow(mDataSheetRowIndex, values);
                                        } else {
                                            dataSheet.saveRowWithValues(values);
                                        }
                                        
                                        getActivity().runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                dataSheet.notifyRowsModified();
                                            }
                                        });
                                        
                                        actionSequencer.resume();
                                    }
                                };
                                thread.start();
                                return false;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                Intent intent = new Intent(getActivity(), RecordStopwatchListActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                                if (mDataSheet != null) {
                                    intent.putExtra("dataSheetName", mDataSheet.getName());
                                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                                }
                                getActivity().startActivity(intent);
                                return true;
                            }
                        },
                });
        
           }
        });

        
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
                            
                        RecordSaveFragment.this.dataSlotUpdated(name);
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
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon559872);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // 'Show question popup' action
                                new android.app.AlertDialog.Builder(getActivity())
                                .setMessage("Do you really want to leave?")
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
                                getActivity().finish();
                                return true;
                            }
                        },
                });
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
                    mText.setText(AppData.getLocalizedString("neonto_recordsave_text_469493", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mBackButton2)) {
                    mBackButton2.setText(AppData.getLocalizedString("neonto_recordsave_backbutton2_188994", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_recordsave_text2_928885", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_recordsave_text4_265829", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_recordsave_text3_144322", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_recordsave_text5_917431", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mSaveButton)) {
                    mSaveButton.setText(AppData.getLocalizedString("neonto_recordsave_button_933231", ""));
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
            val = row.get("back button 2");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mBackButton2.setText((String) value);
                    mDataSheetUpdatedElems.add(mBackButton2);
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
            val = row.get("Title");
            if (val == null) val = row.get("title");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTitleEditText.setText((String) value);
                }
            }
        }
        {
            val = row.get("Date");
            if (val == null) val = row.get("date");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mDatePicker.setCurrentValue((String) value);
                }
            }
        }
        {
            val = row.get("Time");
            if (val == null) val = row.get("time");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mTimePicker.setCurrentValue((String) value);
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
                    mEventTypePicker.setCurrentValue((String) value);
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
                    mDescriptionEditText.setText((String) value);
                }
            }
        }
        {
            val = row.get("SaveButton");
            if (val == null) val = row.get("savebutton");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mSaveButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mSaveButton);
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

        ArrayList<LayoutDesc> layoutDescs_mRectangle2 = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangle2.add(new LayoutDesc(10, 72.0f, 805.79f, 243.29f, 576.0f, 230.92f));  // 720*1280 px
        layoutDescs_mRectangle2.add(new LayoutDesc(2, 24.0f, 193.28f, 64.28f, 192.0f, 62.44f));  // 240*320 px
        layoutDescs_mRectangle2.add(new LayoutDesc(12, 108.0f, 1217.1f, 361.1f, 864.0f, 341.8f));  // 1080*1920 px
        layoutDescs_mRectangle2.add(new LayoutDesc(8, 48.0f, 500.03f, 153.53f, 384.0f, 146.44f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRectangle2 = mOverrideElementLayoutDescriptors.get("rectangle2");
            if (override_mRectangle2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRectangle2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRectangle2 = layoutDescs;
                }
            }
        }
        layoutDescs_mRectangle2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mRectangle2.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRectangle2.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mRectangle2, dm, layoutDescs_mRectangle2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 14.0f, 58.18f, LayoutDesc.NO_VALUE, 127.51f, 70.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 5.0f, -5.24f, LayoutDesc.NO_VALUE, 55.42f, 34.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 22.0f, 110.2f, LayoutDesc.NO_VALUE, 160.83f, 87.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 10.0f, 28.26f, LayoutDesc.NO_VALUE, 90.42f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mBackButton2 = new ArrayList<LayoutDesc>();
        layoutDescs_mBackButton2.add(new LayoutDesc(10, 14.0f, 195.14f, LayoutDesc.NO_VALUE, 297.52f, 63.76f));  // 720*1280 px
        layoutDescs_mBackButton2.add(new LayoutDesc(2, 5.0f, 32.48f, LayoutDesc.NO_VALUE, 129.32f, 27.71f));  // 240*320 px
        layoutDescs_mBackButton2.add(new LayoutDesc(12, 22.0f, 312.6f, LayoutDesc.NO_VALUE, 375.26f, 80.41f));  // 1080*1920 px
        layoutDescs_mBackButton2.add(new LayoutDesc(8, 10.0f, 114.98f, LayoutDesc.NO_VALUE, 210.99f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText2 = new ArrayList<LayoutDesc>();
        layoutDescs_mText2.add(new LayoutDesc(10, 14.0f, 403.06f, LayoutDesc.NO_VALUE, 127.51f, 70.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 5.0f, 86.92f, LayoutDesc.NO_VALUE, 55.42f, 34.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 22.0f, 621.4f, LayoutDesc.NO_VALUE, 160.83f, 87.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 10.0f, 246.42f, LayoutDesc.NO_VALUE, 90.42f, 52.0f));  // 480*800 px
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
        layoutDescs_mText4.add(new LayoutDesc(10, 14.0f, 632.98f, LayoutDesc.NO_VALUE, 255.02f, 70.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 5.0f, 148.36f, LayoutDesc.NO_VALUE, 110.84f, 34.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 22.0f, 962.2f, LayoutDesc.NO_VALUE, 321.65f, 87.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 10.0f, 391.86f, LayoutDesc.NO_VALUE, 180.85f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText3 = new ArrayList<LayoutDesc>();
        layoutDescs_mText3.add(new LayoutDesc(10, 14.0f, 518.02f, LayoutDesc.NO_VALUE, 127.51f, 70.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 5.0f, 117.64f, LayoutDesc.NO_VALUE, 55.42f, 34.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 22.0f, 791.8f, LayoutDesc.NO_VALUE, 160.83f, 87.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 10.0f, 319.14f, LayoutDesc.NO_VALUE, 90.42f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText5 = new ArrayList<LayoutDesc>();
        layoutDescs_mText5.add(new LayoutDesc(10, 14.0f, 740.94f, LayoutDesc.NO_VALUE, 255.02f, 70.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 5.0f, 176.08f, LayoutDesc.NO_VALUE, 110.84f, 34.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 22.0f, 1121.6f, LayoutDesc.NO_VALUE, 321.65f, 87.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 10.0f, 459.58f, LayoutDesc.NO_VALUE, 180.85f, 52.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mRectangleCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 733.94f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 174.08f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 1110.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 454.58f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 618.98f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 143.36f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 940.2f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 381.86f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 504.02f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 112.64f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 769.8f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 309.14f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 389.06f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 81.92f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 599.4f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 236.42f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mPhotopicker = new ArrayList<LayoutDesc>();
        layoutDescs_mPhotopicker.add(new LayoutDesc(10, -459.0f, 348.0f, LayoutDesc.NO_VALUE, 306.02f, 306.02f));  // 720*1280 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(2, -199.0f, 140.0f, LayoutDesc.NO_VALUE, 133.01f, 133.01f));  // 240*320 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(12, -579.0f, 453.0f, LayoutDesc.NO_VALUE, 385.99f, 385.99f));  // 1080*1920 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(8, -325.0f, 207.0f, LayoutDesc.NO_VALUE, 217.02f, 217.02f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mTitleEditText = new ArrayList<LayoutDesc>();
        layoutDescs_mTitleEditText.add(new LayoutDesc(10, 122.0f, 44.18f, LayoutDesc.NO_VALUE, 598.0f, 63.76f));  // 720*1280 px
        layoutDescs_mTitleEditText.add(new LayoutDesc(2, 41.0f, -10.24f, LayoutDesc.NO_VALUE, 199.0f, 27.71f));  // 240*320 px
        layoutDescs_mTitleEditText.add(new LayoutDesc(12, 184.0f, 88.2f, LayoutDesc.NO_VALUE, 896.0f, 80.41f));  // 1080*1920 px
        layoutDescs_mTitleEditText.add(new LayoutDesc(8, 82.0f, 18.26f, LayoutDesc.NO_VALUE, 398.0f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTitleEditText = mOverrideElementLayoutDescriptors.get("titleEditText");
            if (override_mTitleEditText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTitleEditText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTitleEditText = layoutDescs;
                }
            }
        }
        layoutDescs_mTitleEditText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTitleEditText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTitleEditText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTitleEditText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTitleEditText, dm, layoutDescs_mTitleEditText, true, false);

        ArrayList<LayoutDesc> layoutDescs_mDatePicker = new ArrayList<LayoutDesc>();
        layoutDescs_mDatePicker.add(new LayoutDesc(10, 137.0f, 403.06f, LayoutDesc.NO_VALUE, 340.03f, 53.0f));  // 720*1280 px
        layoutDescs_mDatePicker.add(new LayoutDesc(2, 46.0f, 86.92f, LayoutDesc.NO_VALUE, 147.79f, 27.0f));  // 240*320 px
        layoutDescs_mDatePicker.add(new LayoutDesc(12, 205.0f, 621.4f, LayoutDesc.NO_VALUE, 428.87f, 65.0f));  // 1080*1920 px
        layoutDescs_mDatePicker.add(new LayoutDesc(8, 91.0f, 246.42f, LayoutDesc.NO_VALUE, 241.13f, 40.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDatePicker = mOverrideElementLayoutDescriptors.get("datePicker");
            if (override_mDatePicker != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDatePicker.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDatePicker = layoutDescs;
                }
            }
        }
        layoutDescs_mDatePicker.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDatePicker.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDatePicker.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDatePicker.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mDatePicker, dm, layoutDescs_mDatePicker, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTimePicker = new ArrayList<LayoutDesc>();
        layoutDescs_mTimePicker.add(new LayoutDesc(10, 137.0f, 518.02f, LayoutDesc.NO_VALUE, 340.03f, 53.0f));  // 720*1280 px
        layoutDescs_mTimePicker.add(new LayoutDesc(2, 46.0f, 117.64f, LayoutDesc.NO_VALUE, 147.79f, 27.0f));  // 240*320 px
        layoutDescs_mTimePicker.add(new LayoutDesc(12, 205.0f, 791.8f, LayoutDesc.NO_VALUE, 428.87f, 65.0f));  // 1080*1920 px
        layoutDescs_mTimePicker.add(new LayoutDesc(8, 91.0f, 319.14f, LayoutDesc.NO_VALUE, 241.13f, 40.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimePicker = mOverrideElementLayoutDescriptors.get("timePicker");
            if (override_mTimePicker != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimePicker.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimePicker = layoutDescs;
                }
            }
        }
        layoutDescs_mTimePicker.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimePicker.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimePicker.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimePicker.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTimePicker, dm, layoutDescs_mTimePicker, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEventTypePicker = new ArrayList<LayoutDesc>();
        layoutDescs_mEventTypePicker.add(new LayoutDesc(10, 230.0f, 625.98f, LayoutDesc.NO_VALUE, 297.52f, 70.0f));  // 720*1280 px
        layoutDescs_mEventTypePicker.add(new LayoutDesc(2, 77.0f, 145.36f, LayoutDesc.NO_VALUE, 129.32f, 34.0f));  // 240*320 px
        layoutDescs_mEventTypePicker.add(new LayoutDesc(12, 346.0f, 951.2f, LayoutDesc.NO_VALUE, 375.26f, 87.0f));  // 1080*1920 px
        layoutDescs_mEventTypePicker.add(new LayoutDesc(8, 154.0f, 386.86f, LayoutDesc.NO_VALUE, 210.99f, 52.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEventTypePicker = mOverrideElementLayoutDescriptors.get("eventTypePicker");
            if (override_mEventTypePicker != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEventTypePicker.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEventTypePicker = layoutDescs;
                }
            }
        }
        layoutDescs_mEventTypePicker.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEventTypePicker.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEventTypePicker.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEventTypePicker.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEventTypePicker, dm, layoutDescs_mEventTypePicker, true, true);

        ArrayList<LayoutDesc> layoutDescs_mDescriptionEditText = new ArrayList<LayoutDesc>();
        layoutDescs_mDescriptionEditText.add(new LayoutDesc(10, 72.0f, 805.79f, 243.29f, 576.0f, 230.92f));  // 720*1280 px
        layoutDescs_mDescriptionEditText.add(new LayoutDesc(2, 24.0f, 193.28f, 64.28f, 192.0f, 62.44f));  // 240*320 px
        layoutDescs_mDescriptionEditText.add(new LayoutDesc(12, 108.0f, 1217.1f, 361.1f, 864.0f, 341.8f));  // 1080*1920 px
        layoutDescs_mDescriptionEditText.add(new LayoutDesc(8, 48.0f, 500.03f, 153.53f, 384.0f, 146.44f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mDescriptionEditText = mOverrideElementLayoutDescriptors.get("descriptionEditText");
            if (override_mDescriptionEditText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mDescriptionEditText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mDescriptionEditText = layoutDescs;
                }
            }
        }
        layoutDescs_mDescriptionEditText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDescriptionEditText.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDescriptionEditText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDescriptionEditText.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDescriptionEditText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDescriptionEditText.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mDescriptionEditText.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mDescriptionEditText.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mDescriptionEditText, dm, layoutDescs_mDescriptionEditText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSaveButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSaveButton.add(new LayoutDesc(10, 254.0f, 1135.93f, LayoutDesc.NO_VALUE, 212.52f, 63.76f));  // 720*1280 px
        layoutDescs_mSaveButton.add(new LayoutDesc(2, 74.0f, 282.76f, LayoutDesc.NO_VALUE, 92.37f, 27.71f));  // 240*320 px
        layoutDescs_mSaveButton.add(new LayoutDesc(12, 406.0f, 1707.7f, LayoutDesc.NO_VALUE, 268.05f, 80.41f));  // 1080*1920 px
        layoutDescs_mSaveButton.add(new LayoutDesc(8, 165.0f, 710.01f, LayoutDesc.NO_VALUE, 150.71f, 45.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mPhotoPickerButton = new ArrayList<LayoutDesc>();
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(10, 0.0f, 159.14f, 889.94f, 720.0f, 230.92f));  // 720*1280 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(2, 0.0f, 20.48f, 237.08f, 240.0f, 62.44f));  // 240*320 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(12, 0.0f, 258.6f, 1319.6f, 1080.0f, 341.8f));  // 1080*1920 px
        layoutDescs_mPhotoPickerButton.add(new LayoutDesc(8, 0.0f, 90.98f, 562.58f, 480.0f, 146.44f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 542.0f, 173.14f, 903.86f, 149.0f, 203.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 165.0f, 25.48f, 241.52f, 65.0f, 53.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 849.0f, 280.6f, 1341.4f, 188.0f, 298.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 355.0f, 100.98f, 572.02f, 106.0f, 127.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.141904762, 0.0, 0.0, 0.141904762, 0.0, -10.250]; [0.141992449, 0.0, 0.0, 0.130154724, 1.560952381, 2.805238095]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.061904762, 0.0, 0.0, 0.061904762, 0.0, -22.250]; [0.061943015, 0.0, 0.0, 0.056778906, 0.680952381, -16.554761905]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.189206349, 0.0, 0.0, 0.189206349, -5.333333333, 0.0]; [0.189323265, 0.0, 0.0, 0.173539632, -3.252063492, 17.406984127]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.100952381, 0.0, 0.0, 0.100952381, 0.0, -16.0]; [0.101014762, 0.0, 0.0, 0.092593293, 1.110476190, -6.712380952]";
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mIconButton = new ArrayList<LayoutDesc>();
        layoutDescs_mIconButton.add(new LayoutDesc(10, 614.49f, 1035.71f, LayoutDesc.NO_VALUE, 76.51f, 76.51f));  // 720*1280 px
        layoutDescs_mIconButton.add(new LayoutDesc(2, 196.75f, 254.72f, LayoutDesc.NO_VALUE, 33.25f, 33.25f));  // 240*320 px
        layoutDescs_mIconButton.add(new LayoutDesc(12, 940.50f, 1557.9f, LayoutDesc.NO_VALUE, 96.50f, 96.50f));  // 1080*1920 px
        layoutDescs_mIconButton.add(new LayoutDesc(8, 406.75f, 645.47f, LayoutDesc.NO_VALUE, 54.25f, 54.25f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mIconButton = mOverrideElementLayoutDescriptors.get("iconButton");
            if (override_mIconButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mIconButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mIconButton = layoutDescs;
                }
            }
        }
        layoutDescs_mIconButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mIconButton.get(3).offsetToHorizontalKeylineT = 0.0f;
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

}

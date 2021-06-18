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
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.*;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.*;
import android.view.*;
import android.webkit.WebView;
import android.widget.*;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.neonto.exportedByUser_s2461812465168012.MyApp.R;

public class SetAlarmFragment extends Fragment {

    private String[] AmpmString = new String[]{"AM","PM"};
    private DataSheet.OnChangeListener mLocalizationSheetChangeListener;
    private SetAlarmBackgroundShapeView mBackgroundShape;
    private SetAlarmRectangleView mRectangle;
    private SetAlarmRectangleCopyView mRectangleCopy;
    private SetAlarmRectangleCopy2View mRectangleCopy2;
    private SetAlarmRectangleCopy3View mRectangleCopy3;
    private SetAlarmRectangleCopy4View mRectangleCopy4;
    private SetAlarmRectangleCopy5View mRectangleCopy5;
    private SetAlarmRectangleCopy6View mRectangleCopy6;
    private SetAlarmRectangleCopy7View mRectangleCopy7;
    private SetAlarmEllipseCopy12View mEllipseCopy12;
    private SetAlarmEllipseCopy13View mEllipseCopy13;
    private SetAlarmEllipseCopy14View mEllipseCopy14;
    private SetAlarmEllipseCopy15View mEllipseCopy15;
    private SetAlarmEllipseCopy16View mEllipseCopy16;
    private SetAlarmEllipseCopy17View mEllipseCopy17;
    private SetAlarmEllipseCopy25View mEllipseCopy25;
    private SetAlarmEllipseCopy26View mEllipseCopy26;
    private SetAlarmEllipseCopy27View mEllipseCopy27;
    private SetAlarmEllipseCopy28View mEllipseCopy28;
    private SetAlarmEllipseCopy29View mEllipseCopy29;
    private SetAlarmEllipseCopy30View mEllipseCopy30;
    private SetAlarmEllipseCopy31View mEllipseCopy31;
    private SetAlarmEllipseCopyView mEllipseCopy;
    private SetAlarmEllipseView mEllipse;
    private SetAlarmEllipseCopy2View mEllipseCopy2;
    private SetAlarmEllipseCopy3View mEllipseCopy3;
    private SetAlarmEllipseCopy5View mEllipseCopy5;
    private SetAlarmEllipseCopy6View mEllipseCopy6;
    private SetAlarmEllipseCopy18View mEllipseCopy18;
    private SetAlarmEllipseCopy19View mEllipseCopy19;
    private SetAlarmEllipseCopy20View mEllipseCopy20;
    private SetAlarmEllipseCopy21View mEllipseCopy21;
    private SetAlarmEllipseCopy22View mEllipseCopy22;
    private SetAlarmEllipseCopy23View mEllipseCopy23;
    private SetAlarmEllipseCopy24View mEllipseCopy24;
    private ImageButton mSoundDisableicon;
    private ImageButton mVibreateDisableicon;
    private ImageButton mMusicEnableicon;
    private ImageButton mVibreateEnableicon;
    private SetAlarmEllipseCopy4View mEllipseCopy4;
    private SetAlarmEllipseCopy7View mEllipseCopy7;
    private SetAlarmEllipseCopy8View mEllipseCopy8;
    private SetAlarmEllipseCopy9View mEllipseCopy9;
    private SetAlarmEllipseCopy10View mEllipseCopy10;
    private SetAlarmEllipseCopy11View mEllipseCopy11;
    private TextView mText12;
    private TextView mText14;
    private TextView mText15;
    private TextView mText16;
    private TextView mText17;
    private TextView mText18;
    private TextView mText19;
    private TextView mText;
    private TextView mText2;
    private TextView mText3;
    private TextView mText4;
    private TextView mText5;
    private TextView mText6;
    private TextView mText7;
    private TextView mText8;
    private TextView mText9;
    private TextView mTimeText;
    private TextView mNameText;
    private SetAlarmImageView mImage;
    private TextView mRingtoneText;
    private TextView mVolumeText;
    private android.support.v7.widget.SwitchCompat mSwitch;
    private Button mAlarmTimeButton;
    private Button mAlarmNameButton;
    private Button mPickPictureButton;
    private Button mRingtoneButton;
    private Button mVolumeButton;
    private Button mMusicButton;
    private Button mVibrateButton;
    private Button mSatursdayButton;
    private Button mFridayButton;
    private Button mThursdayButton;
    private Button mWednesdayButton;
    private Button mTuesdayButton;
    private Button mMondayButton;
    private Button mSundayButton;
    private Button mYellowButton;
    private Button mBlockButton;
    private Button mBlueButton;
    private Button mRedButton;
    private Button mGreenButton;
    private Button mPurpleButton;
    private SetAlarmPhotopickerView mPhotopicker;
    private RelativeLayout mNested;
    private Button mButton;
    private AppData.IDataSlotChangeListener mDataSlotChangeListener;
    private HashSet<String> mDeferredDataSlotUpdates = new HashSet<String>();
    
    private MenuItem.OnMenuItemClickListener mNavBarButtonClickListener;
    private DataSheet mDataSheet;
    private int mDataSheetRowIndex;
    private ArrayList<AppData.OnLoadingDrawableFinishedListener> mPendingLoadImageListeners = new ArrayList<>();
    private HashSet<View> mDataSheetUpdatedElems = new HashSet<View>();

    public SetAlarmFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_set_alarm, container, false);
                
        mBackgroundShape = (SetAlarmBackgroundShapeView) rootView.findViewById(R.id.mBackgroundShape);
        mRectangle = (SetAlarmRectangleView) rootView.findViewById(R.id.mRectangle);
        mRectangleCopy = (SetAlarmRectangleCopyView) rootView.findViewById(R.id.mRectangleCopy);
        mRectangleCopy2 = (SetAlarmRectangleCopy2View) rootView.findViewById(R.id.mRectangleCopy2);
        mRectangleCopy3 = (SetAlarmRectangleCopy3View) rootView.findViewById(R.id.mRectangleCopy3);
        mRectangleCopy4 = (SetAlarmRectangleCopy4View) rootView.findViewById(R.id.mRectangleCopy4);
        mRectangleCopy5 = (SetAlarmRectangleCopy5View) rootView.findViewById(R.id.mRectangleCopy5);
        mRectangleCopy6 = (SetAlarmRectangleCopy6View) rootView.findViewById(R.id.mRectangleCopy6);
        mRectangleCopy7 = (SetAlarmRectangleCopy7View) rootView.findViewById(R.id.mRectangleCopy7);
        mEllipseCopy12 = (SetAlarmEllipseCopy12View) rootView.findViewById(R.id.mEllipseCopy12);
        mEllipseCopy13 = (SetAlarmEllipseCopy13View) rootView.findViewById(R.id.mEllipseCopy13);
        mEllipseCopy14 = (SetAlarmEllipseCopy14View) rootView.findViewById(R.id.mEllipseCopy14);
        mEllipseCopy15 = (SetAlarmEllipseCopy15View) rootView.findViewById(R.id.mEllipseCopy15);
        mEllipseCopy16 = (SetAlarmEllipseCopy16View) rootView.findViewById(R.id.mEllipseCopy16);
        mEllipseCopy17 = (SetAlarmEllipseCopy17View) rootView.findViewById(R.id.mEllipseCopy17);
        mEllipseCopy25 = (SetAlarmEllipseCopy25View) rootView.findViewById(R.id.mEllipseCopy25);
        mEllipseCopy26 = (SetAlarmEllipseCopy26View) rootView.findViewById(R.id.mEllipseCopy26);
        mEllipseCopy27 = (SetAlarmEllipseCopy27View) rootView.findViewById(R.id.mEllipseCopy27);
        mEllipseCopy28 = (SetAlarmEllipseCopy28View) rootView.findViewById(R.id.mEllipseCopy28);
        mEllipseCopy29 = (SetAlarmEllipseCopy29View) rootView.findViewById(R.id.mEllipseCopy29);
        mEllipseCopy30 = (SetAlarmEllipseCopy30View) rootView.findViewById(R.id.mEllipseCopy30);
        mEllipseCopy31 = (SetAlarmEllipseCopy31View) rootView.findViewById(R.id.mEllipseCopy31);
        mEllipseCopy = (SetAlarmEllipseCopyView) rootView.findViewById(R.id.mEllipseCopy);
        mEllipse = (SetAlarmEllipseView) rootView.findViewById(R.id.mEllipse);
        mEllipseCopy2 = (SetAlarmEllipseCopy2View) rootView.findViewById(R.id.mEllipseCopy2);
        mEllipseCopy3 = (SetAlarmEllipseCopy3View) rootView.findViewById(R.id.mEllipseCopy3);
        mEllipseCopy5 = (SetAlarmEllipseCopy5View) rootView.findViewById(R.id.mEllipseCopy5);
        mEllipseCopy6 = (SetAlarmEllipseCopy6View) rootView.findViewById(R.id.mEllipseCopy6);
        mEllipseCopy18 = (SetAlarmEllipseCopy18View) rootView.findViewById(R.id.mEllipseCopy18);
        mEllipseCopy19 = (SetAlarmEllipseCopy19View) rootView.findViewById(R.id.mEllipseCopy19);
        mEllipseCopy20 = (SetAlarmEllipseCopy20View) rootView.findViewById(R.id.mEllipseCopy20);
        mEllipseCopy21 = (SetAlarmEllipseCopy21View) rootView.findViewById(R.id.mEllipseCopy21);
        mEllipseCopy22 = (SetAlarmEllipseCopy22View) rootView.findViewById(R.id.mEllipseCopy22);
        mEllipseCopy23 = (SetAlarmEllipseCopy23View) rootView.findViewById(R.id.mEllipseCopy23);
        mEllipseCopy24 = (SetAlarmEllipseCopy24View) rootView.findViewById(R.id.mEllipseCopy24);
        mSoundDisableicon = (ImageButton) rootView.findViewById(R.id.mSoundDisableicon);
        mVibreateDisableicon = (ImageButton) rootView.findViewById(R.id.mVibreateDisableicon);
        mMusicEnableicon = (ImageButton) rootView.findViewById(R.id.mMusicEnableicon);
        mVibreateEnableicon = (ImageButton) rootView.findViewById(R.id.mVibreateEnableicon);
        mEllipseCopy4 = (SetAlarmEllipseCopy4View) rootView.findViewById(R.id.mEllipseCopy4);
        mEllipseCopy7 = (SetAlarmEllipseCopy7View) rootView.findViewById(R.id.mEllipseCopy7);
        mEllipseCopy8 = (SetAlarmEllipseCopy8View) rootView.findViewById(R.id.mEllipseCopy8);
        mEllipseCopy9 = (SetAlarmEllipseCopy9View) rootView.findViewById(R.id.mEllipseCopy9);
        mEllipseCopy10 = (SetAlarmEllipseCopy10View) rootView.findViewById(R.id.mEllipseCopy10);
        mEllipseCopy11 = (SetAlarmEllipseCopy11View) rootView.findViewById(R.id.mEllipseCopy11);
        mText12 = (TextView) rootView.findViewById(R.id.mText12);
        mText14 = (TextView) rootView.findViewById(R.id.mText14);
        mText15 = (TextView) rootView.findViewById(R.id.mText15);
        mText16 = (TextView) rootView.findViewById(R.id.mText16);
        mText17 = (TextView) rootView.findViewById(R.id.mText17);
        mText18 = (TextView) rootView.findViewById(R.id.mText18);
        mText19 = (TextView) rootView.findViewById(R.id.mText19);
        mText = (TextView) rootView.findViewById(R.id.mText);
        mText2 = (TextView) rootView.findViewById(R.id.mText2);
        mText3 = (TextView) rootView.findViewById(R.id.mText3);
        mText4 = (TextView) rootView.findViewById(R.id.mText4);
        mText5 = (TextView) rootView.findViewById(R.id.mText5);
        mText6 = (TextView) rootView.findViewById(R.id.mText6);
        mText7 = (TextView) rootView.findViewById(R.id.mText7);
        mText8 = (TextView) rootView.findViewById(R.id.mText8);
        mText9 = (TextView) rootView.findViewById(R.id.mText9);
        mTimeText = (TextView) rootView.findViewById(R.id.mTimeText);
        mNameText = (TextView) rootView.findViewById(R.id.mNameText);
        mImage = (SetAlarmImageView) rootView.findViewById(R.id.mImage);
        mRingtoneText = (TextView) rootView.findViewById(R.id.mRingtoneText);
        mVolumeText = (TextView) rootView.findViewById(R.id.mVolumeText);
        mSwitch = (android.support.v7.widget.SwitchCompat) rootView.findViewById(R.id.mSwitch);
        mAlarmTimeButton = (Button) rootView.findViewById(R.id.mAlarmTimeButton);
        mAlarmNameButton = (Button) rootView.findViewById(R.id.mAlarmNameButton);
        mPickPictureButton = (Button) rootView.findViewById(R.id.mPickPictureButton);
        mRingtoneButton = (Button) rootView.findViewById(R.id.mRingtoneButton);
        mVolumeButton = (Button) rootView.findViewById(R.id.mVolumeButton);
        mMusicButton = (Button) rootView.findViewById(R.id.mMusicButton);
        mVibrateButton = (Button) rootView.findViewById(R.id.mVibrateButton);
        mSatursdayButton = (Button) rootView.findViewById(R.id.mSatursdayButton);
        mFridayButton = (Button) rootView.findViewById(R.id.mFridayButton);
        mThursdayButton = (Button) rootView.findViewById(R.id.mThursdayButton);
        mWednesdayButton = (Button) rootView.findViewById(R.id.mWednesdayButton);
        mTuesdayButton = (Button) rootView.findViewById(R.id.mTuesdayButton);
        mMondayButton = (Button) rootView.findViewById(R.id.mMondayButton);
        mSundayButton = (Button) rootView.findViewById(R.id.mSundayButton);
        mYellowButton = (Button) rootView.findViewById(R.id.mYellowButton);
        mBlockButton = (Button) rootView.findViewById(R.id.mBlockButton);
        mBlueButton = (Button) rootView.findViewById(R.id.mBlueButton);
        mRedButton = (Button) rootView.findViewById(R.id.mRedButton);
        mGreenButton = (Button) rootView.findViewById(R.id.mGreenButton);
        mPurpleButton = (Button) rootView.findViewById(R.id.mPurpleButton);
        mPhotopicker = (SetAlarmPhotopickerView) rootView.findViewById(R.id.mPhotopicker);
        mNested = (RelativeLayout) rootView.findViewById(R.id.mNested);
        mButton = (Button) rootView.findViewById(R.id.mButton);
        final SetAlarmFragment fragment = this;

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
                                        values.put("switch", (mSwitch.isChecked() ? "true" : "false"));
                                        values.put("image", ((android.graphics.drawable.BitmapDrawable) mImage.getDrawable()).getBitmap());
                                
                                        final DataSheet dataSheet = AppData.alarmSaveDataSheet;
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
                                Intent intent = new Intent(getActivity(), TabBar1Activity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                                if (mDataSheet != null) {
                                    intent.putExtra("dataSheetName", mDataSheet.getName());
                                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                                }
                                intent.putExtra("tabIndex", 1);getActivity().startActivity(intent);
                                return true;
                            }
                        },
                });
        
                return true;
            }
        };

        mEllipseCopy13.setVisibility(View.INVISIBLE);
        mEllipseCopy14.setVisibility(View.INVISIBLE);
        mEllipseCopy15.setVisibility(View.INVISIBLE);
        mEllipseCopy16.setVisibility(View.INVISIBLE);
        mEllipseCopy17.setVisibility(View.INVISIBLE);
        mEllipseCopy30.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 30'
                mEllipseCopy30.setVisibility(mEllipseCopy30.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        

        

        

        

        
        mText12.setText(AppData.getLocalizedString("neonto_setalarm_text12_230509", ""));

        
        mText14.setText(AppData.getLocalizedString("neonto_setalarm_text14_356015", ""));

        
        mText15.setText(AppData.getLocalizedString("neonto_setalarm_text15_108144", ""));

        
        mText16.setText(AppData.getLocalizedString("neonto_setalarm_text16_1024168", ""));

        
        mText17.setText(AppData.getLocalizedString("neonto_setalarm_text17_596207", ""));

        
        mText18.setText(AppData.getLocalizedString("neonto_setalarm_text18_495341", ""));

        
        mText19.setText(AppData.getLocalizedString("neonto_setalarm_text19_618117", ""));

        
        mText.setText(AppData.getLocalizedString("neonto_setalarm_text_945970", ""));

        
        mText2.setText(AppData.getLocalizedString("neonto_setalarm_text2_277133", ""));

        
        mText3.setText(AppData.getLocalizedString("neonto_setalarm_text3_284535", ""));

        
        mText4.setText(AppData.getLocalizedString("neonto_setalarm_text4_248264", ""));

        
        mText5.setText(AppData.getLocalizedString("neonto_setalarm_text5_952331", ""));

        
        mText6.setText(AppData.getLocalizedString("neonto_setalarm_text6_477712", ""));

        
        mText7.setText(AppData.getLocalizedString("neonto_setalarm_text7_234856", ""));

        
        mText8.setText(AppData.getLocalizedString("neonto_setalarm_text8_908425", ""));

        
        mText9.setText(AppData.getLocalizedString("neonto_setalarm_text9_667882", ""));

        
        mTimeText.setText(AppData.getLocalizedString("neonto_setalarm_text10_335753", ""));

        
        mNameText.setText(AppData.getLocalizedString("neonto_setalarm_text11_735097", ""));

        
        mRingtoneText.setText(AppData.getLocalizedString("neonto_setalarm_text13_243546", ""));

        
        mVolumeText.setText(AppData.getLocalizedString("neonto_setalarm_text21_987325", ""));

        

        mAlarmNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetAlarmFragment.super.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        AlarmNameDialog(SetAlarmFragment.super.getActivity());
                    }
                });
            }
        });

        mAlarmTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetAlarmFragment.super.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        AlarmTimeDialog(SetAlarmFragment.super.getActivity());
                    }
                });
            }
        });

        mVolumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetAlarmFragment.super.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        VolumeDialog(SetAlarmFragment.super.getActivity());
                    }
                });
            }
        });
        
        mPickPictureButton.setOnClickListener(new View.OnClickListener() {
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

        mRingtoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetAlarmFragment.super.getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        RingtoneDialog(SetAlarmFragment.super.getActivity());
                    }
                });
            }
        });

        

        
        mMusicButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'MusicEnableicon'
                mMusicEnableicon.setVisibility(mMusicEnableicon.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mVibrateButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'VibreateEnableicon'
                mVibreateEnableicon.setVisibility(mVibreateEnableicon.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mSatursdayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 30'
                mEllipseCopy30.setVisibility(mEllipseCopy30.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mFridayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 29'
                mEllipseCopy29.setVisibility(mEllipseCopy29.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mThursdayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 28'
                mEllipseCopy28.setVisibility(mEllipseCopy28.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mWednesdayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 27'
                mEllipseCopy27.setVisibility(mEllipseCopy27.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mTuesdayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 26'
                mEllipseCopy26.setVisibility(mEllipseCopy26.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mMondayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 25'
                mEllipseCopy25.setVisibility(mEllipseCopy25.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mSundayButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                // Reveal or hide element 'ellipse copy 31'
                mEllipseCopy31.setVisibility(mEllipseCopy31.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        
           }
        });

        
        mYellowButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mBlockButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mBlueButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mRedButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mGreenButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mPurpleButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                final ActionSequencer actionSequencer = new ActionSequencer();
                actionSequencer.run(getActivity(), new ActionSequencer.Action []{
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 12'
                                mEllipseCopy12.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 13'
                                mEllipseCopy13.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 14'
                                mEllipseCopy14.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 15'
                                mEllipseCopy15.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 16'
                                mEllipseCopy16.setVisibility(View.INVISIBLE);
                                return true;
                            }
                        },
                        new ActionSequencer.Action() {
                            @Override
                            public boolean execute() {
                                // Reveal or hide element 'ellipse copy 17'
                                mEllipseCopy17.setVisibility(View.VISIBLE);
                                return true;
                            }
                        },
                });
        
           }
        });

        
        mPhotopicker.showsPhoto = true;
        

        mNested.setVisibility(View.INVISIBLE);
        

        
        mButton.setText(AppData.getLocalizedString("neonto_setalarm_button_754676", ""));
        mButton.setTransformationMethod(null);
        mButton.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AlarmScreenActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                if (mDataSheet != null) {
                    intent.putExtra("dataSheetName", mDataSheet.getName());
                    intent.putExtra("dataSheetRowIndex", mDataSheetRowIndex);
                }
                getActivity().startActivity(intent);
        
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
                            
                        SetAlarmFragment.this.dataSlotUpdated(name);
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


   public void VolumeDialog(Activity activity){
       final int Number;
       RelativeLayout relativeLayout = new RelativeLayout(activity);
       relativeLayout.setGravity(RelativeLayout.CENTER_HORIZONTAL);

       final TextView VolumeNo = new TextView(activity);
       VolumeNo.setId(Integer.parseInt("20"));

       final SeekBar Volume = new SeekBar(activity);
       Volume.setClickable(true);
       Volume.setMax(10);
       Volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               VolumeNo.setText("Volume"+progress+"/10");
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

       RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50,50);

       RelativeLayout.LayoutParams qPickerParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       qPickerParams.addRule(RelativeLayout.BELOW,20);

       RelativeLayout.LayoutParams TextSize = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       TextSize.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

       relativeLayout.setLayoutParams(params);
       relativeLayout.addView(VolumeNo,TextSize);
       relativeLayout.addView(Volume,qPickerParams);

       new AlertDialog.Builder(activity).setTitle("Volume")
               .setView(relativeLayout)
               .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

           }
       }).show();
   }

   public void RingtoneDialog(Activity activity){

       final Item[] items = {
               new Item("Email", android.R.drawable.ic_menu_add),
               new Item("Facebook", android.R.drawable.ic_menu_delete),
               new Item("...", 0),//no icon for this one
       };

       ListAdapter adapter = new ArrayAdapter<Item>(SetAlarmFragment.super.getActivity(), android.R.layout.select_dialog_item, android.R.id.text1, items){
           public View getView(int position, View convertView, ViewGroup parent) {
               //Use super class to create the View
               View v = super.getView(position, convertView, parent);
               TextView tv = (TextView)v.findViewById(android.R.id.text1);

               //Put the image on the TextView
               tv.setCompoundDrawablesWithIntrinsicBounds(items[position].icon, 0, 0, 0);

               //Add margin between image and text (support various screen densities)
               int dp5 = (int) (5 * getResources().getDisplayMetrics().density + 0.5f);
               tv.setCompoundDrawablePadding(dp5);

               return v;
           }
       };


       new AlertDialog.Builder(SetAlarmFragment.super.getActivity())
               .setTitle("Share Appliction")
               .setAdapter(adapter, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int item) {
                       //...
                   }
               }).show();



   }

    public static class Item{
        public final String text;
        public final int icon;
        public Item(String text, Integer icon) {
            this.text = text;
            this.icon = icon;
        }
        @Override
        public String toString() {
            return text;
        }
    }

   public void AlarmNameDialog(Activity activity){
       RelativeLayout relativeLayout = new RelativeLayout(activity);
       relativeLayout.setGravity(RelativeLayout.CENTER_HORIZONTAL);

       final EditText Name = new EditText(activity);
       Name.setHint("Please write alarm name");


       RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50,50);

       RelativeLayout.LayoutParams qPickerParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       qPickerParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

       relativeLayout.setLayoutParams(params);
       relativeLayout.addView(Name,qPickerParams);

       new AlertDialog.Builder(activity).setTitle("Alarm Name")
               .setView(relativeLayout)
               .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       mNameText.setText(Name.getText().toString());

                   }
               }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

           }
       }).show();
   }

   public  void AlarmTimeDialog(Activity activity){
       RelativeLayout relativeLayout = new RelativeLayout(activity);
       relativeLayout.setGravity(RelativeLayout.CENTER_HORIZONTAL);

       final NumberPicker HourPicker = new NumberPicker(activity);
       HourPicker.setMaxValue(12);
       HourPicker.setMinValue(1);

       final NumberPicker MinutePicker = new NumberPicker(activity);
       MinutePicker.setMaxValue(59);
       MinutePicker.setMinValue(0);
       MinutePicker.setId(Integer.parseInt("11"));

       final NumberPicker AmpmPicker = new NumberPicker(activity);
       AmpmPicker.setMaxValue(1);
       AmpmPicker.setMinValue(0);
       AmpmPicker.setDisplayedValues(new String[] {"AM","PM"});



       RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50,50);

       RelativeLayout.LayoutParams numberPickerParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       numberPickerParams.addRule(RelativeLayout.LEFT_OF,11);

       RelativeLayout.LayoutParams qPickerParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       qPickerParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

       RelativeLayout.LayoutParams pPickerParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
       pPickerParams.addRule(RelativeLayout.RIGHT_OF,11);



       relativeLayout.setLayoutParams(params);
       relativeLayout.addView(HourPicker,numberPickerParams);
       relativeLayout.addView(MinutePicker,qPickerParams);
       relativeLayout.addView(AmpmPicker,pPickerParams);

       new AlertDialog.Builder(activity).setTitle("Select number")
               .setView(relativeLayout)
               .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                        mTimeText.setText(String.format("%02d:%02d",HourPicker.getValue(),MinutePicker.getValue())+AmpmString[AmpmPicker.getValue()].toString());
                   }
               }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

           }
       }).show();
   }

    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        
        ActionBar actionBar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.button_icon819902);
        
        // Nav bar button.
        MenuItem item = menu.add(Menu.NONE, Menu.NONE, Menu.NONE, null);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        item.setIcon(R.drawable.button_icon1002707);
        item.setOnMenuItemClickListener(mNavBarButtonClickListener);
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
                if ( !mDataSheetUpdatedElems.contains(mText12)) {
                    mText12.setText(AppData.getLocalizedString("neonto_setalarm_text12_230509", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText14)) {
                    mText14.setText(AppData.getLocalizedString("neonto_setalarm_text14_356015", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText15)) {
                    mText15.setText(AppData.getLocalizedString("neonto_setalarm_text15_108144", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText16)) {
                    mText16.setText(AppData.getLocalizedString("neonto_setalarm_text16_1024168", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText17)) {
                    mText17.setText(AppData.getLocalizedString("neonto_setalarm_text17_596207", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText18)) {
                    mText18.setText(AppData.getLocalizedString("neonto_setalarm_text18_495341", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText19)) {
                    mText19.setText(AppData.getLocalizedString("neonto_setalarm_text19_618117", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText)) {
                    mText.setText(AppData.getLocalizedString("neonto_setalarm_text_945970", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText2)) {
                    mText2.setText(AppData.getLocalizedString("neonto_setalarm_text2_277133", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText3)) {
                    mText3.setText(AppData.getLocalizedString("neonto_setalarm_text3_284535", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText4)) {
                    mText4.setText(AppData.getLocalizedString("neonto_setalarm_text4_248264", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText5)) {
                    mText5.setText(AppData.getLocalizedString("neonto_setalarm_text5_952331", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText6)) {
                    mText6.setText(AppData.getLocalizedString("neonto_setalarm_text6_477712", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText7)) {
                    mText7.setText(AppData.getLocalizedString("neonto_setalarm_text7_234856", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText8)) {
                    mText8.setText(AppData.getLocalizedString("neonto_setalarm_text8_908425", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mText9)) {
                    mText9.setText(AppData.getLocalizedString("neonto_setalarm_text9_667882", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mTimeText)) {
                    mTimeText.setText(AppData.getLocalizedString("neonto_setalarm_text10_335753", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mNameText)) {
                    mNameText.setText(AppData.getLocalizedString("neonto_setalarm_text11_735097", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mRingtoneText)) {
                    mRingtoneText.setText(AppData.getLocalizedString("neonto_setalarm_text13_243546", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mVolumeText)) {
                    mVolumeText.setText(AppData.getLocalizedString("neonto_setalarm_text21_987325", ""));
                }
                if ( !mDataSheetUpdatedElems.contains(mButton)) {
                    mButton.setText(AppData.getLocalizedString("neonto_setalarm_button_754676", ""));
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
            val = row.get("text 12");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText12.setText((String) value);
                    mDataSheetUpdatedElems.add(mText12);
                }
            }
        }
        {
            val = row.get("text 14");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText14.setText((String) value);
                    mDataSheetUpdatedElems.add(mText14);
                }
            }
        }
        {
            val = row.get("text 15");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText15.setText((String) value);
                    mDataSheetUpdatedElems.add(mText15);
                }
            }
        }
        {
            val = row.get("text 16");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText16.setText((String) value);
                    mDataSheetUpdatedElems.add(mText16);
                }
            }
        }
        {
            val = row.get("text 17");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText17.setText((String) value);
                    mDataSheetUpdatedElems.add(mText17);
                }
            }
        }
        {
            val = row.get("text 18");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText18.setText((String) value);
                    mDataSheetUpdatedElems.add(mText18);
                }
            }
        }
        {
            val = row.get("text 19");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mText19.setText((String) value);
                    mDataSheetUpdatedElems.add(mText19);
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
            val = row.get("Time");
            if (val == null) val = row.get("time");  // check lowercase version too
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
            val = row.get("Name");
            if (val == null) val = row.get("name");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mNameText.setText((String) value);
                    mDataSheetUpdatedElems.add(mNameText);
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
            val = row.get("Ringtone");
            if (val == null) val = row.get("ringtone");  // check lowercase version too
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
            val = row.get("Volume");
            if (val == null) val = row.get("volume");  // check lowercase version too
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mVolumeText.setText((String) value);
                    mDataSheetUpdatedElems.add(mVolumeText);
                }
            }
        }
        {
            val = row.get("switch");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (type.equals("text")) {
                    String v = ((String) value).toLowerCase();
                    mSwitch.setChecked(v.equals("true") || v.equals("1"));
                }
            }
        }
        {
            val = row.get("button");
            if (val != null) {
                Object value = val.get("value");
                String type = (String) val.get("type");
                if (value != null && type.equals("text")) {
                    mButton.setText((String) value);
                    mDataSheetUpdatedElems.add(mButton);
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
        layoutDescs_mRectangle.add(new LayoutDesc(10, 0.0f, 130.4f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangle.add(new LayoutDesc(2, 0.0f, 12.8f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangle.add(new LayoutDesc(12, 0.0f, 216.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangle.add(new LayoutDesc(8, 0.0f, 72.8f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy.add(new LayoutDesc(10, 0.0f, 1050.08f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(2, 0.0f, 258.56f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(12, 0.0f, 1579.2f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy.add(new LayoutDesc(8, 0.0f, 654.56f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(10, 0.0f, 935.12f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(2, 0.0f, 227.84f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(12, 0.0f, 1408.8f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy2.add(new LayoutDesc(8, 0.0f, 581.84f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(10, 0.0f, 820.16f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(2, 0.0f, 197.12f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(12, 0.0f, 1238.4f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy3.add(new LayoutDesc(8, 0.0f, 509.12f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(10, 0.0f, 705.2f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(2, 0.0f, 166.4f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(12, 0.0f, 1068.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy4.add(new LayoutDesc(8, 0.0f, 436.4f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(10, 0.0f, 590.24f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(2, 0.0f, 135.68f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(12, 0.0f, 897.6f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy5.add(new LayoutDesc(8, 0.0f, 363.68f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(10, 0.0f, 439.36f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(2, 0.0f, 95.36f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(12, 0.0f, 673.95f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy6.add(new LayoutDesc(8, 0.0f, 268.23f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(10, 0.0f, 245.36f, LayoutDesc.NO_VALUE, 720.0f, 1.7f));  // 720*1280 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(2, 0.0f, 43.52f, LayoutDesc.NO_VALUE, 240.0f, 0.74f));  // 240*320 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(12, 0.0f, 386.4f, LayoutDesc.NO_VALUE, 1080.0f, 2.14f));  // 1080*1920 px
        layoutDescs_mRectangleCopy7.add(new LayoutDesc(8, 0.0f, 145.52f, LayoutDesc.NO_VALUE, 480.0f, 1.21f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy12 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy12.add(new LayoutDesc(10, 294.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy12.add(new LayoutDesc(2, 95.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy12.add(new LayoutDesc(12, 448.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy12.add(new LayoutDesc(8, 195.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy12 = mOverrideElementLayoutDescriptors.get("ellipseCopy12");
            if (override_mEllipseCopy12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy12 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy12.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy12.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy12.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy12.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy12, dm, layoutDescs_mEllipseCopy12, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy13 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy13.add(new LayoutDesc(10, 366.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy13.add(new LayoutDesc(2, 119.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy13.add(new LayoutDesc(12, 556.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy13.add(new LayoutDesc(8, 243.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy13 = mOverrideElementLayoutDescriptors.get("ellipseCopy13");
            if (override_mEllipseCopy13 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy13.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy13 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy13.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy13.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy13.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy13.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy13, dm, layoutDescs_mEllipseCopy13, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy14 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy14.add(new LayoutDesc(10, 438.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy14.add(new LayoutDesc(2, 143.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy14.add(new LayoutDesc(12, 664.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy14.add(new LayoutDesc(8, 291.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy14 = mOverrideElementLayoutDescriptors.get("ellipseCopy14");
            if (override_mEllipseCopy14 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy14.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy14 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy14.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy14.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy14.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy14.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy14, dm, layoutDescs_mEllipseCopy14, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy15 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy15.add(new LayoutDesc(10, 510.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy15.add(new LayoutDesc(2, 167.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy15.add(new LayoutDesc(12, 772.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy15.add(new LayoutDesc(8, 339.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy15 = mOverrideElementLayoutDescriptors.get("ellipseCopy15");
            if (override_mEllipseCopy15 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy15.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy15 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy15.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy15.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy15.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy15.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy15, dm, layoutDescs_mEllipseCopy15, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy16 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy16.add(new LayoutDesc(10, 582.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy16.add(new LayoutDesc(2, 191.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy16.add(new LayoutDesc(12, 880.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy16.add(new LayoutDesc(8, 387.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy16 = mOverrideElementLayoutDescriptors.get("ellipseCopy16");
            if (override_mEllipseCopy16 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy16.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy16 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy16.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy16.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy16.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy16.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy16, dm, layoutDescs_mEllipseCopy16, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy17 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy17.add(new LayoutDesc(10, 654.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy17.add(new LayoutDesc(2, 215.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy17.add(new LayoutDesc(12, 988.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy17.add(new LayoutDesc(8, 435.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy17 = mOverrideElementLayoutDescriptors.get("ellipseCopy17");
            if (override_mEllipseCopy17 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy17.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy17 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy17.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy17.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy17.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy17.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy17, dm, layoutDescs_mEllipseCopy17, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy25 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy25.add(new LayoutDesc(10, 186.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy25.add(new LayoutDesc(2, 59.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy25.add(new LayoutDesc(12, 286.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy25.add(new LayoutDesc(8, 123.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy25 = mOverrideElementLayoutDescriptors.get("ellipseCopy25");
            if (override_mEllipseCopy25 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy25.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy25 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy25.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy25.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy25.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy25.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy25, dm, layoutDescs_mEllipseCopy25, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy26 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy26.add(new LayoutDesc(10, 258.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy26.add(new LayoutDesc(2, 83.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy26.add(new LayoutDesc(12, 394.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy26.add(new LayoutDesc(8, 171.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy26 = mOverrideElementLayoutDescriptors.get("ellipseCopy26");
            if (override_mEllipseCopy26 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy26.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy26 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy26.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy26.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy26.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy26.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy26, dm, layoutDescs_mEllipseCopy26, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy27 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy27.add(new LayoutDesc(10, 330.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy27.add(new LayoutDesc(2, 107.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy27.add(new LayoutDesc(12, 502.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy27.add(new LayoutDesc(8, 219.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy27 = mOverrideElementLayoutDescriptors.get("ellipseCopy27");
            if (override_mEllipseCopy27 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy27.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy27 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy27.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy27.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy27.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy27.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy27, dm, layoutDescs_mEllipseCopy27, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy28 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy28.add(new LayoutDesc(10, 402.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy28.add(new LayoutDesc(2, 131.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy28.add(new LayoutDesc(12, 610.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy28.add(new LayoutDesc(8, 267.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy28 = mOverrideElementLayoutDescriptors.get("ellipseCopy28");
            if (override_mEllipseCopy28 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy28.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy28 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy28.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy28.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy28.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy28.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy28, dm, layoutDescs_mEllipseCopy28, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy29 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy29.add(new LayoutDesc(10, 474.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy29.add(new LayoutDesc(2, 155.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy29.add(new LayoutDesc(12, 718.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy29.add(new LayoutDesc(8, 315.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy29 = mOverrideElementLayoutDescriptors.get("ellipseCopy29");
            if (override_mEllipseCopy29 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy29.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy29 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy29.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy29.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy29.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy29.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy29, dm, layoutDescs_mEllipseCopy29, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy30 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy30.add(new LayoutDesc(10, 546.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy30.add(new LayoutDesc(2, 179.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy30.add(new LayoutDesc(12, 826.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy30.add(new LayoutDesc(8, 363.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy30 = mOverrideElementLayoutDescriptors.get("ellipseCopy30");
            if (override_mEllipseCopy30 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy30.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy30 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy30.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy30.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy30.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy30.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy30, dm, layoutDescs_mEllipseCopy30, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy31 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy31.add(new LayoutDesc(10, 618.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy31.add(new LayoutDesc(2, 203.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy31.add(new LayoutDesc(12, 934.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy31.add(new LayoutDesc(8, 411.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy31 = mOverrideElementLayoutDescriptors.get("ellipseCopy31");
            if (override_mEllipseCopy31 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy31.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy31 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy31.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy31.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy31.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy31.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy31, dm, layoutDescs_mEllipseCopy31, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy.add(new LayoutDesc(10, 294.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy.add(new LayoutDesc(2, 95.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy.add(new LayoutDesc(12, 448.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy.add(new LayoutDesc(8, 195.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy = mOverrideElementLayoutDescriptors.get("ellipseCopy");
            if (override_mEllipseCopy != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy, dm, layoutDescs_mEllipseCopy, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipse = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipse.add(new LayoutDesc(10, 654.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipse.add(new LayoutDesc(2, 215.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipse.add(new LayoutDesc(12, 988.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipse.add(new LayoutDesc(8, 435.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipse = mOverrideElementLayoutDescriptors.get("ellipse");
            if (override_mEllipse != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipse.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipse = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipse.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipse.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipse.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipse.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipse, dm, layoutDescs_mEllipse, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy2 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy2.add(new LayoutDesc(10, 510.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy2.add(new LayoutDesc(2, 167.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy2.add(new LayoutDesc(12, 772.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy2.add(new LayoutDesc(8, 339.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy2 = mOverrideElementLayoutDescriptors.get("ellipseCopy2");
            if (override_mEllipseCopy2 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy2.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy2 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy2.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy2.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy2.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy2.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy2, dm, layoutDescs_mEllipseCopy2, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy3 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy3.add(new LayoutDesc(10, 582.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy3.add(new LayoutDesc(2, 191.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy3.add(new LayoutDesc(12, 880.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy3.add(new LayoutDesc(8, 387.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy3 = mOverrideElementLayoutDescriptors.get("ellipseCopy3");
            if (override_mEllipseCopy3 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy3.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy3 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy3.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy3.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy3.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy3.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy3, dm, layoutDescs_mEllipseCopy3, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy5 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy5.add(new LayoutDesc(10, 438.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy5.add(new LayoutDesc(2, 143.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy5.add(new LayoutDesc(12, 664.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy5.add(new LayoutDesc(8, 291.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy5 = mOverrideElementLayoutDescriptors.get("ellipseCopy5");
            if (override_mEllipseCopy5 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy5.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy5 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy5.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy5.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy5.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy5.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy5, dm, layoutDescs_mEllipseCopy5, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy6 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy6.add(new LayoutDesc(10, 366.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy6.add(new LayoutDesc(2, 119.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy6.add(new LayoutDesc(12, 556.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy6.add(new LayoutDesc(8, 243.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy6 = mOverrideElementLayoutDescriptors.get("ellipseCopy6");
            if (override_mEllipseCopy6 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy6.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy6 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy6.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy6.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy6.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy6.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy6, dm, layoutDescs_mEllipseCopy6, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy18 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy18.add(new LayoutDesc(10, 258.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy18.add(new LayoutDesc(2, 83.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy18.add(new LayoutDesc(12, 394.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy18.add(new LayoutDesc(8, 171.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy18 = mOverrideElementLayoutDescriptors.get("ellipseCopy18");
            if (override_mEllipseCopy18 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy18.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy18 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy18.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy18.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy18.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy18.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy18, dm, layoutDescs_mEllipseCopy18, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy19 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy19.add(new LayoutDesc(10, 186.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy19.add(new LayoutDesc(2, 59.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy19.add(new LayoutDesc(12, 286.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy19.add(new LayoutDesc(8, 123.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy19 = mOverrideElementLayoutDescriptors.get("ellipseCopy19");
            if (override_mEllipseCopy19 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy19.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy19 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy19.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy19.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy19.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy19.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy19, dm, layoutDescs_mEllipseCopy19, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy20 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy20.add(new LayoutDesc(10, 330.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy20.add(new LayoutDesc(2, 107.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy20.add(new LayoutDesc(12, 502.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy20.add(new LayoutDesc(8, 219.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy20 = mOverrideElementLayoutDescriptors.get("ellipseCopy20");
            if (override_mEllipseCopy20 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy20.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy20 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy20.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy20.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy20.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy20.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy20, dm, layoutDescs_mEllipseCopy20, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy21 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy21.add(new LayoutDesc(10, 402.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy21.add(new LayoutDesc(2, 131.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy21.add(new LayoutDesc(12, 610.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy21.add(new LayoutDesc(8, 267.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy21 = mOverrideElementLayoutDescriptors.get("ellipseCopy21");
            if (override_mEllipseCopy21 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy21.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy21 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy21.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy21.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy21.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy21.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy21, dm, layoutDescs_mEllipseCopy21, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy22 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy22.add(new LayoutDesc(10, 474.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy22.add(new LayoutDesc(2, 155.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy22.add(new LayoutDesc(12, 718.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy22.add(new LayoutDesc(8, 315.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy22 = mOverrideElementLayoutDescriptors.get("ellipseCopy22");
            if (override_mEllipseCopy22 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy22.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy22 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy22.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy22.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy22.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy22.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy22, dm, layoutDescs_mEllipseCopy22, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy23 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy23.add(new LayoutDesc(10, 546.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy23.add(new LayoutDesc(2, 179.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy23.add(new LayoutDesc(12, 826.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy23.add(new LayoutDesc(8, 363.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy23 = mOverrideElementLayoutDescriptors.get("ellipseCopy23");
            if (override_mEllipseCopy23 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy23.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy23 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy23.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy23.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy23.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy23.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy23, dm, layoutDescs_mEllipseCopy23, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy24 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy24.add(new LayoutDesc(10, 618.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mEllipseCopy24.add(new LayoutDesc(2, 203.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mEllipseCopy24.add(new LayoutDesc(12, 934.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mEllipseCopy24.add(new LayoutDesc(8, 411.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy24 = mOverrideElementLayoutDescriptors.get("ellipseCopy24");
            if (override_mEllipseCopy24 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy24.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy24 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy24.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy24.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy24.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy24.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy24, dm, layoutDescs_mEllipseCopy24, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSoundDisableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mSoundDisableicon.add(new LayoutDesc(10, 614.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mSoundDisableicon.add(new LayoutDesc(2, 201.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mSoundDisableicon.add(new LayoutDesc(12, 928.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mSoundDisableicon.add(new LayoutDesc(8, 408.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSoundDisableicon = mOverrideElementLayoutDescriptors.get("soundDisableicon");
            if (override_mSoundDisableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSoundDisableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSoundDisableicon = layoutDescs;
                }
            }
        }
        layoutDescs_mSoundDisableicon.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSoundDisableicon.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSoundDisableicon.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSoundDisableicon.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSoundDisableicon, dm, layoutDescs_mSoundDisableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mVibreateDisableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mVibreateDisableicon.add(new LayoutDesc(10, 542.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mVibreateDisableicon.add(new LayoutDesc(2, 177.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mVibreateDisableicon.add(new LayoutDesc(12, 820.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mVibreateDisableicon.add(new LayoutDesc(8, 360.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVibreateDisableicon = mOverrideElementLayoutDescriptors.get("vibreateDisableicon");
            if (override_mVibreateDisableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVibreateDisableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVibreateDisableicon = layoutDescs;
                }
            }
        }
        layoutDescs_mVibreateDisableicon.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateDisableicon.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateDisableicon.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateDisableicon.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mVibreateDisableicon, dm, layoutDescs_mVibreateDisableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMusicEnableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(10, 614.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(2, 201.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(12, 928.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mMusicEnableicon.add(new LayoutDesc(8, 408.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMusicEnableicon = mOverrideElementLayoutDescriptors.get("musicEnableicon");
            if (override_mMusicEnableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMusicEnableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMusicEnableicon = layoutDescs;
                }
            }
        }
        layoutDescs_mMusicEnableicon.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicEnableicon.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicEnableicon.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicEnableicon.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mMusicEnableicon, dm, layoutDescs_mMusicEnableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mVibreateEnableicon = new ArrayList<LayoutDesc>();
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(10, 542.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(2, 177.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(12, 820.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mVibreateEnableicon.add(new LayoutDesc(8, 360.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVibreateEnableicon = mOverrideElementLayoutDescriptors.get("vibreateEnableicon");
            if (override_mVibreateEnableicon != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVibreateEnableicon.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVibreateEnableicon = layoutDescs;
                }
            }
        }
        layoutDescs_mVibreateEnableicon.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateEnableicon.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateEnableicon.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibreateEnableicon.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mVibreateEnableicon, dm, layoutDescs_mVibreateEnableicon, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy4 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy4.add(new LayoutDesc(10, 665.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy4.add(new LayoutDesc(2, 220.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy4.add(new LayoutDesc(12, 1001.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy4.add(new LayoutDesc(8, 442.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy4 = mOverrideElementLayoutDescriptors.get("ellipseCopy4");
            if (override_mEllipseCopy4 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy4.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy4 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy4.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy4.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy4.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy4.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy4, dm, layoutDescs_mEllipseCopy4, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy7 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy7.add(new LayoutDesc(10, 593.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy7.add(new LayoutDesc(2, 196.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy7.add(new LayoutDesc(12, 893.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy7.add(new LayoutDesc(8, 394.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy7 = mOverrideElementLayoutDescriptors.get("ellipseCopy7");
            if (override_mEllipseCopy7 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy7.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy7 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy7.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy7.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy7.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy7.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy7, dm, layoutDescs_mEllipseCopy7, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy8 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy8.add(new LayoutDesc(10, 521.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy8.add(new LayoutDesc(2, 172.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy8.add(new LayoutDesc(12, 785.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy8.add(new LayoutDesc(8, 346.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy8 = mOverrideElementLayoutDescriptors.get("ellipseCopy8");
            if (override_mEllipseCopy8 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy8.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy8 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy8.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy8.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy8.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy8.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy8, dm, layoutDescs_mEllipseCopy8, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy9 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy9.add(new LayoutDesc(10, 449.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy9.add(new LayoutDesc(2, 148.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy9.add(new LayoutDesc(12, 677.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy9.add(new LayoutDesc(8, 298.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy9 = mOverrideElementLayoutDescriptors.get("ellipseCopy9");
            if (override_mEllipseCopy9 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy9.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy9 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy9.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy9.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy9.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy9.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy9, dm, layoutDescs_mEllipseCopy9, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy10 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy10.add(new LayoutDesc(10, 377.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy10.add(new LayoutDesc(2, 124.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy10.add(new LayoutDesc(12, 569.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy10.add(new LayoutDesc(8, 250.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy10 = mOverrideElementLayoutDescriptors.get("ellipseCopy10");
            if (override_mEllipseCopy10 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy10.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy10 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy10.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy10.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy10.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy10.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy10, dm, layoutDescs_mEllipseCopy10, true, true);

        ArrayList<LayoutDesc> layoutDescs_mEllipseCopy11 = new ArrayList<LayoutDesc>();
        layoutDescs_mEllipseCopy11.add(new LayoutDesc(10, 305.4f, 745.2f, LayoutDesc.NO_VALUE, 29.75f, 29.75f));  // 720*1280 px
        layoutDescs_mEllipseCopy11.add(new LayoutDesc(2, 100.8f, 179.4f, LayoutDesc.NO_VALUE, 12.93f, 12.93f));  // 240*320 px
        layoutDescs_mEllipseCopy11.add(new LayoutDesc(12, 461.6f, 1127.0f, LayoutDesc.NO_VALUE, 37.53f, 37.53f));  // 1080*1920 px
        layoutDescs_mEllipseCopy11.add(new LayoutDesc(8, 202.6f, 462.4f, LayoutDesc.NO_VALUE, 21.10f, 21.10f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mEllipseCopy11 = mOverrideElementLayoutDescriptors.get("ellipseCopy11");
            if (override_mEllipseCopy11 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mEllipseCopy11.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mEllipseCopy11 = layoutDescs;
                }
            }
        }
        layoutDescs_mEllipseCopy11.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy11.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy11.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mEllipseCopy11.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mEllipseCopy11, dm, layoutDescs_mEllipseCopy11, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText12 = new ArrayList<LayoutDesc>();
        layoutDescs_mText12.add(new LayoutDesc(10, 186.4f, 515.36f, LayoutDesc.NO_VALUE, 51.0f, 32.0f));  // 720*1280 px
        layoutDescs_mText12.add(new LayoutDesc(2, 59.8f, 120.36f, LayoutDesc.NO_VALUE, 22.17f, 18.0f));  // 240*320 px
        layoutDescs_mText12.add(new LayoutDesc(12, 286.6f, 786.95f, LayoutDesc.NO_VALUE, 64.33f, 39.0f));  // 1080*1920 px
        layoutDescs_mText12.add(new LayoutDesc(8, 123.6f, 318.23f, LayoutDesc.NO_VALUE, 36.17f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText12 = mOverrideElementLayoutDescriptors.get("text12");
            if (override_mText12 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText12.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText12 = layoutDescs;
                }
            }
        }
        layoutDescs_mText12.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText12.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText12.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText12.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText12, dm, layoutDescs_mText12, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText14 = new ArrayList<LayoutDesc>();
        layoutDescs_mText14.add(new LayoutDesc(10, 258.4f, 515.36f, LayoutDesc.NO_VALUE, 51.0f, 32.0f));  // 720*1280 px
        layoutDescs_mText14.add(new LayoutDesc(2, 83.8f, 120.36f, LayoutDesc.NO_VALUE, 22.17f, 18.0f));  // 240*320 px
        layoutDescs_mText14.add(new LayoutDesc(12, 394.6f, 786.95f, LayoutDesc.NO_VALUE, 64.33f, 39.0f));  // 1080*1920 px
        layoutDescs_mText14.add(new LayoutDesc(8, 171.6f, 318.23f, LayoutDesc.NO_VALUE, 36.17f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText14 = mOverrideElementLayoutDescriptors.get("text14");
            if (override_mText14 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText14.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText14 = layoutDescs;
                }
            }
        }
        layoutDescs_mText14.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText14.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText14.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText14.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText14, dm, layoutDescs_mText14, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText15 = new ArrayList<LayoutDesc>();
        layoutDescs_mText15.add(new LayoutDesc(10, 330.4f, 515.36f, LayoutDesc.NO_VALUE, 51.0f, 32.0f));  // 720*1280 px
        layoutDescs_mText15.add(new LayoutDesc(2, 107.8f, 120.36f, LayoutDesc.NO_VALUE, 22.17f, 18.0f));  // 240*320 px
        layoutDescs_mText15.add(new LayoutDesc(12, 502.6f, 786.95f, LayoutDesc.NO_VALUE, 64.33f, 39.0f));  // 1080*1920 px
        layoutDescs_mText15.add(new LayoutDesc(8, 219.6f, 318.23f, LayoutDesc.NO_VALUE, 36.17f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText15 = mOverrideElementLayoutDescriptors.get("text15");
            if (override_mText15 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText15.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText15 = layoutDescs;
                }
            }
        }
        layoutDescs_mText15.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText15.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText15.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText15.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText15, dm, layoutDescs_mText15, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText16 = new ArrayList<LayoutDesc>();
        layoutDescs_mText16.add(new LayoutDesc(10, 402.4f, 515.36f, LayoutDesc.NO_VALUE, 51.0f, 32.0f));  // 720*1280 px
        layoutDescs_mText16.add(new LayoutDesc(2, 131.8f, 120.36f, LayoutDesc.NO_VALUE, 22.17f, 18.0f));  // 240*320 px
        layoutDescs_mText16.add(new LayoutDesc(12, 610.6f, 786.95f, LayoutDesc.NO_VALUE, 64.33f, 39.0f));  // 1080*1920 px
        layoutDescs_mText16.add(new LayoutDesc(8, 267.6f, 318.23f, LayoutDesc.NO_VALUE, 36.17f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText16 = mOverrideElementLayoutDescriptors.get("text16");
            if (override_mText16 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText16.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText16 = layoutDescs;
                }
            }
        }
        layoutDescs_mText16.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText16.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText16.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText16.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText16, dm, layoutDescs_mText16, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText17 = new ArrayList<LayoutDesc>();
        layoutDescs_mText17.add(new LayoutDesc(10, 477.4f, 515.36f, LayoutDesc.NO_VALUE, 46.75f, 32.0f));  // 720*1280 px
        layoutDescs_mText17.add(new LayoutDesc(2, 156.8f, 120.36f, LayoutDesc.NO_VALUE, 20.32f, 18.0f));  // 240*320 px
        layoutDescs_mText17.add(new LayoutDesc(12, 721.6f, 786.95f, LayoutDesc.NO_VALUE, 58.97f, 39.0f));  // 1080*1920 px
        layoutDescs_mText17.add(new LayoutDesc(8, 316.6f, 318.23f, LayoutDesc.NO_VALUE, 33.16f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText17 = mOverrideElementLayoutDescriptors.get("text17");
            if (override_mText17 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText17.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText17 = layoutDescs;
                }
            }
        }
        layoutDescs_mText17.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText17.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText17.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText17.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText17, dm, layoutDescs_mText17, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText18 = new ArrayList<LayoutDesc>();
        layoutDescs_mText18.add(new LayoutDesc(10, 549.4f, 515.36f, LayoutDesc.NO_VALUE, 46.75f, 32.0f));  // 720*1280 px
        layoutDescs_mText18.add(new LayoutDesc(2, 180.8f, 120.36f, LayoutDesc.NO_VALUE, 20.32f, 18.0f));  // 240*320 px
        layoutDescs_mText18.add(new LayoutDesc(12, 829.6f, 786.95f, LayoutDesc.NO_VALUE, 58.97f, 39.0f));  // 1080*1920 px
        layoutDescs_mText18.add(new LayoutDesc(8, 364.6f, 318.23f, LayoutDesc.NO_VALUE, 33.16f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText18 = mOverrideElementLayoutDescriptors.get("text18");
            if (override_mText18 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText18.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText18 = layoutDescs;
                }
            }
        }
        layoutDescs_mText18.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText18.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText18.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText18.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText18, dm, layoutDescs_mText18, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText19 = new ArrayList<LayoutDesc>();
        layoutDescs_mText19.add(new LayoutDesc(10, 621.4f, 515.36f, LayoutDesc.NO_VALUE, 46.75f, 32.0f));  // 720*1280 px
        layoutDescs_mText19.add(new LayoutDesc(2, 204.8f, 120.36f, LayoutDesc.NO_VALUE, 20.32f, 18.0f));  // 240*320 px
        layoutDescs_mText19.add(new LayoutDesc(12, 937.6f, 786.95f, LayoutDesc.NO_VALUE, 58.97f, 39.0f));  // 1080*1920 px
        layoutDescs_mText19.add(new LayoutDesc(8, 412.6f, 318.23f, LayoutDesc.NO_VALUE, 33.16f, 25.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mText19 = mOverrideElementLayoutDescriptors.get("text19");
            if (override_mText19 != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mText19.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mText19 = layoutDescs;
                }
            }
        }
        layoutDescs_mText19.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText19.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText19.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mText19.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mText19, dm, layoutDescs_mText19, true, true);

        ArrayList<LayoutDesc> layoutDescs_mText = new ArrayList<LayoutDesc>();
        layoutDescs_mText.add(new LayoutDesc(10, 22.0f, 40.44f, LayoutDesc.NO_VALUE, 324.6f, 58.0f));  // 720*1280 px
        layoutDescs_mText.add(new LayoutDesc(2, 7.0f, -9.92f, LayoutDesc.NO_VALUE, 109.2f, 29.0f));  // 240*320 px
        layoutDescs_mText.add(new LayoutDesc(12, 32.0f, 83.6f, LayoutDesc.NO_VALUE, 487.4f, 71.0f));  // 1080*1920 px
        layoutDescs_mText.add(new LayoutDesc(8, 14.0f, 17.08f, LayoutDesc.NO_VALUE, 217.4f, 43.0f));  // 480*800 px
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
        layoutDescs_mText2.add(new LayoutDesc(10, 22.0f, 155.4f, LayoutDesc.NO_VALUE, 324.6f, 58.0f));  // 720*1280 px
        layoutDescs_mText2.add(new LayoutDesc(2, 7.0f, 20.8f, LayoutDesc.NO_VALUE, 109.2f, 29.0f));  // 240*320 px
        layoutDescs_mText2.add(new LayoutDesc(12, 32.0f, 254.0f, LayoutDesc.NO_VALUE, 487.4f, 71.0f));  // 1080*1920 px
        layoutDescs_mText2.add(new LayoutDesc(8, 14.0f, 89.8f, LayoutDesc.NO_VALUE, 217.4f, 43.0f));  // 480*800 px
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
        layoutDescs_mText3.add(new LayoutDesc(10, 22.0f, 288.36f, LayoutDesc.NO_VALUE, 324.6f, 58.0f));  // 720*1280 px
        layoutDescs_mText3.add(new LayoutDesc(2, 7.0f, 57.52f, LayoutDesc.NO_VALUE, 109.2f, 29.0f));  // 240*320 px
        layoutDescs_mText3.add(new LayoutDesc(12, 32.0f, 451.4f, LayoutDesc.NO_VALUE, 487.4f, 71.0f));  // 1080*1920 px
        layoutDescs_mText3.add(new LayoutDesc(8, 14.0f, 174.52f, LayoutDesc.NO_VALUE, 217.4f, 43.0f));  // 480*800 px
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
        layoutDescs_mText4.add(new LayoutDesc(10, 22.0f, 439.36f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText4.add(new LayoutDesc(2, 7.0f, 95.36f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText4.add(new LayoutDesc(12, 32.0f, 673.95f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText4.add(new LayoutDesc(8, 14.0f, 268.23f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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
        layoutDescs_mText5.add(new LayoutDesc(10, 22.0f, 615.24f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText5.add(new LayoutDesc(2, 7.0f, 143.68f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText5.add(new LayoutDesc(12, 32.0f, 935.6f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText5.add(new LayoutDesc(8, 14.0f, 380.68f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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
        layoutDescs_mText6.add(new LayoutDesc(10, 22.0f, 730.2f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText6.add(new LayoutDesc(2, 7.0f, 174.4f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText6.add(new LayoutDesc(12, 32.0f, 1106.0f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText6.add(new LayoutDesc(8, 14.0f, 453.4f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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
        layoutDescs_mText7.add(new LayoutDesc(10, 22.0f, 845.16f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText7.add(new LayoutDesc(2, 7.0f, 205.12f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText7.add(new LayoutDesc(12, 32.0f, 1276.4f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText7.add(new LayoutDesc(8, 14.0f, 526.12f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mText8 = new ArrayList<LayoutDesc>();
        layoutDescs_mText8.add(new LayoutDesc(10, 22.0f, 960.12f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText8.add(new LayoutDesc(2, 7.0f, 235.84f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText8.add(new LayoutDesc(12, 32.0f, 1446.8f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText8.add(new LayoutDesc(8, 14.0f, 598.84f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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
        layoutDescs_mText9.add(new LayoutDesc(10, 22.0f, 1075.08f, LayoutDesc.NO_VALUE, 281.4f, 58.0f));  // 720*1280 px
        layoutDescs_mText9.add(new LayoutDesc(2, 7.0f, 266.56f, LayoutDesc.NO_VALUE, 94.8f, 29.0f));  // 240*320 px
        layoutDescs_mText9.add(new LayoutDesc(12, 32.0f, 1617.2f, LayoutDesc.NO_VALUE, 422.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mText9.add(new LayoutDesc(8, 14.0f, 671.56f, LayoutDesc.NO_VALUE, 188.6f, 43.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mTimeText = new ArrayList<LayoutDesc>();
        layoutDescs_mTimeText.add(new LayoutDesc(10, 345.6f, 40.44f, LayoutDesc.NO_VALUE, 367.4f, 58.0f));  // 720*1280 px
        layoutDescs_mTimeText.add(new LayoutDesc(2, 115.2f, -9.92f, LayoutDesc.NO_VALUE, 122.8f, 29.0f));  // 240*320 px
        layoutDescs_mTimeText.add(new LayoutDesc(12, 518.4f, 83.6f, LayoutDesc.NO_VALUE, 550.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mTimeText.add(new LayoutDesc(8, 230.4f, 17.08f, LayoutDesc.NO_VALUE, 244.6f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTimeText = mOverrideElementLayoutDescriptors.get("timeText");
            if (override_mTimeText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTimeText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTimeText = layoutDescs;
                }
            }
        }
        layoutDescs_mTimeText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimeText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimeText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTimeText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTimeText, dm, layoutDescs_mTimeText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mNameText = new ArrayList<LayoutDesc>();
        layoutDescs_mNameText.add(new LayoutDesc(10, 345.6f, 155.4f, LayoutDesc.NO_VALUE, 367.4f, 58.0f));  // 720*1280 px
        layoutDescs_mNameText.add(new LayoutDesc(2, 115.2f, 20.8f, LayoutDesc.NO_VALUE, 122.8f, 29.0f));  // 240*320 px
        layoutDescs_mNameText.add(new LayoutDesc(12, 518.4f, 254.0f, LayoutDesc.NO_VALUE, 550.6f, 71.0f));  // 1080*1920 px
        layoutDescs_mNameText.add(new LayoutDesc(8, 230.4f, 89.8f, LayoutDesc.NO_VALUE, 244.6f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mNameText = mOverrideElementLayoutDescriptors.get("nameText");
            if (override_mNameText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mNameText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mNameText = layoutDescs;
                }
            }
        }
        layoutDescs_mNameText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNameText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNameText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNameText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mNameText, dm, layoutDescs_mNameText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mImage = new ArrayList<LayoutDesc>();
        layoutDescs_mImage.add(new LayoutDesc(10, 556.0f, 258.36f, LayoutDesc.NO_VALUE, 128.0f, 128.0f));  // 720*1280 px
        layoutDescs_mImage.add(new LayoutDesc(2, 172.0f, 49.52f, LayoutDesc.NO_VALUE, 56.0f, 56.0f));  // 240*320 px
        layoutDescs_mImage.add(new LayoutDesc(12, 865.0f, 402.4f, LayoutDesc.NO_VALUE, 161.0f, 161.0f));  // 1080*1920 px
        layoutDescs_mImage.add(new LayoutDesc(8, 365.0f, 154.52f, LayoutDesc.NO_VALUE, 91.0f, 91.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mImage = mOverrideElementLayoutDescriptors.get("image");
            if (override_mImage != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mImage.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mImage = layoutDescs;
                }
            }
        }
        layoutDescs_mImage.get(0).contentTransformMatricesString = "[0.121904762, 0.0, 0.0, 0.121904762, 0.0, -32.0]; [0.121904762, 0.0, 0.0, 0.121904762, -8.655238095, -3.108571429]";
        layoutDescs_mImage.get(1).contentTransformMatricesString = "[0.053333333, 0.0, 0.0, 0.053333333, 0.0, -14.0]; [0.053333333, 0.0, 0.0, 0.053333333, -3.786666667, -1.360]";
        layoutDescs_mImage.get(2).contentTransformMatricesString = "[0.153333333, 0.0, 0.0, 0.153333333, 0.0, -40.250]; [0.153333333, 0.0, 0.0, 0.153333333, -10.886666667, -3.910]";
        layoutDescs_mImage.get(3).contentTransformMatricesString = "[0.086666667, 0.0, 0.0, 0.086666667, 0.0, -22.750]; [0.086666667, 0.0, 0.0, 0.086666667, -6.153333333, -2.210]";
        layoutDescs_mImage.get(0).offsetToHorizontalKeylineT = -12.75f;
        layoutDescs_mImage.get(1).offsetToHorizontalKeylineT = -5.54f;
        layoutDescs_mImage.get(2).offsetToHorizontalKeylineT = -16.08f;
        layoutDescs_mImage.get(3).offsetToHorizontalKeylineT = -9.04f;
        applyLayoutToView(mImage, dm, layoutDescs_mImage, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRingtoneText = new ArrayList<LayoutDesc>();
        layoutDescs_mRingtoneText.add(new LayoutDesc(10, 464.4f, 615.24f, LayoutDesc.NO_VALUE, 248.6f, 58.0f));  // 720*1280 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(2, 154.8f, 143.68f, LayoutDesc.NO_VALUE, 83.2f, 29.0f));  // 240*320 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(12, 696.6f, 935.6f, LayoutDesc.NO_VALUE, 372.4f, 71.0f));  // 1080*1920 px
        layoutDescs_mRingtoneText.add(new LayoutDesc(8, 309.6f, 380.68f, LayoutDesc.NO_VALUE, 165.4f, 43.0f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mVolumeText = new ArrayList<LayoutDesc>();
        layoutDescs_mVolumeText.add(new LayoutDesc(10, 273.71f, 1075.08f, LayoutDesc.NO_VALUE, 446.29f, 58.0f));  // 720*1280 px
        layoutDescs_mVolumeText.add(new LayoutDesc(2, 46.02f, 266.56f, LayoutDesc.NO_VALUE, 193.98f, 29.0f));  // 240*320 px
        layoutDescs_mVolumeText.add(new LayoutDesc(12, 517.10f, 1617.2f, LayoutDesc.NO_VALUE, 562.90f, 71.0f));  // 1080*1920 px
        layoutDescs_mVolumeText.add(new LayoutDesc(8, 163.52f, 671.56f, LayoutDesc.NO_VALUE, 316.48f, 43.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVolumeText = mOverrideElementLayoutDescriptors.get("volumeText");
            if (override_mVolumeText != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVolumeText.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVolumeText = layoutDescs;
                }
            }
        }
        layoutDescs_mVolumeText.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeText.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeText.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeText.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mVolumeText, dm, layoutDescs_mVolumeText, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSwitch = new ArrayList<LayoutDesc>();
        layoutDescs_mSwitch.add(new LayoutDesc(10, 602.0f, 953.12f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs_mSwitch.add(new LayoutDesc(2, 191.0f, 233.84f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs_mSwitch.add(new LayoutDesc(12, 927.0f, 1435.8f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs_mSwitch.add(new LayoutDesc(8, 398.0f, 593.84f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSwitch = mOverrideElementLayoutDescriptors.get("switch");
            if (override_mSwitch != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSwitch.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSwitch = layoutDescs;
                }
            }
        }
        layoutDescs_mSwitch.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSwitch.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSwitch.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSwitch.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSwitch, dm, layoutDescs_mSwitch, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmTimeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmTimeButton.add(new LayoutDesc(10, 0.0f, 15.44f, 1148.6f, 720.0f, 115.96f));  // 720*1280 px
        layoutDescs_mAlarmTimeButton.add(new LayoutDesc(2, 0.0f, -17.92f, 306.2f, 240.0f, 31.72f));  // 240*320 px
        layoutDescs_mAlarmTimeButton.add(new LayoutDesc(12, 0.0f, 45.6f, 1703.0f, 1080.0f, 171.4f));  // 1080*1920 px
        layoutDescs_mAlarmTimeButton.add(new LayoutDesc(8, 0.0f, 0.08f, 726.2f, 480.0f, 73.72f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmTimeButton = mOverrideElementLayoutDescriptors.get("alarmTimeButton");
            if (override_mAlarmTimeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmTimeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmTimeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmTimeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTimeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTimeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTimeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTimeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTimeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmTimeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmTimeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mAlarmTimeButton, dm, layoutDescs_mAlarmTimeButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mAlarmNameButton = new ArrayList<LayoutDesc>();
        layoutDescs_mAlarmNameButton.add(new LayoutDesc(10, 0.0f, 130.4f, 1033.64f, 720.0f, 115.96f));  // 720*1280 px
        layoutDescs_mAlarmNameButton.add(new LayoutDesc(2, 0.0f, 12.8f, 275.48f, 240.0f, 31.72f));  // 240*320 px
        layoutDescs_mAlarmNameButton.add(new LayoutDesc(12, 0.0f, 216.0f, 1532.6f, 1080.0f, 171.4f));  // 1080*1920 px
        layoutDescs_mAlarmNameButton.add(new LayoutDesc(8, 0.0f, 72.8f, 653.48f, 480.0f, 73.72f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mAlarmNameButton = mOverrideElementLayoutDescriptors.get("alarmNameButton");
            if (override_mAlarmNameButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mAlarmNameButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mAlarmNameButton = layoutDescs;
                }
            }
        }
        layoutDescs_mAlarmNameButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmNameButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmNameButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmNameButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmNameButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmNameButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mAlarmNameButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mAlarmNameButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mAlarmNameButton, dm, layoutDescs_mAlarmNameButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPickPictureButton = new ArrayList<LayoutDesc>();
        layoutDescs_mPickPictureButton.add(new LayoutDesc(10, 0.0f, 245.36f, 839.64f, 720.0f, 195.0f));  // 720*1280 px
        layoutDescs_mPickPictureButton.add(new LayoutDesc(2, 0.0f, 43.52f, 223.64f, 240.0f, 52.84f));  // 240*320 px
        layoutDescs_mPickPictureButton.add(new LayoutDesc(12, 0.0f, 386.4f, 1245.05f, 1080.0f, 288.55f));  // 1080*1920 px
        layoutDescs_mPickPictureButton.add(new LayoutDesc(8, 0.0f, 145.52f, 530.77f, 480.0f, 123.71f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mPickPictureButton = mOverrideElementLayoutDescriptors.get("pickPictureButton");
            if (override_mPickPictureButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mPickPictureButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mPickPictureButton = layoutDescs;
                }
            }
        }
        layoutDescs_mPickPictureButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPickPictureButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPickPictureButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPickPictureButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPickPictureButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPickPictureButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mPickPictureButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPickPictureButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mPickPictureButton, dm, layoutDescs_mPickPictureButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRingtoneButton = new ArrayList<LayoutDesc>();
        layoutDescs_mRingtoneButton.add(new LayoutDesc(10, 0.0f, 590.24f, 573.8f, 720.0f, 115.96f));  // 720*1280 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(2, 0.0f, 135.68f, 152.6f, 240.0f, 31.72f));  // 240*320 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(12, 0.0f, 897.6f, 851.0f, 1080.0f, 171.4f));  // 1080*1920 px
        layoutDescs_mRingtoneButton.add(new LayoutDesc(8, 0.0f, 363.68f, 362.6f, 480.0f, 73.72f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mVolumeButton = new ArrayList<LayoutDesc>();
        layoutDescs_mVolumeButton.add(new LayoutDesc(10, 0.0f, 1050.08f, 113.96f, 720.0f, 115.96f));  // 720*1280 px
        layoutDescs_mVolumeButton.add(new LayoutDesc(2, 0.0f, 258.56f, 29.72f, 240.0f, 31.72f));  // 240*320 px
        layoutDescs_mVolumeButton.add(new LayoutDesc(12, 0.0f, 1579.2f, 169.4f, 1080.0f, 171.4f));  // 1080*1920 px
        layoutDescs_mVolumeButton.add(new LayoutDesc(8, 0.0f, 654.56f, 71.72f, 480.0f, 73.72f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVolumeButton = mOverrideElementLayoutDescriptors.get("volumeButton");
            if (override_mVolumeButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVolumeButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVolumeButton = layoutDescs;
                }
            }
        }
        layoutDescs_mVolumeButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeButton.get(0).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mVolumeButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeButton.get(1).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mVolumeButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeButton.get(2).offsetToHorizontalKeylineB = 0.0f;
        layoutDescs_mVolumeButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVolumeButton.get(3).offsetToHorizontalKeylineB = 0.0f;
        applyLayoutToView(mVolumeButton, dm, layoutDescs_mVolumeButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMusicButton = new ArrayList<LayoutDesc>();
        layoutDescs_mMusicButton.add(new LayoutDesc(10, 614.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mMusicButton.add(new LayoutDesc(2, 201.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mMusicButton.add(new LayoutDesc(12, 928.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mMusicButton.add(new LayoutDesc(8, 408.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMusicButton = mOverrideElementLayoutDescriptors.get("musicButton");
            if (override_mMusicButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMusicButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMusicButton = layoutDescs;
                }
            }
        }
        layoutDescs_mMusicButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMusicButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mMusicButton, dm, layoutDescs_mMusicButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mVibrateButton = new ArrayList<LayoutDesc>();
        layoutDescs_mVibrateButton.add(new LayoutDesc(10, 542.4f, 845.16f, LayoutDesc.NO_VALUE, 59.50f, 59.50f));  // 720*1280 px
        layoutDescs_mVibrateButton.add(new LayoutDesc(2, 177.8f, 205.12f, LayoutDesc.NO_VALUE, 25.86f, 25.86f));  // 240*320 px
        layoutDescs_mVibrateButton.add(new LayoutDesc(12, 820.6f, 1276.4f, LayoutDesc.NO_VALUE, 75.05f, 75.05f));  // 1080*1920 px
        layoutDescs_mVibrateButton.add(new LayoutDesc(8, 360.6f, 526.12f, LayoutDesc.NO_VALUE, 42.20f, 42.20f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mVibrateButton = mOverrideElementLayoutDescriptors.get("vibrateButton");
            if (override_mVibrateButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mVibrateButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mVibrateButton = layoutDescs;
                }
            }
        }
        layoutDescs_mVibrateButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mVibrateButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mVibrateButton, dm, layoutDescs_mVibrateButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSatursdayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSatursdayButton.add(new LayoutDesc(10, 546.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mSatursdayButton.add(new LayoutDesc(2, 179.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mSatursdayButton.add(new LayoutDesc(12, 826.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mSatursdayButton.add(new LayoutDesc(8, 363.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSatursdayButton = mOverrideElementLayoutDescriptors.get("satursdayButton");
            if (override_mSatursdayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSatursdayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSatursdayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSatursdayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSatursdayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSatursdayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSatursdayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSatursdayButton, dm, layoutDescs_mSatursdayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mFridayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mFridayButton.add(new LayoutDesc(10, 474.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mFridayButton.add(new LayoutDesc(2, 155.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mFridayButton.add(new LayoutDesc(12, 718.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mFridayButton.add(new LayoutDesc(8, 315.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mFridayButton = mOverrideElementLayoutDescriptors.get("fridayButton");
            if (override_mFridayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mFridayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mFridayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mFridayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFridayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFridayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mFridayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mFridayButton, dm, layoutDescs_mFridayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mThursdayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mThursdayButton.add(new LayoutDesc(10, 402.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mThursdayButton.add(new LayoutDesc(2, 131.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mThursdayButton.add(new LayoutDesc(12, 610.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mThursdayButton.add(new LayoutDesc(8, 267.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mThursdayButton = mOverrideElementLayoutDescriptors.get("thursdayButton");
            if (override_mThursdayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mThursdayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mThursdayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mThursdayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mThursdayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mThursdayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mThursdayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mThursdayButton, dm, layoutDescs_mThursdayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mWednesdayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mWednesdayButton.add(new LayoutDesc(10, 330.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mWednesdayButton.add(new LayoutDesc(2, 107.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mWednesdayButton.add(new LayoutDesc(12, 502.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mWednesdayButton.add(new LayoutDesc(8, 219.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mWednesdayButton = mOverrideElementLayoutDescriptors.get("wednesdayButton");
            if (override_mWednesdayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mWednesdayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mWednesdayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mWednesdayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mWednesdayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mWednesdayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mWednesdayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mWednesdayButton, dm, layoutDescs_mWednesdayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mTuesdayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mTuesdayButton.add(new LayoutDesc(10, 258.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mTuesdayButton.add(new LayoutDesc(2, 83.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mTuesdayButton.add(new LayoutDesc(12, 394.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mTuesdayButton.add(new LayoutDesc(8, 171.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mTuesdayButton = mOverrideElementLayoutDescriptors.get("tuesdayButton");
            if (override_mTuesdayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mTuesdayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mTuesdayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mTuesdayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTuesdayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTuesdayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mTuesdayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mTuesdayButton, dm, layoutDescs_mTuesdayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mMondayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mMondayButton.add(new LayoutDesc(10, 186.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mMondayButton.add(new LayoutDesc(2, 59.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mMondayButton.add(new LayoutDesc(12, 286.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mMondayButton.add(new LayoutDesc(8, 123.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mMondayButton = mOverrideElementLayoutDescriptors.get("mondayButton");
            if (override_mMondayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mMondayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mMondayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mMondayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMondayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMondayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mMondayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mMondayButton, dm, layoutDescs_mMondayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mSundayButton = new ArrayList<LayoutDesc>();
        layoutDescs_mSundayButton.add(new LayoutDesc(10, 618.4f, 504.36f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mSundayButton.add(new LayoutDesc(2, 203.8f, 117.36f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mSundayButton.add(new LayoutDesc(12, 934.6f, 770.95f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mSundayButton.add(new LayoutDesc(8, 411.6f, 311.23f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mSundayButton = mOverrideElementLayoutDescriptors.get("sundayButton");
            if (override_mSundayButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mSundayButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mSundayButton = layoutDescs;
                }
            }
        }
        layoutDescs_mSundayButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSundayButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSundayButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mSundayButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mSundayButton, dm, layoutDescs_mSundayButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mYellowButton = new ArrayList<LayoutDesc>();
        layoutDescs_mYellowButton.add(new LayoutDesc(10, 366.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mYellowButton.add(new LayoutDesc(2, 119.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mYellowButton.add(new LayoutDesc(12, 556.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mYellowButton.add(new LayoutDesc(8, 243.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mYellowButton = mOverrideElementLayoutDescriptors.get("yellowButton");
            if (override_mYellowButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mYellowButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mYellowButton = layoutDescs;
                }
            }
        }
        layoutDescs_mYellowButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mYellowButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mYellowButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mYellowButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mYellowButton, dm, layoutDescs_mYellowButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBlockButton = new ArrayList<LayoutDesc>();
        layoutDescs_mBlockButton.add(new LayoutDesc(10, 294.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mBlockButton.add(new LayoutDesc(2, 95.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mBlockButton.add(new LayoutDesc(12, 448.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mBlockButton.add(new LayoutDesc(8, 195.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBlockButton = mOverrideElementLayoutDescriptors.get("blockButton");
            if (override_mBlockButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBlockButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBlockButton = layoutDescs;
                }
            }
        }
        layoutDescs_mBlockButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlockButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlockButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlockButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBlockButton, dm, layoutDescs_mBlockButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mBlueButton = new ArrayList<LayoutDesc>();
        layoutDescs_mBlueButton.add(new LayoutDesc(10, 438.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mBlueButton.add(new LayoutDesc(2, 143.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mBlueButton.add(new LayoutDesc(12, 664.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mBlueButton.add(new LayoutDesc(8, 291.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mBlueButton = mOverrideElementLayoutDescriptors.get("blueButton");
            if (override_mBlueButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mBlueButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mBlueButton = layoutDescs;
                }
            }
        }
        layoutDescs_mBlueButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlueButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlueButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mBlueButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mBlueButton, dm, layoutDescs_mBlueButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mRedButton = new ArrayList<LayoutDesc>();
        layoutDescs_mRedButton.add(new LayoutDesc(10, 510.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mRedButton.add(new LayoutDesc(2, 167.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mRedButton.add(new LayoutDesc(12, 772.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mRedButton.add(new LayoutDesc(8, 339.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mRedButton = mOverrideElementLayoutDescriptors.get("redButton");
            if (override_mRedButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mRedButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mRedButton = layoutDescs;
                }
            }
        }
        layoutDescs_mRedButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRedButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRedButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mRedButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mRedButton, dm, layoutDescs_mRedButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mGreenButton = new ArrayList<LayoutDesc>();
        layoutDescs_mGreenButton.add(new LayoutDesc(10, 582.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mGreenButton.add(new LayoutDesc(2, 191.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mGreenButton.add(new LayoutDesc(12, 880.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mGreenButton.add(new LayoutDesc(8, 387.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mGreenButton = mOverrideElementLayoutDescriptors.get("greenButton");
            if (override_mGreenButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mGreenButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mGreenButton = layoutDescs;
                }
            }
        }
        layoutDescs_mGreenButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGreenButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGreenButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mGreenButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mGreenButton, dm, layoutDescs_mGreenButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPurpleButton = new ArrayList<LayoutDesc>();
        layoutDescs_mPurpleButton.add(new LayoutDesc(10, 654.4f, 734.2f, LayoutDesc.NO_VALUE, 51.0f, 51.0f));  // 720*1280 px
        layoutDescs_mPurpleButton.add(new LayoutDesc(2, 215.8f, 176.4f, LayoutDesc.NO_VALUE, 22.17f, 22.17f));  // 240*320 px
        layoutDescs_mPurpleButton.add(new LayoutDesc(12, 988.6f, 1111.0f, LayoutDesc.NO_VALUE, 64.33f, 64.33f));  // 1080*1920 px
        layoutDescs_mPurpleButton.add(new LayoutDesc(8, 435.6f, 455.4f, LayoutDesc.NO_VALUE, 36.17f, 36.17f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mPurpleButton = mOverrideElementLayoutDescriptors.get("purpleButton");
            if (override_mPurpleButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mPurpleButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mPurpleButton = layoutDescs;
                }
            }
        }
        layoutDescs_mPurpleButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPurpleButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPurpleButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mPurpleButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mPurpleButton, dm, layoutDescs_mPurpleButton, true, true);

        ArrayList<LayoutDesc> layoutDescs_mPhotopicker = new ArrayList<LayoutDesc>();
        layoutDescs_mPhotopicker.add(new LayoutDesc(10, -694.0f, 356.0f, LayoutDesc.NO_VALUE, 306.02f, 306.02f));  // 720*1280 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(2, -302.0f, 143.0f, LayoutDesc.NO_VALUE, 133.01f, 133.01f));  // 240*320 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(12, -876.0f, 462.0f, LayoutDesc.NO_VALUE, 385.99f, 385.99f));  // 1080*1920 px
        layoutDescs_mPhotopicker.add(new LayoutDesc(8, -492.0f, 213.0f, LayoutDesc.NO_VALUE, 217.02f, 217.02f));  // 480*800 px
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

        ArrayList<LayoutDesc> layoutDescs_mNested = new ArrayList<LayoutDesc>();
        layoutDescs_mNested.add(new LayoutDesc(10, 0.0f, 245.36f, LayoutDesc.NO_VALUE, 720.0f, 561.0f));  // 720*1280 px
        layoutDescs_mNested.add(new LayoutDesc(2, 0.0f, 43.52f, LayoutDesc.NO_VALUE, 240.0f, 244.0f));  // 240*320 px
        layoutDescs_mNested.add(new LayoutDesc(12, 0.0f, 386.4f, LayoutDesc.NO_VALUE, 1080.0f, 707.0f));  // 1080*1920 px
        layoutDescs_mNested.add(new LayoutDesc(8, 0.0f, 145.52f, LayoutDesc.NO_VALUE, 480.0f, 398.0f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mNested = mOverrideElementLayoutDescriptors.get("nested");
            if (override_mNested != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mNested.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mNested = layoutDescs;
                }
            }
        }
        layoutDescs_mNested.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNested.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNested.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mNested.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mNested, dm, layoutDescs_mNested, true, true);

        ArrayList<LayoutDesc> layoutDescs_mButton = new ArrayList<LayoutDesc>();
        layoutDescs_mButton.add(new LayoutDesc(10, 197.4f, 1179.04f, LayoutDesc.NO_VALUE, 318.78f, 63.76f));  // 720*1280 px
        layoutDescs_mButton.add(new LayoutDesc(2, 49.8f, 294.28f, LayoutDesc.NO_VALUE, 138.56f, 27.71f));  // 240*320 px
        layoutDescs_mButton.add(new LayoutDesc(12, 333.6f, 1771.6f, LayoutDesc.NO_VALUE, 402.07f, 80.41f));  // 1080*1920 px
        layoutDescs_mButton.add(new LayoutDesc(8, 124.6f, 737.28f, LayoutDesc.NO_VALUE, 226.06f, 45.21f));  // 480*800 px
        if (mOverrideElementLayoutDescriptors != null) {
            HashMap<String, ArrayList<LayoutDesc>> override_mButton = mOverrideElementLayoutDescriptors.get("button");
            if (override_mButton != null) {
                ArrayList<LayoutDesc> layoutDescs = override_mButton.get("layoutDescs");
                if (layoutDescs != null) {
                    layoutDescs_mButton = layoutDescs;
                }
            }
        }
        layoutDescs_mButton.get(0).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(1).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(2).offsetToHorizontalKeylineT = 0.0f;
        layoutDescs_mButton.get(3).offsetToHorizontalKeylineT = 0.0f;
        applyLayoutToView(mButton, dm, layoutDescs_mButton, true, true);

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

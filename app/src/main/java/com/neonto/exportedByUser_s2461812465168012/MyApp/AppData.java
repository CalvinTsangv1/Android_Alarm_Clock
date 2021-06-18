package com.neonto.exportedByUser_s2461812465168012.MyApp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class AppData {
    
    public static Class activityClassByScreenName(String name) {
        HashMap<String, Class> screens = new HashMap<>();
        screens.put("general setting", GeneralSettingActivity.class);
        screens.put("setting", SettingActivity.class);
        screens.put("alarm", AlarmActivity.class);
        screens.put("alarm setting", AlarmSettingActivity.class);
        screens.put("alarmscreen", AlarmScreenActivity.class);
        screens.put("tab bar 1", TabBar1Activity.class);
        screens.put("sleeping data", SleepingDataActivity.class);
        screens.put("recorddetail", RecordDetailActivity.class);
        screens.put("stopwatch/timer settings", StopWatchTimerSettingsActivity.class);
        screens.put("record save", RecordSaveActivity.class);
        screens.put("timer", TimerActivity.class);
        screens.put("more", MoreActivity.class);
        screens.put("stopwatch", StopWatchActivity.class);
        screens.put("record stopwatch list", RecordStopwatchListActivity.class);
        screens.put("sleeping track", SleepingTrackActivity.class);
        screens.put("set alarm", SetAlarmActivity.class);
        screens.put("sleeping", SleepingActivity.class);
        screens.put("contact us", ContactUsActivity.class);
        
        Class cls = screens.get(name.toLowerCase());
        if (cls == null) {
            Log.d("", "** AppData.activityClassByScreenName(): no match for '"+name+"'");
        }
        return cls;
    }

    public static DataSheet localizationSheetDataSheet;

    public static DataSheet alarmSaveDataSheet;

    public static DataSheet pikcerDataSheet;

    public static DataSheet stopwatchBufferSaveDataSheet;

    public static DataSheet sleepTrackSaveDataSheet;

    public static DataSheet settingsSaveDataSheet;

    public static DataSheet stopwatchSaveDataSheet;

    public static DataSheet timerSaveDataSheet;

    public static DataSheet getDataSheetByName(String name) throws Exception {
        switch (name) {
            case "Localization sheet": return localizationSheetDataSheet;
            case "AlarmSave": return alarmSaveDataSheet;
            case "Pikcer": return pikcerDataSheet;
            case "StopwatchBufferSave": return stopwatchBufferSaveDataSheet;
            case "SleepTrackSave": return sleepTrackSaveDataSheet;
            case "SettingsSave": return settingsSaveDataSheet;
            case "StopwatchSave": return stopwatchSaveDataSheet;
            case "TimerSave": return timerSaveDataSheet;
        }
        throw new Exception(String.format("No data sheet found with name '%s'.", name));
    }

    public static void loadDrawableFromUrl(final Context context, String url, final OnLoadingDrawableFinishedListener listener) {
        if (url.startsWith("asset://")) {
            Resources resources = context.getResources();
            int extLen = 4;  // assume extension is dot + three letters (e.g. ".png")
            String resName = "drawable/"+url.substring("asset://".length(), url.length()-extLen);
            int resId = resources.getIdentifier(resName, null, context.getPackageName());
            listener.onLoadingDrawableFinished(resources.getDrawable(resId), false);
            return;
        }
        else if (url.startsWith("documents://")) {
            String path = context.getExternalFilesDir(null).getPath() + java.io.File.separator + url.substring("documents://".length());
            listener.onLoadingDrawableFinished(Drawable.createFromPath(path), false);
            return;
        }
        else if (url.startsWith("http")) {
            new AsyncTask<String, Object, Object>() {
                @Override
                protected Bitmap doInBackground(String... params) {
                    try {
                        URL url = new URL(params[0]);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            Bitmap bitmap = BitmapFactory.decodeStream(conn.getInputStream());
                            final Drawable drawable = new BitmapDrawable(context.getResources(), bitmap);
                            
                            // Run in main thread.
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        listener.onLoadingDrawableFinished(drawable, true);
                                    }
                                    catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        listener.onLoadingDrawableFinished(null, true);
                    }
                    return null;
                }
            }.execute(url);
            return;
        }
        listener.onLoadingDrawableFinished(null, false);
    }
    
    public interface OnLoadingDrawableFinishedListener {
        void onLoadingDrawableFinished(Drawable d, boolean isAsync);
    }
    
    public static String dataSlot_StopWatchBuffer;
    public static Bitmap dataSlot_PhotoPicker;

    public static interface IDataSlotChangeListener {
        public void dataSlotUpdated(String name);
    }

    private static HashSet<IDataSlotChangeListener> mListeners = new HashSet<IDataSlotChangeListener>();

    public static void addListener(IDataSlotChangeListener listener)
    {
        if (listener != null) {
            mListeners.add(listener);
        }
    }

    public static void removeListener(IDataSlotChangeListener listener)
    {
        if (listener != null) {
            mListeners.remove(listener);
        }
    }

    public static void notifyDataSlotModified(String name)
    {
        // Copy listeners in case array gets modified by a listener during notification
        Set<IDataSlotChangeListener> listeners = (Set<IDataSlotChangeListener>) mListeners.clone();
        for (IDataSlotChangeListener listener : listeners) {
            listener.dataSlotUpdated(name);
        }
    }

    private static HashMap<String, Typeface> mTypefaces = new HashMap<String, Typeface>();

    public static Typeface getTypeface(String filename, Context context) {
        Typeface typeface = mTypefaces.get(filename);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/"+filename);
                mTypefaces.put(filename, typeface);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return typeface;
    }

    public static String getLocalizedString(String key, String value) {
        String str = ((LocalizationSheetDataSheet) localizationSheetDataSheet).getLocalizedStringForKey(key);
        return (str != null) ? str : value;
    }
    
}

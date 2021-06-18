package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Timer;
import java.util.TimerTask;

public class MyAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        
        String externalFilesPath = null;
        try {
            externalFilesPath = getExternalFilesDir(null).getPath();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        
        final SharedPreferences prefs = getSharedPreferences("AppPrefs", 0);
        AppData.dataSlot_StopWatchBuffer = prefs.getString("dataSlot_StopWatchBuffer", "");
        if (prefs.contains("dataSlot_PhotoPicker")) {
            AppData.dataSlot_PhotoPicker = BitmapFactory.decodeFile(externalFilesPath + java.io.File.separator + prefs.getString("dataSlot_PhotoPicker", null).substring(12));
        }
        AppData.addListener(new AppData.IDataSlotChangeListener() {
            @Override
            public void dataSlotUpdated(String name) {
                if (name.equals("StopWatchBuffer")) {
                    SharedPreferences.Editor prefsEditor = prefs.edit();
                    prefsEditor.putString("dataSlot_StopWatchBuffer", AppData.dataSlot_StopWatchBuffer);
                    prefsEditor.apply();
                }
                if (name.equals("PhotoPicker")) {
                    try {
                        File file = new File(getExternalFilesDir(null), "dataSlot_PhotoPicker.png");
                        FileOutputStream fos = new FileOutputStream(file);
                        AppData.dataSlot_PhotoPicker.compress(Bitmap.CompressFormat.PNG, 100, fos);
                        fos.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    SharedPreferences.Editor prefsEditor = prefs.edit();
                    prefsEditor.putString("dataSlot_PhotoPicker", "documents://dataSlot_PhotoPicker.png");
                    prefsEditor.apply();
                }
            }
        });
        AppData.localizationSheetDataSheet = new LocalizationSheetDataSheet(this);
        AppData.alarmSaveDataSheet = new AlarmSaveDataSheet(this);
        AppData.pikcerDataSheet = new PikcerDataSheet(this);
        AppData.stopwatchBufferSaveDataSheet = new StopwatchBufferSaveDataSheet(this);
        AppData.sleepTrackSaveDataSheet = new SleepTrackSaveDataSheet(this);
        AppData.settingsSaveDataSheet = new SettingsSaveDataSheet(this);
        AppData.stopwatchSaveDataSheet = new StopwatchSaveDataSheet(this);
        AppData.timerSaveDataSheet = new TimerSaveDataSheet(this);
    }
    
    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        
        if (level >= TRIM_MEMORY_RUNNING_LOW) {
            AppData.localizationSheetDataSheet.releaseCachedData();
            AppData.alarmSaveDataSheet.releaseCachedData();
            AppData.pikcerDataSheet.releaseCachedData();
            AppData.stopwatchBufferSaveDataSheet.releaseCachedData();
            AppData.sleepTrackSaveDataSheet.releaseCachedData();
            AppData.settingsSaveDataSheet.releaseCachedData();
            AppData.stopwatchSaveDataSheet.releaseCachedData();
            AppData.timerSaveDataSheet.releaseCachedData();
        }
    }

}

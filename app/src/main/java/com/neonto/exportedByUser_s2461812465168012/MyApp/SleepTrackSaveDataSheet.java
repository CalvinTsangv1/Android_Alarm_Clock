package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class SleepTrackSaveDataSheet extends DataSheet {

    public SleepTrackSaveDataSheet(Context context) {
        super(context, "sleepTrackSave");
        
        loadRowsWithPersistenceName("sleep_track_save");
    }
    
    @Override
    public String getName() {
        return "SleepTrackSave";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("dd", col);
        arr.add(row);
        
        mRows = arr;
    }

}

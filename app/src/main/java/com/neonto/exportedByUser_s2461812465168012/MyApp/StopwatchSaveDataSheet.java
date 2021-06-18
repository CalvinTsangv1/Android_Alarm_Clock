package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class StopwatchSaveDataSheet extends DataSheet {

    public StopwatchSaveDataSheet(Context context) {
        super(context, "stopwatchSave");
        
        loadRowsWithPersistenceName("stopwatch_save");
    }
    
    @Override
    public String getName() {
        return "StopwatchSave";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "1"); row.put("name", col);
        arr.add(row);
        
        mRows = arr;
    }

}

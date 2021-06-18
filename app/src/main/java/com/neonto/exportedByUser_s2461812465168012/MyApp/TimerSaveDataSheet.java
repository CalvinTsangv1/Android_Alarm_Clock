package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class TimerSaveDataSheet extends DataSheet {

    public TimerSaveDataSheet(Context context) {
        super(context, "timerSave");
        
        // This data sheet doesn't have local persistence enabled in Neonto Studio,
        // so write the default data each time.
        writeDefaultRowData();
    }
    
    @Override
    public String getName() {
        return "TimerSave";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "00:00:00"); row.put("timertext", col);
        arr.add(row);
        
        mRows = arr;
    }

}

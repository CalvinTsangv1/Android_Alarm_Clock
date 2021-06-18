package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class AlarmSaveDataSheet extends DataSheet {

    public AlarmSaveDataSheet(Context context) {
        super(context, "alarmSave");
        
        loadRowsWithPersistenceName("alarm_save");
    }
    
    @Override
    public String getName() {
        return "AlarmSave";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "dd"); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "sss"); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "ssssss"); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", ""); row.put("title", col);
        arr.add(row);
        
        mRows = arr;
    }

}

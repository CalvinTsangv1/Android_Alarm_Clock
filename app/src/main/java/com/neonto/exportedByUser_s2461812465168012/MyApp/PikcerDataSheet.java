package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class PikcerDataSheet extends DataSheet {

    public PikcerDataSheet(Context context) {
        super(context, "pikcer");
        
        loadRowsWithPersistenceName("pikcer");
    }
    
    @Override
    public String getName() {
        return "Pikcer";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Ride"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Run"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Swim"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Walk"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Ice skate"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Surfing"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Examination"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Yoga"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Windsurf"); row.put("eventtype", col);
        arr.add(row);
        row = new HashMap<>();
        col = new HashMap<>(); col.put("type", "text"); col.put("value", "Other"); row.put("eventtype", col);
        arr.add(row);
        
        mRows = arr;
    }

}

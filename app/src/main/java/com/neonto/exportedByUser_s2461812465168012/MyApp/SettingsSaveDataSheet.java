package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class SettingsSaveDataSheet extends DataSheet {

    public SettingsSaveDataSheet(Context context) {
        super(context, "settingsSave");
        
        loadRowsWithPersistenceName("settings_save");
    }
    
    @Override
    public String getName() {
        return "SettingsSave";
    }
    
    @Override
    protected void writeDefaultRowData() {
        ArrayList<HashMap<String, HashMap<String, Object>>> arr = new ArrayList<>();
        HashMap<String, HashMap<String, Object>> row;
        HashMap<String, Object> col;
        
        
        mRows = arr;
    }

}

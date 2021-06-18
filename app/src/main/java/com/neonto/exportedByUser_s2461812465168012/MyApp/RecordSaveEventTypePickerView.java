package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.HashMap;

public class RecordSaveEventTypePickerView extends Spinner implements AdapterView.OnItemSelectedListener {

    private String mCurrentValue;
    private ArrayAdapter<String> mPickerAdapter;
    
    public RecordSaveEventTypePickerView(Context context) {
        super(context);
        init();
    }
    
    public RecordSaveEventTypePickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    
    public RecordSaveEventTypePickerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    
    public void init() {
        mPickerAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item);
        setAdapter(mPickerAdapter);
        
        setOnItemSelectedListener(this);
    }
    
    public String getCurrentValue() {
        return mCurrentValue;
    }
    
    public void setCurrentValue(String value) {
        int selectedRow = 0;
        for (int i = 0; i < mPickerAdapter.getCount(); ++i) {
            String val = mPickerAdapter.getItem(i);
            if (val.equals(value)) {
                selectedRow = i;
            }
        }
        setSelection(selectedRow);
        
        mCurrentValue = mPickerAdapter.getItem(selectedRow);
    }
    
    public void setDataSheet(DataSheet dataSheet) {
        mPickerAdapter.clear();
        
        for (HashMap<String, HashMap<String, Object>> rowDesc : dataSheet.getRows()) {
            HashMap<String, Object> val;
            if ((val = rowDesc.get("eventtype")) != null && val.get("type").equals("text")) {
                mPickerAdapter.add((String) val.get("value"));
            }
        }
    }
    
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mCurrentValue = (String) parent.getItemAtPosition(position);
    }
    
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}

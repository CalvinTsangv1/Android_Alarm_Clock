package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class RecordSaveDatePickerView extends TextView implements View.OnClickListener {

    private String mCurrentValue;
    private SimpleDateFormat mStorageDateFormat;
    private SimpleDateFormat mDisplayFormat;
    
    public RecordSaveDatePickerView(Context context) {
        super(context);
        init();
    }
    
    public RecordSaveDatePickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    
    public RecordSaveDatePickerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    
    public void init() {
        mStorageDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'00:00:00.000Z", Locale.US);
        mStorageDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        mDisplayFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance(java.text.DateFormat.MEDIUM);
        
        setCurrentValue(null);
        
        setOnClickListener(this);
    }
    
    public String getCurrentValue() {
        return mCurrentValue;
    }
    
    public void setCurrentValue(String value) {
        Date date = null;
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(mStorageDateFormat.parse(value));
            date = calendar.getTime();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        if (date == null) {
            date = Calendar.getInstance().getTime();  // fallback to current date.
        }
        
        mCurrentValue = mStorageDateFormat.format(date);
        
        setText(mDisplayFormat.format(date));
    }
    
    @Override
    public void onClick(View v) {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, monthOfYear, dayOfMonth);
                setCurrentValue(mStorageDateFormat.format(calendar.getTime()));
            }
        };
        
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(mStorageDateFormat.parse(mCurrentValue));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        DatePickerDialog pickerDialog = new DatePickerDialog(getContext(), dateSetListener,  calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        pickerDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", pickerDialog);
        pickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", pickerDialog);
        pickerDialog.show();
    }

}

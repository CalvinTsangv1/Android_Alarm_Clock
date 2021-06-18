package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TimePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class RecordSaveTimePickerView extends TextView implements View.OnClickListener {

    private String mCurrentValue;
    private SimpleDateFormat mStorageDateFormat;
    private SimpleDateFormat mDisplayFormat;
    
    public RecordSaveTimePickerView(Context context) {
        super(context);
        init();
    }
    
    public RecordSaveTimePickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    
    public RecordSaveTimePickerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    
    public void init() {
        mStorageDateFormat = new SimpleDateFormat("HH:mm:00.000Z", Locale.US);
        mStorageDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        mDisplayFormat = (SimpleDateFormat) SimpleDateFormat.getTimeInstance(java.text.DateFormat.SHORT);
        
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
        TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
                calendar.set(Calendar.MINUTE, minute);
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
        
        TimePickerDialog pickerDialog = new TimePickerDialog(getContext(), timeSetListener,  calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), DateFormat.is24HourFormat(getContext()));
        pickerDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", pickerDialog);
        pickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", pickerDialog);
        pickerDialog.show();
    }

}

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class SetAlarmEllipseCopy9View extends View {



    public SetAlarmEllipseCopy9View(Context context) {
        super(context);
        init(null, 0);
    }
    
    public SetAlarmEllipseCopy9View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public SetAlarmEllipseCopy9View(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }
    
    private void init(AttributeSet attrs, int defStyle) {
        // This method is just a stub that you can extend.
        // If you make this class styleable, you can load XML-declared
        // style attributes using getContext().obtainStyledAttributes().
        
        setLayerType(LAYER_TYPE_HARDWARE, null);
    }


    private int m_realLayoutWidthInPx;
    private int m_realLayoutHeightInPx;

    public void applyLayoutAndContentTransform(int w, int h, String contentTransform, float sc) {
        m_realLayoutWidthInPx = w;
        m_realLayoutHeightInPx = h;
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        Path path;
        Paint paint;
        
        super.onDraw(canvas);
        
        canvas.scale(m_realLayoutWidthInPx/29.752342704f, m_realLayoutHeightInPx/29.752342704f);
        canvas.translate(14.876171352f, 14.876171352f);
        path = new Path();
        path.moveTo(0.0f, -14.88f);
          path.lineTo(0.77f, -14.86f);
        path.lineTo(1.52f, -14.80f);
        path.lineTo(2.27f, -14.70f);
        path.lineTo(3.0f, -14.57f);
        path.lineTo(3.72f, -14.41f);
        
        path.lineTo(4.42f, -14.21f);
        path.lineTo(5.11f, -13.97f);
        path.lineTo(5.79f, -13.71f);
        path.lineTo(6.45f, -13.41f);
        path.lineTo(7.09f, -13.08f);
        
        path.lineTo(7.71f, -12.72f);
        path.lineTo(8.32f, -12.34f);
        path.lineTo(8.90f, -11.92f);
        path.lineTo(9.46f, -11.48f);
        path.lineTo(10.0f, -11.01f);
        
        path.lineTo(10.52f, -10.52f);
        path.lineTo(11.01f, -10.0f);
        path.lineTo(11.48f, -9.46f);
        path.lineTo(11.92f, -8.90f);
        path.lineTo(12.34f, -8.32f);
        
        path.lineTo(12.72f, -7.71f);
        path.lineTo(13.08f, -7.09f);
        path.lineTo(13.41f, -6.45f);
        path.lineTo(13.71f, -5.79f);
        path.lineTo(13.97f, -5.11f);
        
        path.lineTo(14.21f, -4.42f);
        path.lineTo(14.41f, -3.72f);
        path.lineTo(14.57f, -3.0f);
        path.lineTo(14.70f, -2.27f);
        path.lineTo(14.80f, -1.52f);
        
        path.lineTo(14.88f, 0.0f);
        path.lineTo(14.86f, 0.77f);
        path.lineTo(14.80f, 1.52f);
        path.lineTo(14.70f, 2.27f);
        path.lineTo(14.57f, 3.0f);
        
        path.lineTo(14.41f, 3.72f);
        path.lineTo(14.21f, 4.42f);
        path.lineTo(13.97f, 5.11f);
        path.lineTo(13.71f, 5.79f);
        path.lineTo(13.41f, 6.45f);
        
        path.lineTo(13.08f, 7.09f);
        path.lineTo(12.72f, 7.71f);
        path.lineTo(12.34f, 8.32f);
        path.lineTo(11.92f, 8.90f);
        path.lineTo(11.48f, 9.46f);
        
        path.lineTo(11.01f, 10.0f);
        path.lineTo(10.52f, 10.52f);
        path.lineTo(10.0f, 11.01f);
        path.lineTo(9.46f, 11.48f);
        path.lineTo(8.90f, 11.92f);
        
        path.lineTo(8.32f, 12.34f);
        path.lineTo(7.71f, 12.72f);
        path.lineTo(7.09f, 13.08f);
        path.lineTo(6.45f, 13.41f);
        path.lineTo(5.79f, 13.71f);
        
        path.lineTo(5.11f, 13.97f);
        path.lineTo(4.42f, 14.21f);
        path.lineTo(3.72f, 14.41f);
        path.lineTo(3.0f, 14.57f);
        path.lineTo(2.27f, 14.70f);
        
        path.lineTo(1.52f, 14.80f);
        path.lineTo(0.0f, 14.88f);
        path.lineTo(-0.77f, 14.86f);
        path.lineTo(-1.52f, 14.80f);
        path.lineTo(-2.27f, 14.70f);
        
        path.lineTo(-3.0f, 14.57f);
        path.lineTo(-3.72f, 14.41f);
        path.lineTo(-4.42f, 14.21f);
        path.lineTo(-5.11f, 13.97f);
        path.lineTo(-5.79f, 13.71f);
        
        path.lineTo(-6.45f, 13.41f);
        path.lineTo(-7.09f, 13.08f);
        path.lineTo(-7.71f, 12.72f);
        path.lineTo(-8.32f, 12.34f);
        path.lineTo(-8.90f, 11.92f);
        
        path.lineTo(-9.46f, 11.48f);
        path.lineTo(-10.0f, 11.01f);
        path.lineTo(-10.52f, 10.52f);
        path.lineTo(-11.01f, 10.0f);
        path.lineTo(-11.48f, 9.46f);
        
        path.lineTo(-11.92f, 8.90f);
        path.lineTo(-12.34f, 8.32f);
        path.lineTo(-12.72f, 7.71f);
        path.lineTo(-13.08f, 7.09f);
        path.lineTo(-13.41f, 6.45f);
        
        path.lineTo(-13.71f, 5.79f);
        path.lineTo(-13.97f, 5.11f);
        path.lineTo(-14.21f, 4.42f);
        path.lineTo(-14.41f, 3.72f);
        path.lineTo(-14.57f, 3.0f);
        
        path.lineTo(-14.70f, 2.27f);
        path.lineTo(-14.80f, 1.52f);
        path.lineTo(-14.88f, 0.0f);
        path.lineTo(-14.86f, -0.77f);
        path.lineTo(-14.80f, -1.52f);
        
        path.lineTo(-14.70f, -2.27f);
        path.lineTo(-14.57f, -3.0f);
        path.lineTo(-14.41f, -3.72f);
        path.lineTo(-14.21f, -4.42f);
        path.lineTo(-13.97f, -5.11f);
        
        path.lineTo(-13.71f, -5.79f);
        path.lineTo(-13.41f, -6.45f);
        path.lineTo(-13.08f, -7.09f);
        path.lineTo(-12.72f, -7.71f);
        path.lineTo(-12.34f, -8.32f);
        
        path.lineTo(-11.92f, -8.90f);
        path.lineTo(-11.48f, -9.46f);
        path.lineTo(-11.01f, -10.0f);
        path.lineTo(-10.52f, -10.52f);
        path.lineTo(-10.0f, -11.01f);
        
        path.lineTo(-9.46f, -11.48f);
        path.lineTo(-8.90f, -11.92f);
        path.lineTo(-8.32f, -12.34f);
        path.lineTo(-7.71f, -12.72f);
        path.lineTo(-7.09f, -13.08f);
        
        path.lineTo(-6.45f, -13.41f);
        path.lineTo(-5.79f, -13.71f);
        path.lineTo(-5.11f, -13.97f);
        path.lineTo(-4.42f, -14.21f);
        path.lineTo(-3.72f, -14.41f);
        
        path.lineTo(-3.0f, -14.57f);
        path.lineTo(-2.27f, -14.70f);
        path.lineTo(-1.52f, -14.80f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(255, 0, 102, 255);
        canvas.drawPath(path, paint);
    }

}

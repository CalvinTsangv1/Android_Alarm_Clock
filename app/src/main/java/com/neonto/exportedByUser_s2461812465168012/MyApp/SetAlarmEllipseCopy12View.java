package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class SetAlarmEllipseCopy12View extends View {



    public SetAlarmEllipseCopy12View(Context context) {
        super(context);
        init(null, 0);
    }
    
    public SetAlarmEllipseCopy12View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public SetAlarmEllipseCopy12View(Context context, AttributeSet attrs, int defStyle) {
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
        
        canvas.scale(m_realLayoutWidthInPx/51.004016064f, m_realLayoutHeightInPx/51.004016064f);
        canvas.translate(25.502008032f, 25.502008032f);
        path = new Path();
        path.moveTo(0.0f, -25.50f);
          path.lineTo(1.31f, -25.47f);
        path.lineTo(2.61f, -25.37f);
        path.lineTo(3.88f, -25.21f);
        path.lineTo(5.14f, -24.98f);
        path.lineTo(6.37f, -24.70f);
        
        path.lineTo(7.58f, -24.36f);
        path.lineTo(8.77f, -23.95f);
        path.lineTo(9.93f, -23.50f);
        path.lineTo(11.06f, -22.99f);
        path.lineTo(12.16f, -22.42f);
        
        path.lineTo(13.22f, -21.81f);
        path.lineTo(14.26f, -21.15f);
        path.lineTo(15.26f, -20.44f);
        path.lineTo(16.22f, -19.68f);
        path.lineTo(17.15f, -18.88f);
        
        path.lineTo(18.03f, -18.03f);
        path.lineTo(18.88f, -17.15f);
        path.lineTo(19.68f, -16.22f);
        path.lineTo(20.44f, -15.26f);
        path.lineTo(21.15f, -14.26f);
        
        path.lineTo(21.81f, -13.22f);
        path.lineTo(22.42f, -12.16f);
        path.lineTo(22.99f, -11.06f);
        path.lineTo(23.50f, -9.93f);
        path.lineTo(23.95f, -8.77f);
        
        path.lineTo(24.36f, -7.58f);
        path.lineTo(24.70f, -6.37f);
        path.lineTo(24.98f, -5.14f);
        path.lineTo(25.21f, -3.88f);
        path.lineTo(25.37f, -2.61f);
        
        path.lineTo(25.50f, 0.0f);
        path.lineTo(25.47f, 1.31f);
        path.lineTo(25.37f, 2.61f);
        path.lineTo(25.21f, 3.88f);
        path.lineTo(24.98f, 5.14f);
        
        path.lineTo(24.70f, 6.37f);
        path.lineTo(24.36f, 7.58f);
        path.lineTo(23.95f, 8.77f);
        path.lineTo(23.50f, 9.93f);
        path.lineTo(22.99f, 11.06f);
        
        path.lineTo(22.42f, 12.16f);
        path.lineTo(21.81f, 13.22f);
        path.lineTo(21.15f, 14.26f);
        path.lineTo(20.44f, 15.26f);
        path.lineTo(19.68f, 16.22f);
        
        path.lineTo(18.88f, 17.15f);
        path.lineTo(18.03f, 18.03f);
        path.lineTo(17.15f, 18.88f);
        path.lineTo(16.22f, 19.68f);
        path.lineTo(15.26f, 20.44f);
        
        path.lineTo(14.26f, 21.15f);
        path.lineTo(13.22f, 21.81f);
        path.lineTo(12.16f, 22.42f);
        path.lineTo(11.06f, 22.99f);
        path.lineTo(9.93f, 23.50f);
        
        path.lineTo(8.77f, 23.95f);
        path.lineTo(7.58f, 24.36f);
        path.lineTo(6.37f, 24.70f);
        path.lineTo(5.14f, 24.98f);
        path.lineTo(3.88f, 25.21f);
        
        path.lineTo(2.61f, 25.37f);
        path.lineTo(0.0f, 25.50f);
        path.lineTo(-1.31f, 25.47f);
        path.lineTo(-2.61f, 25.37f);
        path.lineTo(-3.88f, 25.21f);
        
        path.lineTo(-5.14f, 24.98f);
        path.lineTo(-6.37f, 24.70f);
        path.lineTo(-7.58f, 24.36f);
        path.lineTo(-8.77f, 23.95f);
        path.lineTo(-9.93f, 23.50f);
        
        path.lineTo(-11.06f, 22.99f);
        path.lineTo(-12.16f, 22.42f);
        path.lineTo(-13.22f, 21.81f);
        path.lineTo(-14.26f, 21.15f);
        path.lineTo(-15.26f, 20.44f);
        
        path.lineTo(-16.22f, 19.68f);
        path.lineTo(-17.15f, 18.88f);
        path.lineTo(-18.03f, 18.03f);
        path.lineTo(-18.88f, 17.15f);
        path.lineTo(-19.68f, 16.22f);
        
        path.lineTo(-20.44f, 15.26f);
        path.lineTo(-21.15f, 14.26f);
        path.lineTo(-21.81f, 13.22f);
        path.lineTo(-22.42f, 12.16f);
        path.lineTo(-22.99f, 11.06f);
        
        path.lineTo(-23.50f, 9.93f);
        path.lineTo(-23.95f, 8.77f);
        path.lineTo(-24.36f, 7.58f);
        path.lineTo(-24.70f, 6.37f);
        path.lineTo(-24.98f, 5.14f);
        
        path.lineTo(-25.21f, 3.88f);
        path.lineTo(-25.37f, 2.61f);
        path.lineTo(-25.50f, 0.0f);
        path.lineTo(-25.47f, -1.31f);
        path.lineTo(-25.37f, -2.61f);
        
        path.lineTo(-25.21f, -3.88f);
        path.lineTo(-24.98f, -5.14f);
        path.lineTo(-24.70f, -6.37f);
        path.lineTo(-24.36f, -7.58f);
        path.lineTo(-23.95f, -8.77f);
        
        path.lineTo(-23.50f, -9.93f);
        path.lineTo(-22.99f, -11.06f);
        path.lineTo(-22.42f, -12.16f);
        path.lineTo(-21.81f, -13.22f);
        path.lineTo(-21.15f, -14.26f);
        
        path.lineTo(-20.44f, -15.26f);
        path.lineTo(-19.68f, -16.22f);
        path.lineTo(-18.88f, -17.15f);
        path.lineTo(-18.03f, -18.03f);
        path.lineTo(-17.15f, -18.88f);
        
        path.lineTo(-16.22f, -19.68f);
        path.lineTo(-15.26f, -20.44f);
        path.lineTo(-14.26f, -21.15f);
        path.lineTo(-13.22f, -21.81f);
        path.lineTo(-12.16f, -22.42f);
        
        path.lineTo(-11.06f, -22.99f);
        path.lineTo(-9.93f, -23.50f);
        path.lineTo(-8.77f, -23.95f);
        path.lineTo(-7.58f, -24.36f);
        path.lineTo(-6.37f, -24.70f);
        
        path.lineTo(-5.14f, -24.98f);
        path.lineTo(-3.88f, -25.21f);
        path.lineTo(-2.61f, -25.37f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(255, 0, 0, 0);
        canvas.drawPath(path, paint);
    }

}

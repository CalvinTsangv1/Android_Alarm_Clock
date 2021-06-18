package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;
import android.app.Activity;

public class Stencil3RectangleView extends View {



    public Stencil3RectangleView(Context context) {
        super(context);
        init(null, 0);
    }
    
    public Stencil3RectangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public Stencil3RectangleView(Context context, AttributeSet attrs, int defStyle) {
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
    
    // These drawing objects are created when needed in onDraw().
    // Statics are not thread-safe (reentrant), but this is not an issue
    // because onDraw() is only called on the main thread.
    private static Path[] s_paths = null;
    private static Paint[] s_paints = null;
    

    @Override
    protected void onDraw(Canvas canvas) {
        if (s_paths == null) {
            s_paths = new Path[1];
            s_paints = new Paint[1];
            s_paths[0] = new Path();
            s_paints[0] = new Paint();
            s_paths[0].moveTo(-277.5f, -90.5f);
              s_paths[0].lineTo(-43.5f, -90.5f);
            s_paths[0].lineTo(-43.5f, 71.01f);
            s_paths[0].lineTo(-277.5f, 71.01f);
            
            s_paths[0].close();
            s_paints[0] = new Paint(Paint.ANTI_ALIAS_FLAG);
            s_paints[0].setStyle(Paint.Style.FILL);
            s_paints[0].setARGB(255, 204, 204, 204);
        }

        
        float w = canvas.getWidth();
        float h = canvas.getHeight();
        
        float rounding = 35f;  // in points

        DisplayMetrics dm = new DisplayMetrics();
        ((Activity)getContext()).getWindowManager().getDefaultDisplay().getMetrics(dm);
        int dpi = dm.densityDpi;
        rounding = rounding/72.0f * dpi;

        Paint paint;
    
        super.onDraw(canvas);

        canvas.save();

        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        int c0 = s_paints[0].getColor();
        paint.setColor(c0);

        RectF rect = new RectF();
        rect.set(0, 0, w, h);
        float radius = rounding/2.0f;
        canvas.drawRoundRect(rect, radius, radius, paint);

        canvas.restore();

    }

}

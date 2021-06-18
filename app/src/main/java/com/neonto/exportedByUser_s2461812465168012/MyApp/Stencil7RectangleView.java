package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class Stencil7RectangleView extends View {



    public Stencil7RectangleView(Context context) {
        super(context);
        init(null, 0);
    }
    
    public Stencil7RectangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public Stencil7RectangleView(Context context, AttributeSet attrs, int defStyle) {
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
        
        canvas.scale(m_realLayoutWidthInPx/223.0f, m_realLayoutHeightInPx/1.275100402f);
        canvas.translate(111.5f, 0.637550201f);
        path = new Path();
        path.moveTo(-111.5f, -0.64f);
          path.lineTo(111.5f, -0.64f);
        path.lineTo(111.5f, 0.64f);
        path.lineTo(-111.5f, 0.64f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(255, 204, 204, 204);
        canvas.drawPath(path, paint);
    }

}

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.content.*;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.*;
import android.view.*;

public class Stencil3EllipseView extends View {



    public Stencil3EllipseView(Context context) {
        super(context);
        init(null, 0);
    }
    
    public Stencil3EllipseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }
    
    public Stencil3EllipseView(Context context, AttributeSet attrs, int defStyle) {
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
        
        canvas.scale(m_realLayoutWidthInPx/182.764390897f, m_realLayoutHeightInPx/182.764390897f);
        canvas.translate(91.382195448f, 91.382195448f);
        path = new Path();
        path.moveTo(0.0f, -91.38f);
          path.lineTo(4.70f, -91.26f);
        path.lineTo(9.34f, -90.91f);
        path.lineTo(13.92f, -90.33f);
        path.lineTo(18.42f, -89.53f);
        path.lineTo(22.84f, -88.51f);
        
        path.lineTo(27.17f, -87.27f);
        path.lineTo(31.42f, -85.84f);
        path.lineTo(35.57f, -84.20f);
        path.lineTo(39.62f, -82.37f);
        path.lineTo(43.56f, -80.35f);
        
        path.lineTo(47.38f, -78.15f);
        path.lineTo(51.09f, -75.78f);
        path.lineTo(54.68f, -73.23f);
        path.lineTo(58.13f, -70.51f);
        path.lineTo(61.44f, -67.64f);
        
        path.lineTo(64.62f, -64.62f);
        path.lineTo(67.64f, -61.44f);
        path.lineTo(70.51f, -58.13f);
        path.lineTo(73.23f, -54.68f);
        path.lineTo(75.78f, -51.09f);
        
        path.lineTo(78.15f, -47.38f);
        path.lineTo(80.35f, -43.56f);
        path.lineTo(82.37f, -39.62f);
        path.lineTo(84.20f, -35.57f);
        path.lineTo(85.84f, -31.42f);
        
        path.lineTo(87.27f, -27.17f);
        path.lineTo(88.51f, -22.84f);
        path.lineTo(89.53f, -18.42f);
        path.lineTo(90.33f, -13.92f);
        path.lineTo(90.91f, -9.34f);
        
        path.lineTo(91.38f, 0.0f);
        path.lineTo(91.26f, 4.70f);
        path.lineTo(90.91f, 9.34f);
        path.lineTo(90.33f, 13.92f);
        path.lineTo(89.53f, 18.42f);
        
        path.lineTo(88.51f, 22.84f);
        path.lineTo(87.27f, 27.17f);
        path.lineTo(85.84f, 31.42f);
        path.lineTo(84.20f, 35.57f);
        path.lineTo(82.37f, 39.62f);
        
        path.lineTo(80.35f, 43.56f);
        path.lineTo(78.15f, 47.38f);
        path.lineTo(75.78f, 51.09f);
        path.lineTo(73.23f, 54.68f);
        path.lineTo(70.51f, 58.13f);
        
        path.lineTo(67.64f, 61.44f);
        path.lineTo(64.62f, 64.62f);
        path.lineTo(61.44f, 67.64f);
        path.lineTo(58.13f, 70.51f);
        path.lineTo(54.68f, 73.23f);
        
        path.lineTo(51.09f, 75.78f);
        path.lineTo(47.38f, 78.15f);
        path.lineTo(43.56f, 80.35f);
        path.lineTo(39.62f, 82.37f);
        path.lineTo(35.57f, 84.20f);
        
        path.lineTo(31.42f, 85.84f);
        path.lineTo(27.17f, 87.27f);
        path.lineTo(22.84f, 88.51f);
        path.lineTo(18.42f, 89.53f);
        path.lineTo(13.92f, 90.33f);
        
        path.lineTo(9.34f, 90.91f);
        path.lineTo(0.0f, 91.38f);
        path.lineTo(-4.70f, 91.26f);
        path.lineTo(-9.34f, 90.91f);
        path.lineTo(-13.92f, 90.33f);
        
        path.lineTo(-18.42f, 89.53f);
        path.lineTo(-22.84f, 88.51f);
        path.lineTo(-27.17f, 87.27f);
        path.lineTo(-31.42f, 85.84f);
        path.lineTo(-35.57f, 84.20f);
        
        path.lineTo(-39.62f, 82.37f);
        path.lineTo(-43.56f, 80.35f);
        path.lineTo(-47.38f, 78.15f);
        path.lineTo(-51.09f, 75.78f);
        path.lineTo(-54.68f, 73.23f);
        
        path.lineTo(-58.13f, 70.51f);
        path.lineTo(-61.44f, 67.64f);
        path.lineTo(-64.62f, 64.62f);
        path.lineTo(-67.64f, 61.44f);
        path.lineTo(-70.51f, 58.13f);
        
        path.lineTo(-73.23f, 54.68f);
        path.lineTo(-75.78f, 51.09f);
        path.lineTo(-78.15f, 47.38f);
        path.lineTo(-80.35f, 43.56f);
        path.lineTo(-82.37f, 39.62f);
        
        path.lineTo(-84.20f, 35.57f);
        path.lineTo(-85.84f, 31.42f);
        path.lineTo(-87.27f, 27.17f);
        path.lineTo(-88.51f, 22.84f);
        path.lineTo(-89.53f, 18.42f);
        
        path.lineTo(-90.33f, 13.92f);
        path.lineTo(-90.91f, 9.34f);
        path.lineTo(-91.38f, 0.0f);
        path.lineTo(-91.26f, -4.70f);
        path.lineTo(-90.91f, -9.34f);
        
        path.lineTo(-90.33f, -13.92f);
        path.lineTo(-89.53f, -18.42f);
        path.lineTo(-88.51f, -22.84f);
        path.lineTo(-87.27f, -27.17f);
        path.lineTo(-85.84f, -31.42f);
        
        path.lineTo(-84.20f, -35.57f);
        path.lineTo(-82.37f, -39.62f);
        path.lineTo(-80.35f, -43.56f);
        path.lineTo(-78.15f, -47.38f);
        path.lineTo(-75.78f, -51.09f);
        
        path.lineTo(-73.23f, -54.68f);
        path.lineTo(-70.51f, -58.13f);
        path.lineTo(-67.64f, -61.44f);
        path.lineTo(-64.62f, -64.62f);
        path.lineTo(-61.44f, -67.64f);
        
        path.lineTo(-58.13f, -70.51f);
        path.lineTo(-54.68f, -73.23f);
        path.lineTo(-51.09f, -75.78f);
        path.lineTo(-47.38f, -78.15f);
        path.lineTo(-43.56f, -80.35f);
        
        path.lineTo(-39.62f, -82.37f);
        path.lineTo(-35.57f, -84.20f);
        path.lineTo(-31.42f, -85.84f);
        path.lineTo(-27.17f, -87.27f);
        path.lineTo(-22.84f, -88.51f);
        
        path.lineTo(-18.42f, -89.53f);
        path.lineTo(-13.92f, -90.33f);
        path.lineTo(-9.34f, -90.91f);
        
        path.close();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setARGB(255, 204, 204, 204);
        canvas.drawPath(path, paint);
    }

}

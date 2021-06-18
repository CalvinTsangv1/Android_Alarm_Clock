package com.neonto.exportedByUser_s2461812465168012.MyApp;

public class LayoutDesc {

    public static final float NO_VALUE = Float.NEGATIVE_INFINITY;

    public int format;
    public float x, t, b, w, h;
    public String contentTransformMatricesString;
    public float offsetInFlow = NO_VALUE;
    public boolean floatsInFlow = false;
    public float offsetToHorizontalKeylineT = NO_VALUE;
    public float offsetToHorizontalKeylineB = NO_VALUE;

    LayoutDesc(int format, float x, float t, float b, float w, float h) {
        this.format = format;
        this.x = x;
        this.t = t;
        this.b = b;
        this.w = w;
        this.h = h;
    }

}

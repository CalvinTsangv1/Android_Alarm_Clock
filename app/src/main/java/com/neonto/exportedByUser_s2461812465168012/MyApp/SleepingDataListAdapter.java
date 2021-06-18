package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class SleepingDataListAdapter extends BaseAdapter {

    public int[] filteredRows;

    private DataSheet mDataSheet;
    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    private Fragment mOwner;

    public SleepingDataListAdapter(Fragment owner) {
        mOwner = owner;
    }

    private Activity getActivity() {
        return mOwner.getActivity();
    }

    @Override
    public int getCount() {
        int numRows;
        if (filteredRows != null) {
            numRows = filteredRows.length;
        } else {
            numRows = (mDataSheet != null) ? mDataSheet.getRows().size() : 0;
        }
        return numRows;
    }

    @Override
    public HashMap<String, HashMap<String, Object>> getItem(int position) {
        return mDataSheet.getRows().get((filteredRows != null && filteredRows.length > 0) ? filteredRows[position] : position);
    }

    @Override
    public long getItemId(int position) {
        return (filteredRows != null && filteredRows.length > 0) ? filteredRows[position] : position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AdapterView view = (AdapterView) convertView;

        Class viewClass = Stencil7View.class;
        if (view == null || !viewClass.isInstance(view)) {
            try {
                view = (AdapterView) viewClass.getConstructor(Fragment.class).newInstance(mOwner);
            }
            catch (Exception e) {
                e.printStackTrace();
                return null;
            }

            view.setOnContentChangeListener(new AdapterView.OnContentChangeListener() {
                @Override
                public void onContentChange() {
                    notifyDataSetChanged();
                }
            });
        }

        view.takeValuesFromDataSheet(mDataSheet, (filteredRows != null) ? filteredRows[position] : position);

        // Expand to fill width of the container.
        View listStencilView = ((ViewGroup) view).getChildAt(0);
        ViewGroup.LayoutParams layoutParams = listStencilView.getLayoutParams();
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listStencilView.setLayoutParams(layoutParams);
        
        HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> overrides = new HashMap<String, HashMap<String, ArrayList<LayoutDesc>>>();
        HashMap<String, ArrayList<LayoutDesc>> elementDesc;
        ArrayList<LayoutDesc> layoutDescs;
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 7.0f, 476.0f, LayoutDesc.NO_VALUE, 678.0f, 1.28f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 2.0f, 207.0f, LayoutDesc.NO_VALUE, 226.0f, 0.55f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 10.0f, 600.0f, LayoutDesc.NO_VALUE, 1016.0f, 1.61f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 5.0f, 338.0f, LayoutDesc.NO_VALUE, 450.0f, 0.90f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("rectangle", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 3.0f, 94.0f, LayoutDesc.NO_VALUE, 686.0f, 276.27f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 1.0f, 41.0f, LayoutDesc.NO_VALUE, 228.0f, 120.08f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 5.0f, 118.0f, LayoutDesc.NO_VALUE, 1026.0f, 348.46f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 2.0f, 66.0f, LayoutDesc.NO_VALUE, 456.0f, 195.92f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("hotspot", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 346.0f, 519.0f, LayoutDesc.NO_VALUE, 346.0f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 115.0f, 225.0f, LayoutDesc.NO_VALUE, 115.0f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 518.0f, 654.0f, LayoutDesc.NO_VALUE, 518.0f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 230.0f, 368.0f, LayoutDesc.NO_VALUE, 230.0f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text10", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 519.0f, LayoutDesc.NO_VALUE, 347.0f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 225.0f, LayoutDesc.NO_VALUE, 116.0f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 654.0f, LayoutDesc.NO_VALUE, 519.0f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 368.0f, LayoutDesc.NO_VALUE, 231.0f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text9", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 346.0f, 425.0f, LayoutDesc.NO_VALUE, 346.0f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 115.0f, 185.0f, LayoutDesc.NO_VALUE, 115.0f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 518.0f, 536.0f, LayoutDesc.NO_VALUE, 518.0f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 230.0f, 301.0f, LayoutDesc.NO_VALUE, 230.0f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text8", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 425.0f, LayoutDesc.NO_VALUE, 347.0f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 185.0f, LayoutDesc.NO_VALUE, 116.0f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 536.0f, LayoutDesc.NO_VALUE, 519.0f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 301.0f, LayoutDesc.NO_VALUE, 231.0f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text7", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 586.24f, 21.0f, LayoutDesc.NO_VALUE, 63.76f, 63.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 188.29f, 9.0f, LayoutDesc.NO_VALUE, 27.71f, 27.71f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 893.59f, 26.0f, LayoutDesc.NO_VALUE, 80.41f, 80.41f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 386.79f, 15.0f, LayoutDesc.NO_VALUE, 45.21f, 45.21f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("iconButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 34.0f, 51.0f, LayoutDesc.NO_VALUE, 296.33f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 15.0f, 22.0f, LayoutDesc.NO_VALUE, 128.80f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 43.0f, 64.0f, LayoutDesc.NO_VALUE, 373.76f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 24.0f, 36.0f, LayoutDesc.NO_VALUE, 210.14f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text6", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 346.0f, 383.0f, LayoutDesc.NO_VALUE, 346.0f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 115.0f, 166.0f, LayoutDesc.NO_VALUE, 115.0f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 518.0f, 482.0f, LayoutDesc.NO_VALUE, 518.0f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 230.0f, 271.0f, LayoutDesc.NO_VALUE, 230.0f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text5", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 346.0f, 476.0f, LayoutDesc.NO_VALUE, 346.0f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 115.0f, 207.0f, LayoutDesc.NO_VALUE, 115.0f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 518.0f, 600.0f, LayoutDesc.NO_VALUE, 518.0f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 230.0f, 338.0f, LayoutDesc.NO_VALUE, 230.0f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text4", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 476.0f, LayoutDesc.NO_VALUE, 347.0f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 207.0f, LayoutDesc.NO_VALUE, 116.0f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 600.0f, LayoutDesc.NO_VALUE, 519.0f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 338.0f, LayoutDesc.NO_VALUE, 231.0f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text3", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 383.0f, LayoutDesc.NO_VALUE, 347.0f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 166.0f, LayoutDesc.NO_VALUE, 116.0f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 482.0f, LayoutDesc.NO_VALUE, 519.0f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 271.0f, LayoutDesc.NO_VALUE, 231.0f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text2", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 34.0f, 14.0f, LayoutDesc.NO_VALUE, 212.52f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 15.0f, 6.0f, LayoutDesc.NO_VALUE, 92.37f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 43.0f, 17.0f, LayoutDesc.NO_VALUE, 268.05f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 24.0f, 10.0f, LayoutDesc.NO_VALUE, 150.71f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 2.0f, 0.0f, 116.0f, 688.0f, 569.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 1.0f, 0.0f, 51.0f, 228.0f, 247.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 3.0f, 0.0f, 147.0f, 1030.0f, 717.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 2.0f, 0.0f, 83.0f, 456.0f, 403.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("backgroundShape", elementDesc);
        
        if (mOverrideElementLayoutDescriptors != null) {
            overrides = mOverrideElementLayoutDescriptors;
        }
        view.setOverrideElementLayoutDescriptors(overrides);
        
        view.sizeToFitContentHeight();

        return (View) view;
    }

    public DataSheet getDataSheet() {
        return mDataSheet;
    }

    public void setDataSheet(DataSheet d) {
        mDataSheet = d;
    }

    public void setOverrideElementLayoutDescriptors(HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> d)
    {
        mOverrideElementLayoutDescriptors = d;
    }

    public int getColumnWidth() {
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        return 227 * Math.min(dm.widthPixels, dm.heightPixels)/720;
    }

}

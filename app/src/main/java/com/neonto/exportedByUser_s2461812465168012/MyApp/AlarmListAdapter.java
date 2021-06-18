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

public class AlarmListAdapter extends BaseAdapter {

    public int[] filteredRows;

    private DataSheet mDataSheet;
    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    private Fragment mOwner;

    public AlarmListAdapter(Fragment owner) {
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

        Class viewClass = Stencil3View.class;
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
        layoutDescs.add(new LayoutDesc(10, 85.0f, 13.0f, LayoutDesc.NO_VALUE, 507.0f, 161.51f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 37.0f, 6.0f, LayoutDesc.NO_VALUE, 148.0f, 70.20f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 107.0f, 16.0f, LayoutDesc.NO_VALUE, 812.0f, 203.71f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 60.0f, 9.0f, LayoutDesc.NO_VALUE, 330.0f, 114.54f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("alarmColorEditButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 549.75f, 98.0f, LayoutDesc.NO_VALUE, 38.25f, 38.25f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 166.37f, 42.0f, LayoutDesc.NO_VALUE, 16.63f, 16.63f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 865.75f, 123.0f, LayoutDesc.NO_VALUE, 48.25f, 48.25f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 359.87f, 69.0f, LayoutDesc.NO_VALUE, 27.13f, 27.13f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("vibreateEnableicon", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 511.75f, 98.0f, LayoutDesc.NO_VALUE, 38.25f, 38.25f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 149.37f, 42.0f, LayoutDesc.NO_VALUE, 16.63f, 16.63f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 817.75f, 123.0f, LayoutDesc.NO_VALUE, 48.25f, 48.25f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 331.87f, 69.0f, LayoutDesc.NO_VALUE, 27.13f, 27.13f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("musicEnableicon", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 463.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 201.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 584.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 329.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("sundayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 412.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 179.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 520.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 292.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("saturdayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 366.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 159.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 461.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 259.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("fridayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 319.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 139.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 402.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 226.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("thurdayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 272.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 118.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 343.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 193.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("wednesdayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 223.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 97.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 281.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 158.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("tuesdayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 174.0f, 140.0f, LayoutDesc.NO_VALUE, 48.88f, 36.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 76.0f, 61.0f, LayoutDesc.NO_VALUE, 21.25f, 19.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 220.0f, 177.0f, LayoutDesc.NO_VALUE, 61.65f, 44.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 124.0f, 99.0f, LayoutDesc.NO_VALUE, 34.66f, 28.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("mondayText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 404.0f, 60.0f, LayoutDesc.NO_VALUE, 76.51f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 176.0f, 26.0f, LayoutDesc.NO_VALUE, 33.25f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 509.0f, 75.0f, LayoutDesc.NO_VALUE, 96.50f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 286.0f, 42.0f, LayoutDesc.NO_VALUE, 54.25f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("am_PmText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 213.0f, 51.0f, LayoutDesc.NO_VALUE, 199.77f, 83.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 92.0f, 22.0f, LayoutDesc.NO_VALUE, 86.83f, 40.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 268.0f, 64.0f, LayoutDesc.NO_VALUE, 251.96f, 103.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 151.0f, 36.0f, LayoutDesc.NO_VALUE, 141.66f, 61.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("timeText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 191.0f, 15.0f, LayoutDesc.NO_VALUE, 297.52f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 83.0f, 6.0f, LayoutDesc.NO_VALUE, 129.32f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 241.0f, 19.0f, LayoutDesc.NO_VALUE, 375.26f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 136.0f, 11.0f, LayoutDesc.NO_VALUE, 210.99f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("titleText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 603.0f, 64.0f, LayoutDesc.NO_VALUE, 96.0f, 59.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 189.0f, 28.0f, LayoutDesc.NO_VALUE, 42.0f, 26.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 932.0f, 80.0f, LayoutDesc.NO_VALUE, 121.0f, 74.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 397.0f, 45.0f, LayoutDesc.NO_VALUE, 68.0f, 42.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("alarmSwitch", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 19.0f, 17.0f, LayoutDesc.NO_VALUE, 158.0f, 158.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 8.0f, 7.0f, LayoutDesc.NO_VALUE, 69.0f, 69.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 24.0f, 21.0f, LayoutDesc.NO_VALUE, 199.0f, 199.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 14.0f, 12.0f, LayoutDesc.NO_VALUE, 112.0f, 112.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("image", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 9.0f, 4.0f, LayoutDesc.NO_VALUE, 182.76f, 182.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 4.0f, 2.0f, LayoutDesc.NO_VALUE, 79.44f, 79.44f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 11.0f, 5.0f, LayoutDesc.NO_VALUE, 230.52f, 230.52f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 6.0f, 3.0f, LayoutDesc.NO_VALUE, 129.61f, 129.61f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("ellipse", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 43.0f, 13.0f, LayoutDesc.NO_VALUE, 664.0f, 161.51f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 18.0f, 6.0f, LayoutDesc.NO_VALUE, 216.0f, 70.20f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 54.0f, 16.0f, LayoutDesc.NO_VALUE, 1010.0f, 203.71f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 30.0f, 9.0f, LayoutDesc.NO_VALUE, 441.0f, 114.54f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("rectangle", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 287.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 125.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 362.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 203.0f));  // 480*800 px
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
        return 290 * Math.min(dm.widthPixels, dm.heightPixels)/720;
    }

}

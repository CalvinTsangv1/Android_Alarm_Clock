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

public class RecordStopwatchListListAdapter extends BaseAdapter {

    public int[] filteredRows;

    private DataSheet mDataSheet;
    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    private Fragment mOwner;

    public RecordStopwatchListListAdapter(Fragment owner) {
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

        Class viewClass = RecordStopwatchListItemView.class;
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
        layoutDescs.add(new LayoutDesc(10, 587.49f, 15.0f, LayoutDesc.NO_VALUE, 76.51f, 76.51f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 187.75f, 7.0f, LayoutDesc.NO_VALUE, 33.25f, 33.25f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 898.50f, 19.0f, LayoutDesc.NO_VALUE, 96.50f, 96.50f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 387.75f, 11.0f, LayoutDesc.NO_VALUE, 54.25f, 54.25f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("iconButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 489.0f, 132.0f, LayoutDesc.NO_VALUE, 170.01f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 212.0f, 57.0f, LayoutDesc.NO_VALUE, 73.90f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 617.0f, 166.0f, LayoutDesc.NO_VALUE, 214.44f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 347.0f, 93.0f, LayoutDesc.NO_VALUE, 120.56f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("lapNoTextouput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 204.0f, 132.0f, LayoutDesc.NO_VALUE, 148.76f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 89.0f, 57.0f, LayoutDesc.NO_VALUE, 64.66f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 257.0f, 166.0f, LayoutDesc.NO_VALUE, 187.63f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 145.0f, 93.0f, LayoutDesc.NO_VALUE, 105.49f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("totalTimeTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 64.0f, 204.0f, LayoutDesc.NO_VALUE, 628.0f, 92.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 28.0f, 89.0f, LayoutDesc.NO_VALUE, 202.0f, 43.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 80.0f, 257.0f, LayoutDesc.NO_VALUE, 956.0f, 114.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 45.0f, 145.0f, LayoutDesc.NO_VALUE, 415.0f, 67.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("decriptionTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 128.0f, 89.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 55.0f, 39.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 161.0f, 113.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 90.0f, 63.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("eventTypeTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 255.0f, 55.0f, LayoutDesc.NO_VALUE, 148.76f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 111.0f, 24.0f, LayoutDesc.NO_VALUE, 64.66f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 322.0f, 70.0f, LayoutDesc.NO_VALUE, 187.63f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 181.0f, 39.0f, LayoutDesc.NO_VALUE, 105.49f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("timeTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 128.0f, 55.0f, LayoutDesc.NO_VALUE, 127.51f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 55.0f, 24.0f, LayoutDesc.NO_VALUE, 55.42f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 161.0f, 70.0f, LayoutDesc.NO_VALUE, 160.83f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 90.0f, 39.0f, LayoutDesc.NO_VALUE, 90.42f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("dateTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 208.0f, 13.0f, LayoutDesc.NO_VALUE, 382.53f, 41.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 91.0f, 6.0f, LayoutDesc.NO_VALUE, 166.27f, 21.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 263.0f, 16.0f, LayoutDesc.NO_VALUE, 482.48f, 49.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 148.0f, 9.0f, LayoutDesc.NO_VALUE, 271.27f, 31.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("titleTextoutput", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 13.0f, 13.0f, LayoutDesc.NO_VALUE, 107.0f, 107.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 6.0f, 6.0f, LayoutDesc.NO_VALUE, 47.0f, 47.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 16.0f, 16.0f, LayoutDesc.NO_VALUE, 135.0f, 135.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 9.0f, 9.0f, LayoutDesc.NO_VALUE, 76.0f, 76.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("image", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, 89.0f, 573.0f, 297.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, 39.0f, 178.0f, 129.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, 113.0f, 886.0f, 374.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, 63.0f, 376.0f, 211.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("enterButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 14.0f, 166.0f, LayoutDesc.NO_VALUE, 212.52f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 5.0f, 72.0f, LayoutDesc.NO_VALUE, 92.37f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 21.0f, 209.0f, LayoutDesc.NO_VALUE, 268.05f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 9.0f, 118.0f, LayoutDesc.NO_VALUE, 150.71f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text8", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 357.0f, 132.0f, LayoutDesc.NO_VALUE, 140.26f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 155.0f, 57.0f, LayoutDesc.NO_VALUE, 60.96f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 450.0f, 166.0f, LayoutDesc.NO_VALUE, 176.91f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 253.0f, 93.0f, LayoutDesc.NO_VALUE, 99.47f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text6", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 128.0f, 132.0f, LayoutDesc.NO_VALUE, 85.01f, 45.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 55.0f, 57.0f, LayoutDesc.NO_VALUE, 36.95f, 23.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 161.0f, 166.0f, LayoutDesc.NO_VALUE, 107.22f, 55.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 90.0f, 93.0f, LayoutDesc.NO_VALUE, 60.28f, 34.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text5", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 128.0f, 13.0f, LayoutDesc.NO_VALUE, 85.01f, 41.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 55.0f, 6.0f, LayoutDesc.NO_VALUE, 36.95f, 21.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 161.0f, 16.0f, LayoutDesc.NO_VALUE, 107.22f, 49.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 90.0f, 9.0f, LayoutDesc.NO_VALUE, 60.28f, 31.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text3", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, 89.0f, 692.0f, 297.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, 39.0f, 230.0f, 129.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, 113.0f, 1036.0f, 374.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, 63.0f, 460.0f, 211.0f));  // 480*800 px
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
        return 180 * Math.min(dm.widthPixels, dm.heightPixels)/720;
    }

}

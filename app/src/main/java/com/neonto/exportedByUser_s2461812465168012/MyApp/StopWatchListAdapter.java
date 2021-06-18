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

public class StopWatchListAdapter extends BaseAdapter {

    public int[] filteredRows;

    private DataSheet mDataSheet;
    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    private Fragment mOwner;

    public StopWatchListAdapter(Fragment owner) {
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

        Class viewClass = StopWatchListItemView.class;
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
        layoutDescs.add(new LayoutDesc(10, 0.0f, 60.0f, LayoutDesc.NO_VALUE, 720.0f, 2.13f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 26.0f, LayoutDesc.NO_VALUE, 240.0f, 0.92f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 75.0f, LayoutDesc.NO_VALUE, 1080.0f, 2.68f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 42.0f, LayoutDesc.NO_VALUE, 480.0f, 1.51f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("rectangle", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 464.98f, 0.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 129.16f, 0.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 758.35f, 0.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 299.15f, 0.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("textCopy", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 128.0f, 0.0f, LayoutDesc.NO_VALUE, 255.02f, 49.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 55.0f, 0.0f, LayoutDesc.NO_VALUE, 110.84f, 25.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 161.0f, 0.0f, LayoutDesc.NO_VALUE, 321.65f, 60.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 90.0f, 0.0f, LayoutDesc.NO_VALUE, 180.85f, 37.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text2", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 14.0f, 0.0f, LayoutDesc.NO_VALUE, 127.51f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 5.0f, 0.0f, LayoutDesc.NO_VALUE, 55.42f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 22.0f, 0.0f, LayoutDesc.NO_VALUE, 160.83f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 10.0f, 0.0f, LayoutDesc.NO_VALUE, 90.42f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("text", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, 0.0f, 720.0f, 96.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, 0.0f, 240.0f, 42.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, 0.0f, 1080.0f, 121.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, 0.0f, 480.0f, 68.0f));  // 480*800 px
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
        return 216 * Math.min(dm.widthPixels, dm.heightPixels)/720;
    }

}

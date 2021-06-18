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

public class TimerListAdapter extends BaseAdapter {

    public int[] filteredRows;

    private DataSheet mDataSheet;
    private HashMap<String, HashMap<String, ArrayList<LayoutDesc>>> mOverrideElementLayoutDescriptors;

    private Fragment mOwner;

    public TimerListAdapter(Fragment owner) {
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

        Class viewClass = TimerListItemView.class;
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
        layoutDescs.add(new LayoutDesc(10, 629.49f, 43.0f, LayoutDesc.NO_VALUE, 76.51f, 76.51f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 201.75f, 18.0f, LayoutDesc.NO_VALUE, 33.25f, 33.25f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 961.50f, 54.0f, LayoutDesc.NO_VALUE, 96.50f, 96.50f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 415.75f, 30.0f, LayoutDesc.NO_VALUE, 54.25f, 54.25f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("deleteButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 14.0f, 21.0f, LayoutDesc.NO_VALUE, 692.0f, 134.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 5.0f, 9.0f, LayoutDesc.NO_VALUE, 230.0f, 62.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 22.0f, 27.0f, LayoutDesc.NO_VALUE, 1036.0f, 167.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 10.0f, 15.0f, LayoutDesc.NO_VALUE, 460.0f, 97.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("timerText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 170.01f, 58.0f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 73.90f, 29.0f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 214.44f, 71.0f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 120.56f, 43.0f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("noText", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 149.0f, LayoutDesc.NO_VALUE, 361.0f, 63.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 65.0f, LayoutDesc.NO_VALUE, 121.0f, 27.71f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 188.0f, LayoutDesc.NO_VALUE, 541.0f, 80.41f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 105.0f, LayoutDesc.NO_VALUE, 241.0f, 45.21f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("addMinuteButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 360.0f, 149.0f, LayoutDesc.NO_VALUE, 360.0f, 63.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 120.0f, 65.0f, LayoutDesc.NO_VALUE, 120.0f, 27.71f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 540.0f, 188.0f, LayoutDesc.NO_VALUE, 540.0f, 80.41f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 240.0f, 105.0f, LayoutDesc.NO_VALUE, 240.0f, 45.21f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("stopButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 360.0f, 149.0f, LayoutDesc.NO_VALUE, 360.0f, 63.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 120.0f, 65.0f, LayoutDesc.NO_VALUE, 120.0f, 27.71f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 540.0f, 188.0f, LayoutDesc.NO_VALUE, 540.0f, 80.41f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 240.0f, 105.0f, LayoutDesc.NO_VALUE, 240.0f, 45.21f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("startButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 149.0f, LayoutDesc.NO_VALUE, 361.0f, 63.76f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 65.0f, LayoutDesc.NO_VALUE, 121.0f, 27.71f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 188.0f, LayoutDesc.NO_VALUE, 541.0f, 80.41f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 105.0f, LayoutDesc.NO_VALUE, 241.0f, 45.21f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("resetButton", elementDesc);
        
        elementDesc = new HashMap();
        layoutDescs = new ArrayList<LayoutDesc>();
        layoutDescs.add(new LayoutDesc(10, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 720.0f, 212.52f));  // 720*1280 px
        layoutDescs.add(new LayoutDesc(2, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 240.0f, 92.37f));  // 240*320 px
        layoutDescs.add(new LayoutDesc(12, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 1080.0f, 268.05f));  // 1080*1920 px
        layoutDescs.add(new LayoutDesc(8, 0.0f, 0.0f, LayoutDesc.NO_VALUE, 480.0f, 150.71f));  // 480*800 px
        elementDesc.put("layoutDescs", layoutDescs);
        overrides.put("rectangle", elementDesc);
        
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
        return 208 * Math.min(dm.widthPixels, dm.heightPixels)/720;
    }

}

package com.neonto.exportedByUser_s2461812465168012.MyApp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StopWatchListItemFragment extends Fragment {

    private StopWatchListItemView mView;

    public StopWatchListItemFragment() {  // fragment must have a constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = new StopWatchListItemView(this);

        return mView;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        
        mView.onDestroy();
    }

}

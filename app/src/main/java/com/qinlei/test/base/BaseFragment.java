package com.qinlei.test.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;

/**
 * Created by qinlei
 * Created on 2017/11/14
 * Created description :
 */

public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("A_And_F", "onCreate: " + this.getClass().getSimpleName());
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            Log.d("A_And_F", "onHiddenChanged: " + this.getClass().getSimpleName());
        }
    }
}

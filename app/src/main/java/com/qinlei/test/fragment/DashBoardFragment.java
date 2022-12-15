package com.qinlei.test.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qinlei.test.R;
import com.qinlei.test.base.BaseFragment;

/**
 * Created by qinlei
 * Created on 2017/11/14
 * Created description :
 */

public class DashBoardFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText(getString(R.string.title_dashboard));
        return textView;
    }

    public static DashBoardFragment newInstance() {
        return new DashBoardFragment();
    }
}

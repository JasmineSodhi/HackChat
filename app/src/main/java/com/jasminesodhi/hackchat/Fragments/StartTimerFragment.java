package com.jasminesodhi.hackchat.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jasminesodhi.hackchat.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartTimerFragment extends Fragment {


    public StartTimerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start_timer, container, false);
    }

}

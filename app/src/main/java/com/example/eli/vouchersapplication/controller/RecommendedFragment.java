package com.example.eli.vouchersapplication.controller;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.eli.vouchersapplication.R;


public class RecommendedFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate view
        View view = inflater.inflate(R.layout.fragment_recommended,
                container, false);
        Toast.makeText(getActivity()," RecommendedFragment to do",Toast.LENGTH_LONG).show();
        // Return view
        return view;

    }
}

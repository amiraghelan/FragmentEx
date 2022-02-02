package com.example.fragmentex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CounterFragment extends Fragment {
    TextView tvCounter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);
        tvCounter = view.findViewById(R.id.tv_counter);
        return view;
    }

    public void increment(){
        int count = Integer.parseInt(tvCounter.getText().toString());
        String newCount = String.valueOf(++count);
        tvCounter.setText(newCount);
    }
}
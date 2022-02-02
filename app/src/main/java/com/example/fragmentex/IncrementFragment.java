package com.example.fragmentex;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class IncrementFragment extends Fragment {

    public interface IncrementFragmentListener{
        public void onIncrement();
    }

    private IncrementFragmentListener listener;
    private Button btnIncrement;

    public void setListener(IncrementFragmentListener listener) {
        this.listener = listener;
    }



    public static IncrementFragment newInstance(IncrementFragmentListener listener){
        IncrementFragment incrementFragment = new IncrementFragment();
        incrementFragment.setListener(listener);
        return  incrementFragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_increment, container, false);
        btnIncrement = view.findViewById(R.id.btn_increment);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onIncrement();
            }
        });
    }
}
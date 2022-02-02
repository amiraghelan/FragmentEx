package com.example.fragmentex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CounterFragment counterFragment = new CounterFragment();

        IncrementFragment incrementFragment = IncrementFragment.newInstance(new IncrementFragment.IncrementFragmentListener() {
            @Override
            public void onIncrement() {
                counterFragment.increment();
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.frm_counter,counterFragment).replace(R.id.frm_increment,incrementFragment).commit();

    }
}
package com.example.ryan.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListFragment mListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListFragment = new ListFragment().newInstance();


        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_activity_frame_layout, mListFragment)
                .commit();
    }
}


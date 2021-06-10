package com.edu.gcu.labourmanagementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.edu.gcu.labourmanagementapp.Adapter.Adapter_walkthrough;

import me.relex.circleindicator.CircleIndicator;

public class IntroActivity extends AppCompatActivity {
        public ViewPager viewpager;
        Adapter_walkthrough adapter_walkthrough;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_intro);
            viewpager = findViewById(R.id.viewpager);
            CircleIndicator indicator = findViewById(R.id.indicator);
            adapter_walkthrough = new Adapter_walkthrough(getSupportFragmentManager());
            viewpager.setAdapter(adapter_walkthrough);
            indicator.setViewPager(viewpager);
            adapter_walkthrough.registerDataSetObserver(indicator.getDataSetObserver());
        }
}
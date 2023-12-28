package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    String api = "4cb14516821c4e4fb24542c8acf94079";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.ViewPager);


        NewsAdapter newsAdapter = new NewsAdapter(getSupportFragmentManager());

        viewPager.setAdapter(newsAdapter);

        tabLayout.setupWithViewPager(viewPager);


    }
}
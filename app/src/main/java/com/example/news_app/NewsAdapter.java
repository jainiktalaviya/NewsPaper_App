package com.example.news_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class NewsAdapter extends FragmentPagerAdapter {



    public NewsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HomeFragment();
        } else if (position == 1) {
            return new SportsFragment();
        }else if (position == 2) {
            return new HealthFragment();
        }else if (position == 3) {
            return new ScienceFragment();
        }else if (position == 4) {
            return new EntertainmentFragment();
        }else {
            return new TechnologyFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return "Home";
        } else if (position == 1) {
            return "Sports";
        }else if (position == 2) {
            return "Health";
        }else if (position == 3) {
            return "Science";
        }else if (position == 4) {
            return "Entertainment";
        }else {
            return "Technology";
        }

    }
}

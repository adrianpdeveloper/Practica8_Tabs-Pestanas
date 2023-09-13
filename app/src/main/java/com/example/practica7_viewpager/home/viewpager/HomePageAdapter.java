package com.example.practica7_viewpager.home.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practica7_viewpager.home.fragments.HomeFragment;
import com.example.practica7_viewpager.home.fragments.HomeFragment2;
import com.example.practica7_viewpager.home.fragments.HomeFragment3;
import com.example.practica7_viewpager.home.fragments.HomeFragment4;


public class HomePageAdapter extends FragmentStateAdapter {
    public HomePageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            default:
            case 0:
                return new HomeFragment();
            case 1:
                return new HomeFragment2();
            case 2:
                return new HomeFragment3();
            case 3:
                return new HomeFragment4();
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
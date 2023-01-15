package com.example.sdvm2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.sdvm2.aartiya_fragment.GuruvarAartiFragment;
import com.example.sdvm2.aartiya_fragment.ItarAartiFragment;
import com.example.sdvm2.aartiya_fragment.NityaAartiFragament;

import java.util.List;

public class TablelayoutAdapter extends FragmentPagerAdapter {

    public TablelayoutAdapter(
            @NonNull FragmentManager fm
    ) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            default:
                return new NityaAartiFragament();
            case 1:
                return new GuruvarAartiFragment();
            case 2:
                return new ItarAartiFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}

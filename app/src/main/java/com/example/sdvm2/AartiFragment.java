package com.example.sdvm2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sdvm2.aartiya_fragment.GuruvarAartiFragment;
import com.example.sdvm2.aartiya_fragment.ItarAartiFragment;
import com.example.sdvm2.aartiya_fragment.NityaAartiFragament;
import com.example.sdvm2.databinding.FragmentAartiBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class AartiFragment extends Fragment {
    private FragmentAartiBinding binding;
    private TablelayoutAdapter adapter;



    public AartiFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAartiBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new TablelayoutAdapter(getChildFragmentManager());
        binding.viewPagerAarti.setAdapter(adapter);
        binding.tableLayout.setupWithViewPager(binding.viewPagerAarti);

    }



}

package com.example.sdvm2.aartiya_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sdvm2.R;
import com.example.sdvm2.databinding.FragmentGuruvarAartiBinding;


public class GuruvarAartiFragment extends Fragment {

    FragmentGuruvarAartiBinding binding;

    public GuruvarAartiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     binding = FragmentGuruvarAartiBinding.inflate(getLayoutInflater());
     return binding.getRoot();
    }
}
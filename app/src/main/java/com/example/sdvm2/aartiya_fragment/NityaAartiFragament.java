package com.example.sdvm2.aartiya_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sdvm2.R;
import com.example.sdvm2.databinding.FragmentNityaAartiFragamentBinding;


public class NityaAartiFragament extends Fragment {

    private FragmentNityaAartiFragamentBinding binding;
    public NityaAartiFragament() {
        super(R.layout.fragment_nitya_aarti_fragament);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNityaAartiFragamentBinding.inflate(getLayoutInflater());

        return binding.getRoot();

    }
}
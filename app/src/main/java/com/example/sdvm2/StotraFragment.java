package com.example.sdvm2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sdvm2.databinding.FragmentStotraBinding;
import com.example.sdvm2.model.MyAdapterClass;

import java.util.ArrayList;
import java.util.List;

public class StotraFragment extends Fragment {
    private FragmentStotraBinding binding;
    String[] s1;
    String[] s2;
    int[] images = {R.drawable.ganapati,R.drawable.durga,R.drawable.flower,R.drawable.krishna};

    public StotraFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStotraBinding.inflate(getLayoutInflater());

        s1 = getResources().getStringArray(R.array.stotra_name);
        s2 = getResources().getStringArray(R.array.stotram);
        MyAdapterClass myAdapterClass = new MyAdapterClass(getContext(), s1, s2, images);
        binding.stotraRecyclerView.setAdapter(myAdapterClass);
        binding.stotraRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    private void intitData() {


    }
}
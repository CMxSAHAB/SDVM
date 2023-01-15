package com.example.sdvm2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sdvm2.databinding.FragmentNoticeBinding;
import com.example.sdvm2.model.NoticeData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class NoticeFragment extends Fragment {
    FragmentNoticeBinding binding ;
    private DatabaseReference db;
    NoticeData noticeData;


    public NoticeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNoticeBinding.inflate(getLayoutInflater());
        GetDataFromDatabase1();

        return binding.getRoot();
    }

    private void GetDataFromDatabase1() {
        db = FirebaseDatabase.getInstance().getReference("message");

        db.child("message1").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (!task.isSuccessful()) {
                    Log.d("c1234", "onComplete: ",task.getException());
                }
                else{
                    Log.d("c1234", "onSuccess: "+String.valueOf(task.getResult().getValue()));
                    String value = task.getResult().getValue().toString();
                    binding.noticeDisplayText.setText(value);
                }

            }
        });

    }
}
package com.example.sdvm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.sdvm2.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    private  ActivitySplashScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Animation topDown = AnimationUtils.loadAnimation(this,R.anim.top_down);
        Animation bottomUp = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        binding.om.setAnimation(topDown);
        binding.sdvmText.setAnimation(topDown);
        binding.imageDeva.setAnimation(bottomUp);
        binding.namste.setAnimation(bottomUp);

        binding.namste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            }
        });


    }
}
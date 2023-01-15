package com.example.sdvm2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.sdvm2.databinding.ActivityHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private static final NoticeFragment noticeFragment = new NoticeFragment();
    private static final GalleryFragment galleryFragment = new GalleryFragment();
    private static final AartiFragment aartiFragment = new AartiFragment();
    private static final StotraFragment stotraFragment = new StotraFragment();
    private static final WhatsappFragment whatsappFragment = new WhatsappFragment();

    private  Fragment active;
    private  FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.bottomNavView.setSelectedItemId(R.id.notice);

        setBottomNavBar();

    }

    private  void setBottomNavBar(){
        try {
            active = noticeFragment;
            manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .add(R.id.frameLayout,noticeFragment,"1").commit();
            manager.beginTransaction()
                    .add(R.id.frameLayout,galleryFragment,"2").hide(galleryFragment).commit();
            manager.beginTransaction()
                    .add(R.id.frameLayout,aartiFragment,"3").hide(aartiFragment).commit();
            manager.beginTransaction()
                    .add(R.id.frameLayout,stotraFragment,"4").hide(stotraFragment).commit();
            manager.beginTransaction()
                    .add(R.id.frameLayout,whatsappFragment,"5").hide(whatsappFragment).commit();
            binding.bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.notice:
                            getSupportFragmentManager().beginTransaction().
                                    hide(active).show(noticeFragment).commit();
                            active = noticeFragment;
                            return true;
                        case R.id.gallery:
                            getSupportFragmentManager().beginTransaction().
                                    hide(active).show(galleryFragment).commit();
                            active = galleryFragment;
                            return true;
                        case R.id.aarti:
                            getSupportFragmentManager().beginTransaction().
                                    hide(active).show(aartiFragment).commit();
                            active = aartiFragment;
                            return true;
                        case R.id.stotra:
                            getSupportFragmentManager().beginTransaction().
                                    hide(active).show(stotraFragment).commit();
                            active = stotraFragment;
                            return true;
                        case R.id.whatsapp:
                            getSupportFragmentManager().beginTransaction().
                                    hide(active).show(whatsappFragment).commit();
                            active = whatsappFragment;
                            return true;
                    }
                    return false;
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
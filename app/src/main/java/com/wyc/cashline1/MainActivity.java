package com.wyc.cashline1;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.wyc.cashline1.fragments.RecordsFragment;
import com.wyc.cashline1.fragments.SettingFragment;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation_view)
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // bottom navigation
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        // fragments

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
        = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                RecordsFragment recordsFragment = new RecordsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, recordsFragment).commit();
                return true;
            case R.id.navigation_dashboard:
                SettingFragment settingFragment = new SettingFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, settingFragment).commit();
                return true;
            case R.id.navigation_notifications:
                Snackbar.make(bottomNavigationView, "navigation_notifications", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                return true;
        }
        return false;
        }
    };
}
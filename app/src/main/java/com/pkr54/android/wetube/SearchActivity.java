package com.pkr54.android.wetube;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpBottomNavigationView();
    }

    private void setUpBottomNavigationView(){
        // To remove the dark color of clicked item on bnv
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavViewBar);
        bottomNavigationView.setItemIconTintList(null);
        BottomNavigationViewHelper.enableNavigation(SearchActivity.this, bottomNavigationView);
    }
}

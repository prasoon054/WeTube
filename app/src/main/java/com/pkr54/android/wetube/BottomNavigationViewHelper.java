package com.pkr54.android.wetube;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NonNls;

public class BottomNavigationViewHelper {
    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.ic_home:
                        context.startActivity(new Intent(context, MainActivity.class));
                        break;
                    case R.id.ic_search:
                        context.startActivity(new Intent(context, SearchActivity.class));
                        break;
                    case R.id.ic_notification:
                        context.startActivity(new Intent(context, NotifActivity.class));
                        break;
                    case R.id.ic_circle:
                        context.startActivity(new Intent(context, PostActivity.class));
                        break;
                    case R.id.ic_user:
                        context.startActivity(new Intent(context, ProfileActivity.class));
                        break;
                }
                return false;
            }
        });
    }
}

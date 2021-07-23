package com.example.thrive;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Friends extends AppCompatActivity {

    Button updateProfileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);

        BottomNavigationView nav= findViewById(R.id.bottomnavview2);
        findViewById(R.id.bottomnavview2).setBackground(null);
        nav.setSelectedItemId(R.id.friends);

        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        Intent intent = new Intent(Friends.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.profile:
                        Intent intent2 = new Intent(Friends.this, Profile.class);
                        startActivity(intent2);
                        break;
                    case R.id.shop:
                        Intent intent3 = new Intent(Friends.this, Shop.class);
                        startActivity(intent3);
                        break;
                    case R.id.stat:
                        Intent intent4 = new Intent(Friends.this, Stat.class);
                        startActivity(intent4);
                        break;
                    case R.id.friends:
                        break;
                }
                return true;
            }
        });

    }



    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Friends.this, MainActivity.class);
        startActivity(intent);
    }
}
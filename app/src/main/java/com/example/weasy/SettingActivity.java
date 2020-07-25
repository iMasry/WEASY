package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void back(View view) {
        Intent backEIntent = new Intent(SettingActivity.this, ProfileActivity.class);
        startActivity(backEIntent);
    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(SettingActivity.this, HomeActivity.class);
        startActivity(homeEIntent);
    }

    public void chartt(View view) {

        Toast.makeText(getApplicationContext(), "chart", Toast.LENGTH_SHORT).show();
        Intent chartEIntent = new Intent(SettingActivity.this, ReportActivity.class);
        startActivity(chartEIntent);
    }

    public void pic(View view) {
        Intent picEIntent = new Intent();
        picEIntent.setAction(Intent.ACTION_VIEW);
        picEIntent.setType("image/*");
        picEIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(picEIntent);
    }
}
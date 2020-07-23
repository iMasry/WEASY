package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01000000000"));
        startActivity(intent);

    }

    public void send(View view) {

    }

    public void logout(View view) {
        Intent logoutEIntent = new Intent(profile.this, MainActivity.class);
        startActivity(logoutEIntent);
    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(profile.this, homeactivity.class);
        startActivity(homeEIntent);
    }

    public void chartt(View view) {

        Toast.makeText(getApplicationContext(), "chart", Toast.LENGTH_SHORT).show();
        Intent chartEIntent = new Intent(profile.this, ReportActivity.class);
        startActivity(chartEIntent);
    }
}
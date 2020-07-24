package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    private LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        linear = findViewById(R.id.daialog);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendialog();
            }
        });
    }

    public void opendialog() {
        dialog Dialog = new dialog();
        Dialog.show(getSupportFragmentManager(), "dialog");
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

    public void setting(View view) {
        Intent settingEIntent = new Intent(profile.this, setting.class);
        startActivity(settingEIntent);
    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(profile.this, homeactivity.class);
        startActivity(homeEIntent);
    }

    public void chartt(View view) {

        Toast.makeText(getApplicationContext(), "Statics", Toast.LENGTH_SHORT).show();
        Intent chartEIntent = new Intent(profile.this, ReportActivity.class);
        startActivity(chartEIntent);
    }
}
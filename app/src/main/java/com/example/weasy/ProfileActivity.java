package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

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
        Intent logoutEIntent = new Intent(ProfileActivity.this, MainActivity.class);
        startActivity(logoutEIntent);
    }

    public void setting(View view) {
        Intent settingEIntent = new Intent(ProfileActivity.this, SettingActivity.class);
        startActivity(settingEIntent);
    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(ProfileActivity.this, HomeActivity.class);
        startActivity(homeEIntent);
    }

    public void chartt(View view) {

        Toast.makeText(getApplicationContext(), "Statics", Toast.LENGTH_SHORT).show();
        Intent chartEIntent = new Intent(ProfileActivity.this, ReportActivity.class);
        startActivity(chartEIntent);
    }
}
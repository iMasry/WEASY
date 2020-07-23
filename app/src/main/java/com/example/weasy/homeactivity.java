package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
    }

    public void profile(View view) {
        Toast.makeText(getApplicationContext(), "profile", Toast.LENGTH_SHORT).show();
        Intent profileIntent = new Intent(homeactivity.this, profile.class);
        startActivity(profileIntent);
    }

    public void chart(View view) {
        Toast.makeText(getApplicationContext(), "chart", Toast.LENGTH_SHORT).show();
        Intent profileEIntent = new Intent(homeactivity.this, ReportActivity.class);
        startActivity(profileEIntent);
    }

}
package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void profile(View view) {
        Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_SHORT).show();
        Intent profileIntent = new Intent(this, profile.class);
        startActivity(profileIntent);
    }

    public void home(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
        Intent homeIntent = new Intent(this, homeactivity.class);
        startActivity(homeIntent);
    }

    public void chart(View view) {
        Toast.makeText(getApplicationContext(), "Statics", Toast.LENGTH_SHORT).show();
        Intent chartIntent = new Intent(this, ReportActivity.class);
        startActivity(chartIntent);
    }

}
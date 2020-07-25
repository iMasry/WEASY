package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class doctor_home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home);
        radio Dialog = new radio();
        Dialog.show(getSupportFragmentManager(), "radio");
    }

    public void profile(View view) {
        Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_SHORT).show();
        Intent profileIntent = new Intent(this, doctor_profile.class);
        startActivity(profileIntent);
    }

    public void home(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
    }

    public void chart(View view) {
        Toast.makeText(getApplicationContext(), "Statics", Toast.LENGTH_SHORT).show();
        Intent chartIntent = new Intent(this, ReportActivity.class);
        startActivity(chartIntent);
    }

    public void control(View view) {
        Toast.makeText(getApplicationContext(), "control", Toast.LENGTH_SHORT).show();
        Intent chartIntent = new Intent(this, control.class);
        startActivity(chartIntent);
    }

}
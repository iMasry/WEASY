package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class doctor_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_profile);
    }


    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:01000000000"));
        startActivity(intent);

    }

    public void send(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Session Time Is at 4 Pm ");
        intent.putExtra(Intent.EXTRA_TEXT, "final");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void logout(View view) {
        Intent logoutEIntent = new Intent(doctor_profile.this, MainActivity.class);
        startActivity(logoutEIntent);
    }

    public void setting(View view) {
        Intent settingEIntent = new Intent(doctor_profile.this, setting.class);
        startActivity(settingEIntent);
    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(doctor_profile.this, homeactivity.class);
        startActivity(homeEIntent);
    }

    public void chartt(View view) {

        Toast.makeText(getApplicationContext(), "Statics", Toast.LENGTH_SHORT).show();
        Intent chartEIntent = new Intent(doctor_profile.this, ReportActivity.class);
        startActivity(chartEIntent);
    }

    public void control(View view) {
        Toast.makeText(getApplicationContext(), "control", Toast.LENGTH_SHORT).show();
        Intent chartIntent = new Intent(this, BluetoothActivity.class);
        startActivity(chartIntent);
    }
}

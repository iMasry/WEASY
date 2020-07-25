package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
        // Intent settingEIntent = new Intent(doctor_profile.this, setting.class);
        // startActivity(settingEIntent);
        ImageView ic_call = (ImageView) findViewById(R.id.ic_call);
        TextView text_call = (TextView) findViewById(R.id.text_call);
        text_call.setText("Update Phone Number");
        ImageView ic_setting = (ImageView) findViewById(R.id.ic_setting);
        ic_setting.setImageResource(R.drawable.ic_email);
        TextView text_setting = (TextView) findViewById(R.id.text_setting);
        text_setting.setText("Update Email");
        ImageView ic_physical = (ImageView) findViewById(R.id.ic_physical);
        ic_physical.setImageResource(R.drawable.ic_password);
        TextView text_physical = (TextView) findViewById(R.id.text_physical);
        text_physical.setText("Reset Password");
        ImageView ic_email = (ImageView) findViewById(R.id.ic_email);
        ic_email.setImageResource(R.drawable.ic_notification);
        TextView text_email = (TextView) findViewById(R.id.text_email);
        text_email.setText("Notifications");
        ImageView ic_logout = (ImageView) findViewById(R.id.ic_logout);
        ic_logout.setImageResource(R.drawable.ic_back);
        TextView text_logout = (TextView) findViewById(R.id.text_logout);
        text_logout.setText("Back");
        LinearLayout logout = (LinearLayout) findViewById(R.id.linear_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text_call = (TextView) findViewById(R.id.text_call);
                text_call.setText("Call Patient's Parent");
                ImageView ic_setting = (ImageView) findViewById(R.id.ic_setting);
                ic_setting.setImageResource(R.drawable.ic_gear);
                TextView text_setting = (TextView) findViewById(R.id.text_setting);
                text_setting.setText("Settings");
                ImageView ic_physical = (ImageView) findViewById(R.id.ic_physical);
                ic_physical.setImageResource(R.drawable.ic_physiotherapy);
                TextView text_physical = (TextView) findViewById(R.id.text_physical);
                text_physical.setText("Patient's Info");
                ImageView ic_email = (ImageView) findViewById(R.id.ic_email);
                ic_email.setImageResource(R.drawable.ic_email);
                TextView text_email = (TextView) findViewById(R.id.text_email);
                text_email.setText("Send Email With session Time");
                ImageView ic_logout = (ImageView) findViewById(R.id.ic_logout);
                ic_logout.setImageResource(R.drawable.ic_logout);
                TextView text_logout = (TextView) findViewById(R.id.text_logout);
                text_logout.setText("Logout");
                LinearLayout logout = (LinearLayout) findViewById(R.id.linear_logout);
                logout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
                        Intent homeEIntent = new Intent(doctor_profile.this, MainActivity.class);
                        startActivity(homeEIntent);
                    }
                });

            }
        });

    }

    public void hoome(View view) {
        Toast.makeText(getApplicationContext(), "Progress", Toast.LENGTH_SHORT).show();
        Intent homeEIntent = new Intent(doctor_profile.this, doctor_home.class);
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

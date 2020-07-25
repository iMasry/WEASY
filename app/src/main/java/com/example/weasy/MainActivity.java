package com.example.weasy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sign_in(View view) {
        EditText text = findViewById(R.id.name);
        String username = text.getText().toString();
        EditText pass_word = findViewById(R.id.Pass_word);
        String password = pass_word.getText().toString();
        if (username.equals("ayman") && password.equals("1945")) {
            Toast.makeText(getApplicationContext(), "Welcome " + username, Toast.LENGTH_SHORT).show();
            Intent HOMEIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(HOMEIntent);
        } else if (username.equals("ahmed") && password.equals("1945")) {

            Intent sign_upIntent = new Intent(MainActivity.this, DoctorHomeActivity.class);
            startActivity(sign_upIntent);
        } else {
            Toast.makeText(getApplicationContext(), "Authentication failed " + '\n' + "Please check your username / password ", Toast.LENGTH_SHORT).show();

        }


    }

    public void Sign_up(View view) {
        Intent sign_upIntent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(sign_upIntent);
    }
}

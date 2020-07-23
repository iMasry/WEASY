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
        EditText text = (EditText) findViewById(R.id.name);
        String username = text.getText().toString();
        EditText pass_word = (EditText) findViewById(R.id.Pass_word);
        String password = pass_word.getText().toString();
        if (username.equals("leen") && password.equals("1945")) {
            Toast.makeText(getApplicationContext(), "Welcome " + username, Toast.LENGTH_SHORT).show();
            Intent HOMEIntent = new Intent(MainActivity.this, homeactivity.class);
            startActivity(HOMEIntent);
        } else {
            Toast.makeText(getApplicationContext(), "Authentication failed " + '\n' + "Please check your username / password ", Toast.LENGTH_SHORT).show();

        }


    }
    public void Sign_up(View view) {
        Intent sign_upIntent = new Intent(MainActivity.this, sign_up.class);
        startActivity(sign_upIntent);
    }
}

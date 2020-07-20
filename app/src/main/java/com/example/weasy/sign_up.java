package com.example.weasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
    public void Sign_up(View view) {
        EditText text = (EditText) findViewById(R.id.name);
        String username = text.getText().toString();
        EditText pass_word = (EditText) findViewById(R.id.Pass_word);
        String password = pass_word.getText().toString();
        EditText con_pass_word = (EditText) findViewById(R.id.con_Pass_word);
        String con_password = con_pass_word.getText().toString();
        if (password ==con_password ) {
            Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
          //  Intent numbersIntent = new Intent(MainActivity.this, homeactivity.class);
           // startActivity(numbersIntent);
        } else {
            Toast.makeText(getApplicationContext(), "Authentication failed " + '\n' +"Please check your username / password ", Toast.LENGTH_SHORT).show();

        }


    }

}
package com.amikom.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivityy extends AppCompatActivity {
    PreferencesHelper instance;
    private EditText name;
    private EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activityy);

        instance = PreferencesHelper.getInstance(getApplicationContext());

        name = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
    }
    public void Login(View view){
        String n = name.getText().toString();
        String n = email.getText().toString();
        Toast.makeText(getApplicationContext(), "Succes Login", Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(n);

        Intent intent = new Intent(LoginActivityy.this, MainActivity.class);
    }
}

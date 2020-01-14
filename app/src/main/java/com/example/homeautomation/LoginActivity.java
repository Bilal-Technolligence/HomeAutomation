package com.example.homeautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button btn;
    EditText id,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.login);
        id=(EditText) findViewById(R.id.id);
        password=(EditText) findViewById(R.id.password);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else if (!password.getText().toString().equals("admin")) {
                    password.setError("Invalid password");
                    password.setFocusable(true);
                } else {
                    id.setError("Invalid id");
                    id.setFocusable(true);
                }
            }
            }
        );

    }
}

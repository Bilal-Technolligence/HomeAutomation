package com.example.homeautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    Button btn;
    EditText id,password;
    ProgressDialog progressDialog;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=(Button) findViewById(R.id.register);
        id=(EditText) findViewById(R.id.id);
        password=(EditText) findViewById(R.id.password);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Registering..... ");
        login = (TextView) findViewById(R.id.login);
        final FirbaseAuthenticationClass firbaseAuthenticationClass=new FirbaseAuthenticationClass();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = id.getText().toString().trim();
                String Password = password.getText().toString().trim();

                if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {

                    id.setError("Invalid Email");
                    id.setFocusable(true);

                } else if (Password.length() < 6) {
                    password.setError("Password Length Must Be greater than 6 characters");
                    password.setFocusable(true);

                } else {
                    progressDialog.setMessage("Registering ....");
                    progressDialog.show();

                    firbaseAuthenticationClass.RegisterUser(Email,Password, RegisterActivity.this, progressDialog);
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                finish();
            }
        });
    }
}

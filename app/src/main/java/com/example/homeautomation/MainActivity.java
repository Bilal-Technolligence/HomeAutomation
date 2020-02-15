package com.example.homeautomation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    CardView btnBulb, btnFan, btnAirConditionar, btnSensors;
    DatabaseReference dref = FirebaseDatabase.getInstance().getReference();
    Switch a1;
    Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (Switch) findViewById(R.id.ac1);
        btnBulb = findViewById(R.id.cardLigt);
        btnFan = findViewById(R.id.cardFan);
        btnAirConditionar = findViewById(R.id.cardAirConditionar);
        btnSensors = findViewById(R.id.cardSensors);
        logout = findViewById(R.id.btnLogout);

        SharedPreferences.Editor editor = getSharedPreferences("Log", MODE_PRIVATE).edit();
        editor.putBoolean("isLoggedIn", true );
        editor.commit();

        dref.child("AC").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1)
                    a1.setChecked(true);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        btnBulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BulbActivity.class));
            }
        });

        btnFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FanActivity.class));
            }
        });
        a1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (a1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Ac On", Toast.LENGTH_SHORT).show();
                    dref.child("AC").setValue(1);
                } else {
                    dref.child("AC").setValue(0);
                }
            }
        });


        btnSensors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SensorsActivity.class));
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("Log", MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.remove("isLoggedIn");
                editor.commit();
                startActivity(new Intent(MainActivity.this , LoginActivity.class));
                finish();
            }
        });
    }
}

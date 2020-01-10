package com.example.homeautomation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView btnBulb,btnFan,btnAirConditionar,btnSensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnBulb = findViewById( R.id.cardLigt );
        btnFan = findViewById( R.id.cardFan );
        btnAirConditionar = findViewById( R.id.cardAirConditionar );
        btnSensors = findViewById( R.id.cardSensors );

        btnBulb.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this,BulbActivity.class ) );
            }
        } );

        btnFan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this,FanActivity.class ) );
            }
        } );

        btnAirConditionar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );

        btnSensors.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this,SensorsActivity.class ) );
            }
        } );
    }
}

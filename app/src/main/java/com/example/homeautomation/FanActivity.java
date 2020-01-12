package com.example.homeautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FanActivity extends AppCompatActivity {
    Switch b1,b2,b3;
    DatabaseReference dref= FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fan );
        b1 = (Switch) findViewById( R.id.btnb1 );
        b2 = (Switch) findViewById( R.id.btnb2 );
        b3 = (Switch) findViewById( R.id.btnb3 );
        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b1.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 1 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b1" ).setValue( 1 );



                }
                else
                {
                    Toast.makeText( FanActivity.this, "Fan 1 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b1" ).setValue( 0 );

                }
            }
        });


        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b2.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 2 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b2" ).setValue( 1 );



                }
                else
                {

                    Toast.makeText( FanActivity.this, "Fan 2 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b2" ).setValue( 0 );
                }
            }
        });

        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b3.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 3 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b3" ).setValue( 1 );



                }
                else
                {

                    Toast.makeText( FanActivity.this, "Fan 3 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b3" ).setValue( 0 );
                }
            }
        });
    }
}

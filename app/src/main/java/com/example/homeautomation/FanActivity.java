package com.example.homeautomation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FanActivity extends AppCompatActivity {
    Switch b1,b2,b3;
    DatabaseReference dref= FirebaseDatabase.getInstance().getReference();
    ImageView f1 ,f2, f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fan );
        b1 = (Switch) findViewById( R.id.btnb1 );
        b2 = (Switch) findViewById( R.id.btnb2 );
        b3 = (Switch) findViewById( R.id.btnb3 );
        f1 = (ImageView) findViewById(R.id.fan1);
        f2 = (ImageView) findViewById(R.id.fan2);
        f3 = (ImageView) findViewById(R.id.fan3);

        dref.child("Fan").child("b1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f1.startAnimation(animation);
                    b1.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        dref.child("Fan").child("b2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f2.startAnimation(animation);
                    b2.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Fan").child("b3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f3.startAnimation(animation);
                    b3.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b1.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 1 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b1" ).setValue( 1 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f1.startAnimation(animation);

                }
                else
                {
                    Toast.makeText( FanActivity.this, "Fan 1 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b1" ).setValue( 0 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.stopfananim);
                    f1.startAnimation(animation);

                }
            }
        });


        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b2.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 2 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b2" ).setValue( 1 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f2.startAnimation(animation);
                }
                else
                {
                    Toast.makeText( FanActivity.this, "Fan 2 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b2" ).setValue( 0 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.stopfananim);
                    f2.startAnimation(animation);

                }
            }
        });

        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b3.isChecked()){
                    Toast.makeText( FanActivity.this, "Fan 3 On", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b3" ).setValue( 1 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.fananim);
                    f3.startAnimation(animation);
                }
                else
                {
                    Toast.makeText( FanActivity.this, "Fan 3 Off", Toast.LENGTH_SHORT ).show();
                    dref.child( "Fan" ).child( "b3" ).setValue( 0 );
                    Animation animation = AnimationUtils.loadAnimation(FanActivity.this, R.anim.stopfananim);
                    f3.startAnimation(animation);

                }
            }
        });
    }
}

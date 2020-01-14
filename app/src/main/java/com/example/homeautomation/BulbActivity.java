package com.example.homeautomation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BulbActivity extends AppCompatActivity {

    Switch b1, b2, b3, b4, b5, b6;
    ImageView l1, l2, l3, l4, l5, l6;
    DatabaseReference dref = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulb);

        b1 = (Switch) findViewById(R.id.btnb1);
        b2 = (Switch) findViewById(R.id.btnb2);
        b3 = (Switch) findViewById(R.id.btnb3);
        b4 = (Switch) findViewById(R.id.btnb4);
        b5 = (Switch) findViewById(R.id.btnb5);
        b6 = (Switch) findViewById(R.id.btnb6);

        l1 = (ImageView) findViewById(R.id.img1);
        l2 = (ImageView) findViewById(R.id.img2);
        l3 = (ImageView) findViewById(R.id.img3);
        l4 = (ImageView) findViewById(R.id.img4);
        l5 = (ImageView) findViewById(R.id.img5);
        l6 = (ImageView) findViewById(R.id.img6);


        dref.child("Light").child("b1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l1.setImageDrawable(resure);
                    b1.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Light").child("b2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l2.setImageDrawable(resure);
                    b2.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Light").child("b3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l3.setImageDrawable(resure);
                    b3.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Light").child("b4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l4.setImageDrawable(resure);
                    b4.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Light").child("b5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l5.setImageDrawable(resure);
                    b5.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        dref.child("Light").child("b6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int x = Integer.parseInt(dataSnapshot.getValue().toString());
                if (x == 1) {
                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l6.setImageDrawable(resure);
                    b6.setChecked(true);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b1.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b1").setValue(1);

                    String urione = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    Drawable resure = getResources().getDrawable(imageResource);
                    l1.setImageDrawable(resure);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b1").setValue(0);


                    String urione = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(urione, null, getPackageName());

                    //  l1= (ImageView)findViewById(R.id.img1);
                    Drawable resure = getResources().getDrawable(imageResource);
                    l1.setImageDrawable(resure);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b2.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b2").setValue(1);

                    String uri = "@drawable/bulb1";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    //   l2= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    l2.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b2").setValue(0);


                    String uritwo = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResourceTwo = getResources().getIdentifier(uritwo, null, getPackageName());

                    //  bulblighton= (ImageView)findViewById(R.id.img2);
                    Drawable restwo = getResources().getDrawable(imageResourceTwo);
                    l2.setImageDrawable(restwo);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });

        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b3.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b3").setValue(1);

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    //  bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    l3.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b3").setValue(0);


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    //  bulblighton= (ImageView)findViewById(R.id.img3);
                    Drawable res = getResources().getDrawable(imageResource);
                    l3.setImageDrawable(res);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b4.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b4").setValue(1);

                    String uri = "@drawable/bulb3";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    // bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    l4.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b4").setValue(0);


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    // bulblighton= (ImageView)findViewById(R.id.img4);
                    Drawable res = getResources().getDrawable(imageResource);
                    l4.setImageDrawable(res);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b5.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b5").setValue(1);

                    String uri = "@drawable/bulb4";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    //bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    l5.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b5").setValue(0);


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    // bulblighton= (ImageView)findViewById(R.id.img5);
                    Drawable res = getResources().getDrawable(imageResource);
                    l5.setImageDrawable(res);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (b6.isChecked()) {
                    Toast.makeText(BulbActivity.this, "LightOn", Toast.LENGTH_SHORT).show();
                    dref.child("Light").child("b6").setValue(1);

                    String uri = "@drawable/bulb5";  // where myresource (without the extension) is the file

                    int imageResource1 = getResources().getIdentifier(uri, null, getPackageName());

//                    l6= (ImageView)findViewById(R.id.img6);
                    Drawable res1 = getResources().getDrawable(imageResource1);
                    l6.setImageDrawable(res1);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);


                } else {
                    dref.child("Light").child("b6").setValue(0);


                    String uri1 = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource1 = getResources().getIdentifier(uri1, null, getPackageName());

                    l6 = (ImageView) findViewById(R.id.img6);
                    Drawable res1 = getResources().getDrawable(imageResource1);
                    l6.setImageDrawable(res1);

                    Toast.makeText(BulbActivity.this, "LightOff", Toast.LENGTH_SHORT).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


    }
}

package com.example.homeautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BulbActivity extends AppCompatActivity {

    Switch b1,b2,b3,b4,b5,b6;
    ImageView bulblighton;
    DatabaseReference dref= FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bulb );

        b1 = (Switch) findViewById( R.id.btnb1 );
        b2 = (Switch) findViewById( R.id.btnb2 );
        b3 = (Switch) findViewById( R.id.btnb3 );
        b4 = (Switch) findViewById( R.id.btnb4 );
        b5 = (Switch) findViewById( R.id.btnb5 );
        b6 = (Switch) findViewById( R.id.btnb6 );

        b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b1.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b1" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b2.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b2" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img2);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });

        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b3.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b3" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img3);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b4.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b4" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img4);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b5.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b5" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img5);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });


        b6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(b6.isChecked()){
                    Toast.makeText( BulbActivity.this, "LightOn", Toast.LENGTH_SHORT ).show();
                    dref.child( "Light" ).child( "b1" ).setValue( 1 );

                    String uri = "@drawable/bulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img1);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);
//                    dref.child( "SmokeGas" ).child( "Smoke" ).setValue( 0 );
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.fananim);
//                    animationTarget.startAnimation(animation);



                }
                else
                {
                    dref.child( "Light" ).child( "b6" ).setValue( 0 );


                    String uri = "@drawable/lightbulb";  // where myresource (without the extension) is the file

                    int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                    bulblighton= (ImageView)findViewById(R.id.img6);
                    Drawable res = getResources().getDrawable(imageResource);
                    bulblighton.setImageDrawable(res);

                    Toast.makeText( BulbActivity.this, "LightOff", Toast.LENGTH_SHORT ).show();
//                    Animation animation = AnimationUtils.loadAnimation(ActivitySmoke.this, R.anim.stopfananim);
//                    animationTarget.startAnimation(animation);
                }
            }
        });




    }
}

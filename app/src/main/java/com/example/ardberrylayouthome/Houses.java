package com.example.ardberrylayouthome;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Houses extends AppCompatActivity implements View.OnClickListener {


    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houses);

        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser()==null) {
            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_activity_start,R.anim.fade_activity_end);
        }

        FirebaseUser user = firebaseAuth.getCurrentUser();



        View view5 = findViewById(R.id.u1);
        SlideAnimationUtil.slideInFromUp1(this,view5);
        View view6 = findViewById(R.id.u2);
        SlideAnimationUtil.slideInFromUp2(this,view6);


        View view1 = findViewById(R.id.house1);
        SlideAnimationUtil.slideInFromLeft1(this,view1);
        View view3 = findViewById(R.id.house3);
        SlideAnimationUtil.slideInFromLeft3(this,view3);
        View view2 = findViewById(R.id.house2);
        SlideAnimationUtil.slideInFromRight2(this,view2);
        View view4 = findViewById(R.id.house4);
        SlideAnimationUtil.slideInFromRight4(this,view4);


        View view8 = findViewById(R.id.d1);
        SlideAnimationUtil.slideInFromDown1(this,view8);
        View view9 = findViewById(R.id.d2);
        SlideAnimationUtil.slideInFromDown2(this,view9);
        View view10 = findViewById(R.id.d3);
        SlideAnimationUtil.slideInFromDown2(this,view10);

        View home = findViewById(R.id.homemain);
        SlideAnimationUtil.slideInFromLeft3(this,home);
        View logout = findViewById(R.id.logout);
        SlideAnimationUtil.slideInFromRight4(this,logout);


    }
    public void house1(View view)
    {
        View house2 = findViewById(R.id.house2);
        SlideAnimationUtil.slideOutToRight(this,house2);
        View house3 = findViewById(R.id.house3);
        SlideAnimationUtil.slideOutToLeft(this,house3);
        View house4 = findViewById(R.id.house4);
        SlideAnimationUtil.slideOutToRight(this,house4);
        View house1 = findViewById(R.id.house1);
        SlideAnimationUtil.slideClickFocus1(this,house1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Houses.this, InsideHouse.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
            }
        }, 600);

    }
    public void house2(View view)
    {
        View house1 = findViewById(R.id.house1);
        SlideAnimationUtil.slideOutToLeft(this,house1);
        View house3 = findViewById(R.id.house3);
        SlideAnimationUtil.slideOutToLeft(this,house3);
        View house4 = findViewById(R.id.house4);
        SlideAnimationUtil.slideOutToRight(this,house4);
        View house2 = findViewById(R.id.house2);
        SlideAnimationUtil.slideClickFocus2(this,house2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Houses.this, InsideHouse.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
            }
        }, 600);
    }
    public void house3(View view)
    {
        View house1 = findViewById(R.id.house1);
        SlideAnimationUtil.slideOutToLeft(this,house1);
        View house2 = findViewById(R.id.house2);
        SlideAnimationUtil.slideOutToRight(this,house2);
        View house4 = findViewById(R.id.house4);
        SlideAnimationUtil.slideOutToRight(this,house4);
        View house3 = findViewById(R.id.l2);
        SlideAnimationUtil.slideClickFocus3(this,house3);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Houses.this, InsideHouse.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
            }
        }, 600);
    }
    public void house4(View view)
    {
        View house1 = findViewById(R.id.house1);
        SlideAnimationUtil.slideOutToLeft(this,house1);
        View house2 = findViewById(R.id.house2);
        SlideAnimationUtil.slideOutToRight(this,house2);
        View house3 = findViewById(R.id.house3);
        SlideAnimationUtil.slideOutToLeft(this,house3);
        View house4 = findViewById(R.id.l2);
        SlideAnimationUtil.slideClickFocus4(this,house4);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Houses.this, InsideHouse.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
            }
        }, 800);
    }

    public void home(View view){
        Intent intent =new Intent(Houses.this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }

    public void logout(View view){
        firebaseAuth.signOut();
        Intent intent = new Intent(Houses.this,LoginActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

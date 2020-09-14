package com.example.ardberrylayouthome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InsideHouse extends AppCompatActivity {
    int fan = 0;
    int fridge = 0;
    int pc = 0;
    int bedroom = 0;
    int living = 0;
    int kitchen = 0;
    int tv = 0;
    int cloth = 0;
    int geyser = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_house);
        View view5 = findViewById(R.id.u1);
        SlideAnimationUtil.slideInFromUp21(this,view5);
        View view6 = findViewById(R.id.u2);
        SlideAnimationUtil.slideInFromUp22(this,view6);


        View l1 =findViewById(R.id.ll1);
        SlideAnimationUtil.slideInFromLeft21(this,l1);
        View l2 =findViewById(R.id.ll2);
        SlideAnimationUtil.slideInFromRight21(this,l2);

        View card1 =findViewById(R.id.card1);
        SlideAnimationUtil.slideInFromLeft22(this,card1);
        View card2 =findViewById(R.id.card2);
        SlideAnimationUtil.slideInFromLeft23(this,card2);
        View card3 =findViewById(R.id.card3);
        SlideAnimationUtil.slideInFromLeft24(this,card3);

        View card4 =findViewById(R.id.card4);
        SlideAnimationUtil.slideInFromUp23(this,card4);
        View card5 =findViewById(R.id.card5);
        SlideAnimationUtil.slideInFromUp24(this,card5);
        View card6 =findViewById(R.id.card6);
        SlideAnimationUtil.slideInFromUp25(this,card6);

        View card7 =findViewById(R.id.card7);
        SlideAnimationUtil.slideInFromRight22(this,card7);
        View card8 =findViewById(R.id.card8);
        SlideAnimationUtil.slideInFromRight23(this,card8);
        View card9 =findViewById(R.id.card9);
        SlideAnimationUtil.slideInFromRight24(this,card9);


        View view8 = findViewById(R.id.d1);
        SlideAnimationUtil.slideInFromBottom21(this,view8);
        View view9 = findViewById(R.id.d2);
        SlideAnimationUtil.slideInFromBottom22(this,view9);
        View view10 = findViewById(R.id.d3);
        SlideAnimationUtil.slideInFromBottom22(this,view10);
    }
    public void card1(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card1view =findViewById(R.id.card1view);
        SlideAnimationUtil.fadehalfrepeat(this,card1);
        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);

        if (fan==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Fan On",Toast.LENGTH_SHORT);
            toast.show();
            fan=1;
            Intent intent = new Intent(InsideHouse.this , InsideButton.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_activity_start,R.anim.fade_activity_end);
            card1view.setBackgroundResource(R.drawable.layoutdot2on);
        }
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Fan Off",Toast.LENGTH_SHORT);
            toast.show();
            fan=0;
            card1view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }
    public void card2(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card2view =findViewById(R.id.card2view);
        SlideAnimationUtil.fadehalfrepeat(this,card2);

        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);

        if (fridge==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Fridge On",Toast.LENGTH_SHORT);
            toast.show();
            fridge=1;
            Intent intent = new Intent(InsideHouse.this , InsideButtonHorizontal.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fade_activity_start,R.anim.fade_activity_end);
            card2view.setBackgroundResource(R.drawable.layoutdot2on);}
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Fridge Off",Toast.LENGTH_SHORT);
            toast.show();
            fridge=0;
            card2view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }
    public void card3(View view){
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card1 = findViewById(R.id.card1);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card3view =findViewById(R.id.card3view);
        SlideAnimationUtil.fadehalfrepeat(this,card3);


        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);
        if (pc==0){
            Toast toast =Toast.makeText(getApplicationContext(),"PC On",Toast.LENGTH_SHORT);
            toast.show();
            pc=1;
            card3view.setBackgroundResource(R.drawable.layoutdot2on);}
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"PC Off",Toast.LENGTH_SHORT);
            toast.show();
            pc=0;
            card3view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }
    public void card4(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card4view =findViewById(R.id.card4view);
        SlideAnimationUtil.fadehalfrepeat(this,card4);


        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);
        if (bedroom==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Bedroom Lights On",Toast.LENGTH_SHORT);
            toast.show();
            bedroom=1;
            card4view.setBackgroundResource(R.drawable.layoutdot3on);}
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Bedroom Lights Off",Toast.LENGTH_SHORT);
            toast.show();
            bedroom=0;
            card4view.setBackgroundResource(R.drawable.layoutdot3);
        }
    }
    public void card5(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card5view =findViewById(R.id.card5view);
        SlideAnimationUtil.fadehalfrepeat(this,card5);

        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);
        if (living==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Living Room Lights On",Toast.LENGTH_SHORT);
            toast.show();
            living=1;
            card5view.setBackgroundResource(R.drawable.layoutdot3on);
        }
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Living Room Lights Off",Toast.LENGTH_SHORT);
            toast.show();
            living=0;
            card5view.setBackgroundResource(R.drawable.layoutdot3);
        }
    }
    public void card6(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card6view =findViewById(R.id.card6view);
        SlideAnimationUtil.fadehalfrepeat(this,card6);


        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);
        if (kitchen==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Kitchen Lights On",Toast.LENGTH_SHORT);
            toast.show();
            kitchen=1;
            card6view.setBackgroundResource(R.drawable.layoutdot3on);}
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Kitchen Lights Off",Toast.LENGTH_SHORT);
            toast.show();
            kitchen=0;
            card6view.setBackgroundResource(R.drawable.layoutdot3);
        }
    }
    public void card7(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card7view =findViewById(R.id.card7view);
        SlideAnimationUtil.fadehalfrepeat(this,card7);

        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card9);
        if (tv==0){
            Toast toast =Toast.makeText(getApplicationContext(),"TV On",Toast.LENGTH_SHORT);
            toast.show();
            tv=1;
            card7view.setBackgroundResource(R.drawable.layoutdot2on);
        }
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"TV Off",Toast.LENGTH_SHORT);
            toast.show();
            tv=0;
            card7view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }
    public void card8(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card8view =findViewById(R.id.card8view);
        SlideAnimationUtil.fadehalfrepeat(this,card8);

        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card7);
        SlideAnimationUtil.fadehalf(this , card9);
        if (cloth==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Washing Machine On",Toast.LENGTH_SHORT);
            toast.show();
            cloth=1;
            card8view.setBackgroundResource(R.drawable.layoutdot2on);
        }
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Washing Machine Off",Toast.LENGTH_SHORT);
            toast.show();
            cloth=0;
            card8view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }
    public void card9(View view){
        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        View card5 = findViewById(R.id.card5);
        View card6 = findViewById(R.id.card6);
        View card7 = findViewById(R.id.card7);
        View card8 = findViewById(R.id.card8);
        View card9 = findViewById(R.id.card9);
        View card9view =findViewById(R.id.card9view);
        SlideAnimationUtil.fadehalfrepeat(this,card9);

        SlideAnimationUtil.fadehalf(this , card1);
        SlideAnimationUtil.fadehalf(this , card2);
        SlideAnimationUtil.fadehalf(this , card3);
        SlideAnimationUtil.fadehalf(this , card4);
        SlideAnimationUtil.fadehalf(this , card5);
        SlideAnimationUtil.fadehalf(this , card6);
        SlideAnimationUtil.fadehalf(this , card8);
        SlideAnimationUtil.fadehalf(this , card7);
        if (geyser==0){
            Toast toast =Toast.makeText(getApplicationContext(),"Geyser On",Toast.LENGTH_SHORT);
            toast.show();
            geyser=1;
            card9view.setBackgroundResource(R.drawable.layoutdot2on);
        }
        else{
            Toast toast =Toast.makeText(getApplicationContext(),"Geyser Off",Toast.LENGTH_SHORT);
            toast.show();
            geyser=0;
            card9view.setBackgroundResource(R.drawable.layoutdot2);
        }
    }

    public void back(View view){
        Intent intent = new Intent( this, Houses.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Houses.class);
        startActivity(intent);
    }
}

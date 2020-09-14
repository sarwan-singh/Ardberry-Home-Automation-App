package com.example.ardberrylayouthome;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class InsideButton extends AppCompatActivity {

    private boolean status = true;

    private int initial_state,final_state, difference_state,delay_number;

    String url  = "http://192.168.1.1/specificArgs"+"?"+"slider1=";

    String temp = url;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String tempNumber = "temp";


    private int progressMain = 0 ;
    String[] urls = {
            "https://www.iconeye.com/images/2016/01/harbin_1.jpg",
            "http://www.iflarchitecture.com/wp-content/uploads/2016/04/harbin-opera-house_mad-architects_beijing_hufton-crow_dezeen_sq.jpg",
            "https://www.archute.com/wp-content/uploads/2016/08/Harbin-Opera-House-China-MAD-architects_archute-19.jpg",
            "https://www.architectural-review.com/pictures/980x653fitpad/0/1/2/1456012_Harbin_Opera_House_MAD_Hufton_Crow_Slide_1.jpg",
            "http://www.abitare.it/wp-content/uploads/2015/11/MAD-OPERA-HOUSE_88_001_Harbin_218.jpg",
            "https://www.designboom.com/cms/images/ridnew/cairo02.jpg",
            "https://www.phaidon.com/resource/mei1.jpg",
            "https://www.designboom.com/cms/images/ridnew/cairo01.jpg",
            "https://i.ytimg.com/vi/30N1fZ5oRrk/hqdefault.jpg",
            "https://images.adsttc.com/media/images/55f6/e51a/adbc/01bd/4b00/0288/large_jpg/1228225124_zha-cairo-expo-city-05.jpg?1442243840",
            "http://2.bp.blogspot.com/_S5Lk_3IhICU/TTB0Y600HKI/AAAAAAAAAww/EKm9H8meSAM/s400/1683573_ZHA_Cairo%252520Expo%252520City_Site%25252002.jpg",
            "https://static.dezeen.com/uploads/2016/03/Hufton-Crow_London-Aquatics-Centre_Zaha-Hadid_dezeen_784_3.jpg",
            "https://theresident.wpms.greatbritishlife.co.uk/wp-content/uploads/sites/10/2017/03/Zaha-Hadid-Olympic.jpg",
            "https://lh3.googleusercontent.com/kDe3PGhZDNKR2D1b19cpCTMC0ZjSkCWxQuV9k9oDg3YAofhYLXrLvo6V_ZyjHIA",
            "http://www.urukia.com/wp-content/uploads/2012/02/Bogota-International-Convention-Centre-ZHA-urukia-05a.jpg",
            "https://static.dezeen.com/uploads/2016/03/Hufton-Crow_London-Aquatics-Centre_Zaha-Hadid_dezeen_784_3.jpg",
            "https://lh3.googleusercontent.com/kDe3PGhZDNKR2D1b19cpCTMC0ZjSkCWxQuV9k9oDg3YAofhYLXrLvo6V_ZyjHIA",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/London_Olympic_Aquatic_Centre_%281%29.jpg/862px-London_Olympic_Aquatic_Centre_%281%29.jpg",
            "https://static.dezeen.com/uploads/2014/07/Heydar-Aliyev-Centre-by-Zaha-Hadid_dezeen.jpg",
            "https://avatars.mds.yandex.net/get-pdb/245485/32df05b6-5ddb-4c02-884d-77bc067c3936/orig",
            "https://i.pinimg.com/236x/d7/29/e1/d729e193b5432d0a121a55eff8907ff4--building-structure-hadid-architect.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_button);
        SeekBar seekBar = findViewById(R.id.seek_bar);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        int a = sharedPreferences.getInt(tempNumber,0);
        progressMain = a;


        View view1 = findViewById(R.id.u1);
        SlideAnimationUtil.slideInFromUp1(this, view1);

        View view2 = findViewById(R.id.heading_button);
        SlideAnimationUtil.slideInFromUp2(this, view2);

        View view3 = findViewById(R.id.image_button_layout);
        SlideAnimationUtil.fadeMain1(this, view3);
//
//        SlideAnimationUtil.fadeMain2(this, seekBar);

        View view4 = findViewById(R.id.statusImage);
        SlideAnimationUtil.fadeMain3(this,view4);

        View view5 = findViewById(R.id.status);
        SlideAnimationUtil.fadeMain3(this,view5);

        View view6 = findViewById(R.id.d1);
        SlideAnimationUtil.slideInFromDown1(this, view6);

        View view7 =findViewById(R.id.d2);
        SlideAnimationUtil.slideInFromDown2(this,view7);

        final WebView webView = findViewById(R.id.webView);
        webView.loadUrl(url);

        seekActivity(progressMain,seekBar);


        webView.setVisibility(View.GONE);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(20);
                if (progress == 0){
                    seekActivity(0,seekBar);
                }
                if (progress == 1){
                    seekActivity(1,seekBar);
                }
                if (progress == 2){
                    seekActivity(2,seekBar);
                }
                if (progress == 3){
                    seekActivity(3,seekBar);
                }
                if (progress == 4){
                    seekActivity(4,seekBar);
                }
                if (progress == 5){
                    seekActivity(5,seekBar);
                }
                if (progress == 6){
                    seekActivity(6,seekBar);
                }
                if (progress == 7){
                    seekActivity(7,seekBar);
                }
                if (progress == 8){
                    seekActivity(8,seekBar);
                }
                if (progress == 9){
                    seekActivity(9,seekBar);
                }
                if (progress == 10){
                    seekActivity(10,seekBar);
                }
                if (progress == 11){
                    seekActivity(11,seekBar);
                }
                if (progress == 12){
                    seekActivity(12,seekBar);
                }
                if (progress == 13){
                    seekActivity(13,seekBar);
                }
                if (progress == 14){
                    seekActivity(14,seekBar);
                }
                if (progress == 15){
                    seekActivity(15,seekBar);
                }
                if (progress == 16){
                    seekActivity(16,seekBar);
                }
                if (progress == 17){
                    seekActivity(17,seekBar);
                }
                if (progress == 18){
                    seekActivity(18,seekBar);
                }
                if (progress == 19){
                    seekActivity(19,seekBar);
                }
                if (progress == 20){
                    seekActivity(20,seekBar);
                }
                progressMain = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(),"Changing angle", (int) (Toast.LENGTH_SHORT*0.5)).show();
                initial_state = seekBar.getProgress();

            }

            @Override
            public void onStopTrackingTouch(final SeekBar seekBar) {

               Toast.makeText(getApplicationContext(),"Angle = " + seekBar.getProgress()*18 + "" , (int) (Toast.LENGTH_SHORT*0.5)).show();
               final_state = seekBar.getProgress();

               difference_state = final_state - initial_state;



                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();


                editor.putInt(tempNumber,final_state);

                editor.apply();


                url = url + difference_state;


                webView.loadUrl(url);     //uploading to arduino


                Log.v("difference","" + url);


                url = temp;

                delay_number = difference_state;

                Log.v("delay" ," delay = " + delay_number + "seconds");



                seekBar.setAlpha(0.2f);
                seekBar.setEnabled(false);
                if (delay_number<0) {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                        seekBar.setAlpha(0.5f);
                        seekBar.setEnabled(true);
                        }
                    }, 500*(-delay_number));

                }else {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            seekBar.setAlpha(0.5f);
                            seekBar.setEnabled(true);
                        }
                    }, 500*(delay_number));

                }
            }
        });
    }

    public void switchButton(View view){


        TextView statusText = findViewById(R.id.status);
        ImageView statusImage = findViewById(R.id.statusImage);
        ImageView mainImage = findViewById(R.id.image_button_layout);
        SeekBar seekBar = findViewById(R.id.seek_bar);
        if (status == true){
            statusText.setText("Off");
            status = false;
            statusImage.setImageResource(R.drawable.off3);
            seekBar.setVisibility(View.GONE);
            Glide.with(this).load(urls[0]).into(mainImage);
        }
        else{
            statusText.setText("On");
            status = true;
            statusImage.setImageResource(R.drawable.on3);
            seekBar.setVisibility(View.VISIBLE);
            Glide.with(this).load(urls[progressMain]).into(mainImage);
        }

    }



    public void seekActivity(int progress,SeekBar seekBar){
        ImageView mainImage = findViewById(R.id.image_button_layout);
        seekBar.setProgress(progress);
        Glide.with(seekBar).load(urls[progress]).into(mainImage);
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(InsideButton.this,InsideHouse.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start,R.anim.fade_activity_end);
    }

}

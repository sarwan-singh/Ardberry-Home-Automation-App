package com.example.ardberrylayouthome;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    float x1,x2,y1,y2;
    private long startClickTime;
    int child_number;
    View child,first_child;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View view1 = findViewById(R.id.controlRoom);
        SlideAnimationUtil.fadeMain1(this,view1);
        View view2 =findViewById(R.id.flipper2);
        SlideAnimationUtil.fadeMain2(this,view2);

        View view3 = findViewById(R.id.flipper1);
        SlideAnimationUtil.fadeMain3(this,view3);

        View view4 = findViewById(R.id.ardberryTextmain);
        SlideAnimationUtil.fadeMain4(this,view4);

        View view5 = findViewById(R.id.homeTextmain);
        SlideAnimationUtil.fadeMain5(this,view5);



    }




    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onResume() {
        super.onResume();
        Context context = this;

        //loading images form online urls
        ImageView img1= findViewById(R.id.image1);
        ImageView img2= findViewById(R.id.image2);
        ImageView img3= findViewById(R.id.image3);
        ImageView img4= findViewById(R.id.image4);
        ImageView img5= findViewById(R.id.image5);
        ImageView img6= findViewById(R.id.image6);
        ImageView img7= findViewById(R.id.image7);
        ImageView img8= findViewById(R.id.image8);
        ImageView img9= findViewById(R.id.image9);
        ImageView img10= findViewById(R.id.image10);
        ImageView img11= findViewById(R.id.image11);
        ImageView img12= findViewById(R.id.image12);
        ImageView img13= findViewById(R.id.image13);
        ImageView img14= findViewById(R.id.image14);
        ImageView img15= findViewById(R.id.image15);
        ImageView img16= findViewById(R.id.image16);
        ImageView img17= findViewById(R.id.image17);
        ImageView img18= findViewById(R.id.image18);
        ImageView img19= findViewById(R.id.image19);
        ImageView img20= findViewById(R.id.image20);
        ImageView img21= findViewById(R.id.image21);
        ImageView img22= findViewById(R.id.image22);
        ImageView img23= findViewById(R.id.image23);
        ImageView img24= findViewById(R.id.image24);
        ImageView img25= findViewById(R.id.image25);
        ImageView img26= findViewById(R.id.image26);
        ImageView img27= findViewById(R.id.image27);
        ImageView img28= findViewById(R.id.image28);
        ImageView img29= findViewById(R.id.image29);
        ImageView img30= findViewById(R.id.image30);
        ImageView img31= findViewById(R.id.image31);
        ImageView img32= findViewById(R.id.image32);
        ImageView img33= findViewById(R.id.image33);
        ImageView img34= findViewById(R.id.image34);
        ImageView img35= findViewById(R.id.image35);
        ImageView img36= findViewById(R.id.image36);
        ImageView img37= findViewById(R.id.image37);
        ImageView img38= findViewById(R.id.image38);
        ImageView img39= findViewById(R.id.image39);

        String[] urls ={
                "https://images.adsttc.com/media/images/5452/db24/e58e/ce64/0100/0105/newsletter/52852152e8e44e8e7200015f_heydar-aliyev-center-zaha-hadid-architects_hac_exterior_photo_by_hufton_crow_-1-.jpg?1414716185",
                "https://images.adsttc.com/media/images/5015/552a/28ba/0d02/f000/0de7/slideshow/stringio.jpg?1414488078",
                "https://img.newatlas.com/zha-admiral-serebryakov-embankment-5.jpg?auto=format%2Ccompress&ch=Width%2CDPR&fit=crop&h=347&q=60&rect=445%2C0%2C1449%2C815&w=616&s=ab3e90d68e7c98f0b11b6dadc748b4d4",
                "","https://i.pinimg.com/originals/78/95/f8/7895f87f7fbcc0ca13495303119fa463.jpg",
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
                "http://studioparametric.com/images/museum/Picture27.jpg",
                "https://images.adsttc.com/media/images/5015/552a/28ba/0d02/f000/0de7/slideshow/stringio.jpg?1414488078",
                "https://images.adsttc.com/media/images/5008/f427/28ba/0d27/a700/0ec6/large_jpg/stringio.jpg?1414380521",
                "https://cdnassets.hw.net/f0/44/686beb714b40a1f1b971eee0f77a/grandviewaquatics-fastepp-exterior.jpg",
                "https://files1.structurae.de/files/photos/5256/2018-07-24/dsc00201.jpeg",
                "https://2luxury2-fw79xuz8ihfc3ku.netdna-ssl.com/wp-content/uploads/London-Olympics-Aquatics-Centre.jpg?x31591",
                "https://www.architectural-review.com/pictures/980x653fitpad[31]/5/9/8/1229598_studiogang.jpg",
                "https://evermotion.org/files/publications_images/sl_00417_1_2.jpg",
                "http://www.cgarchitect.com/content/portfolioitems/2015/03/111034/octavtirziucom-zaha-hadid-cultural-baku_1_large.jpg",
                "https://www.mydearhome.com/wp-content/uploads/2017/03/0903_DB.jpg",
                "https://archinect.imgix.net/uploads/ij/ijwyoizzt0uye2i0.jpg?fit=crop&auto=compress%2Cformat&w=1500",
                "https://pbs.twimg.com/media/D41rTt1WwAEt4Rt.jpg",
                "https://www.world-architects.com/img/frontend/pages/2180/hadid-soho.jpg",
                "http://covetedition.com/wp-content/uploads/2015/09/coveted-Top-Interior-Designers-Zaha-Hadid-architecture.jpg",
                "https://i.pinimg.com/236x/d7/29/e1/d729e193b5432d0a121a55eff8907ff4--building-structure-hadid-architect.jpg"
        };

        Glide.with(this).load(urls[0]).into(img1);
        Glide.with(this).load(urls[1]).into(img2);
        Glide.with(this).load(urls[2]).into(img3);

        Glide.with(this).load(urls[4]).into(img4);
        Glide.with(this).load(urls[5]).into(img5);
        Glide.with(this).load(urls[6]).into(img6);
        Glide.with(this).load(urls[7]).into(img7);
        Glide.with(this).load(urls[8]).into(img8);
        Glide.with(this).load(urls[9]).into(img9);

        Glide.with(this).load(urls[10]).into(img10);
        Glide.with(this).load(urls[11]).into(img11);
        Glide.with(this).load(urls[12]).into(img12);
        Glide.with(this).load(urls[13]).into(img13);
        Glide.with(this).load(urls[14]).into(img14);
        Glide.with(this).load(urls[15]).into(img15);

        Glide.with(this).load(urls[16]).into(img16);
        Glide.with(this).load(urls[17]).into(img17);
        Glide.with(this).load(urls[18]).into(img18);
        Glide.with(this).load(urls[19]).into(img19);
        Glide.with(this).load(urls[20]).into(img20);
        Glide.with(this).load(urls[21]).into(img21);

        Glide.with(this).load(urls[22]).into(img22);
        Glide.with(this).load(urls[23]).into(img23);
        Glide.with(this).load(urls[24]).into(img24);
        Glide.with(this).load(urls[25]).into(img25);
        Glide.with(this).load(urls[26]).into(img26);
        Glide.with(this).load(urls[27]).into(img27);

        Glide.with(this).load(urls[28]).into(img28);
        Glide.with(this).load(urls[29]).into(img29);
        Glide.with(this).load(urls[30]).into(img30);
        Glide.with(this).load(urls[31]).into(img31);
        Glide.with(this).load(urls[32]).into(img32);
        Glide.with(this).load(urls[33]).into(img33);

        Glide.with(this).load(urls[34]).into(img34);
        Glide.with(this).load(urls[35]).into(img35);
        Glide.with(this).load(urls[36]).into(img36);

        Glide.with(this).load(urls[37]).into(img37);
        Glide.with(this).load(urls[38]).into(img38);
        Glide.with(this).load(urls[39]).into(img39);


        //flipper for images
        ViewFlipper flipperImages = findViewById(R.id.flipper1);
        Animation inImage = AnimationUtils.loadAnimation(this,R.anim.slide_from_out_fade);
        Animation outImage = AnimationUtils.loadAnimation(this,R.anim.slide_to_in_fade);
        flipperImages.setInAnimation(inImage);
        flipperImages.setOutAnimation(outImage);
        flipperImages.setFlipInterval(5000);
        flipperImages.setAutoStart(true);



        //flipper for quotes
        ViewFlipper flipperQuotes = findViewById(R.id.flipper2);
        Animation outQuote = AnimationUtils.loadAnimation(this,R.anim.fade_out_quote);
        flipperQuotes.setOutAnimation(outQuote);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ViewFlipper flipperQuotes = findViewById(R.id.flipper2);
                Animation inQuote = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_quote);
                flipperQuotes.setInAnimation(inQuote);

            }
        }, 800);
        flipperQuotes.setFlipInterval(6000);
        flipperQuotes.setAutoStart(true);




        //flipper for gallery1
        final ViewFlipper flipperGallery1 = findViewById(R.id.flippergallery1);
        flipperGallery1.setFlipInterval(1600);
        flipperGallery1.setAutoStart(false);
        child_number=0;
        flipperGallery1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery1.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery1.setInAnimation(inImagegallery);
                    flipperGallery1.setOutAnimation(outImagegallery);
                    flipperGallery1.setDisplayedChild(child_number+1);
                    flipperGallery1.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery1.getDisplayedChild();
                    flipperGallery1.clearAnimation();
                    flipperGallery1.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery1.getDisplayedChild();
                    flipperGallery1.clearAnimation();
                    flipperGallery1.stopFlipping();
                }
                return true;
            }
        });


        //flipper for gallery2
        final ViewFlipper flipperGallery2 = findViewById(R.id.flippergallery2);
        flipperGallery2.setFlipInterval(1500);
        flipperGallery2.setAutoStart(false);
        child_number=0;
        flipperGallery2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery2.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery2.setInAnimation(inImagegallery);
                    flipperGallery2.setOutAnimation(outImagegallery);
                    flipperGallery2.setDisplayedChild(child_number+1);
                    flipperGallery2.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery2.getDisplayedChild();
                    flipperGallery2.clearAnimation();
                    flipperGallery2.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery2.getDisplayedChild();
                    flipperGallery2.clearAnimation();
                    flipperGallery2.stopFlipping();
                }
                return true;
            }
        });

        //flipper for gallery3
        final ViewFlipper flipperGallery3 = findViewById(R.id.flippergallery3);
        flipperGallery3.setFlipInterval(1500);
        flipperGallery3.setAutoStart(false);
        child_number=0;
        flipperGallery3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery3.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery3.setInAnimation(inImagegallery);
                    flipperGallery3.setOutAnimation(outImagegallery);
                    flipperGallery3.setDisplayedChild(child_number+1);
                    flipperGallery3.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery3.getDisplayedChild();
                    flipperGallery3.clearAnimation();
                    flipperGallery3.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery3.getDisplayedChild();
                    flipperGallery3.clearAnimation();
                    flipperGallery3.stopFlipping();
                }
                return true;
            }
        });

        //flipper for gallery4
        final ViewFlipper flipperGallery4 = findViewById(R.id.flippergallery4);
        flipperGallery4.setFlipInterval(1500);
        flipperGallery4.setAutoStart(false);
        child_number=0;
        flipperGallery4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery4.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery4.setInAnimation(inImagegallery);
                    flipperGallery4.setOutAnimation(outImagegallery);
                    flipperGallery4.setDisplayedChild(child_number+1);
                    flipperGallery4.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery4.getDisplayedChild();
                    flipperGallery4.clearAnimation();
                    flipperGallery4.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery4.getDisplayedChild();
                    flipperGallery4.clearAnimation();
                    flipperGallery4.stopFlipping();
                }
                return true;
            }
        });

        //flipper for gallery5
        final ViewFlipper flipperGallery5 = findViewById(R.id.flippergallery5);
        flipperGallery5.setFlipInterval(1500);
        flipperGallery5.setAutoStart(false);
        child_number=0;
        flipperGallery5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery5.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery5.setInAnimation(inImagegallery);
                    flipperGallery5.setOutAnimation(outImagegallery);
                    flipperGallery5.setDisplayedChild(child_number+1);
                    flipperGallery5.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery5.getDisplayedChild();
                    flipperGallery5.clearAnimation();
                    flipperGallery5.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery5.getDisplayedChild();
                    flipperGallery5.clearAnimation();
                    flipperGallery5.stopFlipping();
                }
                return true;
            }
        });

        //flipper for gallery6
        final ViewFlipper flipperGallery6 = findViewById(R.id.flippergallery6);
        flipperGallery6.setFlipInterval(1500);
        flipperGallery6.setAutoStart(false);
        child_number=0;
        flipperGallery6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {
                    x1=arg1.getX();
                    y1=arg1.getY();
                    first_child = flipperGallery6.getChildAt(0);
                    startClickTime=System.currentTimeMillis();
                    Animation inImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_down);
                    Animation outImagegallery = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_gallery_up);
                    flipperGallery6.setInAnimation(inImagegallery);
                    flipperGallery6.setOutAnimation(outImagegallery);
                    flipperGallery6.setDisplayedChild(child_number+1);
                    flipperGallery6.startFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_CANCEL) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery6.getDisplayedChild();
                    flipperGallery6.clearAnimation();
                    flipperGallery6.stopFlipping();
                }
                if (arg1.getAction() == MotionEvent.ACTION_UP) {
                    x2=arg1.getX();
                    y2=arg1.getY();
                    child_number=flipperGallery6.getDisplayedChild();
                    flipperGallery6.clearAnimation();
                    flipperGallery6.stopFlipping();
                }
                return true;
            }
        });

        findViewById(R.id.facebookiconmain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/ardberry.ml/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.instagramiconmain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/ardberrytechnology/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.twittericonmain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.twitter.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        findViewById(R.id.linkediniconmain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/company/ardberrytechnology/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    public void controlRoom(View view){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }

    public  void openArdberry(View view){
        Intent intent = new Intent(MainActivity.this, ArdberryLayout.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right_fade, R.anim.slide_to_left_fade);
    }
    @Override
    public void onBackPressed() {
        finishAffinity();
    }



}

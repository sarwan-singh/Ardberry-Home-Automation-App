package com.example.ardberrylayouthome;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ArdberryLayout extends AppCompatActivity implements OnMapReadyCallback {


    float x1,x2,y1,y2;
    private long startClickTime;
    private GoogleMap mMap;
    int child_number;
    private StorageReference mStorageRef;
    private DatabaseReference mDatabaseRef;
    View child,first_child;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("uploads/photo1.jpeg");
    StorageReference storageReference2 = FirebaseStorage.getInstance().getReference().child("uploads/photo2.jpeg");
    StorageReference storageReference3 = FirebaseStorage.getInstance().getReference().child("uploads/photo3.jpeg");
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ardberry_layout);
        TextView textDiscription = findViewById(R.id.textDiscriptionArdberry);
        textDiscription.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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


    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1<x2){
                Intent i = new Intent(ArdberryLayout.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_from_left_fade, R.anim.slide_to_right_fade);
            }
            break;
        }
        return false;
    }


    @Override
    protected void onResume() {
        super.onResume();

        //loading images from online urls
        ImageView img1 = findViewById(R.id.image1);
        ImageView img2 = findViewById(R.id.image2);
        ImageView img3 = findViewById(R.id.image3);
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

        String[] urls = {
                "https://firebasestorage.googleapis.com/v0/b/ardberryt.appspot.com/o/uploads%2Fphoto1.jpg?alt=media&token=cf1b8af0-9472-414d-82c4-c25b315b5c56",
                "https://firebasestorage.googleapis.com/v0/b/ardberryt.appspot.com/o/uploads%2Fphoto2.jpg?alt=media&token=cb9ff269-0ccd-4fe6-9030-631ad7f43d6d",
                "https://firebasestorage.googleapis.com/v0/b/ardberryt.appspot.com/o/uploads%2Fphoto3.jpg?alt=media&token=9adb448a-f395-4db1-8dd1-4fe810bcbac1","",
                "https://s3-eu-central-1.amazonaws.com/centaur-wp/theengineer/prod/content/uploads/2017/09/13180125/Heydar-Aliyev-Cultural-Centre.jpg",
                "https://static.thousandwonders.net/Heydar.Aliyev.Center.original.35427.jpg",
                "https://www.researchgate.net/profile/Rodrigo_Tavares6/publication/309211816/figure/fig19/AS:418483469864961@1476785642325/FIGURA-20-Heydar-Aliyev-Cultural-Centre-2012.png",
                "http://www.bakuexplorer.com/wp-content/uploads/2016/02/main_center.jpg",
                "http://www.designcurial.com/Uploads/NewsArticle/4169053/main.jpg",
                "https://assets.atlasobscura.com/media/W1siZiIsInVwbG9hZHMvcGxhY2VfaW1hZ2VzLzU0YjVlNWJjNDgwNDQ4NzBiYV8zMDU5OTczMTg2Ml8xN2M3MWJiNTMyX28uanBnIl0sWyJwIiwidGh1bWIiLCJ4MzkwPiJdLFsicCIsImNvbnZlcnQiLCItcXVhbGl0eSA4MSAtYXV0by1vcmllbnQiXV0/30599731862_17c71bb532_o.jpg",
                "http://www.bocadolobo.com/en/inspiration-and-ideas/wp-content/uploads/2017/09/borjes-chapel-2.jpg",
                "https://images.adsttc.com/media/images/58cb/1ce3/e58e/cec1/a900/035c/large_jpg/Bosjes__002.jpg?1489706204",
                "http://hellopictures.co.za/wp-content/uploads/2017/05/Bosjes-45-800x800.jpg",
                "https://i.imgur.com/UowlMn4.jpg",
                "http://www.eatout.co.za/wp-content/uploads/2017/01/BOSJES-Kombuis-HR-by-Adam-Letch-2_preview-2.jpeg",
                "https://mir-s3-cdn-cf.behance.net/projects/404/113cd053804103.Y3JvcCwxOTIyLDE1MDQsNzM1LDA.png",
                "https://media2.zipcar.com/drupal-presales/files/1_fi_NapoliAfragolaRailway-v1_0.jpg",
                "https://makearchitecture.com.au/cms_images/170207%20House%20to%20catch%200532+0535%20web_4035.jpg",
                "https://image.architonic.com/imgArc/project-1/4/5210405/inspiration-group-a-home-without-boundary-architonic-13-02.jpg",
                "https://static.dezeen.com/uploads/2018/02/hunter-house-the-boundary-architecture-hotels-usa-desert-_dezeen_1704_col_15-852x523.jpg",
                "https://blog.broadwayrealty.com/wp-content/uploads/2018/03/ZahaHadidInterior1_2000px.jpg",
                "https://cdn.vox-cdn.com/thumbor/-KFmLCuD66V1LAn5eNzLWJ_Z42M=/0x0:2000x1232/1200x800/filters:focal(840x456:1160x776)/cdn.vox-cdn.com/uploads/chorus_image/image/60742029/SFrances_180710_5170_A.0.jpg",
                "https://archinect.imgix.net/uploads/jr/jru3igf0pp50mway.jpg?auto=compress%2Cformat",
                "https://images.adsttc.com/media/images/5a7a/4c1f/f197/cc81/4500/0110/slideshow/07_FREYMING-MERLEBACH_%C2%A9Eugeni_Pons.jpg?1517964283",
                "https://static.dezeen.com/uploads/2017/12/institute-for-contemporary-art-virginia-commonwealth-university-steven-holl-architecture-usa_dezeen_2364_sq-2.jpg",
                "https://images.adsttc.com/media/images/5163/90c5/b3fc/4b9d/4f00/02d5/newsletter/Ext05_vue_g%C3%A9n%C3%A9rale_am%C3%A9ricaine.jpg?1365479585",
                "https://i.ytimg.com/vi/l9ZqRtvpT5E/maxresdefault.jpg",
                "https://i.ytimg.com/vi/Z5_mFd-9y1M/maxresdefault.jpg",
                "data:image/jpeg;base64,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",
                "https://d2v9y0dukr6mq2.cloudfront.net/video/thumbnail/9QnrhD8/timelapse-view-of-oscar-niemeyer-museum-aka-mon-in-curitiba-brazil-zoom-in_v3dpgrsll__F0014.png",
                "https://travelguide.michelin.com/sites/default/files/styles/poi_slideshow_big/public/images/travel_guide/NX-24014.jpg?itok=cQ1YuObE",
                "https://upload.wikimedia.org/wikipedia/commons/1/1e/Museu_Oscar_Niemeyer_2_Curitiba_Brasil.jpg",
                "https://www.thoughtco.com/thmb/Vsni9TkNn6qA-iZhRVPb_eWr4Ow=/4658x3080/filters:no_upscale():max_bytes(150000):strip_icc()/Oscar-Niemeyer-Museum-Curitiba-85579041-crop-56fafec93df78c78419d23d8.jpg",
                "https://travelguide.michelin.com/sites/default/files/styles/poi_slideshow/public/images/travel_guide/voyage_media-NX-24014/museu-oscar-niemeyer.jpg",
                "https://www.e-architect.co.uk/images/jpgs/brazil/mac_niemeyer_m071211_7.jpg",
                "https://hk.louisvuitton.com/images/is/image/lv/1/VE_DI3_M/louis-vuitton--Louis_Vuitton_Cruise2017_Announce_1_DI3.jpg?wid=1000&hei=562",
                "https://champ-magazine.com/wp-content/uploads/2017/07/niteroi-5-1280x0-c-default.jpg",
                "https://abrilvejasp.files.wordpress.com/2016/11/foyer_foto-sergio-castro.jpeg?quality=70&strip=info&w=920",
                "https://upload.wikimedia.org/wikipedia/commons/d/d2/Aviles_-_Centro_Cultural_Internacional_Oscar_Niemeyer_55.jpg",
                "http://sentirosario.com/wp-content/uploads/2017/06/SAN-PABLO-AUDITORIO-IBIRAPUERA.jpg"
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
        Animation inImage = AnimationUtils.loadAnimation(this, R.anim.fade_ardberry_slide_in);
        Animation outImage = AnimationUtils.loadAnimation(this, R.anim.fade_ardberry_slide_out);
        flipperImages.setInAnimation(inImage);
        flipperImages.setOutAnimation(outImage);
        flipperImages.setFlipInterval(4000);
        flipperImages.setAutoStart(true);


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

    }


    public void openHome(View view){
        Intent intent = new Intent(ArdberryLayout.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left_fade, R.anim.slide_to_right_fade);

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ArdberryLayout.this,MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_left_fade, R.anim.slide_to_right_fade);
    }
    public  void openArdberry(View view){
        Intent intent = new Intent(ArdberryLayout.this, ArdberryLayout.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_activity_start, R.anim.fade_activity_end);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Ardberry Technology Pvt. Ltd. and move the camera
        LatLng Ardberry = new LatLng(26.868173, 75.818271);
        mMap.addMarker(new MarkerOptions().position(Ardberry).title("Marker in Ardberry Technology Pvt. Ltd.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Ardberry,11F));
    }

}

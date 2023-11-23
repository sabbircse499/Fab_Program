package com.fabred.fabprogram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //AdView mAdView;
    GridView mainGrid;
    SharedPreferences sharedPreferences;
    TextView tvScore;
    BottomNavigationView nav_bar;
    FrameLayout fragment;
    ScrollView linearlayout, linear_prgram;

    SharedPreferences.Editor editor;

    androidx.cardview.widget.CardView cpp, java, py, js,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  mAdView = findViewById(R.id.adView);
        mainGrid = findViewById(R.id.mainGrid);
        tvScore = findViewById(R.id.tvScore);
        nav_bar = findViewById(R.id.nav_bar);

        linear_prgram = findViewById(R.id.linear_prgram);
        linearlayout = findViewById(R.id.linearlayout);

        cpp = findViewById(R.id.cpp);
        java = findViewById(R.id.java);
        py = findViewById(R.id.py);
        js = findViewById(R.id.js);
        c=findViewById(R.id.c);

        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);


        tributeToAdor();


        //calling a method to create our question bank with ans
        QuestionCollection.createQuestionBank();

        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
           // loadBannerAd();
            loadFullscreenAd();
        }


        MyAdapter adapter = new MyAdapter();
        //mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();


        String lastScore = sharedPreferences.getString("savedScore", "No Data");
        tvScore.setText(lastScore);

        //========================================================

        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        editor= sharedPreferences.edit();
        //=======================================================


        nav_bar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.nav_home){

                    linearlayout.setVisibility(View.GONE);
                    //li_frag.setVisibility(View.VISIBLE);
                    linear_prgram.setVisibility(View.VISIBLE);

                }
                if(item.getItemId()==R.id.nav_about){
                    linearlayout.setVisibility(View.VISIBLE);

                    linear_prgram.setVisibility(View.GONE);


                }



                return true;
            }
        });
        //=================
        final String langulage[] = {""};

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                langulage[0] = "c";
                editor.putString("language",langulage[0]);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Program_Home.class));
                showInterstitial();
            }
        });




        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                langulage[0] = "cpp";
                editor.putString("language",langulage[0]);
                editor.commit();

                startActivity(new Intent(MainActivity.this, Program_Home.class));
                showInterstitial();
            }
        });
          java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                langulage[0] = "java";
                editor.putString("language","java");
                editor.commit();
                startActivity(new Intent(MainActivity.this, Program_Home.class));
                showInterstitial();
            }
        });
            py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("language","py");
                editor.commit();
                langulage[0] = "py";
                startActivity(new Intent(MainActivity.this, Program_Home.class));
                showInterstitial();
            }
        });
           js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("language","js");
                editor.commit();
                langulage[0] = "js";
                startActivity(new Intent(MainActivity.this, Program_Home.class));
                showInterstitial();
            }
        });




        //============

    }
    //==================================================================== onCreate Ends here
    //====================================================================



//============================================


    //===================================================









    // ================================================================
    // ================================================================

    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return QuestionCollection.questionBank.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> mHashMap =  QuestionCollection.subjectList.get(position);
            String subjectName = mHashMap.get("subjectName");
            String icon = mHashMap.get("icon");


            if (tvTitle!=null) tvTitle.setText(subjectName);
            if (imgIcon!=null && icon!=null) {
                int drawable = Integer.parseInt(icon);
                imgIcon.setImageResource( drawable );
            }

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_grid);
            animation.setStartOffset(position*400);
            convertView.startAnimation(animation);


            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    QuestionCollection.SUBJECT_NAME = subjectName;
                    QuestionCollection.question_list = QuestionCollection.questionBank.get(position);

                    Intent intent = new Intent(MainActivity.this, QuestionCollection.class);
                    startActivity(intent);

                    showInterstitial();

                }
            });



            return convertView;
        }
    }




    //=============================================
    //=============================================
    //=============================================












    private void initAdmobAd(){
        if (getString(R.string.device_id).length()>12){
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }
        //Init Admob Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



/*


    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=2){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=2){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
*/






    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // loadFullscreenAd method starts here.....
    InterstitialAd mInterstitialAd;
    int FULLSCREEN_AD_LOAD_COUNT=0;
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        FULLSCREEN_AD_LOAD_COUNT++;

                        if(FULLSCREEN_AD_LOAD_COUNT<3)
                            loadFullscreenAd();
                        Log.d("FULLSCREEN_AD", ""+FULLSCREEN_AD_LOAD_COUNT);

                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }
    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================





    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {

            Toast.makeText(getBaseContext(), "Press again to exit",
                    Toast.LENGTH_SHORT).show();
        }

        mBackPressed = System.currentTimeMillis();



    } // end of onBackpressed method

    //#############################################################################################



    //#############################################################################################
    //#############################################################################################
    private void tributeToAdor(){

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog_tribute);
                dialog.show();
                //TextView tvThanks = dialog.findViewById(R.id.tvThanks);
             /*   tvThanks.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });*/

            }
        }, 4000);


    }
}
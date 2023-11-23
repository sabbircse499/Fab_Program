package com.fabred.fabprogram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.Arrays;
import java.util.List;

public class Basic_To_Advance extends AppCompatActivity {
    ImageView imageView;
    SharedPreferences sharedPreferences;
    CardView basic, condition, datatype, loop, function,array, extras, string, opp;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_to_advance);
        imageView = findViewById(R.id.lan_img);
        basic = findViewById(R.id.basic);
        datatype = findViewById(R.id.data_type);
        condition = findViewById(R.id.conditon);
        loop = findViewById(R.id.loop);
        function = findViewById(R.id.function);
        array = findViewById(R.id.array);
        extras = findViewById(R.id.extras);
        string = findViewById(R.id.string);
        opp = findViewById(R.id.oop);

        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
         //   loadBannerAd();
            loadFullscreenAd();
        }


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);
        editor= sharedPreferences.edit();

         if(element.equals("c")){
            imageView.setImageResource(R.drawable.c);
        }

        else if(element.equals("cpp")){
            imageView.setImageResource(R.drawable.cpp);

        } else if (element.equals("java")) {
            imageView.setImageResource(R.drawable.java);


        }else if (element.equals("py")) {
            imageView.setImageResource(R.drawable.python);

        }else if (element.equals("js")) {
            imageView.setImageResource(R.drawable.js);


        } else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }

        // ===============On Click

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("language","basic");
                //showInterstitial();
                editor.commit();
                startActivity(new Intent(Basic_To_Advance.this, Basic.class));
                showInterstitial();
            }
        });
        datatype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("language","basic");
                //showInterstitial();
                editor.commit();
                startActivity(new Intent(Basic_To_Advance.this, DataType.class));
                showInterstitial();
            }
        });
        condition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("language","basic");
               // showInterstitial();
                editor.commit();
                startActivity(new Intent(Basic_To_Advance.this, Conditions.class));
                showInterstitial();
            }
        });

        loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // showInterstitial();
                startActivity(new Intent(Basic_To_Advance.this, Loops.class));
                showInterstitial();
            }
        });

        function.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // showInterstitial();
                startActivity(new Intent(Basic_To_Advance.this, Functions.class));
                showInterstitial();
            }
        });

        array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  showInterstitial();
                startActivity(new Intent(Basic_To_Advance.this, Array.class));
                showInterstitial();
            }
        });

        extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showInterstitial();
                startActivity(new Intent(Basic_To_Advance.this, Extras.class));
                showInterstitial();
            }
        });

        string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(Basic_To_Advance.this, St_Final.class));
                showInterstitial();

            }
        });

        opp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Basic_To_Advance.this, OOP.class));
                showInterstitial();
            }
        });
    }


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
}
package com.fabred.fabprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    TextView txtscore;
    TextView txtStatus, tvSubjectName;
    MediaPlayer audio;
    ImageView imgBack;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        imgBack = findViewById(R.id.imgBack);
        tvSubjectName = findViewById(R.id.tvSubjectName);
        txtscore = findViewById(R.id.txtscore);
        txtStatus = findViewById(R.id.txtStatus);
        sharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);

        Intent intent = getIntent();
        String scores = String.valueOf(intent.getIntExtra("score", 0));
        txtscore.setText(scores);
        txtStatus.setText(setStatus(scores));
        audio.start();


        tvSubjectName.setText(QuestionCollection.SUBJECT_NAME);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(ScoreActivity.this, MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(home);
                finish();
            }
        });

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("savedScore", scores+ " ("+ QuestionCollection.SUBJECT_NAME+")");
        editor.apply();


    }

    private String setStatus(String scores){
        int score = Integer.parseInt(scores);

        if(score >= 8){
            audio = MediaPlayer.create(this, R.raw.high_score);
            return "অভিনন্দন!! খুব ভালো করেছেন";
        }

        if (score >= 5){
            audio = MediaPlayer.create(this,  R.raw.medium_score);
            return "ভালো হয়েছে। আবার চেষ্টা করুন";
        }

        audio = MediaPlayer.create(this,  R.raw.low_score);
        return "আরো ভালো করতে হবে :) ";

    }




    //=======================================================

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Intent home = new Intent(ScoreActivity.this, MainActivity.class);
        home.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(home);
        finish();
    }
}
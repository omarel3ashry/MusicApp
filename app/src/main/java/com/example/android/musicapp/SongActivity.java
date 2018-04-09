package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SongActivity extends AppCompatActivity {
    ImageView playAndpause3;
    Button redirectBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        redirectBtn = findViewById(R.id.redirect);
        redirectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list=new Intent(SongActivity.this,SecondActivity.class);
                startActivity(list);
            }
        });

        playAndpause3 = findViewById(R.id.playAndpause3);
        MainActivity child2=new MainActivity();
        child2.playandpause(playAndpause3);

    }}
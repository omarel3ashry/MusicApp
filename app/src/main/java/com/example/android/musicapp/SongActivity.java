package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {
    TextView songName;
    ImageView playAndpause;
    ImageView prev;
    ImageView next;
    boolean swap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        songName = findViewById(R.id.playing_now);
        Bundle bundleSongName = getIntent().getExtras();
        Bundle bundleIndex = getIntent().getExtras();
        assert bundleSongName != null;
        songName.setText(bundleSongName.getString("songName"));
        playAndpause = findViewById(R.id.playAndpause);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        playAndpause.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
        prev.setImageResource(R.drawable.ic_skip_previous_black_24dp);
        next.setImageResource(R.drawable.ic_skip_next_black_24dp);
        playAndpause.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (swap) {
                playAndpause.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
                swap = false;
            } else {
                playAndpause.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
                swap = true;
            }
        }
    });
}
}

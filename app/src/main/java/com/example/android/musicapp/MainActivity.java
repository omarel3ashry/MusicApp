package com.example.android.musicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Artist> artistList;
    ListView listView;
    ImageView playAndpause;
    ImageView prev;
    ImageView next;
    boolean swap = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artistList = new ArrayList<>();
        artistList.add(new Artist("Angham",R.drawable.ic_library_music_black_24dp));
        artistList.add(new Artist("Assala",R.drawable.ic_library_music_black_24dp));
        artistList.add(new Artist("Mohamed Hamaki",R.drawable.ic_library_music_black_24dp));
        artistList.add(new Artist("Hamza Namira",R.drawable.ic_library_music_black_24dp));
        artistList.add(new Artist("Ramy Gamal",R.drawable.ic_library_music_black_24dp));
        artistList.add(new Artist("Tamer Ashour",R.drawable.ic_library_music_black_24dp));
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistList);
        listView = findViewById(R.id.list);

        listView.setAdapter(artistAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position1, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ArtistName", position1);
                startActivity(intent);
            }
        });
        prev = findViewById(R.id.prev1);
        next = findViewById(R.id.next1);
        playAndpause = findViewById(R.id.playAndpause1);
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


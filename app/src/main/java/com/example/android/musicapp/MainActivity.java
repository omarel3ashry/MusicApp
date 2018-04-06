package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Artist> artistList;
    ListView listView;

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

    }
}


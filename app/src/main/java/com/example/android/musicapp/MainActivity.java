package com.example.android.musicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    boolean swap = false;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        artistList = new ArrayList<>();
        artistList.add(new Artist("Angham","Ahlam Bari2a", R.drawable.angham));
        artistList.add(new Artist("Assala","Mohtamma Bel Tafaseel", R.drawable.assala));
        artistList.add(new Artist("Mohamed Hamaki","3omro Ma Yegheb", R.drawable.hamaki));
        artistList.add(new Artist("Hamza Namira","Hateer Mn Tany", R.drawable.hamza));
        artistList.add(new Artist("Ramy Gamal","Fo2t Mt2a5r", R.drawable.ramy));
        artistList.add(new Artist("Tamer Ashour","Esht Maak Hekayat", R.drawable.tamer));
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
        playAndpause = findViewById(R.id.playAndpause1);
        playandpause(playAndpause);

    }

    public void playandpause(final ImageView btnview) {
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swap) {
                    btnview.setImageResource(R.drawable.play);
                    swap = false;
                } else {
                    btnview.setImageResource(R.drawable.pause);
                    swap = true;
                }
            }
        });
    }

}


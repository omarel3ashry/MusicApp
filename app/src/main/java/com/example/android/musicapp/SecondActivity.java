package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView artistName;
    ImageView artistPic;
    ListView playList;
    int store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        artistName = findViewById(R.id.artistName);
        artistPic = findViewById(R.id.artistImg);
        playList = findViewById(R.id.list2);
        Bundle bundle = getIntent().getExtras();
        store = bundle.getInt("ArtistName");
        ArrayList<String> angham = new ArrayList<>();
        angham.add("Ahe Gat");
        angham.add("Etgah Wa7ed");
        angham.add("Ben Elbnen");
        angham.add("Tool Manta B3ed");
        angham.add("Aktblk Ta3hod");
        angham.add("Heta Na2sa");
        angham.add("Ahlam Bare2a");
        angham.add("Fengan_Elnsyan");
        angham.add("Bakrah Elmosika");
        angham.add("Ba7eb Aghany");
        angham.add("Ganbk Makani");
        angham.add("Ba2eet Wa7eda");
        ArrayList<String> assala = new ArrayList<>();
        assala.add("Ana Batkhan");
        assala.add("Ased Aih");
        assala.add("Hay Ollek");
        assala.add("Kam Marra");
        assala.add("Kefaya Kelma");
        assala.add("Koll Amma Teftekroo");
        assala.add("Meen Feena");
        assala.add("Mohtamma Bel Tafaseel");
        assala.add("Rejea El Farah");
        assala.add("Sandoo Sgheer");
        assala.add("Shou Bedak");
        assala.add("Ya Aalem");
        assala.add("Youm El Raheel");
        ArrayList<String> hamaki = new ArrayList<>();
        hamaki.add("Agmal Youm");
        hamaki.add("Ma Balash");
        hamaki.add("Mayni");
        hamaki.add("Kanet Henak");
        hamaki.add("Nesit");
        hamaki.add("Saber Ala_Hali");
        hamaki.add("Nesmet Shouq");
        hamaki.add("Yally Za3lan");
        hamaki.add("Ana Serraha");
        hamaki.add("El Ghaly Nasiny");
        hamaki.add("Kan We Kan");
        hamaki.add("Omroh Ma Yeghib");
        hamaki.add("Be3dna Leh");
        hamaki.add("Enta Habibi");
        hamaki.add("Elly Ekhtaroh Albi");
        ArrayList<String> hamza = new ArrayList<>();
        hamza.add("Dari Ya Alby");
        hamza.add("El Wad El Abeet");
        hamza.add("Hateer Min Tany");
        hamza.add("Zahra");
        hamza.add("Bos Bos");
        hamza.add("Wala Sohba Ahla");
        hamza.add("Shuwayyet Habayeb");
        hamza.add("Sheekayyo");
        hamza.add("Madadd");
        ArrayList<String> ramy = new ArrayList<>();
        ramy.add("2odamy");
        ramy.add("7asl 5er");
        ramy.add("B7bk Ya Blady");
        ramy.add("Etfadl Emshy");
        ramy.add("Fo2t Mt2a5r");
        ramy.add("Getlk");
        ramy.add("H5af Mn Eh");
        ramy.add("Hatfr2 Eh");
        ramy.add("Malesh Da3wa B7d");
        ramy.add("Mfadsh Bya");
        ramy.add("Msh Bmzagk");
        ramy.add("Msh Kdab");
        ramy.add("Nadele");
        ramy.add("Y5alek Lya");
        ArrayList<String> tamer = new ArrayList<>();
        tamer.add("Law Ghaly Aleik");
        tamer.add("Esht Maak Hekayat");
        tamer.add("Ana Ragea");
        tamer.add("Makamlnash");
        tamer.add("Malish Hal");
        tamer.add("Entaq");
        tamer.add("Waqt El Wadaa");
        tamer.add("Mesh Sahla.");
        tamer.add("Get Ala Karamty");
        tamer.add("Men Gherak");
        if (store == 3) {
            ArrayAdapter<String> hamzaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, hamza);
            playList.setAdapter(hamzaAdapter);
        } else if (store == 2) {
            ArrayAdapter<String> hamakiAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, hamaki);
            playList.setAdapter(hamakiAdapter);
        } else if (store == 1) {
            ArrayAdapter<String> assalaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, assala);
            playList.setAdapter(assalaAdapter);
        } else if (store == 0) {
            ArrayAdapter<String> anghamAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, angham);
            playList.setAdapter(anghamAdapter);
        } else if (store == 5) {
            ArrayAdapter<String> tamerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tamer);
            playList.setAdapter(tamerAdapter);
        } else if (store == 4) {
            ArrayAdapter<String> ramyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ramy);
            playList.setAdapter(ramyAdapter);
        }
        playList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position2, long id) {
                Intent info = new Intent(SecondActivity.this, SongActivity.class);
                info.putExtra("songName", playList.getItemAtPosition(position2).toString());
                startActivity(info);
            }
        });
    }

}

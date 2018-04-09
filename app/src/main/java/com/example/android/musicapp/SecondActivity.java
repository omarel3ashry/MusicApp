package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView artistName;
    ListView playList;
    ImageView playAndpause2;
    Button homeRedirect;
    int store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        artistName = findViewById(R.id.artistName);
        playList = findViewById(R.id.list2);
        MainActivity child=new MainActivity();
        playAndpause2 = findViewById(R.id.playAndpause2);
        child.playandpause(playAndpause2);
        homeRedirect = findViewById(R.id.home_redirect);
        homeRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });
        DoAll();
    }
public void DoAll(){
    Bundle bundle = getIntent().getExtras();
    assert bundle != null;
    store = bundle.getInt("ArtistName");
    ArrayList<Artist> angham = new ArrayList<>();
    angham.add(new Artist("Ahe Gat","Angham",R.drawable.angham));
    angham.add(new Artist("Etgah Wa7ed","Angham",R.drawable.angham));
    angham.add(new Artist("Ben Elbnen","Angham",R.drawable.angham));
    angham.add(new Artist("Tool Manta B3ed","Angham",R.drawable.angham));
    angham.add(new Artist("Aktblk Ta3hod","Angham",R.drawable.angham));
    angham.add(new Artist("Heta Na2sa","Angham",R.drawable.angham));
    angham.add(new Artist("Ahlam Bare2a","Angham",R.drawable.angham));
    angham.add(new Artist("Fengan Elnsyan","Angham",R.drawable.angham));
    angham.add(new Artist("Bakrah Elmosika","Angham",R.drawable.angham));
    angham.add(new Artist("Ba7eb Aghany","Angham",R.drawable.angham));
    angham.add(new Artist("Ganbk Makani","Angham",R.drawable.angham));
    angham.add(new Artist("Ba2eet Wa7eda","Angham",R.drawable.angham));
    ArrayList<Artist> assala = new ArrayList<>();
    assala.add(new Artist("Ana Batkhan","Assala",R.drawable.assala));
    assala.add(new Artist("Ased Aih","Assala",R.drawable.assala));
    assala.add(new Artist("Hay Ollek","Assala",R.drawable.assala));
    assala.add(new Artist("Kam Marra","Assala",R.drawable.assala));
    assala.add(new Artist("Kefaya Kelma","Assala",R.drawable.assala));
    assala.add(new Artist("Koll Amma Teftekroo","Assala",R.drawable.assala));
    assala.add(new Artist("Meen Feena","Assala",R.drawable.assala));
    assala.add(new Artist("Mohtamma Bel Tafaseel","Assala",R.drawable.assala));
    assala.add(new Artist("Rejea El Farah","Assala",R.drawable.assala));
    assala.add(new Artist("Sandoo Sgheer","Assala",R.drawable.assala));
    assala.add(new Artist("Shou Bedak","Assala",R.drawable.assala));
    assala.add(new Artist("Ya Aalem","Assala",R.drawable.assala));
    assala.add(new Artist("Youm El Raheel","Assala",R.drawable.assala));
    ArrayList<Artist> hamaki = new ArrayList<>();
    hamaki.add(new Artist("Agmal Youm","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Ma Balash","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Mayni","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Kanet Henak","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Nesit","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Saber Ala_Hali","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Nesmet Shouq","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Yally Za3lan","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Ana Serraha","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("El Ghaly Nasiny","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Kan We Kan","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Omroh Ma Yeghib","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Be3dna Leh","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Enta Habibi","Mohamed Hamaki",R.drawable.hamaki));
    hamaki.add(new Artist("Elly Ekhtaroh Albi","Mohamed Hamaki",R.drawable.hamaki));
    ArrayList<Artist> hamza = new ArrayList<>();
    hamza.add(new Artist("Dari Ya Alby","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("El Wad El Abeet","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Hateer Min Tany","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Zahra","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Bos Bos","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Wala Sohba Ahla","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Shuwayyet Habayeb","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Sheekayyo","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Madadd","Hamza Namira",R.drawable.hamza));
    hamza.add(new Artist("Dari Ya Alby","Hamza Namira",R.drawable.hamza));
    ArrayList<Artist> ramy = new ArrayList<>();
    ramy.add(new Artist("2odamy","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("7asl 5er","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("B7bk Ya Blady","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Etfadl Emshy","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Fo2t Mt2a5r","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Getlk","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("H5af Mn Eh","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Hatfr2 Eh","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Malesh Da3wa B7d","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Mfadsh Bya","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Msh Bmzagk","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Msh Kdab","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Nadele","Ramy Gamal",R.drawable.ramy));
    ramy.add(new Artist("Y5alek Lya","Ramy Gamal",R.drawable.ramy));
    ArrayList<Artist> tamer = new ArrayList<>();
    tamer.add(new Artist("Law Ghaly Aleik","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Esht Maak Hekayat","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Ana Ragea","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Makamlnash","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Malish Hal","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Entaq","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Waqt El Wadaa","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Mesh Sahla","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Get Ala Karamty","Tamer Ashour",R.drawable.tamer) );
    tamer.add(new Artist("Men Gherak","Tamer Ashour",R.drawable.tamer) );

    if (store == 3) {
        ArtistAdapter hamzaAdapter = new ArtistAdapter(this,hamza);
        playList.setAdapter(hamzaAdapter);
    } else if (store == 2) {
        ArtistAdapter hamakiAdapter = new ArtistAdapter(this,hamaki);
        playList.setAdapter(hamakiAdapter);
    } else if (store == 1) {
        ArtistAdapter assalaAdapter = new ArtistAdapter(this, assala);
        playList.setAdapter(assalaAdapter);
    } else if (store == 0) {
        ArtistAdapter anghamAdapter = new ArtistAdapter(this, angham);
        playList.setAdapter(anghamAdapter);
    } else if (store == 5) {
        ArtistAdapter tamerAdapter = new ArtistAdapter(this, tamer);
        playList.setAdapter(tamerAdapter);
    } else if (store == 4) {
        ArtistAdapter ramyAdapter = new ArtistAdapter(this, ramy);
        playList.setAdapter(ramyAdapter);
    }
    playList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position2, long id) {
            Intent info = new Intent(SecondActivity.this, SongActivity.class);
            startActivity(info);
        }
    });
}
}

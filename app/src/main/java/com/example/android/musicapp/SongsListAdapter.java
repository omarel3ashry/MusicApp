package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongsListAdapter extends ArrayAdapter {
    public SongsListAdapter(@NonNull Context context, ArrayList<Artist> module) {
        super(context,0, module);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View wantedList = convertView;
        if (wantedList == null) {
            wantedList = LayoutInflater.from(getContext())
                    .inflate(R.layout.custom_album_list, parent, false);
        }
        Artist testArtist = (Artist) getItem(position);
        ImageView artistPic = wantedList.findViewById(R.id.artistImg);
        artistPic.setImageResource(testArtist.getPicRes());
        TextView artistName = wantedList.findViewById(R.id.artistName);
        artistName.setText(testArtist.getName());
        TextView songName = wantedList.findViewById(R.id.songName);
        songName.setText(testArtist.getName2());

        return wantedList;
    }
}

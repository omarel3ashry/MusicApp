package com.example.android.musicapp;

public class Artist {
    private String name;
    private int picRes;

    public Artist(String name, int picRes) {
        this.name = name;
        this.picRes = picRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicRes() {
        return picRes;
    }

    public void setPicRes(int picRes) {
        this.picRes = picRes;
    }


}

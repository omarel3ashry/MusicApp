package com.example.android.musicapp;

public class Artist {
    private String name;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    private String name2;
    private int picRes;

    public Artist(String name,String name2, int picRes) {
        this.name = name;
        this.name2 = name2;
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

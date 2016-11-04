package com.example.marty_000.myapp1;

import android.widget.ImageView;
/*
 * 4-11-2016
 * M.Heijstek, 10800441
 * This class combines a String with an ImageView
 * and is used in "MainActivity.java"
 */
public class ImageVisability {

    private String key;
    private ImageView image;

    public ImageVisability(String key, ImageView image)
    {
        this.key   = key;
        this.image = image;
    }
    public String key()   { return key; }
    public ImageView image() { return image; }
}
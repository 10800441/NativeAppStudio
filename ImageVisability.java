package com.example.marty_000.myapp1;

import android.widget.ImageView;
// This class combines a String with an ImageView
public class ImageVisability
{
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
package com.example.dong.recyclerviewex;

public class ItemImage {

    private int mIdImage;
    private String mDescription;

    public ItemImage(int idImage, String description) {
        this.mIdImage = idImage;
        this.mDescription = description;
    }

    public int getIdImage() {
        return mIdImage;
    }

    public String getDescription() {
        return mDescription;
    }
}

package com.example.androideatit.Model;

public class Categoy {
    private String Name;
    private String Image;

    public Categoy() {
    }

    public Categoy(String name, String image) {
        Name = name;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}

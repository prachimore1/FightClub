package com.example.fightclub.domain;

public class Creature {
    String title;
    String image_url;

    public Creature(String title, String image_url) {
        this.title = title;
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public String getImage_url() {
        return image_url;
    }
}

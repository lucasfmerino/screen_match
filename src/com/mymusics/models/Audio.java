package com.mymusics.models;

public class Audio {
    private String title;
    private int totalPlays;
    private int likes;
    private int rating;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public void like() {
        this.likes++;
    }

    public void play() {
        this.totalPlays++;
    }
}

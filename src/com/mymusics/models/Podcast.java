package com.mymusics.models;

public class Podcast extends Audio{
    private String host;
    private String description;


    public void setHost(String host) {
        this.host = host;
    }
    
    public String getHost() {
        return host;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getRating() {
        if (this.getLikes() > 1000) {
            return 10;
        } else {
            return 8;
        }
    }
}

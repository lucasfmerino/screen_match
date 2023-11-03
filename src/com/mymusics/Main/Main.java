package com.mymusics.Main;

import com.mymusics.models.Favorite;
import com.mymusics.models.Music;
import com.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) throws Exception {


        Music myMusic = new Music();
        myMusic.setTitle("Without You");
        myMusic.setSinger("Harry Nilsson");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }




        Podcast myPodcast = new Podcast();
        myPodcast.setHost("Paulo Silveira");
        myPodcast.setTitle("Hipsters Ponto Tech");

        for (int i = 0; i < 10000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 2000; i++) {
            myPodcast.like();
        }



        Favorite favorite = new Favorite();
        favorite.include(myMusic);
        System.out.println(myMusic.getRating());
        favorite.include(myPodcast);
        System.out.println(myPodcast.getRating());

    }
}

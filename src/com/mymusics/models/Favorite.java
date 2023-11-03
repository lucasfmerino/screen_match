package com.mymusics.models;

public class Favorite {
    public void include (Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + ": É considerado um sucesso absoluto!");
        } else {
            System.out.println(audio.getTitle() + ": Que tal adicionar este à sua lista de reprodução?");
        }
    }
}

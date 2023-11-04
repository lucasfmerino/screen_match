package models;

import calculators.Classifiable;

/**
 * Movie
 */
public class Movie extends Title implements Classifiable{
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getRating() {
        return (int) this.getReview()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

package models;

import calculators.Classifiable;

/**
 * Movie
 */
public class Movie extends Title implements Classifiable{
    private String director;

    // CONSTRUTOR - WITH NAME
    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    public String getRatingStars() {
        String star = " * ";
        int count = (int) this.getReview()/2;
        return (String) star.repeat(count);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}

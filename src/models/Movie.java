package models;
/**
 * Movie
 */
public class Movie {
    public String name;
    public boolean includedInThePlan;
    public double review;
    public int releaseYear;
    public int numberOfreviews;
    public int durationInminutes;


    public void displaysDatasheet () {
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration: " + durationInminutes);
    }


    public void evaluate(double newReview) {
        review += newReview;
        numberOfreviews++;
        if (numberOfreviews > 1) {
            review /= 2;
        }
    }


    public double getReview() {
        return review;
    }

}

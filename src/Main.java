import models.Movie;

public class Main {
    public static void main(String[] args) throws Exception {
        Movie movie = new Movie();

        movie.name = "O Poderoso Chefão";
        movie.releaseYear = 1970;
        movie.durationInminutes = 180;

        movie.displaysDatasheet();

        System.out.println(movie.review);

        movie.evaluate(8.2);
        System.out.println(movie.review);

        movie.evaluate(6.8);
        System.out.println(movie.review);

        movie.evaluate(9.5);
        System.out.println(movie.review);

        System.out.println(movie.getReview());

    }
}

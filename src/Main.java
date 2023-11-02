import models.Movie;

public class Main {
    public static void main(String[] args) throws Exception {
        Movie movie = new Movie();

        movie.setName("O Poderoso Chefão");
        movie.setReleaseYear(1970);
        movie.setDurationInMinutes(180);

        movie.displaysDatasheet();

        if (movie.getNumberOfReviews() == 0) {
            System.out.println("O filme ainda não possui avaliações");
        } else {
            System.out.println(movie.getReview());
        }

    }
}

import calculators.TimeCalculator;
import models.Movie;
import models.Series;

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


        // CRIANDO UMA SÉRIE
        Series series = new Series();
        series.setName("Lost");
        series.setReleaseYear(2000);
        series.setSeasons(10);
        series.setEpisodesPerSeason(10);
        series.setMinutesPerEpisode(50);

        series.displaysDatasheet();

        System.out.println();
        System.out.println();
        System.out.println();



        TimeCalculator timeCalculator = new TimeCalculator();

        timeCalculator.includeTitle(movie);

        System.out.println("O tempo total necessário para assistir esses títulos é de %d minutos".formatted(timeCalculator.getTotalTime()));

        timeCalculator.includeTitle(series);

        System.out.println("O tempo total necessário para assistir esses títulos é de %d minutos".formatted(timeCalculator.getTotalTime()));

    }
}

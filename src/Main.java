import java.util.ArrayList;

import calculators.RecommendationFilter;
import calculators.TimeCalculator;
import models.Episode;
import models.Movie;
import models.Series;

public class Main {
    public static void main(String[] args) throws Exception {


// ---------------------- MOVIES INSTANCES ----------------------
        Movie movie = new Movie();
        movie.setName("O Poderoso Chefão");
        movie.setReleaseYear(1970);
        movie.setDurationInMinutes(180);
        movie.evaluate(8.5);
        movie.evaluate(5.5);
        movie.evaluate(7);

        var movie2 = new Movie();
        movie2.setName("Star Wars: O Império Contra-ataca");
        movie2.setReleaseYear(1980);
        movie2.setDurationInMinutes(124);
        movie2.evaluate(9.2);

        Movie movie3 = new Movie();
        movie.setName("O Senhor dos Anéis - A Sociedade do Anel");
        movie.setReleaseYear(2002);
        movie.setDurationInMinutes(178);
        movie.evaluate(9.4);



// ---------------------- SERIES INSTANCES ----------------------
        Series series = new Series();
        series.setName("Lost");
        series.setReleaseYear(2000);
        series.setSeasons(10);
        series.setEpisodesPerSeason(10);
        series.setMinutesPerEpisode(50);



// ---------------------- EPISODES INSTANCES ----------------------
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(series);
        episode.setViews(467);



// ---------------------- MODELS TESTING METHODS ----------------------
        System.out.println();
        System.out.println();
        System.out.println();

        movie.displaysDatasheet();
        if (movie.getNumberOfReviews() == 0) {
            System.out.println("O filme ainda não possui avaliações");
        } else {
            System.out.println(movie.getReview());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        series.displaysDatasheet();


        System.out.println();
        System.out.println();
        System.out.println();


// ---------------------- TIME CALCULATOR ----------------------
        TimeCalculator timeCalculator = new TimeCalculator();

        timeCalculator.includeTitle(movie);
        System.out.println("O tempo total necessário para assistir esses títulos é de %d minutos".formatted(timeCalculator.getTotalTime()));

        timeCalculator.includeTitle(series);
        System.out.println("O tempo total necessário para assistir esses títulos é de %d minutos".formatted(timeCalculator.getTotalTime()));

        System.out.println();
        System.out.println();
        System.out.println();



// ---------------------- RECOMMENDATIONS ----------------------
        RecommendationFilter filter = new RecommendationFilter();

        filter.filters(movie);
        System.out.println(movie.getRating());
        System.out.println(movie.getReview());

        System.out.println(episode.getRating());
        filter.filters(episode);

        System.out.println();
        System.out.println();
        System.out.println();



// ---------------------- ARRAYLIST<> ----------------------

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movie);
        moviesList.add(movie2);
        moviesList.add(movie3);

        System.out.println("Tamanho da lista: " + moviesList.size());
        System.out.println("Primeiro Filme: " + moviesList.get(0).getName());
        System.out.println(moviesList);

    }
}

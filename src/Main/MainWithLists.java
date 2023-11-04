package Main;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

// import models.Episode;
import models.Movie;
import models.Series;
import models.Title;

public class MainWithLists {
    public static void main(String[] args) {

// ---------------------- MOVIE AND SERIES INSTANCES ----------------------
        Movie movie = new Movie("O Poderoso Chefão", 1970);
        var movie2 = new Movie("Star Wars: O Império Contra-ataca", 1980);
        Movie movie3 = new Movie("O Senhor dos Anéis - A Sociedade do Anel", 2002);
        Series series = new Series("Lost", 2000);
        // Episode episode = new Episode();

        movie.evaluate(7.4);
        movie2.evaluate(9.4);
        movie3.evaluate(9.6);


// ---------------------- LIST ISNTANCES---------------------- 
        ArrayList<Title> titleList = new ArrayList<>();
        titleList.add(movie);
        titleList.add(movie2);
        titleList.add(movie3);
        titleList.add(series);

        Collections.sort(titleList);  //implementado a interface Comparable em Title
// ---------------------- PRINTS ----------------------


// NAS VERSOES MAIS ANTIGAS:
/*         for (Title item: titleList) {
            System.out.println(item.getName());
            if (item instanceof Movie) {
                Movie m = (Movie) item;
                System.out.println("Classificação: " + m.getRating());
            }
        }
 */

        for (Title item: titleList) {
            System.out.println(item.getName());
            if (item instanceof Movie m && m.getRating() > 0) {
                System.out.println("Classificação: " + m.getRatingStars());
            }
            System.out.println();
        }
    }
    
}

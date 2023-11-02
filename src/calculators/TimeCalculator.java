package calculators;

// import models.Movie;
// import models.Series;
import models.Title;

/**
 * TimeCalculator
 */
public class TimeCalculator {
    private int totalTime;


    public int getTotalTime() {
        return totalTime;
    }

/* 
UTILIZANDO SOBRECARGA DE MÉTODOS:

    public void includeTitle (Movie title) {
        this.totalTime += title.getDurationInMinutes();
    }

    public void includeTitle (Series title) {
        this.totalTime += title.getDurationInMinutes();
    }
 */



// UTILIZANDO POLIMORFISMO:
    public void includeTitle (Title title) {
        
        this.totalTime += title.getDurationInMinutes();
    }

}
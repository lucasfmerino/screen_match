package models;

import calculators.Classifiable;

/**
 * Episode
 */
public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int views;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public int getRating() {
        if (views <= 100) {
            return 0;
        } else if (views <= 200) {
            return 1;
        } else if (views <= 300) {
            return 2;
        } else if (views <= 400) {
            return 3;
        } else if (views <= 500) {
            return 4;
        } else {
            return 5;
        }

    }

}
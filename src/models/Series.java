package models;

/**
 * Series
 */
public class Series extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;
    private boolean isConcluded;
    // private int durationInMinutes;

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setIsConcluded() {
        if (this.isConcluded) {
            this.isConcluded = false;
        } else {
            this.isConcluded = true;
        }
    }

    public boolean getIsConcluded() {
        return isConcluded;
    }
    
    @Override
    public int getDurationInMinutes() {
         return this.seasons * this.episodesPerSeason * this.minutesPerEpisode;
    }

    @Override
    public void displaysDatasheet() {
        System.out.println("Series name: " + this.getName());
        System.out.println("Release year: " + this.getReleaseYear());
        System.out.println("Duration: " + this.getDurationInMinutes());
    }
}
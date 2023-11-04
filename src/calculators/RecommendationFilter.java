package calculators;

/**
 * RecommendationFilter
 */
public class RecommendationFilter {

    public void filters(Classifiable classifiable) {
        if (classifiable.getRating() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classifiable.getRating() >= 2) {
            System.out.println("As pessoas estão comentando sobre ele!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}

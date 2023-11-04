package models;

public class Title implements Comparable<Title>{
    private String name;
    private boolean includedInThePlan;
    private double review;
    private int releaseYear;
    private int numberOfreviews;
    private int durationInminutes;

// CONSTRUTOR
    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }


// IMPLEMENTANDO INTERFACE
    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }


// MÉTODOS PARA O ATRIBUTO NOME
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


// MÉTODOS PARA O ATRUBUTO ANO DE LANÇAMENTO
    public void setReleaseYear(int year) {
        this.releaseYear = year;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }


// MÉTODOS PARA O ATRUBUTO DURAÇÃOO DO FILME
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInminutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return this.durationInminutes;
    }


// MÉTODOS PARA O ATRIBUTO DISPONIBILIDADE NO PLANO
    public void changeAvailability() {
        if (this.includedInThePlan) {
            this.includedInThePlan = false;
        } else {
            this.includedInThePlan = true;
        }
    }

    public boolean getAvailability() {
        return this.includedInThePlan;
    }


// MÉTODOS RELACIONADOS À AVALIAÇÕES
    public double getReview() {
        return review;
    }

    public int getNumberOfReviews() {
        return numberOfreviews;
    }

    public void evaluate(double newReview) {
        this.review += newReview;
        numberOfreviews++;
        if (numberOfreviews > 1) {
            this.review /= 2;
        }
    }


// MÉTODO PARA EXIBIR FICHA TÉCNICA DO FILME
    public void displaysDatasheet () {
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration: " + durationInminutes);
    }

}

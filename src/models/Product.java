package models;

public class Product implements Taxable, Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(otherProduct.price, this.price);
    }

    @Override
    public String toString() {
        return """
                Produto: %s ................ R$%.2f

                """.formatted(getName(), getPrice());
    }

    @Override
    public String getTax() {
        return toString();
    }
}

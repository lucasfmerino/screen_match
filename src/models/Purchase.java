package models;

import java.util.ArrayList;

public class Purchase implements Taxable {
    private ArrayList<Product> purchaseItems;
    private double totalVelue;

    public Purchase(ArrayList<Product> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public void setPurchaseItems(ArrayList<Product> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public ArrayList<Product> getPurchaseItems() {
        return this.purchaseItems;
    }

    public ArrayList<Product> addItem(Product item) {
        purchaseItems.add(item);
        return this.purchaseItems;
    }

    public double gatTotalValue() {
        this.totalVelue = 0;
        for (Product item : purchaseItems) {
            this.totalVelue += item.getPrice();
        }
        return this.totalVelue;
    }

    @Override
    public String getTax() {
        String taxlist = "";

        for (Product product : purchaseItems) {
            taxlist += (product.toString());
        }
        return taxlist;
    }

}

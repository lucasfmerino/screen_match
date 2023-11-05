package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import models.CreditCard;
import models.Product;
import models.Purchase;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CARD INSTANCES
        CreditCard mycard = new CreditCard(1000, 2000);
        mycard.setHistoricHeader();

        // PRODUCTS INSTANCES
        Product noteBook01 = new Product("Notebook Nimbus 2000", 9000);
        Product noteBook02 = new Product("Notebook da Xuxa", 499.99);
        Product mouse01 = new Product("mouse ultrasonic gamerPro", 399.50);
        Product mouse02 = new Product("ball mouse", 12.99);
        Product keyboard01 = new Product("keyboard nextGen with glowing lights", 450);
        Product keyboard02 = new Product("keyboard Chernobyl", 30);

        // LISTS INSTANCES
        List<Product> productsList = new ArrayList<>();
        productsList.add(noteBook01);
        productsList.add(noteBook02);
        productsList.add(mouse01);
        productsList.add(mouse02);
        productsList.add(keyboard01);
        productsList.add(keyboard02);

        List<Product> purchaseList = new ArrayList<>();

        // PURCHASES INSTANCES
        Purchase purchaseItems = new Purchase((ArrayList<Product>) purchaseList);

        // RUN APP
        Boolean online = true;

        while (online) {
            System.out.println("""
                        *******************************

                            WELCOME TO THE APPSTORE

                        *******************************

                        Select the option:

                        1 - Go to sotre products;

                        2 - Make the payment;

                        3 - Cancel purchase;

                        4 - View card statement;

                        5 - Close;

                    """);

            int welcomeOption = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();

            switch (welcomeOption) {
                case 1:
                    displayProducts(sc, productsList, purchaseList);
                    break;

                case 2:
                    makePayment(sc, mycard, purchaseItems);

                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;

                case 3:
                    purchaseList.clear();
                    break;

                case 4:
                    System.out.println(mycard.getHistoric());
                    System.out.println();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Thank you for using our services");
                    online = false;
                    break;

                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }

    }

    // DISPLAY PRODUCTS
    public static void displayProducts(Scanner sc, List<Product> productsList, List<Product> purchaseList) {
        int count = 1;
        productsList.sort(Comparator.comparing(Product::getPrice));
        for (Product product : productsList) {
            System.out.println(count + "- " + product);

            count++;
        }

        Boolean addProducts = true;

        while (addProducts) {
            System.out.println("select product code to add or \"0\" (zero) to return");

            int productOption = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.println();

            if (productOption > 0 && productOption <= productsList.size()) {
                purchaseList.add(productsList.get(productOption - 1));

            } else if (productOption == 0) {
                System.out.println("Check back often.");
                for (Product product : purchaseList) {
                    System.out.println(product);
                }
                addProducts = false;
                break;
            } else {
                System.out.println("Sorry! Unavailabel Prodcut.");
            }
        }

    }

    // MAKE THE PAYMENT
    public static void makePayment(Scanner sc, CreditCard card, Purchase purchase) {
        purchase.getPurchaseItems().clear();
    }
}
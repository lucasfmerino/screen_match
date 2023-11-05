package models;

public class CreditCard extends Card {

    private double creditCardLimit;
    private double invoiceAmount;
    private String historicHeader;
    private String historic;

    public CreditCard(double accountBalance, double limit) {
        super(accountBalance);
        this.creditCardLimit = limit;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setHistoricHeader() {
        this.historicHeader = """
                *********************************
                CARD STATEMENT

                *********************************
                Puchases Made:

                """;
    }

    public void setHistoric(Purchase purchase) {
        this.historic += purchase.getTax();
    }

    public boolean creditPayment(Purchase purchase) {
        if (purchase.gatTotalValue() + invoiceAmount <= creditCardLimit) {
            this.invoiceAmount += purchase.gatTotalValue();
            setHistoric(purchase);
            System.out.println("Compra Aprovada");
            return true;
        } else {
            System.out.println("Compra recusada");
            return false;
        }
    }

    public String getHistoric() {
        return this.historicHeader + historic + """

                TOTAL VALUE:""" + getInvoiceAmount();
    }

}

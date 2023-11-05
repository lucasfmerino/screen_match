package models;

/**
 * Card
 */
public class Card {

    private double accountBalance;
    // private ArrayList<String> purchaseHistoric;

    public Card(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public boolean debitPayment(double payment) {
        if (payment <= accountBalance) {
            this.accountBalance -= payment;
            System.out.println("Pagamento realizado com sucesso.");
            return true;
        } else {
            System.out.println("Pagamento recusado.");
            return false;
        }

    }
}
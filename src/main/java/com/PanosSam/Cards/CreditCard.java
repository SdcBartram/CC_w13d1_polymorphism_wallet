package com.PanosSam.Cards;

public class CreditCard extends PaymentCard implements IChargeable{

    private double availableCredit;
    private String transactionLog = "";

    public CreditCard(String cardNumber, String expiryDate, String securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(double availableCredit) {
        this.availableCredit = availableCredit;
    }

    @Override
    public void charge(double purchaseAmount) {
        double purchaseAmountWithCost = purchaseAmount + purchaseAmount*0.01;
        if (purchaseAmountWithCost <= availableCredit){
            this.availableCredit -= purchaseAmountWithCost;
            String transactionString = "You spent £" + purchaseAmount + ". Your new balance is £ " + getAvailableCredit() + "\n";
            this.transactionLog += transactionString;
        }
        else {
            String transactionString = "You unsuccessfully tried to spend £" + purchaseAmount + ". Your balance remains £ " + getAvailableCredit() + "\n";
            this.transactionLog += transactionString;
            System.out.println("You have insufficient funds for this transaction!");}

    }
}

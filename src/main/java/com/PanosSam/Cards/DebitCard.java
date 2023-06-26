package com.PanosSam.Cards;

public class DebitCard extends PaymentCard implements IChargeable{

    private String accountNumber;
    private String sortCode;

    private double balance;

    private String transactionLog = "";

    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String accountNumber, String sortCode) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }


    @Override
    public void charge(double purchaseAmount) {
        if (purchaseAmount <= balance){
            this.balance -= purchaseAmount;
            String transactionString = "You spent £" + purchaseAmount + ". Your new balance is £ " + getBalance() + "\n";
            this.transactionLog += transactionString;
        }
        else {
            String transactionString = "You unsuccessfully tried to spend £" + purchaseAmount + ". Your balance remains £ " + getBalance() + "\n";
            this.transactionLog += transactionString;
            System.out.println("You have insufficient funds for this transaction!");}
    }
}

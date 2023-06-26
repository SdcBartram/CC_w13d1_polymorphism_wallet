package com.PanosSam.Cards;

public class GiftCard implements IChargeable{
    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void charge(double purchaseAmount) {
        if (purchaseAmount <= balance){
            this.balance -= purchaseAmount;
        }
        else {System.out.println("You have insufficient funds for this transaction!");}
    }
}

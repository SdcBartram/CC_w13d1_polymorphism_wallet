package com.PanosSam.Cards;

public abstract class PaymentCard {
    private String cardNumber;
    private String expiryDate;
    private String securityNumber;

    public PaymentCard(String cardNumber, String expiryDate, String securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }
}

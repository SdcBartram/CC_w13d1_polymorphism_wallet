package com.PanosSam;

import com.PanosSam.Cards.IChargeable;

import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargeable> chargeables;
    private IChargeable chargeable;

    public Wallet(){
        chargeables = new ArrayList<>();
    }


    public void addCardToWallet(IChargeable chargeable) {
        this.chargeables.add(chargeable);
    }

    public void chooseCardToCharge(IChargeable chargeable) {
        if (this.chargeables.contains(chargeable)) {
            this.chargeable = chargeable;
        }
    }

    public void pay(double purchaseAmount){
        this.chargeable.charge(purchaseAmount);
    }

    public int countCardsInWallet(){
        return chargeables.size();
    }

    public IChargeable getChosenCard() {
        return chargeable;
    }
}

import com.PanosSam.Cards.CreditCard;
import com.PanosSam.Cards.DebitCard;
import com.PanosSam.Cards.GiftCard;
import com.PanosSam.Wallet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet wallet;

    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before(){
        wallet = new Wallet();
        giftCard = new GiftCard(100);
        debitCard = new DebitCard("4550 0987 6543 1234", "04/24", "098",
                "1234567890", "009988");
        debitCard.setBalance(500);
        creditCard = new CreditCard("4550 6789 0987 1234", "03/24", "098");
        this.creditCard.setAvailableCredit(500);
        wallet.addCardToWallet(debitCard);
        wallet.addCardToWallet(creditCard);
        wallet.addCardToWallet(giftCard);
    }

    @Test
    public void canPayWithWallet(){
        wallet.chooseCardToCharge(creditCard);
        wallet.pay(100);
        assertEquals(399, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void walletHasCards(){
        assertEquals(3, wallet.countCardsInWallet());
    }

    @Test
    public void canAddCardToWallet(){
        wallet.addCardToWallet(giftCard);
        assertEquals(4, wallet.countCardsInWallet());
    }

    @Test
    public void canChooseCardFromWallet(){
        wallet.chooseCardToCharge(creditCard);
        assertEquals(creditCard, wallet.getChosenCard());
    }
}

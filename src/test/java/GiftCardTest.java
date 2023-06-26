import com.PanosSam.Cards.GiftCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(100);
    }

    @Test
    public void canChargeTransactionAmount(){
        giftCard.charge(50);
        assertEquals(50, giftCard.getBalance(),0.0);
    }

    @Test
    public void cannotChargeInsufficientFunds(){
        giftCard.charge(1000);
        assertEquals(100, giftCard.getBalance(),0.0);

    }
}

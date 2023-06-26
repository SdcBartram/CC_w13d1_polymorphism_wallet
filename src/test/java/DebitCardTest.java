import com.PanosSam.Cards.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard("4550 0987 6543 1234", "04/24", "098",
                "1234567890", "009988");
    }

    @Test
    public void canChargeTransactionAmount(){
        debitCard.setBalance(500);
        debitCard.charge(50);
        assertEquals(450, debitCard.getBalance(), 0.0);
    }

    @Test
    public void cannotChargeTransactionInsufficientFunds(){
        debitCard.setBalance(50);
        debitCard.charge(100);
        assertEquals(50, debitCard.getBalance(), 0.0);
    }
}

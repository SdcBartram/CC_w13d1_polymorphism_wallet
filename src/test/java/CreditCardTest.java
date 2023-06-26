import com.PanosSam.Cards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("4550 6789 0987 1234", "03/24", "098");
        this.creditCard.setAvailableCredit(500);
    }

    @Test
    public void canChargeTransaction(){
        creditCard.charge(150);
        assertEquals(348.5, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void cannotChargeTransactionInsufficientFunds(){
        creditCard.charge(600);
        assertEquals(500, creditCard.getAvailableCredit(), 0.0);
    }
}

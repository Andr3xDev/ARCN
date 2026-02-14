package escuelaing.arcn.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    
    @Test
    public void testRegularDiscount() {
        DiscountCalculator calculator = new DiscountCalculator(new RegularDiscount());
        assertEquals(10.0, calculator.calculateDiscount(100.0));
    }
    
    @Test
    public void testVIPDiscount() {
        DiscountCalculator calculator = new DiscountCalculator(new VIPDiscount());
        assertEquals(20.0, calculator.calculateDiscount(100.0));
    }
}

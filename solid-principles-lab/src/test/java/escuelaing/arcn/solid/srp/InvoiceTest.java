package escuelaing.arcn.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    
    @Test
    public void testCalculateTotal() {
        Invoice invoice = new Invoice("John Doe", 100.0);
        assertEquals(121.0, invoice.calculateTotal());
    }
    
    @Test
    public void testGetCustomer() {
        Invoice invoice = new Invoice("Jane Smith", 200.0);
        assertEquals("Jane Smith", invoice.getCustomer());
    }
}

package escuelaing.arcn.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessorTest {
    
    @Test
    public void testProcessMultipleOrders() {
        Database db = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);
        assertEquals(0, processor.getOrdersProcessed());
        processor.processOrder();
        assertEquals(1, processor.getOrdersProcessed());
        processor.processOrder();
        assertEquals(2, processor.getOrdersProcessed());
    }
    
    @Test
    public void testDifferentDatabases() {
        OrderProcessor processor1 = new OrderProcessor(new MySQLDatabase());
        OrderProcessor processor2 = new OrderProcessor(new PostgreSQLDatabase());
        
        processor1.processOrder();
        processor2.processOrder();
        
        assertEquals(1, processor1.getOrdersProcessed());
        assertEquals(1, processor2.getOrdersProcessed());
    }
}

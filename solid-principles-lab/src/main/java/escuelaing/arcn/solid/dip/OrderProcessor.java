package escuelaing.arcn.solid.dip;

public class OrderProcessor {
    private Database database;
    private int ordersProcessed = 0;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        database.saveOrder();
        ordersProcessed++;
    }
    
    public int getOrdersProcessed() {
        return ordersProcessed;
    }
}

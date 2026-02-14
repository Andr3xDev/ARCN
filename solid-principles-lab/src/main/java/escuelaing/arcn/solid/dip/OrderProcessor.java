package escuelaing.arcn.solid.dip;

public class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        database.saveOrder();
    }
}

package escuelaing.arcn.solid.dip;

public class DIPDemo {
    
    public static void main(String[] args) {
        Database mysqlDb = new MySQLDatabase();
        OrderProcessor processor1 = new OrderProcessor(mysqlDb);
        processor1.processOrder();
        
        Database postgresDb = new PostgreSQLDatabase();
        OrderProcessor processor2 = new OrderProcessor(postgresDb);
        processor2.processOrder();
    }
}

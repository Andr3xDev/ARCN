package escuelaing.arcn.solid.dip;

public class PostgreSQLDatabase implements Database {
    
    @Override
    public void saveOrder() {
        System.out.println("Saving order to PostgreSQL...");
    }
}

package escuelaing.arcn.solid.dip;

public class MySQLDatabase implements Database {
    
    @Override
    public void saveOrder() {
        System.out.println("Saving order to MySQL...");
    }
}

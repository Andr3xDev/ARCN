package escuelaing.arcn.solid.lsp;

public class ElectricCar implements Vehicle, Rechargeable {
    private boolean running = false;
    
    @Override
    public void drive() {
        running = true;
        System.out.println("Driving electric car...");
    }
    
    @Override
    public void recharge() {
        System.out.println("Recharging battery...");
    }
    
    public boolean isRunning() {
        return running;
    }
}

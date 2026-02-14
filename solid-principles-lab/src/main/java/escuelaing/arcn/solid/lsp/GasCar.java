package escuelaing.arcn.solid.lsp;

public class GasCar implements Vehicle, Refuelable {
    private boolean running = false;
    
    @Override
    public void drive() {
        running = true;
        System.out.println("Driving gas car...");
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling with gasoline...");
    }
    
    public boolean isRunning() {
        return running;
    }
}

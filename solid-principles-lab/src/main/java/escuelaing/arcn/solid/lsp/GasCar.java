package escuelaing.arcn.solid.lsp;

public class GasCar implements Vehicle, Refuelable {
    
    @Override
    public void drive() {
        System.out.println("Driving gas car...");
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling with gasoline...");
    }
}

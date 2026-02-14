package escuelaing.arcn.solid.lsp;

public class LSPDemo {
    
    public static void main(String[] args) {
        Vehicle gasCar = new GasCar();
        gasCar.drive();
        ((Refuelable) gasCar).refuel();
        
        Vehicle electricCar = new ElectricCar();
        electricCar.drive();
        ((Rechargeable) electricCar).recharge();
    }
}

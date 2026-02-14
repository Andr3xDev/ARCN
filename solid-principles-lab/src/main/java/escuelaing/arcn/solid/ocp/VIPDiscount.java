package escuelaing.arcn.solid.ocp;

public class VIPDiscount implements DiscountStrategy {
    
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}

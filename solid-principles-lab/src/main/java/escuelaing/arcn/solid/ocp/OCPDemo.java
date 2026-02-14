package escuelaing.arcn.solid.ocp;

public class OCPDemo {
    
    public static void main(String[] args) {
        double price = 100.0;
        
        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular discount: " + regularCalculator.calculateDiscount(price));
        
        DiscountCalculator vipCalculator = new DiscountCalculator(new VIPDiscount());
        System.out.println("VIP discount: " + vipCalculator.calculateDiscount(price));
    }
}

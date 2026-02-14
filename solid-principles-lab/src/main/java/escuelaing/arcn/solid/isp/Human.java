package escuelaing.arcn.solid.isp;

public class Human implements Workable, Eatable {
    
    @Override
    public void work() {
        System.out.println("Working...");
    }
    
    @Override
    public void eat() {
        System.out.println("Eating lunch...");
    }
}

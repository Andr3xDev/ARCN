package escuelaing.arcn.solid.isp;

public class Human implements Workable, Eatable {
    private boolean hasEaten = false;
    
    @Override
    public void work() {
        System.out.println("Working...");
    }
    
    @Override
    public void eat() {
        hasEaten = true;
        System.out.println("Eating lunch...");
    }
    
    public boolean hasEaten() {
        return hasEaten;
    }
}

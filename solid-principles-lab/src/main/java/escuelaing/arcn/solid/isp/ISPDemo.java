package escuelaing.arcn.solid.isp;

public class ISPDemo {
    
    public static void main(String[] args) {
        Workable developer = new Developer();
        developer.work();
        
        Workable robot = new Robot();
        robot.work();
        
        Human human = new Human();
        human.work();
        human.eat();
    }
}

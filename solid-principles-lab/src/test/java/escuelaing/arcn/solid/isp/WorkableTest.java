package escuelaing.arcn.solid.isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkableTest {
    
    @Test
    public void testDeveloperWork() {
        Developer dev = new Developer();
        assertEquals(0, dev.getLinesOfCode());
        dev.work();
        assertEquals(100, dev.getLinesOfCode());
    }
    
    @Test
    public void testRobotWork() {
        Robot robot = new Robot();
        assertEquals(0, robot.getTasksProcessed());
        robot.work();
        assertEquals(1, robot.getTasksProcessed());
    }
    
    @Test
    public void testHumanEat() {
        Human human = new Human();
        assertFalse(human.hasEaten());
        human.eat();
        assertTrue(human.hasEaten());
    }
}

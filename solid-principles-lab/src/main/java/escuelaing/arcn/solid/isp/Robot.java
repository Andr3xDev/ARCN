package escuelaing.arcn.solid.isp;

public class Robot implements Workable {
    private int tasksProcessed = 0;
    
    @Override
    public void work() {
        tasksProcessed++;
        System.out.println("Processing tasks...");
    }
    
    public int getTasksProcessed() {
        return tasksProcessed;
    }
}

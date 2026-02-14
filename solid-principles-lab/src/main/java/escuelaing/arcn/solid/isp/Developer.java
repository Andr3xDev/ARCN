package escuelaing.arcn.solid.isp;

public class Developer implements Workable {
    private int linesOfCode = 0;
    
    @Override
    public void work() {
        linesOfCode += 100;
        System.out.println("Writing code...");
    }
    
    public int getLinesOfCode() {
        return linesOfCode;
    }
}

package escuelaing.arcn.solid;

import escuelaing.arcn.solid.srp.SRPDemo;
import escuelaing.arcn.solid.ocp.OCPDemo;
import escuelaing.arcn.solid.lsp.LSPDemo;
import escuelaing.arcn.solid.isp.ISPDemo;
import escuelaing.arcn.solid.dip.DIPDemo;

/**
 * Laboratorio de Principios SOLID
 */
public class App {
    public static void main(String[] args) {
        System.out.println("=== SOLID Laboratory ===");
        System.out.println("Executing SOLID principles examples in order:\n");
        
        System.out.println("1. SRP - Single Responsibility Principle");
        SRPDemo.main(args);
        
        System.out.println("\n2. OCP - Open/Closed Principle");
        OCPDemo.main(args);
        
        System.out.println("\n3. LSP - Liskov Substitution Principle");
        LSPDemo.main(args);
        
        System.out.println("\n4. ISP - Interface Segregation Principle");
        ISPDemo.main(args);
        
        System.out.println("\n5. DIP - Dependency Inversion Principle");
        DIPDemo.main(args);
        
        System.out.println("\n=== End of Laboratory ===");
    }
}

package escuelaing.arcn.solid.srp;

public class InvoicePrinter {
    
    public void print(Invoice invoice) {
        System.out.println("Invoice for: " + invoice.getCustomer());
        System.out.println("Total: " + invoice.calculateTotal());
    }
}

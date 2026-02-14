package escuelaing.arcn.solid.srp;

public class InvoiceRepository {
    
    public void save(Invoice invoice) {
        System.out.println("Saving invoice for " + invoice.getCustomer() + " to database...");
    }
}

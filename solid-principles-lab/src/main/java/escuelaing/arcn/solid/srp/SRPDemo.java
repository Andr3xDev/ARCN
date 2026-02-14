package escuelaing.arcn.solid.srp;

public class SRPDemo {
    
    public static void main(String[] args) {
        Invoice invoice = new Invoice("John Doe", 100.0);
        
        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);
        
        InvoiceRepository repository = new InvoiceRepository();
        repository.save(invoice);
    }
}

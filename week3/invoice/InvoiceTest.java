
package week3.invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice item = new Invoice("101", "Keyboard", 3, 25.0);

        System.out.println("Part Number: " + item.getPartNumber());
        System.out.println("Description: " + item.getPartDescription());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price: " + item.getPrice());

        System.out.println("Total: " + item.getInvoiceAmount());

        item.setPartNumber("102");
        item.setPartDescription("Mouse");
        item.setQuantity(2);
        item.setPrice(15.0);

        System.out.println("New Part: " + item.getPartNumber());
        System.out.println("New Description: " + item.getPartDescription());
        System.out.println("New Total: " + item.getInvoiceAmount());

        item.setQuantity(-5);
        item.setPrice(-10);

        System.out.println("Invalid Quantity: " + item.getQuantity());
        System.out.println("Invalid Price: " + item.getPrice());
        System.out.println("Final Total: " + item.getInvoiceAmount());
    }
}

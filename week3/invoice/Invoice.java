
package week3.invoice;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price) {
        partNumber = number;
        partDescription = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public void setPartNumber(String number) {
        partNumber = number;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        partDescription = description;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}

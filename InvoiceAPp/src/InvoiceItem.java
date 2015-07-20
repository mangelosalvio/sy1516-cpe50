public class InvoiceItem {
    private String productName;
    double quantity, price, amount;

    public InvoiceItem(String productName, double quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.amount = quantity * price;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getProductName() + "\t" + this.getQuantity() + "\t" +
                this.getPrice() + "\t" + this.getAmount();

    }
}

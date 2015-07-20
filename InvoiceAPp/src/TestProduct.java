import javax.swing.*;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        InvoiceItem[] items = new InvoiceItem[10];

        products[0] = new Product("Product1","111",1);
        products[1] = new Product("Product2","222",2);
        products[2] = new Product("Product3","333",3);
        products[3] = new Product("Product4","444",4);
        products[4] = new Product("Product5","555",5);

        int item_index = 0;



        while ( true ){

            String barcode = JOptionPane.showInputDialog("Enter barcode");

            if ( barcode.toLowerCase().equals("quit") ){
                displayItems(items);
                break;
            } else {
                /**
                 * look for barcode
                 */
                Product p = getProduct(products,barcode);

                if ( p == null ){
                    /**
                     * product not found
                     */

                    System.out.println(p);
                    JOptionPane.showMessageDialog(null, "Barcode not found");
                } else {

                    /**
                     * check if items exceeded
                     */

                    if ( item_index < items.length ){
                        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter Quantity"));
                        items[item_index] = new InvoiceItem(p.getProductName(),quantity, p.getPrice());
                        item_index++;

                        displayItems(items);
                    } else {
                        /**
                         * items exceeded
                         */
                        JOptionPane.showMessageDialog(null, "Items exceeded");

                        displayItems(items);
                        break;

                    }
                }

            }
        }
    }

    public static void displayItems(InvoiceItem[] items){
        String content = "";
        for ( InvoiceItem item : items ) {
            if ( item != null ) {
                content += item + "\n";
            }
        }

        String header = "Product\tQty\tPrice\tAmount\n";
        JOptionPane.showMessageDialog(null, new JTextArea( header + content ));
    }

    public static Product getProduct(Product[] products,String barcode)
    {
        for ( Product product : products ) {
            if ( product.getBarcode().equals(barcode) ){
                return product;
            }
        }

        return null;
    }
}

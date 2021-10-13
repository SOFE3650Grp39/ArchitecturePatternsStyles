public class CashRegister {
private ViewInterface display = new Display();
private ViewInterface ticketPrinter = new TicketPrinter();
private Product currentProduct;
private ProductDB productDB = new ProductDB();
private int UPCCode;

public void setCurrentProductUPC(int UPCCode) {
                this.UPCCode = UPCCode;
                this.currentProduct = this.getCurrentProductInfo();

                if (this.currentProduct != null) { // Prints only when the product is defined
                        this.display.displayText(this.currentProduct.toString()); // Displays the scanned item
                        this.ticketPrinter.displayText(this.currentProduct.toString());
              }
        }

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}

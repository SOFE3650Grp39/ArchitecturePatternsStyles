public class Product {
private int UPCCode;
        private String name;
        private double price;
        public Product(int UPCCode, String name, double price) {
                this.UPCCode = UPCCode;
               this.name = name;
                this.price = price;
        }

           public void setUPCCode(int UPCCode) {
                this.UPCCode = UPCCode;
        }

           public int getUPCCode() {
                return UPCCode;
       }

public String toString() {
                return "Product{" + "UPCCode=" + UPCCode + ", name='" + name + '\'' + ", price=" + price + “}”;
        }
}

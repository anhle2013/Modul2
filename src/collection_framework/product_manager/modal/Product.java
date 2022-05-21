package collection_framework.product_manager.modal;

public class Product {
    private int idProduct;
    private String productName;
    private int importPrice;

    public Product(int idProduct, String productName, int price) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.importPrice = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", price=" + importPrice +
                '}';
    }
}

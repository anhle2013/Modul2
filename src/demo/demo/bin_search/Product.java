package demo.demo.bin_search;

public class Product {
    private String name;
    private int price;
    private int quality;

    public Product() {}
    public Product(String name, int price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return " {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }
}

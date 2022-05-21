package collection_framework.product_manager.modal;

import java.util.Comparator;

public class ASCByImportPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getImportPrice() - p2.getImportPrice();
    }
}

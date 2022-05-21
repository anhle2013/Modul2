package collection_framework.product_manager.modal;

import java.util.Comparator;

public class DESByImportPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getImportPrice() - p1.getImportPrice();
    }
}

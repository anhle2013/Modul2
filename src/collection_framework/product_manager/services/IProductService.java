package collection_framework.product_manager.services;

import collection_framework.product_manager.modal.Product;
import java.util.List;

public interface IProductService {
    Product findById(int id);
    boolean existById(int id);

    void addProduct(Product product);
    void editImportPrice(int id, int newPrice);
    void editProductName(int id, String newName);
    Product removeProduct(int id);
    List<Product> findProduct(String key);
    List<Product> findAll();
    List<Product> findAllByPriceASC();
    List<Product> findAllByPriceDES();


}

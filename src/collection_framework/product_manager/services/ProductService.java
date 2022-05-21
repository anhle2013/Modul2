package collection_framework.product_manager.services;

import collection_framework.product_manager.modal.ASCByImportPrice;
import collection_framework.product_manager.modal.DESByImportPrice;
import collection_framework.product_manager.modal.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    public final List<Product> productsList;
    public ProductService() {
        this.productsList = new ArrayList<>();
        productsList.add(new Product(2,"two",20));
        productsList.add(new Product(44,"four",4000));
        productsList.add(new Product(6666,"six",60000));
    }

    @Override
    public void addProduct(Product newProduct) {
        productsList.add(newProduct);
    }

    @Override
    public void editImportPrice(int id, int newPrice) {
        int index = getIndexProduct(id);
        productsList.get(index).setImportPrice(newPrice);
    }

    @Override
    public void editProductName(int id, String newName) {
        int index = getIndexProduct(id);
        productsList.get(index).setProductName(newName);
    }

    @Override
    public Product removeProduct(int id) {
        int index = getIndexProduct(id);
        return productsList.remove(index);
    }

    @Override
    public List<Product> findProduct(String key) {
        List<Product> products = new ArrayList<>();
        for (Product product: productsList)
            if (product.getProductName().contains(key) || String.valueOf(product.getIdProduct()).contains(key))
                products.add(product);
        return products;
    }

    @Override
    public List<Product> findAll() {
        return productsList;
    }

    @Override
    public List<Product> findAllByPriceASC() {
        List<Product> products = new ArrayList<>(productsList);
        products.sort(new ASCByImportPrice());
        return products;
    }

    @Override
    public List<Product> findAllByPriceDES() {
        List<Product> products = new ArrayList<>(productsList);
        products.sort(new DESByImportPrice());
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product: productsList)
            if (product.getIdProduct() == id)
                return product;
        return null;
    }

    @Override
    public boolean existById(int id) {
        return findById(id) != null;
    }



    private int getIndexProduct(int id) {
        for (int i = 0; i < productsList.size(); i++)
            if (productsList.get(i).getIdProduct() == id)
                return i;
        return -1;
    }
}

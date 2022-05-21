package collection_framework.product_manager.view;

import collection_framework.product_manager.modal.Product;
import collection_framework.product_manager.services.IProductService;
import collection_framework.product_manager.services.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    IProductService productService = new ProductService();
    public Scanner scanner = new Scanner(System.in);
    int choice;

    public void menuManager() {
        System.out.println("Menu Product Manager");
        System.out.println();
        System.out.println("1. Add new Product");
        System.out.println("2. Edit product");
        System.out.println("3. Remove product");
        System.out.println("4. Search product (by name and id)");
        System.out.println("5. Display products");
        System.out.println();
        System.out.println("0. Exit");
        System.out.print("Choose your action: ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                editProduct();
                break;
            case 3:
                int id = inputId();
                Product removed = productService.removeProduct(id);
                System.out.println("Removed: " + removed);
                break;
            case 4:
                String key = inputKeyword();
                displayProducts(productService.findProduct(key));
                break;
            case 5:
                selectDisplayAction();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid action! Please select again!");

        }
    }

    public void addProduct() {
        int idProduct;
        boolean existId;
        String productName;
        int importPrice;
        System.out.println("Add new product:");
        do {
            System.out.print("Enter id: ");
            idProduct = Integer.parseInt(scanner.nextLine());
            existId = productService.existById(idProduct);
            if (existId)
                System.out.println("This ID already available! Try another id!");
        } while (existId);

        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
        System.out.print("Enter import price: ");
        importPrice = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(idProduct,productName,importPrice);
        productService.addProduct(newProduct);
    }

    public void editProduct() {
        int idProduct;
        boolean existId;
        System.out.print("Enter ID of product that needs to be change information: ");
        idProduct = Integer.parseInt(scanner.nextLine());
        existId = productService.existById(idProduct);
        if(existId)
            selectEditAction(idProduct);
        else {
            System.out.println("Invalid id!");
            reInputIdToEdit();
        }
    }
    private void selectEditAction(int id) {
        System.out.println("Select: ");
        System.out.println("1. Edit product name");
        System.out.println("2. Edit import price");
        System.out.println();
        System.out.println("0. 'Cancel action'");
        System.out.print("==> ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.print("Enter new product name: ");
                String newName = scanner.nextLine();
                productService.editProductName(id, newName);
                break;
            case 2:
                System.out.print("Enter new import price: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                productService.editImportPrice(id, newPrice);
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid action!");
                selectEditAction(id);
                break;
        }
    }
    private void reInputIdToEdit() {
        System.out.println();
        System.out.println("Select action:");
        System.out.println("1. Re-input ID to edit");
        System.out.println("0. Cancel action");
        System.out.println();
        System.out.print("==> ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                editProduct();
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid action!");
                reInputIdToEdit();
                break;
        }
    }

    public String inputKeyword() {
        System.out.print("Search key: ");
        String key = scanner.nextLine();
        System.out.printf("\n      SEARCH BY KEY: '%s' \n",key);
        return key;
    }

    public int inputId() {
        System.out.print("Input id of product: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.printf("\n      SEARCH BY ID: '%d' \n",id);
        return id;
    }

    private void selectDisplayAction() {
        System.out.println("Select: ");
        System.out.println("1. Display all products");
        System.out.println("2. Display product list by price ascending");
        System.out.println("3. Display product list by descending price ");
        System.out.println();
        System.out.println("0. 'Cancel action'");
        System.out.print("==> ");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                displayProducts(productService.findAll());
                break;
            case 2:
                displayProducts(productService.findAllByPriceASC());
                break;
            case 3:
                displayProducts(productService.findAllByPriceDES());
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid action!");
                selectDisplayAction();
                break;
        }
    }
    private void displayProducts(List<Product> products) {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*               LIST OF PRODUCTS                  *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("___________________________________________________");
        System.out.println("|  ID  |       Product Name        | Import Price |");
        System.out.println("|------|---------------------------|--------------|");
        for (Product product : products)
            System.out.printf("| %-5d| %-26s| %-13d|\n",
                    product.getIdProduct(), product.getProductName(), product.getImportPrice());
        System.out.println("|______|___________________________|______________|");
    }
}

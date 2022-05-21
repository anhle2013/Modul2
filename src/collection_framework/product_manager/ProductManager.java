//package collection_framework.product_manager;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ProductManager {
//    public static ArrayList<Product> productsList = new ArrayList<>();
//    static Scanner scanner = new Scanner(System.in);
//
//    public ProductManager() {
//    }
//    public static boolean isExistIdProduct(int id) {
//        for (Product product: productsList)
//            if (product.getIdProduct() == id)
//                return true;
//        return false;
//    }
//
//    private static int getIndexProduct(int id) {
//        for (int i = 0; i < productsList.size(); i++)
//            if (productsList.get(i).getIdProduct() == id)
//                return i;
//        return -1;
//    }
//
//    public static void editProduct() {
//        int idProduct;
//        boolean existId;
//        System.out.print("Enter ID of product that needs to be change information: ");
//        idProduct = Integer.parseInt(scanner.nextLine());
//        existId = isExistIdProduct(idProduct);
//        if(existId)
//            selectEdit(idProduct);
//        else {
//            System.out.println("Invalid id!");
//            reInputIdToEdit();
//        }
//    }
//
//    private static void reInputIdToEdit() {
//        System.out.println();
//        System.out.println("Select action:");
//        System.out.println("1. Re-input ID to edit");
//        System.out.println("0. Cancel action");
//        System.out.println();
//        System.out.print("==> ");
//        String key = scanner.nextLine();
//        switch (key) {
//            case "1":
//                editProduct();
//                break;
//            case "0":
//                break;
//            default:
//                System.out.println("Invalid action!");
//                reInputIdToEdit();
//                break;
//        }
//    }
//    private static void selectEdit(int idProduct) {
//        System.out.println("Select: ");
//        System.out.println("1. Edit product name");
//        System.out.println("2. Edit import price");
//        System.out.println();
//        System.out.println("0. 'Cancel action'");
//        System.out.print("==> ");
//        String key = scanner.nextLine();
//        switch (key) {
//            case "1":
//                editProductName(idProduct);
//                break;
//            case "2":
//                editImportPrice(idProduct);
//                break;
//            case "0":
//                break;
//            default:
//                System.out.println("Invalid action!");
//                selectEdit(idProduct);
//                break;
//        }
//    }
//    private static void editImportPrice(int idProduct) {
//        int indexProduct = getIndexProduct(idProduct);
//        System.out.print("Enter new import price: ");
//        int newPrice = Integer.parseInt(scanner.nextLine());
//        productsList.get(indexProduct).setImportPrice(newPrice);
//    }
//
//    private static void editProductName(int idProduct) {
//        int indexProduct = getIndexProduct(idProduct);
//        System.out.print("Enter new product name: ");
//        String newProductName = scanner.nextLine();
//        productsList.get(indexProduct).setProductName(newProductName);
//    }
//    public static Product removeProduct() {
//        if (productsList.isEmpty())
//            throw new RuntimeException("Not available any product to remove!");
//        int idProduct;
//        boolean existId;
//
//        System.out.print("Enter ID of product needs to remove: ");
//        idProduct = Integer.parseInt(scanner.nextLine());
//        existId = isExistIdProduct(idProduct);
//        if(existId) {
//            int indexProduct = getIndexProduct(idProduct);
//            return productsList.remove(indexProduct);
//        }
//        else {
//            System.out.println("Invalid id!");
//            reInputIdToRemove();
//        }
//        return null;
//    }
//    private static void reInputIdToRemove() {
//        System.out.println();
//        System.out.println("Select action:");
//        System.out.println("1. Re-input ID to remove");
//        System.out.println("0. Cancel action");
//        System.out.println();
//        System.out.print("==> ");
//        String key = scanner.nextLine();
//        switch (key) {
//            case "1":
//                removeProduct();
//                break;
//            case "0":
//                break;
//            default:
//                System.out.println("Invalid action!");
//                reInputIdToRemove();
//                break;
//        }
//    }
//
//    public static void searchProduct() {
//        System.out.print("Search key: ");
//        String key = scanner.nextLine();
//        boolean notFound = true;
//        System.out.println();
//        System.out.printf("      SEARCH BY KEY: '%s' \n",key);
//        System.out.println("___________________________________________________");
//        System.out.println("|  ID  |       Product Name        | Import Price |");
//        System.out.println("|------|---------------------------|--------------|");
//        for (Product product: productsList)
//            if (product.getProductName().contains(key) || String.valueOf(product.getIdProduct()).contains(key)) {
//                System.out.printf("| %-5d| %-26s| %-13d|\n",
//                        product.getIdProduct(),product.getProductName(),product.getImportPrice());
//                System.out.println("|______|___________________________|______________|");
//                notFound = false;
//            }
//        if (notFound)
//            System.out.println("|...............KEY NOT FOUND.....................|");
//
//    }
//}

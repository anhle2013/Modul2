package demo.demo.bin_search;

import java.util.*;

public class TestBinSearch {
    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(10, new Product("apple", 100, 1000));
        productMap.put(1, new Product("orange", 50, 500));
        productMap.put(5, new Product("mango", 300, 10));
        productMap.put(2, new Product("star fruits", 5, 200));
        productMap.put(20, new Product("dragon fruit", 100, 300));
        productMap.put(4, new Product("strawberry", 20, 80));
        productMap.put(6, new Product("blueberry", 100, 100));
        productMap.put(14, new Product("watermelon", 70, 1000));
        productMap.put(8, new Product("banana", 80, 400));
        productMap.put(11, new Product("avocado", 10, 100));
        productMap.put(22, new Product("pineapple", 20, 80));
        productMap.put(16, new Product("blackberry", 100, 100));
        productMap.put(7, new Product("coconut", 110, 400));
        productMap.put(15, new Product("durian", 130, 200));
        productMap.put(3, new Product("grape", 150, 100));
        System.out.println(productMap.keySet());


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search key: ");
        int searchKey = Integer.parseInt(scanner.nextLine());
//        Product found = find(productMap,searchKey);
//        if (found != null)
//            System.out.println(found);
//        else
//            System.out.printf("Not found any product with key '%d'",searchKey);

        Integer[] keys = new Integer[productMap.keySet().size()];
        productMap.keySet().toArray(keys);
        System.out.println(Arrays.toString(keys));
        bubbleSort(keys);
        System.out.println(Arrays.toString(keys));
        //Object[] keys = productMap.keySet().toArray();
        int index = binarySearch(keys,searchKey);
        if (index != -1)
            System.out.println("Product with key '" + searchKey + "': " + productMap.get(searchKey));
        else
            System.out.printf("Not found any product with key '%d'",searchKey);
    }

    public static int binarySearch(Integer[] keys, int searchKey) {
        int mid;
        int left = 0;
        int right = keys.length -1;
        while(left <= right) {
            mid = (left + right) / 2;
            if (keys[mid] == searchKey)
                return mid;
            if (searchKey > keys[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static Product find(HashMap<Integer,Product> map, int searchKey) {
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet)
            if (searchKey == key)
                return map.get(key);
        return null;
    }

    public static void bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }


//        Map<Integer, Product> treeMap = new TreeMap<Integer, Product>(productMap);
//        System.out.println(treeMap);
}

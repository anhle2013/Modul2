package demo.generic;

public class DemoGenerics {
    public static <T> void printArrayWithGeneric(T[] array) {
        for ( T element : array ){
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static void printArray(Object[] array) {
        for (Object element : array){
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    public static void main( String args[] ){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = { 1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};

        printArrayWithGeneric(intArray);
        printArrayWithGeneric(doubleArray);
        printArrayWithGeneric(charArray);


        Integer[] arr = new Integer[] {10,20,30,40,50};
        Double[] arr2 = new Double[] {10.1,20.2,30.3,40.4};
        printArray(arr);
        printArray(arr2);

    }
}


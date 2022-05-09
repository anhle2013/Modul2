package demo.demo;


public class Exx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0, j=1; i < 5; i++, j+=2)
            arr[i] = j;

        System.out.println(arr[1]);
    }
}

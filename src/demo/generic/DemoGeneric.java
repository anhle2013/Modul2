package demo.generic;
import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(10);

        //mylist.add("Hello");

        System.out.println(mylist.get(0));
    }
}
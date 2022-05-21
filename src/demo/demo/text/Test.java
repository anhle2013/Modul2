package demo.demo.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("test.txt"));

        int intValue = input.nextInt();

        String line = input.nextLine();
        System.out.println(intValue);
        System.out.println(line);
    }
}

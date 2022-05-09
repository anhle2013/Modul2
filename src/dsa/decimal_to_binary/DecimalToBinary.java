package dsa.decimal_to_binary;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number to convert: ");
        int number = Integer.parseInt(scanner.nextLine());
        BinaryStack stack = new BinaryStack();

        System.out.print(number);
        stack.convertDecimalToBinary(number);

    }
}

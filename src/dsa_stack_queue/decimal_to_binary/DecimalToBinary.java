package dsa_stack_queue.decimal_to_binary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a decimal number to convert: ");
            number = Integer.parseInt(scanner.nextLine());
            BinaryStack stack = new BinaryStack();

            System.out.print(number);
            stack.convertDecimalToBinary(number);
        } while (number > 0);

    }

}

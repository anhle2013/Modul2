package array_and_methods.count_character;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "1234567890abcabc";
        System.out.print("Enter a char: ");
        char character = sc.next().charAt(0);

        int count_char = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i))
                count_char++;
        }
        System.out.printf("Character '%s' has appeared %d time(s) in string '%s'", character, count_char, str);
    }
}
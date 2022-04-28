package introduction_to_java.currency_exchange;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount (USD): ");
        int USD = scanner.nextInt();
        int VND = 23000 * USD;
        System.out.printf("%d USD = %d VND",USD, VND);

    }
}


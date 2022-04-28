package loop_in_java.loan_interest;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();
        System.out.print("Enter interest rate (%): ");
        double interestRate = scanner.nextDouble();

        double totalInterest = amount * (interestRate/100)/12 * month;
        System.out.println("Total of interest: " + totalInterest);
    }
}

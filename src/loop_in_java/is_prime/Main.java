package loop_in_java.is_prime;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number < 2) isPrime = false;
        else if (number > 2) {
            for (int i = 2; i < number; i++ ) {
               if (number % i == 0)
                   isPrime = false;
               break;
            }
        }
        if (isPrime) System.out.printf("%d is prime number", number);
        else System.out.printf("%d is NOT prime number", number);
    }
}

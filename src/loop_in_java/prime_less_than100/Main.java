package loop_in_java.prime_less_than100;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        System.out.println("List of 20 first prime numbers: ");
        while (true) {
            if (number > 100) break;
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

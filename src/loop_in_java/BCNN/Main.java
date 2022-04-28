package loop_in_java.BCNN;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        int max = a, BCNN;

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("No least common multiple");
        } else {
            if (b > max) max = b;
            if (c > max) max = c;
            for ( ; ; max++) {
                if ((max % a == 0) && (max % b == 0) && (max % c == 0)) {
                    BCNN = max;
                    break;
                }
            }
            System.out.println("BCNN: " + BCNN);
        }
    }
}

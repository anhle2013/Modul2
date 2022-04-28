package introduction_to_java.scanner;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.printf("Hello: %s", name);
    }
}

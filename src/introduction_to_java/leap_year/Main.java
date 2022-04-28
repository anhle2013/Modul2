package introduction_to_java.leap_year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;
        if ((year % 4 == 0) && (year % 100 != 0)) isLeapYear = true;
        if (year % 400 == 0) isLeapYear = true;

        if (isLeapYear) System.out.printf("%d is a leap year", year);
        else System.out.printf("%d is NOT a leap year", year);
    }
}

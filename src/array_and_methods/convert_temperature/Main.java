package array_and_methods.convert_temperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            if (choice < 0 || choice > 2)
                System.out.println("Invalid choice!");

            double temperature;
            switch (choice) {
                case 1:
                    System.out.println("\nFahrenheit to Celsius");
                    System.out.print("Enter a temperature to convert: ");
                    temperature = sc.nextDouble();
                    System.out.printf("%.1f F = %.1f C", temperature, fahrenheitToCelsius(temperature));
                    break;
                case 2:
                    System.out.println("\nCelsius to Fahrenheit");
                    System.out.print("Enter a temperature to convert: ");
                    temperature = sc.nextDouble();
                    System.out.printf("%.1f C = %.1f F", temperature, celsiusToFahrenheit(temperature));
                    break;
                case 0:
                    System.exit(0);

            }
        } while ((choice < 0 || choice > 2));
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

package introduction_to_java.bmi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        height = scanner.nextDouble();

        bmi = weight/ Math.pow(height,2);
        if (bmi <18.5) System.out.println("Underweight");
        else if (bmi <25) System.out.println("Normal");
        else if (bmi <30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}

package introduction_to_java.read_number;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (max 3 digit number): ");
        int abc = scanner.nextInt();
        int a = abc / 100;
        int bc = abc - a * 100;
        int b = bc / 10;
        int c = bc % 10;
        String read_a="";
        String read_b="";
        String read_c="";

        switch (a) {
            case 1:
                read_a += "one";
                break;
            case 2:
                read_a += "two";
                break;
            case 3:
                read_a += "three";
                break;
            case 4:
                read_a += "four";
                break;
            case 5:
                read_a += "five";
                break;
            case 6:
                read_a += "six";
                break;
            case 7:
                read_a += "seven";
                break;
            case 8:
                read_a += "eight";
                break;
            case 9:
                read_a += "nine";
                break;
        }
        switch (b) {
            case 1:
                switch (c) {
                    case 0:
                        read_c += "ten";
                        break;
                    case 1:
                        read_c += "eleven";
                        break;
                    case 2:
                        read_c += "twelve";
                        break;
                    case 3:
                        read_c += "thirteen";
                        break;
                    case 4:
                        read_c += "fourteen";
                        break;
                    case 5:
                        read_c += "fifteen";
                        break;
                    case 6:
                        read_c += "sixteen";
                        break;
                    case 7:
                        read_c += "seventeen";
                        break;
                    case 8:
                        read_c += "eighteen";
                        break;
                    case 9:
                        read_c += "nineteen";
                        break;
                }
                break;
            case 2:
                read_b += "twenty";
                break;
            case 3:
                read_b += "thirty";
                break;
            case 4:
                read_b += "fourty";
                break;
            case 5:
                read_b += "fifty";
                break;
            case 6:
                read_b += "sixty";
                break;
            case 7:
                read_b += "seventy";
                break;
            case 8:
                read_b += "eighty";
                break;
            case 9:
                read_b += "ninety";
                break;
        }
        if (b != 1) {
            switch (c) {
                case 0:
                    break;
                case 1:
                    read_c += " one";
                    break;
                case 2:
                    read_c += " two";
                    break;
                case 3:
                    read_c += " three";
                    break;
                case 4:
                    read_c += " four";
                    break;
                case 5:
                    read_c += " five";
                    break;
                case 6:
                    read_c += " six";
                    break;
                case 7:
                    read_c += " seven";
                    break;
                case 8:
                    read_c += " eight";
                    break;
                case 9:
                    read_c += " nine";
                    break;
            }
        }
        System.out.printf("%d reads as %s hundred and %s%s",abc,read_a,read_b,read_c);
    }
}

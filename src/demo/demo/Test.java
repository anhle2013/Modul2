package demo.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Select a payment method:");
        PaymentGateways paymentGateways = new PaymentGateways() {
            @Override
            public void payment() {
                System.out.println("Cancel");
            }
        };
        //PaymentGateways paymentGateways;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("transfer"))
            paymentGateways = new Transfer();
        else if (input.equals("cash"))
            paymentGateways = new Cash();

        paymentGateways.payment();
    }
}

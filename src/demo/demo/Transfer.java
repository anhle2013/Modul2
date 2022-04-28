package demo.demo;

public class Transfer implements PaymentGateways {
    @Override
    public void payment() {
        System.out.println("Payment with transfer");
    }
}

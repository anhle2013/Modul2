package demo.demo;

public class Cash implements PaymentGateways{
    @Override
    public void payment() {
        System.out.println("Payment with cash");
    }
}

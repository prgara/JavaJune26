package aug11;

public class PayPal implements Payable{

    @Override
    public void processPayment() {
        System.out.println("Money transferred through paypal");
    }
}

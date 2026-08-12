package aug11;

public class CreditCard implements Payable {
    @Override
    public void processPayment() {
        System.out.println("Charging $ amount to credit card");
    }
}

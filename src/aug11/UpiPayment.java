package aug11;

public class UpiPayment implements Payable{
    @Override
    public void processPayment() {
        System.out.println("Upi payment done");
    }
}

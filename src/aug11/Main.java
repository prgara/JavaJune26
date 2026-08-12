package aug11;

public class Main {


    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog)a;

        Dog dog = new Dog();
        dog.sound();

        Payable creditCard = new UpiPayment();
        creditCard.processPayment();
        System.out.println(Payable.amount);
    }
}

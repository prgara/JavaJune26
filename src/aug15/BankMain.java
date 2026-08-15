package aug15;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        try{

            bank.withdraw(500);
        }catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println("Net balance is : "+ bank.balance);
    }
}

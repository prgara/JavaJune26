package aug15;

public class Bank {
    int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        if (amount > balance) {
        throw new InsufficientBalanceException("Amount should be less than balance");
        }
        balance = balance - amount;
        System.out.println("withdraw successfull for $" + amount );
    }

}

package aug08;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount() {
    }

    String getOwner(){
        return owner;
    }


    public double getBalance() {
        return balance;
    }


    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount should be grater than 0");
        } else {
            this.balance += amount;
        }
    }

    void withdraw(double amount){
        if(amount > 0 && amount <=balance) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}

package thread.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public  double getBalance() {
        return balance;
    }

    public  void withdraw(double amount){
        this.balance-=amount;
    }
    public  void deposit(double amount){
        this.balance+=amount;
    }

}

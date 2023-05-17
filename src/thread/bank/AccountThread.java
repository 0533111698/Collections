package thread.bank;

public class AccountThread extends Thread{
    private BankAccount bankAccount;
    private String name;

    public AccountThread(BankAccount bankAccount, String name) {
        this.bankAccount = bankAccount;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            synchronized (bankAccount) {
                int num = (int) (Math.random() * 2) + 1;
                if (num == 1) {
                    bankAccount.withdraw(100);
                    System.out.println(bankAccount.getBalance() + name + " " + (-100));
                } else {
                    bankAccount.deposit(50);
                    System.out.println(bankAccount.getBalance() + name + " " + (+50));
                }

            }
        }
    }
}

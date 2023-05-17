package thread.bank;

public class ProgramAccount {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(200.00);
        AccountThread t1=new AccountThread(bankAccount,"t1");
        AccountThread t2=new AccountThread(bankAccount,"t2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        System.out.println("The balance is: "+bankAccount.getBalance());

    }
}

package thread.bank;

public class progi {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount(200.00);
        for (int i = 0; i <5; i++) {
            int num=(int) (Math.random()*2)+1;
            if (num==1) {
                bankAccount1.withdraw(100);
                System.out.println(bankAccount1.getBalance());
            }else{
                bankAccount1.deposit(50);
                System.out.println(bankAccount1.getBalance());}

        }
        System.out.println("The balance is"+bankAccount1.getBalance());
    }
}

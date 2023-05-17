package thread;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        MyThread th1=new MyThread("th1");
        th1.start();
        MyThread th2=new MyThread("th2");
        th1.start();
        Thread.sleep(100);

    }
}

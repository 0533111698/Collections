package thread.repository;

public class Program {
    public static void main(String[] args) {
        Repository repository=new Repository();
        FillThread fillThread1=new FillThread(repository,"fil1");
        FillThread fillThread2=new FillThread(repository,"fil2");
        fillThread1.start();
        fillThread2.start();

        try {
            fillThread2.join();
            fillThread1.join();
        } catch (InterruptedException e) {

        } System.out.println(repository);


    }
}

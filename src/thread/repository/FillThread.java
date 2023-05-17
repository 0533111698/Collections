package thread.repository;

public class FillThread extends Thread{
    private Repository repository;
    private String name;

    public FillThread(Repository repository, String name) {
        this.repository = repository;
        this.name = name;
    }

    public Repository getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "FillThread{" +
                "repository=" + repository +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            repository.addNumber((int) (Math.random()*10)+1);}

        }

}

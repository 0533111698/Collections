package thread.repository;

import java.util.List;
import java.util.Vector;

public class Repository {
    private List<Integer>list;

    public Repository() {
        this.list = new Vector<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public void addNumber(int num){
        list.add(num);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "list=" + list +
                '}';
    }
}

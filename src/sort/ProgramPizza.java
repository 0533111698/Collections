package sort;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramPizza {
    public static void main(String[] args) {
        ArrayList<Pizza>myList=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            myList.add(new Pizza((int) (Math.random()*7)+1,(double) (Math.random()*41)+10));

        }
        System.out.println(myList);
        Collections.sort(myList,new MyPizzaCompare());
        System.out.println(myList);
    }
}

package sort;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramWheel  {
    public static void main(String[] args) {
        ArrayList<Wheel>myList=new ArrayList<>();
        for (int i = 0; i <5; i++) {
            myList.add(new Wheel((int)(Math.random()*41)+10));

        }
        for (Wheel wheels:myList) {
            System.out.print(wheels+" ");

        }
        Collections.sort(myList);
        System.out.println("\n"+myList);
    }



}

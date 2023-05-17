package api.Arreylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        Random random=new Random();
        int max=0;
        int min=50;
        int sum=0;
        for (int i = 0; i <10; i++) {
           myList.add(random.nextInt(50)+1);
            System.out.print(myList.get(i)+" ");
            if (myList.get(i)>max){
                max=myList.get(i);
            }
            if (myList.get(i)<min){
                min=myList.get(i);}
            sum+=myList.get(i);
        }
        System.out.println("\n"+"max= "+max+" min= "+min+" sum= "+sum);

    }
}

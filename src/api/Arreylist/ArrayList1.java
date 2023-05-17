package api.Arreylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> mylist1=new ArrayList<>(5);
        mylist1.add("malki");
        mylist1.add("Chani");
        mylist1.add("Pessi");
        mylist1.add("Ari");
        mylist1.add("Shimhi");
        System.out.println(mylist1);
        int max=0;
        String maxMyList = " ";
        for (int i = 0; i <5; i++) {
            if (mylist1.get(i).length()>max){
                max=mylist1.get(i).length();
            maxMyList=mylist1.get(i);}


        }
        System.out.println(max);
        System.out.println(maxMyList);

    }
}

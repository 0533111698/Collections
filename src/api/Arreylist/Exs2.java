package api.Arreylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exs2 {
    public static void main(String[] args) {
        List<Geolocation> myList=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            myList.add(new Geolocation((double)(Math.random()*10)+4,(double)(Math.random()*10)+4));

        }

        int counterArr=1;
        for (Geolocation a:myList) {
            System.out.println((counterArr++)+" "+a);

        }
//        Iterator<Geolocation>it=myList.iterator();
//        while (it.hasNext()){
//            if (it.next().getLongitude()>10){
//                it.remove();
//            }
//        }
//        for (Geolocation x:myList) {
//            if (x.getLongitude()>10)
//                myList.remove();
//
//        }
        int counterArr1=1;
        for (Geolocation b:myList) {
            System.out.println((counterArr1++)+" "+b);}
//        for (Geolocation x:myList) {
//            if (x.getLongitude()>10)
//                x.
//
//        }


//         myList.removeIf(x->(x.getLongitude()>10));


//        int counterArr2=1;
//        for (Geolocation a:myList) {
//            System.out.println((counterArr2++)+" "+a);








    }
}

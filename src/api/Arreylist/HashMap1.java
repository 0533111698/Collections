package api.Arreylist;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String> myMap=new HashMap<>();
        myMap.put("A1234","Steve Jobs");
        myMap.put("A1235","Scott McNealy");
        myMap.put("A1236","Jeff Bezos");
        myMap.put("A1237","Bill Gates");

            System.out.println(myMap.keySet().toString()+myMap.values());


    }
}

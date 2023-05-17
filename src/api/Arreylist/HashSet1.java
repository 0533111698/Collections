package api.Arreylist;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String>email=new HashSet<>();
        email.add("a0533111698");
        email.add("b0548583108");
        email.add("Shalom");
        email.add("a0533111698");
        for (String a:email) {
            System.out.println(a);

        }
        HashSet<String>ID=new HashSet<>();
        ID.add("315747600");
        ID.add("315747618");
        ID.add("Shalom");
        ID.add("315747600");
        for (String b:ID) {
            System.out.println(b);

        }
        System.out.println("-----");
        for (String a:email) {
            for (String b:ID) {
                if (a.equals(b))
                    System.out.println(a);

            }


        }

    }
}

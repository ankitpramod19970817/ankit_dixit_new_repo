package org.example.Practice_Codeing;
/*count no of strings based on some condition*/

import java.util.ArrayList;

public class Streams2 {
    public static void main(String[] args) {
        ArrayList<String>l=new ArrayList<>();
        l.add("Ankitdixit");l.add("nagarjua");l.add("venkatesh");l.add("Balkrishna");
        long x=l.stream().filter(s->s.length()>=9).count();
        System.out.println(x);
    }

}

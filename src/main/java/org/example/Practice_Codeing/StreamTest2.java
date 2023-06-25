package org.example.Practice_Codeing;

import java.util.ArrayList;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);l.add(20);l.add(25);l.add(30);l.add(35);
        Integer[] i=l.stream().toArray(Integer[]::new);
        for (Integer e:i
             ) {
            System.out.println(e);
        }
    }
}

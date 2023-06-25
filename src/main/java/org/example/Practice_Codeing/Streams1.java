package org.example.Practice_Codeing;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*

public class Streams1 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        List<Integer>l1=new ArrayList<>();
        for (Integer i:l
             ) {
            l1.add(i*2);

        }
        System.out.println(l1);
    }
    }*/
public class Streams1 {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        List<Integer>l1=l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l1);

    }
}



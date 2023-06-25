package org.example.Practice_Codeing;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BifunctionEx1 {
    String name;
    int rollno;
    public BifunctionEx1(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
class Test{
    public static void main(String[] args) {
        ArrayList<BifunctionEx1> l=new ArrayList<>();
        BiFunction<String,Integer,BifunctionEx1> b=(name,rollno)->new BifunctionEx1(name,rollno);
        l.add(b.apply("ram",10));
        l.add(b.apply("james",20));
        for (BifunctionEx1 e:l
             ) {
            System.out.println(e.name);
            System.out.println(e.rollno);
        }
    }
}

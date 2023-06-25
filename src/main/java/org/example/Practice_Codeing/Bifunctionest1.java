package org.example.Practice_Codeing;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Bifunctionest1 {
    String name;
    int id;
    public Bifunctionest1(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
      ArrayList<Bifunctionest1>l=new ArrayList<>();
      BiFunction<String,Integer,Bifunctionest1>b=(name,id)->new Bifunctionest1(name,id);
      l.add(b.apply("Ankit",10));
      l.add(b.apply("ram",11));
        for (Bifunctionest1 x:l
             ) {
            System.out.println(x.name);
            System.out.println(x.id);
        }
    }
}




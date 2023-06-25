package org.example.Practice_Codeing;
/*student object containing two arguments*/

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Bifunction2 {
    String name;
    int rollno;
    public Bifunction2(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public static void main(String[] args) {
        ArrayList<Bifunction2>l=new ArrayList<>();
        BiFunction<String,Integer,Bifunction2>b=(name,rolno)->new Bifunction2(name,rolno);
        l.add(b.apply("Ankit",42));
        l.add(b.apply("ram",32));
        for (Bifunction2 x:l
             ) {
            System.out.println("Name:"+x.name);
            System.out.println("rollno:"+x.rollno);
            System.out.println();

        }
        }
}

package org.example.Practice_Codeing;
/* code to increase employee salary by using Biconsumer and Bifyunction*/

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Salaryincrement {
    String name;
    double salary;

    public Salaryincrement(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args) {
        ArrayList<Salaryincrement>l=new ArrayList<>();
        BiFunction<String, Double, Salaryincrement> f = (name, salary) -> new Salaryincrement(name, salary);
        l.add(f.apply("Ankit",50000.0));
        l.add(f.apply("ram",20000.0));
        l.add(f.apply("sohan",40000.0));
        BiConsumer<Salaryincrement,Double>c=(s,inc)->s.salary=s.salary+inc;
        for (Salaryincrement x:l
             ) {
            c.accept(x,1000.0);
            c.accept(x,2000.0);
        }
        for (Salaryincrement y:l
             ) {
            System.out.println("name:"+y.name);
            System.out.println("newsalary:"+y.salary);
            System.out.println();
        }
    }
}

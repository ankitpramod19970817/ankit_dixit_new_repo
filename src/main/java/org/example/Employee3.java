package org.example;
/* employee salary increment code*/

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee3 {
    String name;
    double salary;
    public Employee3(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name+".."+salary;
    }
    public static void main(String[] args) {
        ArrayList<Employee3> l=new ArrayList<>();
        populate(l);
        Predicate<Employee3>p=s->s.salary>400000;
        Function<Employee3,Employee3>f=s->{
            s.salary+=477;
            return s;
        };
        for (Employee3 e:l
             ) {
            if (p.test(e))
            {
                System.out.println(f.apply(e));
            }

        }
    }

    public static void populate(ArrayList<Employee3>l){
        l.add(new Employee3("ankit",500000));
        l.add(new Employee3("ram",400000));
        l.add(new Employee3("rohan",300000));
    }
}

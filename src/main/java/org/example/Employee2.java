package org.example;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
/*code to print employee salary sum usinf function8*/

public class Employee2 {
    String name;
    double salary;
    Employee2(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name+"..."+salary;
    }
    public static void main(String[] args) {
        ArrayList<Employee2> l=new ArrayList<>();
        populate(l);
        Function<ArrayList<Employee2>,Double> f= s->{ double d=0;
            for (Employee2 e:l
                 ) {d+= e.salary;
            }
            return d;
        };
        System.out.println("total salary is:"+f.apply(l));
    }
    public static void populate(ArrayList<Employee2>l){
        l.add(new Employee2("ram",10000));
        l.add(new Employee2("rohan",20000));
        l.add(new Employee2("rakesh",30000));
        l.add(new Employee2("roujk",40000));
    }
}

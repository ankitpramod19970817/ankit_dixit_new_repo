package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String designation;
    double salary;
    Employee(String name,String designation,double salary){
        this.designation=designation;
        this.name=name;
        this.salary=salary;
    }
    public static void display(ArrayList<Employee>e,Predicate<Employee>p){
        for (Employee e1:e
        ) {
            if (p.test(e1))
                System.out.println(e1);
        }
    }
    public static void populate(ArrayList<Employee>e){
        e.add(new Employee("developer","Ankit",25000));
        e.add(new Employee("lead","amit",40000));
        e.add(new Employee("manager","ramesh",50000));
        e.add(new Employee("manager","rohan",50000));
    }

    public static void main(String[] args) {
        ArrayList<Employee>e=new ArrayList<>();
         populate(e);
         Predicate<Employee> p=emp->emp.designation.equals("manager");
         display(e,p);
    }
}

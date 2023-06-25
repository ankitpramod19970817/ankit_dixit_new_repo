package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test{
    public static void main(String[] args) {
        List<Employee_Info> list=new ArrayList<>();
        populate(list);
        Predicate<Employee_Info> p=s->s.designation.equals("manager");
        for (Employee_Info empinf:list
             ) {
            if (p.test(empinf)){
                System.out.println(empinf);
            }

        }
    }

    public static void populate(List<Employee_Info> list){
        list.add(new Employee_Info("Ankit","ceo","bangalore"));
        list.add(new Employee_Info("ram","manager","lko"));
        list.add(new Employee_Info("shyam","director","hbd"));
    }
}

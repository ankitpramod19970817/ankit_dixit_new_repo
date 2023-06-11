package org.example;

import java.util.function.Predicate;

public class SoftwareEngineer {
    String name;
    int age;
    boolean iseligible;
    SoftwareEngineer(String name,int age,boolean iseligible){
        this.age=age;
        this.name=name;
        this.iseligible=iseligible;
    }
    public String toString(){
        return name;
    }
}
class Softwareengg {
    public static void main(String[] args) {
        SoftwareEngineer[] e = {
                new SoftwareEngineer("Ankit", 50, false),
                new SoftwareEngineer("Pradeep", 24, true),
                new SoftwareEngineer("Ram", 25, true),
                new SoftwareEngineer("rohan",100,true)
        };
        Predicate<SoftwareEngineer> p = se -> se.age > 23 && se.iseligible == true;
        for (SoftwareEngineer a : e
        ) {

            if (p.test(a)) {
                System.out.println(a);

            }
        }
    }
    }




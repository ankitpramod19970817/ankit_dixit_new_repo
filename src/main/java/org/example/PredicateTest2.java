package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        Predicate<Collection>p=c->c.isEmpty();
        ArrayList l=new ArrayList<>();
        l.add(10);
        System.out.println(p.test(l));


    }
}

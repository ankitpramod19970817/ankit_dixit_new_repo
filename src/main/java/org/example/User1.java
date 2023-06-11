package org.example;

import java.util.function.Predicate;

public class User1 {
    public static void main(String[] args) {
        Predicate<String>p=s->s.equals("Ankit");
        System.out.println(p.test("Ankit"));
        System.out.println(p.test("ram"));
    }
}

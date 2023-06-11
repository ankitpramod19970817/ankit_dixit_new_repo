package org.example;

import java.util.function.Predicate;

public class PredicatTest {
    public static void main(String[] args) {
        Predicate<String> s = a -> a.length() > 10;

        System.out.println(s.test("ankit"));
        System.out.println(s.test("saslaslaslalsadjajdla"));
    };
    }


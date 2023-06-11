package org.example;

import java.util.function.Function;

public class Employee5 {
    public static void main(String[] args) {
        Function<Integer,Integer>f1=s->s+s;
        Function<Integer,Integer>f2=s->s*s*s;
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}

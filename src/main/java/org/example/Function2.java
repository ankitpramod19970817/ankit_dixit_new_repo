package org.example;

import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        Function<Integer,Integer>p=s->s*s;
        System.out.println(p.apply(11));
    }
}

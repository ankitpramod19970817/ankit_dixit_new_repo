package org.example;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<String,Integer>p=s -> s.length();
        System.out.println(p.apply("Rams"));
    }
}

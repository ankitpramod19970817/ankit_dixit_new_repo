package org.example;

import java.util.function.Function;
/* remove space in string*/

public class function3 {
    public static void main(String[] args) {
        Function<String,String>p=s->s.replaceAll(" ","");
        System.out.println(p.apply("My name is ankit"));
    }
}

package org.example;

import java.util.function.Function;
/*no of spaces in given string*/

public class Function4 {
    public static void main(String[] args) {
        String s="My name is ankit";
        Function<String,Integer>p=x->s.length()-s.replaceAll(" ","").length();
        System.out.println(p.apply(s));
    }
}

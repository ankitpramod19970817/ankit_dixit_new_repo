package org.example.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverseelementofstring {
    public static void main(String[] args) {
        String str ="java concept of the day";
        String result= Stream.of(String.valueOf(str).split(" ")).map(x->new StringBuffer(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(result);
    }

}

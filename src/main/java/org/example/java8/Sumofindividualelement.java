package org.example.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sumofindividualelement {
    public static void main(String[] args) {
        int number=12345;
        int result= Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(result);
    }
}

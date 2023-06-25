package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortthreemaxandminnumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(15,20,36,40,85,6,21,98,35);
        list.stream().sorted().limit(3).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}

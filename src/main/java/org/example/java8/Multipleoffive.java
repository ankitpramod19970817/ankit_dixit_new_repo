package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multipleoffive {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,10,21,25,30);
        list.stream().filter(i->i%5==0).forEach(System.out::println);

    }
}

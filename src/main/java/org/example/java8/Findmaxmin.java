package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Findmaxmin {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,50,80,90,999);
       int max= list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}

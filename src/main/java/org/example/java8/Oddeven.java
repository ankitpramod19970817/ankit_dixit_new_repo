package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oddeven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,2,8,6);
        List<Integer> even =list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}

package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Secondlargestelementofarray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,5,98,100,62,89);
        int result=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(result);
    }
}

package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Arraysorting {
    public static void main(String[] args) {
        int array1[]={1,2,3,-1,-2,5};
         List<Integer> result =Arrays.stream(array1).boxed().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(result);
    }
}

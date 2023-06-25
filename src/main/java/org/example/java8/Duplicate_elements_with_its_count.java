package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_elements_with_its_count {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> map=names.stream().filter(x-> Collections.frequency(names,x)>1).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}

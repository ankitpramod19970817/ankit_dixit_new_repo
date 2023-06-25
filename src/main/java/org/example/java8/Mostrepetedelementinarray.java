package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mostrepetedelementinarray {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("A","B","C","A");
        Map<String, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        Map.Entry<String,Long> entry=map.entrySet().stream().min(Map.Entry.comparingByValue()).get();
        System.out.println(entry);
    }
}

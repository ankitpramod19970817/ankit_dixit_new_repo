package org.example.inteview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Most_repeated_element {
    public static void main(String[] args) {
        String str="aabc";
        Map<String,Long> map= Stream.of(String.valueOf(str).split("+")).collect(Collectors.groupingBy(Function.identity()
        ,Collectors.counting()));
        Map.Entry<String,Long> entry=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);
    }
}

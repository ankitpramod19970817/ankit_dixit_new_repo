package org.example.inteview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Print_occurance {
    public static void main(String[] args) {
        String str="ankitdixit";
        Map<String,Long> map=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }


}

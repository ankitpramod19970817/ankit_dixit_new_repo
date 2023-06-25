package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequencyofelementinarraylist {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("pen","erasar","notebook","pencil","pen","erasar");
        Map<String, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

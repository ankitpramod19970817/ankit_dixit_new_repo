package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seperatestring {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("facebook", "twitter", "youtube", "watsup");
        String result= list.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(result);
    }
}

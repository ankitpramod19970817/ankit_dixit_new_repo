package org.example.Practice_Codeing;

import java.util.stream.Stream;

public class StreamsTest4 {
    public static void main(String[] args) {
        Integer[] i={10,23,30,40,50};
        Stream<Integer> x=Stream.of(i);
        x.forEach(System.out::println);
    }
}

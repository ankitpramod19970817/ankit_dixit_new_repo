package org.example.Practice_Codeing;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream<Integer>s=Stream.of(10,20,30,40,45);
        s.forEach(System.out::println);

    }
}

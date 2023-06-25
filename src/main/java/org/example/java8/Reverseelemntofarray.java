package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reverseelemntofarray {
    public static void main(String[] args) {
        int arr1[]= {10,20,30,40,50};
        int []arr= IntStream.rangeClosed(1,arr1.length).map(i->arr1[arr1.length-i]).toArray();
        System.out.println(Arrays.toString(arr));
    }
}

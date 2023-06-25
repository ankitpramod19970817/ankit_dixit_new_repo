package org.example.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mergesortedarray {
    public static void main(String[] args) {
        int arr1[]={5,4,3};
        int arr2[]={8,9,1};
        int result[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(result));
        System.out.println(IntStream.of(5,6,8,1000).max());

    }
}

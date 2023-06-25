package org.example.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Sorttwoarraytosingleone {
    public static void main(String[] args) {
        int arr1[]={2,5,20,8};
        int arr2[]={7,15,9,1};
        int arr3[]= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(arr3));
    }
}

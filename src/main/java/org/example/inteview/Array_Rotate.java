package org.example.inteview;

import java.util.Arrays;

public class Array_Rotate {
    public static void main(String[] args) {
        int result[]=rotate(new int[]{1,2,3,4,5},2);
        System.out.println(Arrays.toString(result));

    }
    public static int[] rotate(int[] arr, int k){
        reverse(arr,0, arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
        return arr;
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

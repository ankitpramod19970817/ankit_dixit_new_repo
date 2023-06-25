package org.example.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicatefromsortedarray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    public static int solution(int arr[]){
        int j=1;
        for (int i=1;i< arr.length;i++){
            if (arr[i]!=arr[i-1]){
                j++;
                System.out.println("j"+j);
            }
            System.out.println("i"+i);
        }
        return j;
    }

}

package org.example.leetcode;

import java.util.Set;
import java.util.TreeSet;

public class MinimumCommonValue {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,6},new int[]{2,3,4,5}));
    }
    public static int solution(int arr1[],int []arr2){
        Set<Integer>s1=new TreeSet<>();
        Set<Integer>s2=new TreeSet<>();
        for (int e1:arr1
             ) {
            s1.add(e1);

        }
        for (int e2:arr2
             ) {
            s2.add(e2);

        }
        for (int e3:s1
             ) {
            if (s2.contains(e3))
                return e3;
        }
        return -1;
    }
}

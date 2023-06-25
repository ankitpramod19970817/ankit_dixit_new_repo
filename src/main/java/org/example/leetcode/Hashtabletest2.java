package org.example.leetcode;

import java.util.HashMap;

public class Hashtabletest2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,4},new int[]{2,6,5}));

    }
    public static boolean solution(int []arr1,int arr2[]){
        HashMap<Integer,Boolean> hashMap=new HashMap<>();
        for (int i:arr1
             ) {
            hashMap.put(i,true);
        }
        for (int j:arr2
             ) {
            hashMap.put(j,true);
            if (hashMap.get(j)!=null) return true;

        }
        return false;
    }
}

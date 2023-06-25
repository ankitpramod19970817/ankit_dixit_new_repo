package org.example.inteview;
//2,5,7,9,-2
//7

import java.util.*;

public class Two_sum {
    public static void main(String[] args) {
        solution(new int[]{2,5,7,9,-2},7);

    }
    public static void solution(int arr[], int target){
        int complement=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            complement=target-arr[i];//2
            if (hashMap.containsKey(complement)){
                list.add(complement);
                list.add(arr[i]);
            }
            else {
                hashMap.put(arr[i],i);//{2:0,
            }


        }
        System.out.println(list);
    }
}

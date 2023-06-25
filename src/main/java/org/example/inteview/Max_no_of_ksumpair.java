package org.example.inteview;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class Max_no_of_ksumpair {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5},5));
    }
    public static int solution(int arr[],int k){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int num:arr){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        int count=0;
        System.out.println(hashMap);
        for (int x:arr
             ) {
            int complement=k-x;
            if (hashMap.containsKey(complement) && hashMap.get(complement)>0){
                count++;
                hashMap.put(complement,hashMap.get(complement)-1);
                hashMap.put(x,hashMap.get(x)-1);
            }
        }
        return count;
    }
}

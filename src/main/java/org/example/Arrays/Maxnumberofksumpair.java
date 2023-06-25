package org.example.Arrays;

import java.util.HashMap;

public class Maxnumberofksumpair {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3},6));

    }

    public static int solution(int nums[], int k) {//map.containsKey(k-nums[i])&& map.get(k-nums[i]>0
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            //to check if that k-nums[i] present and had some value left or already paired
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
                System.out.println(map);
            }else{
                //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
                //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                System.out.println(map);
            }
        }
        return count;
    }
}

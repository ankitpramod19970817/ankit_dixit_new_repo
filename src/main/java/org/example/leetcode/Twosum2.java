package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum2 {
    public static void main(String[] args) {
        int result[]=solution(new int[]{2,7,4,5},9);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int []nums, int target){
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i< nums.length;i++) {
            int g = nums[i];//7
            int r = target - g;//2
            if (hashMap.containsKey(r)) {
                ans[0] = hashmap.get(r);//0
                ans[1] = i;//1
                System.out.println(ans);//
                return ans;
            }
            hashMap.put(nums[i], i);
            System.out.println(hashMap);
        }
        return ans;
    }
}

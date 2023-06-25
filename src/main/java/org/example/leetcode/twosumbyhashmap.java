package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class twosumbyhashmap {
    public static void main(String[] args) {
        int result[]=twoSum(new int[]{2,7,11,15},9);
        System.out.println(result[0]+" "+result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int r = nums[i];
            int g = target - r;
            if (hashmap.containsKey(g)) {
                return new int[]{hashmap.get(nums[i]),i};

            } else {
                hashmap.put(nums[i], i);
            }

        }
        return null;

    }
}

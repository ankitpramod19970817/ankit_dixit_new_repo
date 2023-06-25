package org.example.Arrays;
/*return indices of the array whose sum equals to target */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Twosum {
    public static void main(String[] args) {
        int result[] = twosumtest(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twosumtest(int[] arr, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            int compliment=target-arr[i];
            if (hashMap.containsKey(compliment)){
                return new int[]{hashMap.get(compliment),i};
            }
            hashMap.put(arr[i],i);
        }
        return arr;
    }

}

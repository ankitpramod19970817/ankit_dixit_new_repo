package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1, 4, 5, 6, 11, 9, 10}, 15));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
            int start = 0, end = nums.length - 1;
            int count = 0;
            while (start < end) {
                if (nums[start] + nums[end] == k) {
                    count++;
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < k) {
                    start++;
                } else if (nums[start] + nums[end] > k) {
                    end--;
                }
            }
            return count;
        }
}
//**************************************************************

//*** below code is not correct
  /*public static void main(String[] args) {
      System.out.println(solution(new int[]{1,4,5,6,11,9,10},15));
  }
public static int solution(int arr[],int k){
      int i=0;
      int j= arr.length-1;
      int ans=0;
      while (i<j){
          if (arr[i]+arr[j]==k){
              ans++;
              i++;
              j--;
          } else if (arr[i]+arr[j]<k) {
              i++;
          }
          else
              j--;

      }
      return ans;
}*/






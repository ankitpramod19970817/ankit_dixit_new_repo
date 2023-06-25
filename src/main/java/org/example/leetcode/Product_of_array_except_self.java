package org.example.leetcode;

import java.util.Arrays;

public class Product_of_array_except_self {
    public static void main(String[] args) {
        int nums[]=solution(new int[]{4,5,8,3});

        System.out.println(Arrays.toString(nums));
    }
    public static int[] solution(int nums[]){
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;
    }
}
/*
class Product_of_array_except_self2{
    int []nums={4,5,8,3};
    int n= nums.length;
    int prod=1;
    int[]ans=new int[nums.length];
    for(int i=0;i<n;i++){
    prod*=nums[i];}
    for(int j=0;j<n;j++){
    ans[j]=prod/nums[j];
    }
    return ans;



}
*/

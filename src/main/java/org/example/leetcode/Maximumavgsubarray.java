package org.example.leetcode;

public class Maximumavgsubarray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,12,-5,-6,50,3},4));
    }
    public static double solution(int arr[],int k){
        int sum=0;
        double currentsum=0;
        double maxsum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxsum=sum;
        int start=0;
        int end=k;
        while (end< arr.length){
            sum-=arr[start];
            start++;
            sum+=arr[end];
            end++;
            maxsum=Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }

}


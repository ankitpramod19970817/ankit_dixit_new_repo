package org.example.Arrays;

import java.util.Arrays;

public class Mergesortedarray {
    public static void main(String[] args) {
        int result[]=solution(new int[]{1,2,3,0,0,0},new int[]{2,5,6},3,3);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int nums1[], int nums2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        return nums1;
    }
}

package org.example.leetcode;

public class Maxareaofcontainer {

    public static void main(String[] args) {
        System.out.println(maxarea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxarea(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int currentarea = 0;
        int maxarea = 0;
        while (left < right) {
            currentarea = Math.min(arr[left], arr[right]) * (right - left);
            maxarea = Math.max(maxarea, currentarea);
            if (arr[left] < arr[right]) {
                left++;
            } else
                right--;
        }
        return maxarea;
    }
}

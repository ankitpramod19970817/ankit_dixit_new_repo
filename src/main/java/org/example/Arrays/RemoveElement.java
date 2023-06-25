package org.example.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,2,3},3));

    }
    public static int solution(int arr[],int val){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==val){
                continue;
            }
            count++;
        }
        return count;
    }
}

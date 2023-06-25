package org.example.inteview;

public class Remove_duplicate_from_sorted_Array {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,3}));

    }
    public static int solution(int arr[]){
        int i=0;
        for (int j=1;j< arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[j]=arr[i];
            }
        }
        return i+1;
    }
}

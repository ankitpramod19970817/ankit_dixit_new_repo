package org.example.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println(search( new int[]{10,11,15,18,20},18));
        System.out.println(search( new int[]{10,11,15,18,20},85));
    }
    public static int search(int []a,int target){
        for (int i=0;i<a.length;i++){
            if (a[i]==target)
                return i;
        }return -1;

    }
}

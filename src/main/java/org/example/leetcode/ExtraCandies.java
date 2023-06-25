package org.example.leetcode;

public class ExtraCandies {
   static int candies[]={2,5,3,4,1};
   static int extracandi=3;
    static int max=0;
    public static void main(String[] args) {

        for (int i=0;i< candies.length;i++){
            if (candies[i]+extracandi>=max)
                System.out.println("false");
            else
                System.out.println("true ");
        }

    }
    public static int maxvalue(int arr[]){
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

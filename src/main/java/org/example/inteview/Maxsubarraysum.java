package org.example.inteview;

public class Maxsubarraysum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{-2,-5,6,-2,-3,1,5,-6}));
    }
    public static int sum(int arr[]){
        int currentsum=arr[0];
        int maxsum=0;
        for (int i=0;i< arr.length;i++){
            currentsum+=arr[i];
            if (currentsum>maxsum){
                maxsum=currentsum;
            }
            if (currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
}

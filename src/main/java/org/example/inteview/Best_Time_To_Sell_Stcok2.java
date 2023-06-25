package org.example.inteview;

public class Best_Time_To_Sell_Stcok2 {
    public static void main(String[] args) {
        System.out.println(sell(new int[]{1,2,3,4,5}));
    }
    public static int sell(int arr[]){
        int result=0;
        for (int i=1;i< arr.length;i++){
            if (arr[i]>arr[i-1]){
                result+=(arr[i]-arr[i-1]);
            }
        }return result;
    }
}

package org.example.inteview;
//7,1,5,3,6,4

public class Best_time_to_sell_stock {
    public static void main(String[] args) {
        System.out.println( solution(new int[]{7,1,5,3,6,4}));
    }
    public static int solution(int arr[]){
        int minsofar=arr[0];
        int maxprofit=0;
        for (int i=0;i< arr.length;i++){
            minsofar=Math.min(arr[i],minsofar);
            int profit=arr[i]-minsofar;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }

}

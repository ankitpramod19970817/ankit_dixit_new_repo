package org.example.inteview;

public class Rain_water_Tappping {
    public static void main(String[] args) {
        System.out.println(waterlog(new int []{3,1,2,4,0,1,3,2}));

    }
    public static int waterlog(int arr[]){
        int result=0;
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[arr.length-1]=arr[arr.length-1];
        for (int j= arr.length-2;j>=0;j--){
            right[j]=Math.max(right[arr.length-1],arr[arr.length-1]);
        }
        for (int i=0;i< arr.length;i++){
            result+=(Math.min(left[i],right[i])-arr[i]);
        }
        return result;



    }
}

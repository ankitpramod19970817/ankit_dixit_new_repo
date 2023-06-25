package org.example.Practice_Codeing;

public class FibonnaciiSeries {
    int sum=0;
    public int fibo(){
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        FibonnaciiSeries f=new FibonnaciiSeries();
        System.out.println(f.fibo());
    }
}

package org.example.inteview;

public class Gcdoftwonumbers {
    public static void main(String[] args) {
        System.out.println(gcd(12,4));

    }
    public static int gcd(int x,int y){
        while (y!=0){
            int temp=y;//18,12,6
            y=x%y;//12,6,0
            x=temp;//18,12,6
        }
        return x;
    }
}

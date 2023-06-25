package org.example.leetcode;

public class Ispallindrome {
    public static boolean soultion(int num) {
        int rev=0;
        int temp=num;
        while (num!=0){
             int digit =num%10;//1
            rev=(rev*10)+digit;//121
            num=num/10;//1
        }
        return (rev==temp);
    }
    public static void main(String[] args) {
        System.out.println(soultion(821));
    }
}

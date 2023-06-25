package org.example.leetcode;

public class Issubsequance {
    static  String str1="acb";
    static String str2="axbdcy";

    public static void main(String[] args) {
        System.out.println(subsequance(str1,str2));

    }
    public static boolean subsequance(String str1,String str2){
        int i=0;
        int j=0;
        while (i<str1.length()&&j<str2.length()){
            if (str1.charAt(i)==str2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==str1.length();
    }
}

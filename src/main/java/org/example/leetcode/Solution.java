package org.example.leetcode;

public class Solution {
    public static String mergestring(String s1,String s2){
        StringBuffer sb=new StringBuffer();
        int l1=s1.length();
        int l2=s2.length();
        int i=0;
        while (i<l1 || i<l2){
            if (i<l1){
                sb.append(s1.charAt(i));
            }
            if (i<l2){
                sb.append(s2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(mergestring("abc","pqrst"));
    }
}

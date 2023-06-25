package org.example.leetcode;

import java.util.Arrays;

public class Anagramnumber {
    public static void main(String[] args) {
        System.out.println(solution("anagram",  "naguram"));
    }
    public static boolean solution(String s1,String s2){
        char ch[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if (Arrays.equals(ch,ch2)) return true;
        return false;

    }
}

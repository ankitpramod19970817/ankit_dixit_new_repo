package org.example.inteview;

import java.util.HashSet;

public class Longest_non_repeating_substring {
    public static void main(String[] args) {
        System.out.println(longest("abcabcabc"));
    }
    public static int longest(String str){
        int a_pointer=0;
        int b_pointer=0;
        int count=0;
        HashSet<Character> hashSet=new HashSet<>();
        while (b_pointer!=str.length()){
            if (!hashSet.contains(str.charAt(b_pointer))){
                hashSet.add(str.charAt(b_pointer));
                b_pointer++;
                count=Math.max(count, hashSet.size());
                System.out.println(count);
            }
            else {
                hashSet.remove(str.charAt(a_pointer));
                a_pointer++;
            }
        }
        return count;
    }
}

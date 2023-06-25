package org.example.leetcode;

import java.util.HashSet;
import java.util.Set;

//find max no of vowel in given length substring
public class Maxvowelinsubstring {
    public static void main(String[] args) {
        System.out.println(solution("abciiidef",3));
    }

    public static int solution(String s, int k) {
        int count = 0;
        int maxvalue = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for (int i = 0; i < k; i++) {
            if (set.contains(s.charAt(i)))
                count++;
        }
        maxvalue = count;
        for (int i=k;i<s.length();i++){
            if (set.contains(s.charAt(i-k))) count--;
            if (set.contains(s.charAt(i))) count++;
            maxvalue=Math.max(count,maxvalue);
            }
        return maxvalue;
        }

}

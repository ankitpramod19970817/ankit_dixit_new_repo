package org.example.leetcode;

import java.util.HashMap;
import java.util.Hashtable;

//Given a pattern and a string s, find if s follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//
//
//
//Example 1:
//
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,Character> hashMap=new HashMap<>();
        if (pattern.length()!=s.length()) return false;
        for (int i=0;i< pattern.length();i++){
            char ch1=pattern.charAt(i);
            char ch2=s.charAt(i);
            if (hashMap.containsKey(ch1)){
                if (!hashMap.get(ch1).equals(ch2)) return false;
            }else {
                if (hashMap.containsValue(ch2)) return false;
                hashMap.put(ch1,ch2);//{a:dog,b:cat,
            }
        }
        return true;
    }

    }

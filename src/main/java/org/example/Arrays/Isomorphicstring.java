package org.example.Arrays;
//Two strings str1 and str2 are called isomorphic if
// there is a one-to-one mapping possible for every
// character of str1 to every character of str2. And all
// occurrences of every character in ‘str1’ map to the same character in ‘str2’.
//Input: s = "egg", t = "add"
//Output: true
//
//Example 2:
//
//Input: s = "foo", t = "bar"
//Output: false

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Isomorphicstring {
    public static void main(String[] args) {
        System.out.println(isiso("AAB", "XXZ"));
    }

    public static boolean isiso(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char orignal = s.charAt(i);
            char replacement = t.charAt(i);
            if (!hashMap.containsKey(orignal)) {
                if (!hashMap.containsValue(orignal)) {
                    hashMap.put(orignal, replacement);
                } else
                    return false;
            }
            char ch=hashMap.get(orignal);
            if (ch!=replacement) return false;
        }
        return true;
    }
}

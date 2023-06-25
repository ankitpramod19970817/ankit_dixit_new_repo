package org.example.leetcode;

import org.example.Practice_Codeing.PredicateTest;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println( solution("a#b","b"));
    }

    public static boolean solution(String str1, String str2) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        for (char c : str1.toCharArray()
        ) {
            if (c != '#')
                st.push(c);
            else  {
                st.pop();
            }
        }
        for (char c : str2.toCharArray()
        ) {
            if (c != '#')
                st1.push(c);
            else  {
                st1.pop();
            }
        }
        if (st.equals(st1))
            return true;
        return false;
    }
}

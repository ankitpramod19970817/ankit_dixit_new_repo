package org.example.leetcode;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"
        ));
    }
    public static String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<StringBuilder> ss = new Stack<>();

        int n = s.length(), num = 0;
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()) {
            // There will be 4 types of characters --> number, [ , ], character

            if(ch >= '0' && ch <= '9') {
                num = (num * 10) + ch - '0';
            } else if(ch == '[') {
                ss.push(str);
                System.out.println(ss);
                str = new StringBuilder();
                System.out.println(str);

                is.push(num);
                num = 0;
            } else if(ch == ']') {
                StringBuilder temp = str;
                str = ss.pop();
                int count = is.pop();

                while(count-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}

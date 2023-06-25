package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemovingStarsFromaString {
 /*   public static String solution(String str){
        List<Character> l=new ArrayList<>();
        for (Character c:str.toCharArray()
             ) {
            if (c!='*'){
                l.add(c);
                System.out.println(l);
            }
            else if (!l.isEmpty()) {
                l.remove(l.size()-1);
                System.out.println(l);

            }
        }
        StringBuilder sb=new StringBuilder();
        for (char c:l
             ) {
            sb.append(c);
            
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(solution("leet**cod*e"));

    }
}*/


//best aproach ---stack
public static String solution(String str){
    Stack<Character> st=new Stack<>();
    for (Character c:str.toCharArray()
         ) {
        if (c!='*'){
            st.push(c);
        } else if (!st.isEmpty()) {
            st.pop();
        }
    }
    return st.toString();

    }
    public static void main(String[] args) {
        System.out.println(solution("leet**cod*e"));

    }


}



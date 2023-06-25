package org.example.Arrays;

import java.util.HashMap;

public class Worldpattern_repeat {
    public static void main(String[] args) {
        System.out.println(solution("abba","dog cat cat dog"));

    }
    public static boolean solution(String s1,String s2){
        HashMap<Character,String> map=new HashMap<>();
        String [] str=s2.split(" ");
        if (str.length!=s1.length()) return false;
        for (int i=0;i< str.length;i++){
            char ch=s1.charAt(i);
            String s=str[i];
            if (!map.containsKey(ch)){
                if (!map.containsValue(s))
                    map.put(ch,s);
                else  return false;
            }
            else {
                String str1=map.get(ch);
                if (!str1.equals(s)) return false;
            }

        }
        return true;
    }
}

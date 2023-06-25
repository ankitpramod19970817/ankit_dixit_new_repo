package org.example.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Wordpatterntest {
    public static void main(String[] args) {
        System.out.println(solution("abba","dog cat cat fish"));
    }
    public static boolean solution(String s1,String s2) {
        HashMap<Character,String> hashMap=new HashMap<>();
        String arr[]=s2.split(" ");
        System.out.println(Arrays.toString(arr));
        if (arr.length!=s1.length()) return false;
        for (int i=0;i< arr.length;i++){
            char ch=s1.charAt(i);//a
            String str=arr[i];//fish
            if (!hashMap.containsKey(ch)){
                if (!hashMap.containsValue(str))
                    hashMap.put(ch,str);//{a:dog,b:cat
                else
                    return false;
            }else {
                String s=hashMap.get(ch);
                if (!s.equals(str)) return  false;
            }
        }
        return  true;
    }
}
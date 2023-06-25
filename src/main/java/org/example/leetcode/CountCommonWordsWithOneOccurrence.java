package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"leetcode","is","amazing","as","is"},new String[]{"amazing","leetcode","is"}));
    }
   public static int countWords(String str1[],String str2[]){

        HashMap<String,Integer> h1=new HashMap<>();
        HashMap<String,Integer> h2=new HashMap<>();
       int count=0;
       for (String s1:str1
            ) {
           h1.put(s1, h1.getOrDefault(s1,0)+1);
       }
       System.out.println(h1);
       for (String s2:str2
       ) {
           h2.put(s2, h2.getOrDefault(s2,0)+1);
       }
       System.out.println(h2);

       for (String s3:h1.keySet()
            ) {
           if (h2.containsKey(s3) && h1.get(s3)==1 && h2.get(s3)==1)
                count++;
       }
       return count;
    }

}

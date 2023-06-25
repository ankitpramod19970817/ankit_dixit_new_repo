package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray {
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"aaa", "aa", "a"}, 1));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> h1=new HashMap<>();
        for (String s1:arr
             ) {
            h1.put(s1,h1.getOrDefault(s1,0)+1);
        }
        int i=0;
        for (String s2:arr
             ) {
            if (h1.get(s2)==1 && ++i==k)
                return s2;
        }
        return "";
    }
}

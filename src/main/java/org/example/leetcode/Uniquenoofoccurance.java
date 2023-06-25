package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Uniquenoofoccurance {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2}));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for (int e:arr
             ) {
            m.put(e,m.getOrDefault(e,0)+1);
        }
        System.out.println(m);
        Set<Integer> set=new HashSet<>(m.values());
        System.out.println(set);
        return set.size()==m.size();
    }
}

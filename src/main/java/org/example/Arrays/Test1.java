package org.example.Arrays;
//Input :  "AA", "BB", "AA", "CC"
//Output: {CC=1, BB=1, AA=2}

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(populate(new String[]{"AA", "BB", "AA", "CC"}));
    }
    public static HashMap<String,Integer> populate(String arr[]){
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (String s:arr
             ) {
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
        }
        return hashMap;
    }
}


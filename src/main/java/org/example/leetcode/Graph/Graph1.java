package org.example.leetcode.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph1 {
    static HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Graph1 graph1 = new Graph1();
        graph1.addvertax("s");
        graph1.addvertax("t");
        graph1.addvertax("u");
        graph1.addvertax("v");
        graph1.addedge("s", "t");
        graph1.addedge("t","u");
        graph1.addedge("u","v");
        graph1.addedge("v","s");
        //graph1.removeedge("s","u");
        graph1.removevertax("u");
        graph1.printgraph();


    }

    public static void printgraph() {
        System.out.println(hashMap);
    }

    public static boolean addvertax(String value) {
        if (hashMap.get(value) == null) {
            hashMap.put(value, new ArrayList<>());
            return true;
        }
        return false;
    }

    public static boolean addedge(String vertax1, String vertax2) {
        if (hashMap.get(vertax1) != null && hashMap.get(vertax2) != null) {
            hashMap.get(vertax1).add(vertax2);
            hashMap.get(vertax2).add(vertax1);
            return true;
        }
        return false;
    }

    public static boolean removeedge(String vertax1, String vertax2) {
        if (hashMap.get(vertax1) != null && hashMap.get(vertax2) != null) {
            hashMap.get(vertax1).remove(vertax2);
            hashMap.get(vertax2).remove(vertax1);
            return true;
        }
        return false;
    }
    public static boolean removevertax(String vertax){
        if (hashMap.get(vertax)==null) return  false;
        for (String  othervertax:hashMap.get(vertax)
             ) {
            hashMap.get(othervertax).remove(vertax);
        }
        hashMap.remove(vertax);
        return true;
    }
}

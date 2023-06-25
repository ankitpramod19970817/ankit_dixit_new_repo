package org.example.leetcode;

import org.example.Practice_Codeing.PredicateTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// find the list of arrys haveing differnt elemnts from each other
public class Differenceotwoarrarys {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{1,2,3,2},new int[]{2,4,6}));
    }
    public static List<List<Integer>> solution(int arr1[],int arr2[]){
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for (int ele1:arr1
             ) {
            s1.add(ele1);
        }
        for (int ele2:arr2
        ) {
            s2.add(ele2);
        }
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>(s1);
        List<Integer>l3=new ArrayList<>(s2);
        l2.removeAll(s2);
        l3.removeAll(s1);
        l1.add(l2);
        l1.add(l3);
        return l1;
    }
}

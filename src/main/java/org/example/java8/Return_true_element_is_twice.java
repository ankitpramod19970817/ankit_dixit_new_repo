package org.example.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Return_true_element_is_twice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>(list);
        if (list.size()== set.size()){
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
}

package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringTest {
    public static void main(String[] args) {
        System.out.println(solution("the sky is blue"));

    }
    public static String solution(String inputString){
        String [] result=inputString.split(" ");
        String ans="";
        for (int i= result.length-1;i>=0;i--){
            ans+=result[i]+" ";
        }
        return ans;
    }

}


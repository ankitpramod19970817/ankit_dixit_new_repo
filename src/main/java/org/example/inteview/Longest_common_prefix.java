package org.example.inteview;

public class Longest_common_prefix {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{
                "flower","flow","flight"
        }));

    }
    public static String solution(String[]arr){
        String prefix=arr[0];//flower
        for (int i=1;i< arr.length;i++){
            while (arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

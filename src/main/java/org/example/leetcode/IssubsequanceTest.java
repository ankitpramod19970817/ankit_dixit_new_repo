package org.example.leetcode;

public class IssubsequanceTest {
    public static void main(String[] args) {
        System.out.println(issub("abc","ahbgdc"));
    }
    public static boolean issub(String s1,String s2){
        int i=0;
        int j=0;
        while (i<s1.length() && j<s2.length()){
            if (s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            j++;
        }
        return i==s1.length();
    }
}

package org.example.Arrays;

public class Validpallindrome {
    public static void main(String[] args) {
        System.out.println(sol("A man, a plan, a canal: Panama"));

    }
    public static boolean sol(String s){
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
                System.out.println(sb);
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

}


package org.example.Arrays;

public class ReverseStringTest2 {
    public static void main(String[] args) {
        System.out.println(solution("the sky is blue"));
    }
    public static String solution(String str){
        str.trim();
        StringBuilder sb=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            int s=i;
            while (i>=0 && str.charAt(i)!=' '){
                i--;
            }
            String word= str.substring(i+1,s+1);
            if (word.equals(""))
                continue;
            sb.append(word).append(" ");

        }
        return sb.toString().trim();
    }
}

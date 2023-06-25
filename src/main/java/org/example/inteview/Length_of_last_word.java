package org.example.inteview;

public class Length_of_last_word {
    public static void main(String[] args) {
        System.out.println(solution("my name is ankit"));
    }
    public static int solution(String str){
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!=' '){
                count++;
            }
            else {
                if (count>0)
                    return count;
            }
        }
        return count;
    }
}

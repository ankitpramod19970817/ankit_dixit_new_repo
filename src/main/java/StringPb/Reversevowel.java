package StringPb;

public class Reversevowel {
    public static void main(String[] args) {
        System.out.println(vowelreverse("hello"));

    }
    public static String vowelreverse(String s){
        int n=s.length();
        char c[]=s.toCharArray();
        int start=0;
        int end=n-1;
        while (start<end){
        if (!isvowel(c[start]))
            start++;
         else if (!isvowel(c[end]))
            end--;
        else {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }


        }
        return String.valueOf(c);

    }
    public  static  boolean isvowel(char c1){
        if (c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
            return true;
        else
            return false;
    }


}

package StringPb;
/* print the length of longest substring*/

public class Longestsubstring {
    public static void main(String[] args) {
        System.out.println(lenthofsubstring("abccdef"));

    }
    public static int lenthofsubstring(String s){
        int max=0;
        for (int i=0;i<s.length();i++){
            int count=0;
            for (int j=i;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j))
                    count++;
            }
            if (count>max)
                max=count;
        }
        return max;
    }
}

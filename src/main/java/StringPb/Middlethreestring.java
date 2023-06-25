package StringPb;

public class Middlethreestring {
    public static void main(String[] args) {
        System.out.println(middlethree());
    }
    public static String middlethree() {
        String s1="hhujkhjkjjj";
        int x=s1.length()/2;
        String s2=s1.substring(x-1,x+2);
        return s2;
    }
}


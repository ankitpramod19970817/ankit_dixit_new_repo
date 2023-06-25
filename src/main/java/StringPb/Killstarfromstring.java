package StringPb;
/* an*kit=ait
ab**cd=ad
 */

public class Killstarfromstring {
    public static void main(String[] args) {
        System.out.println(killstar("ab*cd"));
        System.out.println(killstar("ab**cd"));
    }
    public static String killstar(String s){
        String result="";
        int l=s.length();
        for (int i=0;i<l;i++){
            if (i==0&&s.charAt(i)!='*')
                 result+=s.charAt(i);
            if (i>0&&s.charAt(i)!='*'&&s.charAt(i-1)!='*')
                 result+=s.charAt(i);
            if (i>0&&s.charAt(i)=='*'&&s.charAt(i-1)!='*')
                  result+=result.substring(0,result.length()-1);
        }
        return result;
    }
}

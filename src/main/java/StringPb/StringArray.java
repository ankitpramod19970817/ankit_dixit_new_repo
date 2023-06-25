package StringPb;
/*  given two string array and match some condition*/

public class StringArray {
    public static void main(String[] args) {
        System.out.println(count(new String[]{"a","bb","cc"},new String[]{"aaa","jjj","ccc"}));
        System.out.println(count(new String[]{"fff","uuuu","ghgh"},new String[]{"juiii","uuu","ooo"}));

    }
    public static int count(String[]a,String[]b){
        int count=0;


        for (int i=0;i<a.length;i++){
            String s1=a[i];
            String s2=b[i];
            if (s1.length()!=0&&s2.length()!=0){
                if (s1.charAt(0)==s2.charAt(0))
                    count++;}
        }
        return count;
    }
}

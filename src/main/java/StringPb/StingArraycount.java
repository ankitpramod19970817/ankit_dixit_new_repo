package StringPb;
/* count string repetition*/

public class StingArraycount {
    public static void main(String[] args) {
        System.out.println(count(new String[]{"aa", "bbbb", "cccc", "d"},4));

    }
    public static int count(String[]str,int len){
        int count=0;
        for (int i=0;i< str.length;i++){
            if (str[i].length()==len)
                count++;
        }
        return count;

    }
}

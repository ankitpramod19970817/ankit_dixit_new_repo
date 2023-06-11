package Practice_Codeing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lambda3 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(20);
        l.add(25);
        l.add(15);
        System.out.println("before sorting");
        Collections.sort(l);
        System.out.println("after sorting");
        System.out.println(l);
        System.out.println("with lambda sortring");
        Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
        System.out.println(l);
    }
}

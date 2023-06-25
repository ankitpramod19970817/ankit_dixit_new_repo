package org.example.Practice_Codeing;
/* using predicate function and consumer find the grade of student*/

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function5 {
    String name;
    String grade;
    int marks;
    public Function5(String name,String grade,int marks){
        this.grade=grade;
        this.marks=marks;
        this.name=name;
    }
    public static void main(String[] args) {
        ArrayList<Function5>l=new ArrayList<>();
        populate(l);
        Predicate<Function5>p=s->s.marks>=60;
        Function<Function5,String>f=s->{
            int x=s.marks;
            if (s.marks>=70)
                return "A";
            else if (s.marks>=60) {
                return "B";
            }
            else
                return "C";
        };
        Consumer<Function5>c=s->{
            System.out.println("name:"+s.name);
            System.out.println("grade:"+f.apply(s));
        };
        for (Function5 a:l
             )
            if (p.test(a)){
                c.accept(a);
            }
    }
    public static void populate(ArrayList<Function5>l){
        l.add(new Function5("Ankit","A",50));
        l.add(new Function5("Amit","B",60));
        l.add(new Function5("ram","C",70));
    }
}

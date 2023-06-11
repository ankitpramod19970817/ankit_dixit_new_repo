package org.example;

import java.util.function.Predicate;

public class Lambda4 {
    public static void main(String[] args) {
        String s[]={"ankit","amit","ram"};
        Predicate<String>p= x->x.charAt(0)=='a';
        for (String s1:s
             ) {
            if (p.test(s1))
            {
                System.out.println(s1);
            }

        }
    }
}

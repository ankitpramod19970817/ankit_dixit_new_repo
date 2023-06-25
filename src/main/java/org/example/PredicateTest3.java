package org.example;

import java.util.function.Predicate;

public class PredicateTest3 {
    public static void main(String[] args) {
        int[] x = {1, 2, 5, 10, 20, 25, 30};
        Predicate<Integer> p1 = c -> c > 10;
        Predicate<Integer> p2 = c -> c % 2 == 0;
        System.out.println("grtaer than ten:" + p1);
        m1(p1, x);
        System.out.println("devisible by two:" + p2);
        m1(p2, x);
        System.out.println("negate them");
        m1(p1.negate(), x);
        System.out.println("and use");
        m1(p1.and(p2), x);
        System.out.println("or use");
        m1(p1.or(p2), x);
    }

    public static  void m1(Predicate<Integer> p, int x[]){
            for (int x1:x
                 ) {
                if (p.test(x1))
                    System.out.println(x1);
            }
    }
}

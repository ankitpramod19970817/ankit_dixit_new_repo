package org.example.Practice_Codeing;


import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class PrimitiveFunction {
    public static void main(String[] args) {
        IntFunction<Integer> p= i->i*i;
        System.out.println(p.apply(10));
    }
}

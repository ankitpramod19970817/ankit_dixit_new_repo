package org.example.Practice_Codeing;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunction2 {
    public static void main(String[] args) {
        ToIntFunction<String>f= i->i.length();
        System.out.println(f.applyAsInt("Ankitdixit"));
    }
}

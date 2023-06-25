package org.example.Practice_Codeing;
/* add  select random name */

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String[]x={"Ankit","ram","shyam","sohan"};
            int b =(int) Math.random()*2;
            return x[b];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}

package org.example.Practice_Codeing;
/* generate random otp*/

import java.util.function.Supplier;

public class Otp {
    public static void main(String[] args) {
        Supplier<String>s=()->{
            String q="";
            for (int i=1;i<=6;i++){
                q=q+(int)(Math.random()*10);
            }
            return q;
        };
        System.out.println(s.get());

    }
}

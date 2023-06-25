package org.example.Practice_Codeing;
/*code to get random password using supplier
* rules
* it should have length 8
* even places digits
* odd places alphabates
* */

import java.util.function.Supplier;

public class Password {
    public static void main(String[] args) {

        Supplier<String>s1=()-> {
            Supplier<Integer> s = () ->  (int) Math.random() * 10;
            String str = "abcdefghijklmnopqrstuvwxyz@#$";
            Supplier<Character> ch = () -> str.charAt((int) Math.random() * 29);
            String pwd = "";
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    pwd += s.get();
                } else
                    pwd += ch.get();
            }
            return pwd;
        };
            System.out.println(s1.get());
        System.out.println(s1.get());

    }

}

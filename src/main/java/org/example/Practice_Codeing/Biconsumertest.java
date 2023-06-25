package org.example.Practice_Codeing;

import java.util.function.BiConsumer;

public class Biconsumertest {
    public static void main(String[] args) {
        BiConsumer<String,String>b=(firsntame,lastname)->{
            System.out.println(firsntame+lastname);
        };
        b.accept("big","boss");
    }
}

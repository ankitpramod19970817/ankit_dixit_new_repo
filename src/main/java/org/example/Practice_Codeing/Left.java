package org.example.Practice_Codeing;

public interface Left {
    default void m1(){
        System.out.println("left");
    };
}
interface Right{
    default void m1(){
        System.out.println("right");
    };
}
class Imp implements Left,Right {

    public void m1(){
        System.out.println("my own implemenatation");
        Left.super.m1();
    }

    public static void main(String[] args) {
        Imp i=new Imp();
        i.m1();
    }
}

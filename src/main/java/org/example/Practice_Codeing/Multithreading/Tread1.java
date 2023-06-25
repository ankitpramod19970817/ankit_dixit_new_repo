package org.example.Practice_Codeing.Multithreading;

public class Tread1 extends Thread {
    public void run(){
        System.out.println("thread 1");
    }
}
 class Tread2 extends Thread {
    public void run(){
        System.out.println("thread 2");
    }
}
class Mythread{
    public static void main(String[] args) {
        Tread1 t1=new Tread1();
        t1.start();
        Tread2 t2=new Tread2();
        t2.start();
        System.out.println("main thread");
    }
}

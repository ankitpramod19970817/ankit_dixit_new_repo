package org.example.Practice_Codeing;

public class Thread2 extends Thread {
    public void start(){
        super.start();
        System.out.println("child thread");
    }
}
class Mythread {
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.start();
        System.out.println("main thread");
    }
}


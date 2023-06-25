package org.example.Practice_Codeing.Multithreading;

public class Thread3 {
    public static void main(String[] args) {
       ThreadGroup g=new ThreadGroup("ankitthread");
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
      ThreadGroup g1=new ThreadGroup(g,"Dixitthread");
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
    }
}

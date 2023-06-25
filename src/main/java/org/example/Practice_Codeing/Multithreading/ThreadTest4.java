package org.example.Practice_Codeing.Multithreading;
/* to copy all active and sub thread group in thraed arraay*/
public class ThreadTest4 {
    public static void main(String[] args) {
        ThreadGroup t=Thread.currentThread().getThreadGroup().getParent();
        Thread[] threads=new Thread[t.activeCount()];
        t.enumerate(threads);
        for (Thread x:threads
             ) {
            System.out.println("thraed name"+x+"..."+ x.isDaemon());

        }
    }
}

package org.example.leetcode.queue;

public class Myqueue {
     static Node first;
   static Node last;
   static int length;

     static class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
    public Myqueue(int value){
        Node newnode =new Node(value);
        first=newnode;
        last=newnode;
        length=1;
    }
    public static void getfirst(){
        System.out.println("first"+first.value);
    }
    public static void getlast(){
        System.out.println("first"+last.value);
    }
    public static void printqueue(){
        Node temp=first;
        if (temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }
    public static void enqueue(int value){
        Node node=new Node(8);
        if (length==0) {
            first=node;
            last=node;
        }
        else {
            last.next=node;
            last=node;
        }
        length++;

    }
    public static void main(String[] args) {
        Myqueue myqueue=new Myqueue(7);
       // myqueue.getlast();
        //myqueue.getfirst();
        myqueue.enqueue(8);
        myqueue.printqueue();
    }

}

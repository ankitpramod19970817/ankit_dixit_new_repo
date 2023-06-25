package org.example.leetcode;

import static java.lang.reflect.Array.get;

public class Linkedlisttest1 {
    private Node head;
    private Node tail;
    private int length;

    public Linkedlisttest1(int i) {

    }

    public static void main(String[] args) {
        Linkedlisttest1 linkedlisttest1=new Linkedlisttest1(4);
        System.out.println(linkedlisttest1.getHead());
        System.out.println(linkedlisttest1.getTail());
        linkedlisttest1.getLength();
       linkedlisttest1.appened(2);
        linkedlisttest1.appened(5);

        System.out.println(linkedlisttest1.removelast().value);
        linkedlisttest1.prepend(8);
        System.out.println(linkedlisttest1.removefirst().value);
        System.out.println(linkedlisttest1.removefirst().value);
        System.out.println(linkedlisttest1.set(0,10));


    }
    class Node{
        int  value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public  void printlist(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value);
            temp.next=temp;
        }
    }
    public void  appened(int value){
        Node newnode=new Node(value);
        if (length == 0){
            head=newnode;
            tail=newnode;
        }
        else
            tail.next=newnode;
        tail=newnode;
        length++;
    }
    public Node removelast(){
        if (length==0) return null;
        Node pre=head;
        Node temp=head;
        while (temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if (length==0){
            head=null;
            tail=null;

        }
        return temp;

    }
    public void prepend(int value){
        Node newnode=new Node(value);
        if (length==0){
            head=newnode;
            tail=newnode;
        }else {
            newnode.next=head;
            head=newnode;
        }
        length++;
    }
    public Node removefirst(){
        if(length==0)
            return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if (length==0){
            tail=null;
        }
        return temp;

    }
    public Node get(int index){

        if (index<0||index>=length)return null;
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if (temp!=null){
            temp.value=value;
            return true;
        }
        return false;

    }

}

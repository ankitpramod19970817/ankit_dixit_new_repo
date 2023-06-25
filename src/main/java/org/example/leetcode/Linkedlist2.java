package org.example.leetcode;

import static java.lang.reflect.Array.get;

public class Linkedlist2 {
    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        Linkedlist2 list=new Linkedlist2(5);
        list.appened(1);
        list.reverse();

       // list.insert(1,10);
        //System.out.println(list);
    }
    public Linkedlist2(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    class Node{

        int  value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void  appened(int value){
        Linkedlist2.Node newnode=new Linkedlist2.Node(value);
        if (length == 0){
            head=newnode;
            tail=newnode;
        }
        else
            tail.next=newnode;
        tail=newnode;
        length++;
    }
    public void prepend(int value){
        Linkedlist2.Node newnode=new Linkedlist2.Node(value);
        if (length==0){
            head=newnode;
            tail=newnode;
        }else {
            newnode.next=head;
            head=newnode;
        }
        length++;
    }
    public Node get(int index){

        if (index<0||index>=length)return null;
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public boolean insert(int index,int value){
        if (index<0 || index>length) return false;
        if (index==0){
            prepend(value);
        }if (index==length){
            appened(value);
        }
        Node node=new Node(value);
        Node temp= get(index-1);
        temp.next=node.next;
        temp.next=node;
        length++;
        return  true;
    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after;
        Node before=null;
        for (int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

}

package org.example.leetcode;

/*public class Doublylinkedlist {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        Node next;
        Node previous;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Doublylinkedlist ddl=new Doublylinkedlist(4);
        ddl.getHead();
        ddl.getTail();
        ddl.getLength();
        ddl.printlist();

    }
    public Doublylinkedlist(int value){
        Node newnode=new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }

    public Node getHead() {
        System.out.println(head);
        return head;
    }

    public void setHead(Node head) {
        this.head = head;

    }

    public Node getTail() {
        System.out.println(tail);
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;

    }

    public int getLength() {

        System.out.println(length);
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
    public void appened(int value){
        Node newnode=new Node(value);
        if (length==0){
            head=newnode;
            tail=newnode;
        }
        else {
            tail.next=newnode;
            newnode.previous=tail;
            tail=newnode;
        }
        length++;
    }
    public Node removelast(){
        if (length==0) return  null;
        Node temp=tail;
        tail=tail.previous;
        tail.next=null;
        temp.previous=null;
        length--;
        if (length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public Node removefirst(){
        if (length==0)return  null;
        Node temp=head;
        if (length==1){
            head=null;
            tail=null;
        }else {
            temp=head;
            head=head.next;
            head.previous=null;
            temp.next=null;
        }
        length--;
        return temp;
    }
    public boolean set(int index,int value){
        if (length==0)
            return false;
        Node temp=get(index);
        if (temp!=null){
            temp.value=value;
            return true;

        }
        return false;
    }
    public boolean insert(int index, int value){
        Node newnode=new Node(value);
        if (length==0) return  false;
        Node before=get(index-1);
        Node after=before.next;
        if (index==0){
            prepend(value);
            return true;
        }
        if (index==length){
            appened(value);
            return true;
        }
        newnode.previous=before;
        newnode.next=after;
        before.next=newnode;
        after.previous=newnode;
        length++;
        return true;

    }
    public Node remove(int index){
        if (index<0 || index>length) return null;
        if (index==0) return removefirst();
        if (index==length) return removelast();
        Node temp=get(index);
        temp.next.previous=temp.previous;
        temp.previous.next=temp.next;
        temp.next=null;
        temp.previous=null;
        length--;
        return temp;

        }
    }






*/
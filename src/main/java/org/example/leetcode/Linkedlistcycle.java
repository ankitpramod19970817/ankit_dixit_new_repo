package org.example.leetcode;

import java.util.HashSet;

public class Linkedlistcycle {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int  value;
        Node next;

        public Node(int value) {
            this.value = value;
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
    public  void printlist(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value);
            temp.next=temp;
        }
    }


    public static void main(String[] args) {
        Linkedlistcycle linkedlistcycle=new Linkedlistcycle();
        linkedlistcycle.appened(5);
        linkedlistcycle.appened(4);
        linkedlistcycle.appened(3);

        linkedlistcycle.appened(1);
        System.out.println(linkedlistcycle);




    }
    public static boolean hasCycle(Node head) {
        HashSet<Node> visited_nodes = new HashSet<>();
        Node current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }


}

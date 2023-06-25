package org.example.leetcode.linkedlist;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle=new LinkedListCycle();

    }
    class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
    public boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
                return  true;
        }
        return false;

    }


}

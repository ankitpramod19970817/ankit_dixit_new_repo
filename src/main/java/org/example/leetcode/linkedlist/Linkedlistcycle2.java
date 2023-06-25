package org.example.leetcode.linkedlist;

public class Linkedlistcycle2 {
    public static void main(String[] args) {

    }

    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node solution(Node head) {
        Node fast = head;
        Node slow2 = head;
        if (fast != null && fast.next != null) {
            slow2 = slow2.next;
            fast = fast.next.next;
            if (slow2 == fast) {
                while (slow2 !=head) {
                    slow2 = slow2.next;
                    fast = fast.next;
                }
                return slow2;

            }

        }
        return null;

    }
}

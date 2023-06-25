package org.example.leetcode.binaryTree;

public class Bst2 {
    static Node root;
    static Node temp;

    static class Node {
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }
    public static boolean contains(int value){
        temp=root;
        while(temp!=null){
        if (value< temp.value){
            temp=temp.left;

        } else if (value> temp.value) {
            temp=temp.right;
        }
        return true;
        }
        return false;


    }
}

package org.example.leetcode.binaryTree;

public class BST1 {
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

    public static boolean insert(int value) {
        Node newnode = new Node(value);
        if (root == null) {
            root = newnode;
            return true;
        }
        temp = root;
        while (true) {
            if (newnode.value == temp.value) {
                return false;
            }
            if (newnode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newnode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (newnode.value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newnode;
                        return true;
                    }
                    temp = temp.right;
                }
            }
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
            else

            return true;
        }
        return false;


    }
}

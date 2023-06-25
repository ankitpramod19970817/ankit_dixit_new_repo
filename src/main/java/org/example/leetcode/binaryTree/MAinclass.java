package org.example.leetcode.binaryTree;


public class MAinclass {
    public static void main(String[] args) {


        BST1 bst1 = new BST1();
        bst1.insert(8);
        bst1.insert(5);
        bst1.insert(10);
        bst1.insert(12);
        bst1.insert(9);
        bst1.insert(14);
       // System.out.println(bst1.root.right.right.value);
        System.out.println(bst1.contains(12));
    }


}

package org.example.leetcode.binaryTree;
//Given the root of a binary tree, return its maximum depth.
//
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//
/*
import java.util.LinkedList;
import java.util.Queue;

public class Maximumepthofbinaytree {
    public static void main(String[] args) {

    }
    class Node {
        BST1.Node left;
        BST1.Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
    public static  int maxdepth(Node root){

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        int count= queue.size();
        int countlevel=-1;
        while(true){
            if(count==0)
                return countlevel;
            if (count>0){
                Node element= queue.poll();
                if (element.left!=null){
                    queue.add(element.left);
                }
                if (element.right!=null){
                    queue.add(element.right);
                }
                count--;
            }
            countlevel++;

        }


    }
}
*/
package org.example.leetcode;

public class HashtableTest {
    private int size=7;
    private static Node[] datasize;

    public static void main(String[] args) {
        HashtableTest hashtableTest=new HashtableTest();
        hashtableTest.printtable();
    }
    class Node{
        Node next;
        int value;
        String key;
        public Node(int value, String key) {
            this.value = value;
            this.key = key;
        }
    }
    public HashtableTest(){
        datasize=new Node[size];
    }
    public static void printtable(){

        for (int i=0;i<datasize.length;i++){
            Node temp=datasize[i];
            while (temp!=null){
                System.out.println("{"+temp.key+"}"+"{"+temp.value+"}");
                temp=temp.next;
            }

        }
    }


}

package org.example.Practice_Codeing;

public class Lambda1 {
    public static void main(String[] args) {
        interf i=(a, b)-> System.out.println(a+b);
        i.add(10,20);

    }
}
interface interf{
    public void add(int a,int b);
}

package org.example.Practice_Codeing;

public class Lamda2 {
    public static void main(String[] args) {
       interf1 i=s -> s.length();
        System.out.println(i.getlength("ankit"));
        System.out.println(i.getlength("ramesh"));
    }
}
interface interf1{
 public int getlength(String s);
}

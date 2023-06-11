package org.example;
/* user authentication using function interface*/

import java.util.Scanner;
import java.util.function.Function;

public class User2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String username= sc.next();
        System.out.println("enter user mail");
        Scanner sc1=new Scanner(System.in);
        String password=sc1.next();
        System.out.println("enter password");
        Function<String,String>f1=a->a.toLowerCase();
        Function<String,String>f2=a->a.substring(0,5);
       if (f1.andThen(f2).apply(username).equals("AnkitDixit")&& password.equals("java")){
           System.out.println("valid user");
       }
       else
           System.out.println("invalid user");
    }
}

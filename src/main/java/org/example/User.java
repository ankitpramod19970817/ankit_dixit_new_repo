package org.example;

import java.util.Scanner;
import java.util.function.Predicate;

public class User {
    String name;
    String pwd;

    User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
    class Ankit {
        public static void main(String[] args) {
             Predicate<User> p = u -> u.name.equals("Ankit") && u.pwd.equals("ramesh");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name");
            String s = sc.next();
            System.out.println("enter password");
            String s1 = sc.next();
            User user = new User(s, s1);
            {
                if (p.test(user))
                    System.out.println("valid user");
                else
                    System.out.println("invalid user");
            }
        }
    }



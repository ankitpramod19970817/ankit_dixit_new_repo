package org.example;
/* code to find student object grades*/

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    int marks;
    String subject;
    public Student(int marks, String name, String subject) {
        this.marks = marks;
        this.name = name;
        this.subject = subject;
    }
    public static void main(String[] args) {
            ArrayList<Student> l = new ArrayList<>();
            populate(l);
            Function<Student,String>f=s->{
                int marks=s.marks;
                if (marks>=90)
                    return "A[excellent]";
                else if (marks>=70) {
                    return "B[v good]";

                } else if (marks>=50) {
                    return "C[fair]";
                }
                else
                    return "D[fail]";
            };
            Predicate<Student>p=x->x.marks>=80;
            for (Student s1:l
                 ) {
                if (p.test(s1)) {
                    System.out.println("name:" + s1.name);
                    System.out.println("marks:" + s1.marks);
                    System.out.println(f.apply(s1));
                    System.out.println();
                }
            }

        }
        public  static void populate(ArrayList<Student>l ){
            l.add(new Student(50,"ankit","english"));
            l.add(new Student(70,"ravi","maths"));
            l.add(new Student(80,"ram","scince"));
            l.add(new Student(90,"hina","cs"));
        }
    }



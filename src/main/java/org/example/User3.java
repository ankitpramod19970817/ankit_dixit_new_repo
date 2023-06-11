package org.example;
/*cnsumer interface use*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class User3 {
    String  moviename;
    String actor;
    public User3(String moviename,String actor){
        this.moviename=moviename;
        this.actor=actor;
    }
    public static void populate(ArrayList<User3>l){
        l.add(new User3("sultan","salman"));
        l.add(new User3("raees","srk"));
    }


    public static void main(String[] args) {
        ArrayList<User3>l=new ArrayList<>();
        populate(l);
        Consumer<User3>c=s->{
            System.out.println("movie name:"+s.moviename);
            System.out.println("actor name"+s.actor);
        };
        for (User3 u:l
             ) {
            c.accept(u);

        }
    }
}

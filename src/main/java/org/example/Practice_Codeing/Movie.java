package org.example.Practice_Codeing;
/* consumer chaining*/

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {
    String moviename;
    String result;
    public Movie(String moviename,String result){
        this.moviename=moviename;
        this.result=result;
    }

    public static void main(String[] args) {
        ArrayList<Movie>l=new ArrayList<>();
        populate(l);
        Consumer<Movie>c1=s-> System.out.println("moviename"+s.moviename);
        Consumer<Movie>c2=s-> System.out.println("Result"+s.result);
        Consumer<Movie>chaining=c1.andThen(c2);
        for (Movie m:l
             ) {
            chaining.accept(m);
        }
    }
    public static void populate(ArrayList<Movie>l){
        l.add(new Movie("bahubali","succesful"));
        l.add(new Movie("kites","flop"));
    }

}

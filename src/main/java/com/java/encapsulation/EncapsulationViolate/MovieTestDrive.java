package com.java.encapsulation.EncapsulationViolate;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        //since movie class title data is directly accessible which is very dangerous.
        //Outside class MovieTestDrive can directly change the variable data and fill it with inappropriate data .

        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        int x = 10/0;
        System.out.println(x);

    System.out.println("Hello Everyone");


  }
}

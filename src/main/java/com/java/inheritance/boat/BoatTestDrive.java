package com.java.inheritance.boat;

public class BoatTestDrive {
    public static void main(String[] args){
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Boat b3 = new Rowboat(1,32);
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
        b2.move();
  }
}

package com.java.inheritance.boat;

public class Sailboat extends Boat {
    public final static int height = 5;
//    public void move() {
//        System.out.print("hoist sail ");
//    }

    public void move(int distance) {
        System.out.print("hoist sail " + distance);
    }
}
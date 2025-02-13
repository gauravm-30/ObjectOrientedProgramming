package com.java.inheritance.boat;

public class Boat {
     private int length ;
     public final static int height = 5;

    public Boat(int length) {
        this.length = length;
    }

    public Boat() {
    }

    public void setLength (int len ) {
        length = len;
    }
    public int getLength() {
        return length ;
    }
    public void move() {
        System.out.print("drift  ");
    }
}
package com.java.encapsulation.EncapsulationFollow;

public class GoodDog {
    private int size;
    public int getSize() {
        return size;
    }
    //  Even though the methods don’t really
//            add new functionality, the nice thing  is that you can change your mind later.
//            You can come back and make a method
//            safer, faster, better.
//                    Any place where a
//            particular value can
//            be used, a method
//            call that returns that
//            type can be used.
    //Can control what value it should have.
    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff!  Ruff!");
        }else {
            System.out.println("Yip! Yip!");
        }

    }
}


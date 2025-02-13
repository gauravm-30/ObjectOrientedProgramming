package com.java.overridingAndOverloading.overriding;

public class TestDrive {

    public static void main(String[] args){

        //compile time resolution
        ClassA a = new ClassB();
    System.out.println(a.getB());
    ClassB b = new ClassB();
    System.out.println(b.getSuperB());
    System.out.println(b.getB());

    }
}

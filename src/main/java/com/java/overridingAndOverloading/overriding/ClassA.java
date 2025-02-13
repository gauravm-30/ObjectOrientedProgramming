package com.java.overridingAndOverloading.overriding;

public class ClassA {
    private int b=10;
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    //Specific to class A only
    public static int a = 10;
    public static void m1(){
    System.out.println("Static method from classA");
    }
}

package com.java.overridingAndOverloading.overriding;


public class ClassB extends ClassA {

    private int b =20;
    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }


    public int getSuperB() {
        return super.getB();
    }

    //specific to ClassB only
    public static int a = 20;
    //Static methods are never overriden
    public static void m1(){
    System.out.println("Static method from ClassB");
    }
}

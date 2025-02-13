package com.java.superandthis;

public class ClassB extends ClassA{

    public ClassB() {
        super();
    System.out.println("ClassB constructor");
    }

    @Override
    public void m1(){
        System.out.println("Hello Everyone from ClassB");
    }
}

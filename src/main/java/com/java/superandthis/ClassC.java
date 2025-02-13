package com.java.superandthis;

public class ClassC extends ClassB{

    //It is not possible to have super() as second statement
    // because generally we can't create the child first without parent.
    public ClassC() {
        super();
        System.out.println("ClassC Constructor");
    }

    @Override
    public void m1(){
        super.m1();
        System.out.println("Hello Everyone from ClassC");
    }

    public void classAM1Method(){
        ((ClassA)this).m1();  // Calls m1 in ClassA using cast
    }

}

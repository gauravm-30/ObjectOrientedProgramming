package com.java.overridingAndOverloading.overloading;

import java.io.IOException;

public class ClassA {

    public static int a =10;
    //Not possible
//    public static String a ="Hello";
    public static void m1(){
    System.out.println("Static overloaded Method from ClassA");
    }

    public static void m1(int a) throws IOException {
        System.out.println("Static overloaded method from ClassA");
    }
}

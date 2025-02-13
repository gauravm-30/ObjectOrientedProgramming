package com.java.overridingAndOverloading.exceptionmethods.checkedexception;

import java.io.IOException;

public class TestDrive {
    public static void main(String[] args) throws IOException {
        ClassA a = new ClassB();
        //at compile time it checks whether method is there in Class A or not with complete method signature
        a.m1();
    }
}

package com.java.overridingAndOverloading.exceptionmethods.checkedexception;

import java.io.IOException;
import java.sql.SQLOutput;

public class ClassA {
    public void m1() throws IOException{
    System.out.println("ClassA");
    }

    public void m2() {
    System.out.println("Class A m2()");
    }

    public void m3()  throws ArrayIndexOutOfBoundsException{
        System.out.println("Class A m2()");
    }


}




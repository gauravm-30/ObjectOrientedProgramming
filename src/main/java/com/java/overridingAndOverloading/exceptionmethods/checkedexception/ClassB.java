package com.java.overridingAndOverloading.exceptionmethods.checkedexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class ClassB extends ClassA{
    @Override
    public void m1() throws FileNotFoundException {
        System.out.println("ClassB");
    }

//    @Override
//    public void m2() throws IOException{
//
//    }

    @Override
    public void m3() throws RuntimeException{

    }

}

package com.java.overridingAndOverloading.exceptionmethods.uncheckedexception;

import java.io.IOException;

public class ClassA {
    public void performOperation(String input) throws IOException {
        // Method implementation
         if (input == null) {
             throw new IOException("Input cannot be null");
         }
         System.out.println("Performing operation with input: " + input);
    }

    public void performOperation(int number) throws IllegalArgumentException {
        // Overloaded method implementation
         if (number < 0) {
             throw new IllegalArgumentException("Number cannot be negative");
         }
         System.out.println("Performing operation with number: " + number); }
}

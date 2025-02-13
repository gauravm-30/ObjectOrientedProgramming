package com.java.innerClass.withoutstatic;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakSimulator {
    // Static list to simulate long-lived object holding inner class instances
    public static List<OuterClass.InnerClass> innerClassList = new ArrayList<>();

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        OuterClass outer = new OuterClass("Outer class instance");
        outer.createInnerClassInstance();

        // outer reference is now eligible for GC, but held by inner class
        outer = null;

        // Simulate memory leak scenario
        // System.gc(); // Attempt to trigger garbage collection
        runtime.gc();
    }
}

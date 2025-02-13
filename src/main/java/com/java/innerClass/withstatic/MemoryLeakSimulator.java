package com.java.innerClass.withstatic;

import com.java.innerClass.withoutstatic.OuterClass;
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakSimulator {
    // Static list to simulate long-lived object holding inner class instances
    public static List<OuterWithStaticInnerClass.InnerClass> innerClassList = new ArrayList<>();

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
    OuterWithStaticInnerClass outer = new OuterWithStaticInnerClass("Outer class instance");
        outer.createInnerClassInstance();

        // outer reference is now eligible for GC, but held by inner class
        outer = null;

        // Simulate memory leak scenario
        // System.gc(); // Attempt to trigger garbage collection
        runtime.gc();
    }
}

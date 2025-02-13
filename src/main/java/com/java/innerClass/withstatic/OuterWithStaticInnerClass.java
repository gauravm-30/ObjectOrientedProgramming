package com.java.innerClass.withstatic;

import com.java.innerClass.withstatic.MemoryLeakSimulator;

public class OuterWithStaticInnerClass {
    private String outerField;

    public OuterWithStaticInnerClass(String outerField) {
        this.outerField = outerField;
    }

    public void createInnerClassInstance() {
       InnerClass inner = new InnerClass();
        // Storing inner instance in a static list
        MemoryLeakSimulator.innerClassList.add(inner);
    }

     static class InnerClass {
        public void innerMethod() {
            System.out.println("Outer field:");
        }
    }
}

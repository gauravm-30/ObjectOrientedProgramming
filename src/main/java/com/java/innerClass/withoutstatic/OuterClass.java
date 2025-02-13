package com.java.innerClass.withoutstatic;

public class OuterClass {
    private String outerField;

    public OuterClass(String outerField) {
        this.outerField = outerField;
    }

    public void createInnerClassInstance() {
        InnerClass inner = new InnerClass();
        // Storing inner instance in a static list
        MemoryLeakSimulator.innerClassList.add(inner);
    }

    public class InnerClass {
        public void innerMethod() {
            System.out.println("Outer field: " + outerField);
        }
    }
}



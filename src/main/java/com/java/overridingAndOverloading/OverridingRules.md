Overriding Concept only applicable on methods not on variables .


When you override a method from a superclass, you’re agreeing to fulfill the contract.
The contract that says, for example, “I take no arguments and I return a boolean.” In
other words, the arguments and return types of your overriding method must look to
the outside world exactly like the overridden method in the superclass.

The methods are the contract.
If polymorphism is going to work, the Toaster’s version of the overridden method
from Appliance has to work at runtime. Remember, the compiler looks at the
reference type to decide whether you can call a particular method on that reference.
Reference type            Object type            
Appliance appliance = new Toaster();
With an Appliance reference to a Toaster, the compiler cares only if class
Appliance has the method you’re invoking on an Appliance reference. But at
runtime, the JVM does not look at the reference type (Appliance) but at the
actual Toaster object on the heap. 


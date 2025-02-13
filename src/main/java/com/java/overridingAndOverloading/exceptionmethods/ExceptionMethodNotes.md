When you override a method that throws exceptions in Java, there are specific rules you must follow:

Checked Exceptions:

The overriding method can only throw the same checked exceptions, 
subclasses of those exceptions, or no exceptions at all. 
This ensures that the method signature of the overriding method is 
compatible with the overridden method.
You cannot throw new or broader checked exceptions 
that are not declared in the superclass method.


If superclass doesn't throw any exception , sublcass overriding method is not allowed to throw checked exception.



Unchecked Exceptions:

The overriding method can throw any unchecked exceptions (subclasses of RuntimeException),
regardless of what exceptions are declared in the superclass method.

If superclass doesn't throw any exception, sublcass overriding method can throw RuntimeException.


In simple word restriction are there for only checked exception.



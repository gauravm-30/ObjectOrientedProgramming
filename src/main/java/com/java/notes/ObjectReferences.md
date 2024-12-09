
You know how to declare a primitive variable and assign it a value.
But now what about non-primitive variables? In other words, what
about objects?



**There is actually no such thing as an object variable.
1.  There’s only an object reference variable.
2.  An object reference variable holds bits that represent a
way to access an object.
3. It doesn’t hold the object itself, but it holds something
like a pointer. Or an address. Except, in Java we don’t
really know what is inside a reference variable. We do
know that whatever it is, it represents one and only one
object. And the JVM knows how to use the reference to
get to the object**

Objects live in one place and one place only—the
garbage-collectible heap!.

Although a primitive variable is full of bits
representing the actual value of the variable,
an object reference variable is full of bits
representing a way to get to the
object.
You use the dot operator (.) on a ref
erence variable to say, “use the thing
before the dot to get me the thing after
the dot.” 

Regardless of what the array holds, the array itself is always an object!

An array is always an object, even if the array
is declared to hold primitives. There is no such
thing as a primitive array, only an array that
holds primitives.

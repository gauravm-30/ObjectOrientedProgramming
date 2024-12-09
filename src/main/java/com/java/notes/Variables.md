Java cares about type. It won’t let you do 
something bizarre and dangerous like stuff a
Giraffe reference into a Rabbit variable—what
happens when someone tries to ask the so-called
Rabbit to hop()? And it won’t let you put a
floating-point number into an integer variable,
unless you tell the compiler that you know you might
lose precision (like, everything after the decimal
point). 

Variables come in two flavors:
primitive and object reference. Primitives hold
fundamental values (think: simple bit patterns)
including integers, booleans, and floating-point num
bers. Object references hold, well, references to objects
(gee, didn’t that clear it up). 

When you think of Java variables, think of cups. Coffee cups, tea cups, giant cups
that hold lots and lots of your favorite drink.

A variable is just a cup. A container. It holds something.

A primitive variable value is the bits representing
the value (5, ‘a’, true, 3.1416, etc.).
� A reference variable value is the bits
representing a way to get to an object on the
heap.

Java cares about type.
Once you’ve declared an array, you
can’t put anything in it except things
that are of a compatible array type.
For example, you can’t put a Cat into a Dog
array (it would be pretty awful if someone
thinks that only Dogs are in the array, so
they ask each one to bark, and then to their
horror discover there’s a cat lurking.)  And
you can’t stick a double into an int array
(spillage, remember?). You can, however, put
a byte into an int array, because a byte
will always fit into an int-sized cup. This is
known as an implicit widening.
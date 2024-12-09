Question 1. In a subclass, what if I want to
use BOTH the superclass version and
my overriding subclass version of a
method?  In other words,  I don’t want
to completely replace the superclass
version; I just want to add more stuff
to it

Answer 1. You can do this! And it’s an
important design feature. Think of the
word “extends” as meaning “I want
to extend the functionality of the
superclass.”  
public void roam() {
super.roam();
// my own roam stuff
}
This calls the inherited version of
roam(), then comes back to do your
own subclass-specific code

You can design your superclass
methods in such a way that they
contain method implementations
that will work for any subclass, even
though the subclasses may still need to
“append” more code. In your subclass
overriding method, you can call the
superclass version using the keyword
super. It’s like saying, “first go run the
superclass version, then come back
and finish with my own code...”


So what does all this
inheritance really buy you?

You get a lot of OO mileage by designing with
inheritance. You can get rid of duplicate code by
abstracting out the behavior common to a group
of classes, and sticking that code in a superclass.
That way, when you need to modify it, you have
only one place to update, and the change is magically
reflected in all the classes that inherit that behavior. 

You avoid duplicate
code.

You define a common
protocol for a group of
classes.
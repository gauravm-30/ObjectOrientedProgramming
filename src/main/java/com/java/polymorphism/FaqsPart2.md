What is the point of an abstract method? I thought
the whole point of an abstract class was to have common
code that could be inherited by subclasses.


Inheritable method implementations (in other words,  
methods with actual bodies) are A Good Thing to put in a
superclass when it makes sense.

And in an abstract class, it
often doesn’t make sense, **because you can’t come up with
any generic code that subclasses would find useful**. The
point of an abstract method is that even though you haven’t
put in any actual method code, you’ve still defined part of
the protocol for a group of subtypes (subclasses).


Which is good because...
A: Polymorphism! Remember, what you want is the
ability to use a superclass type (often abstract) as a method
argument, return type, or array type. That way, you get
to add new subtypes (like a new Animal subclass) to your
program without having to rewrite (or add) new methods
to deal with those new types. Imagine how you’d have to
change the Vet class, if it didn’t use Animal as its argument
type for methods. You’d have to have a separate method
for every single Animal subclass! One that takes a Lion, one
that takes a Wolf, one that takes a...you get the idea. So with
an abstract method, you’re saying, “All subtypes of this type
have THIS method” for the benefit of polymorphism.


Question 2 : Wait a minute, interfaces
don’t really give you multiple
inheritance, because you can’t put
any implementation code in them.
If all the methods are abstract, what
does an interface really buy you?

Answer 2 :
Well, actually...there are
cases where interfaces can have
implementation code (static and
default methods, for example), but
we're not going to go into them here.

**The main purpose of interfaces
is polymorphism, polymorphism,
polymorphism.** **Interfaces are the
ultimate in flexibility,** because if you
use interfaces instead of concrete
classes (or even abstract classes) as
arguments and return types, you can
pass anything that implements that
interface. And with an interface, a class
doesn’t have to come from just one
inheritance tree. A class can extend
one class, and implement an interface. 

But another class might implement
the same interface, yet come from a
completely different inheritance tree!

So you get to treat an object by the role
it plays, rather than by the class type
from which it was instantiated.
In fact, if you write your code using
interfaces, you don’t even have to give
anyone a superclass to extend. You can
just give them the interface and say,
“Here, I don’t care what kind of class
inheritance structure you come from,
just implement this interface and you’ll
be good to go.”

Question 3 : 
How do you know whether to make a
class, a subclass, an abstract class, or
an interface?

Answer 3 :
▪ Make a class that doesn’t extend anything
(other than Object) when your new class doesn’t
pass the IS-A test for any other type.
▪ Make a subclass (in other words, extend a class)
only when you need to make a more specific
version of a class and need to override or add
new behaviors.
▪ Use an abstract class when you want to define
a template for a group of subclasses, and you
have at least some implementation code that all
subclasses could use. Make the class abstract
when you want to guarantee that nobody can
make objects of that type.
▪ Use an interface when you want to define a role
that other classes can play, regardless of where
those classes are in the inheritance tree.


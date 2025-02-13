To exploit polymorphism, we need interfaces
(and not the GUI kind). We need to go beyond simple inheritance to a level of flexibility and
extensibility you can get only by designing and coding to interface specifications


The class structure isn’t too bad. We’ve designed it so
that duplicate code is kept to a minimum, and we’ve
overridden the methods that we think should have
subclass-specific implementations. We’ve made it nice
and flexible from a polymorphic perspective, because
we can design Animal-using programs with Animal
arguments (and array declarations) so that any Animal
subtype—including those we never imagined at
the time we wrote our code—can be passed in and
used at runtime.

But here’s where it gets weird:
Animal anim = new Animal();

These two are the same type, but...
what the heck does an Animal object look like

**Some classes just should not be
instantiated!** 

We need an Animal
class, for inheritance and polymorphism. But we want
programmers to instantiate only the less abstract subclasses
of class Animal, not Animal itself. We want Tiger objects
and Lion objects, not Animal objects.

Fortunately, there’s a simple way to prevent a class from
ever being instantiated. In other words, to stop anyone
from saying “new” on that type. By marking the class as
abstract, the compiler will stop any code, anywhere,
from ever creating an instance of that type.

You can still use that abstract type as a reference type. In
fact, that’s a big part of why you have that abstract class
in the first place (to use it as a polymorphic argument or
return type, or to make a polymorphic array).


When you’re designing your class inheritance structure,
you have to decide which classes are abstract and which
are concrete. Concrete classes are those that are specific
enough to be instantiated. A concrete class just means that
it’s OK to make objects of that type.

Making a class abstract is easy—put the keyword
abstract before the class declaration:
abstract class Canine extends Animal {
public void roam() { }
}

An abstract class means that nobody can ever make a new instance
of that class. You can still use that abstract class as a declared refer
ence type, for the purpose of polymorphism, but you don’t have to
worry about somebody making objects of that type. The compiler
guarantees it. 

An abstract class has virtually* no use, no value, no
purpose in life, unless it is extended.
With an abstract class, it’s the instances of a subclass of
your abstract class that’s doing the work at runtime


An abstract class
means the class must be extended; an abstract method means the method
must be overridden. You might decide that some (or all) behaviors in an
abstract class don’t make any sense unless they’re implemented by a more
specific subclass. In other words, you can’t think of any generic method
implementation that could possibly be useful for subclasses. What would a
generic eat() method look like?
An abstract method has no body!
Because you’ve already decided there isn’t any code that would make
sense in the abstract method, you won’t put in a method body. So no curly
braces— just end the declaration with a semicolon.
public abstract void eat();

If you declare an abstract method, you MUST
mark the class abstract as well. You can’t have
an abstract method in a non-abstract class.

Abstract methods don’t have a body; **they exist solely for polymorphism**. That means the
first concrete class in the inheritance tree must implement all abstract methods.

When we say “you must implement the abstract method,” that means you must provide
a body. That means you must create a non-abstract method in your class with the same
method signature (name and arguments) and a return type that is compatible with the
declared return type of the abstract method.

What if you need to change
the contract?

It looks like we need TWO
superclasses at the top.

It’s called “multiple inheritance,”    
and it can be a Really Bad Thing.
That is, if it were possible to do in Java.
But it isn’t, because multiple inheritance has a problem
known as The Deadly Diamond of Death.

Making and implementing
interfaces and polymorphism
the Pet interface 






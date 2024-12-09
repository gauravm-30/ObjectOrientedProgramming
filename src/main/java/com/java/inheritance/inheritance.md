
I looked at what all four
classes have in common.

They’re Shapes, and they all rotate and
playSound.  So I abstracted(summarize) out the
common features and put them into a
new class called Shape.

Then I linked the other
four shape classes to
the new Shape class,
in a relationship called
**inheritance.**

When you design with inheritance, you put common code in a
class and then tell other more specific classes that the common (more abstract) class is their superclass.

When one class inherits from another, the subclass inherits from the superclass.
In Java, we say that the subclass extends the superclass.
An inheritance relationship means that the subclass inherits the
members of the superclass. When we say “members of a class,”
we mean the instance variables and methods. For example if
PantherMan is a subclass of SuperHero, the PantherMan class
automatically inherits the instance variables and methods common
to all superheroes including suit, tights, specialPower,
useSpecialPower(), and so on. But the PantherMan sub
class can add new methods and instance variables of its
own, and it can override the methods it inherits from the
superclass SuperHero.

Instance variables are not overridden because they
don’t need to be. They don’t define any special behavior, so a
subclass can give an inherited instance variable any value it
chooses. PantherMan can set his inherited tights to
purple, while FriedEggMan sets his to white.



When you call a method on an object refer
ence, you’re calling the most specific version
of the method for that object type.
In other words, the lowest one wins!
“Lowest” meaning lowest on the inheritance
tree. Canine is lower than Animal, and Wolf
is lower than Canine, so invoking a method
on a reference to a Wolf object means the
JVM starts looking first in the Wolf class. If
the JVM doesn’t find a version of the method
in the Wolf class, it starts walking back up the
inheritance hierarchy until it finds a match.

Is A vs Has A

Remember that when one class inherits
from another, we say that the subclass
extends the superclass. When you want to
know if one thing should extend another,
apply the IS-A test.
Triangle IS-A Shape, yeah, that works.


Tub extends Bathroom, sounds
reasonable.  
Until you apply the IS-A test.
To know if you’ve designed your types
correctly, ask, “Does it make sense to say
type X IS-A type Y?” If it doesn’t, you
know there’s something wrong with the
design, so if we apply the IS-A test, Tub
IS-A Bathroom is definitely false.
What if we reverse it to Bathroom
extends Tub? That still doesn’t work,
Bathroom IS-A Tub doesn’t work.
Tub and Bathroom are related, but not
through inheritance. Tub and Bathroom
are joined by a HAS-A relationship.
Does it make sense to say “Bathroom
HAS-A Tub”? If yes, then it means that
Bathroom has a Tub instance variable. In
other words, Bathroom has a reference to
a Tub, but Bathroom does not extend Tub
and vice versa.



Access levels control who sees what, and are crucial
to having well-designed, robust Java code. For now we’ll
focus just on public and private. The rules are simple for
those two
When a subclass inherits a member, it is as if the
subclass defined the member itself. In the Shape
example, Square inherited the rotate() and
playSound() methods and to the outside world (other
code) the Square class simply has a rotate() and
playSound() method.
The members of a class include the variables and
methods defined in the class plus anything inherited
from a superclass.


When designing with inheritance,
inheritance and polymorphism
are you using or abusing?


DO use inheritance when one class is a more specific type of a
superclass. Example: Willow is a more specific type of Tree, so
Willow extends Tree makes sense

DO consider inheritance when you have behavior
(implemented code) that should be shared among multiple
classes of the same general type. Example: Square, Circle,
and Triangle all need to rotate and play sound, so putting
that functionality in a superclass Shape might make sense and
makes for easier maintenance and extensibility. Be aware,
however, that while inheritance is one of the key features of
object-oriented programming, it’s not necessarily the best way
to achieve behavior reuse. It’ll get you started, and often it’s
the right design choice, but design patterns will help you see
other more subtle and flexible options. If you don’t know about
design patterns, a good follow-on to this book would be Head
First Design Patterns.


DO NOT use inheritance just so that you can reuse code
from another class, if the relationship between the superclass
and subclass violate either of the above two rules. For example,
imagine you wrote special printing code in the Animal class
and now you need printing code in the Potato class. You might
think about making Potato extend Animal so that Potato
inherits the printing code. That makes no sense! A Potato is not
an Animal! (So the printing code should be in a Printer class
that all printable objects can take advantage of via a HAS-A
relationship.)

DO NOT use inheritance if the subclass and superclass
do not pass the IS-A test. Always ask yourself if the subclass
IS-A more specific type of the superclass. Example: Tea IS-A
Beverage makes sense. Beverage IS-A Tea does not make any sense.


In other words, you define a common protocol for a
set of classes related through inheritance.
When you define methods in a superclass that can be inher
ited by subclasses, you’re announcing a kind of protocol to
other code that says, “All my subtypes (i.e., subclasses) can
do these things, with these methods that look like this...”
In other words, you establish a contract.
Class Animal establishes a common protocol for all Animal
subtypes


Animal
makeNoise()
eat()
sleep()
roam()

You’re telling the world that
any Animal can do these four
things. That includes the method
arguments and return types. 



We know that objects
have state and behavior, represented by instance variables and methods. But until now, we
haven’t looked at how state and behavior are related.
We already know that each instance of a
class (each object of a particular type) can have its own unique values for its instance variables. 

Fortunately, that’s the whole point of an object—it has behavior that acts on its state.  In
other words, methods use instance variable values. Like, “if dog is less than 14 pounds, make
yippy sound, else...” or “increase weight by 5.” Let’s go change some state.


Java is pass-by-value.
That means pass-by-copy.


Exposing our data!
Here we are, just humming along without a
care in the world leaving our data out there
for anyone to see and even touch.

Exposed means reachable with the dot operator, as in:
theCat.height = 27;

Think about this idea of using our remote
control to make a direct change to the Cat
object’s size instance variable. In the hands of
the wrong person, a reference variable (remote
control) is quite a dangerous weapon. Because
what’s to prevent:
theCat.height = 0; 

This would be a Bad Thing. We need to build
setter methods for all the instance variables,
and find a way to force other code to call the
setters rather than access the data directly.

By forcing everybody to call a setter
method, we can protect the cat from
**unacceptable** size changes

We put in checks to
guarantee a mini
mum cat height
public void setHeight(int ht) {
if (ht > 9) {
height = ht;
}
}


Hide the data - protects your data and protects
**your right to modify your
implementation later.**

OK, so how exactly do you hide
the data? With the public
and private access modifiers.
You’re familiar with public—
we use it with every main
method.
Here’s an encapsulation starter
rule of thumb (all standard
disclaimers about rules of
thumb are in effect): mark your
instance variables private and
provide public getters and
setters for access control

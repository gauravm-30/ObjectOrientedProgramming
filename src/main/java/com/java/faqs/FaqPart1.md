Question 1. What if I need global 
variables and methods? How 
do I do that if everything has to 
go in a class?

Answer 1. There isn’t a concept of
“global” variables and methods
in a Java OO program. In
practical use, however, there
are times when you want a
method (or a constant) to be
available to any code running in
any part of your program.

You’ll learn that marking
a method as public and
static makes it behave much
like a “global.” Any code, in any
class of your application, can
access a public static method.
And if you mark a variable as
public, static, and final,
you have essentially made a
globally available constant.

Question 2. Then how is this object-oriented if you can still make
global functions and global
data?

Answer 2. First of all, everything
in Java goes in a class. So the
constant for pi and the method
for random(), although both
public and static, are defined
within the Math class.  And you
must keep in mind that these
static (global-like) things are the
**exception** rather than the rule
in Java. They represent a very
special case, where you don’t
have multiple instances/objects.


Question 3.  What if I have a hundred
classes? Or a thousand? Isn’t
that a big pain to deliver
all those individual files?
Can I bundle them into one
Application Thing?

Answer 3.Yes, it would be a big
pain to deliver a huge bunch of
individual files to your end users,
but you won’t have to. You can
put all of your application files
into a Java ARchive—a .jar file—
that’s based on the pkzip format.  
In the jar file, you can include
a simple text file formatted as
something called a manifest, that
defines which class in that jar
holds the main() method that
should run. 





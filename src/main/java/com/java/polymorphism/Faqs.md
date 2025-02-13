Questions 1 : Are there any practical limits
on the levels of subclassing? How
deep can you go?

Answer 1 :
If you look in the Java API,
you’ll see that most inheritance
hierarchies are wide but not deep.
Most are no more than one or two
levels deep, although there are
exceptions (especially in the GUI
classes). You’ll come to realize that
it usually makes more sense to keep
your inheritance trees shallow, but
there isn’t a hard limit (well, not one
that you’d ever run into).

Question 2 :
Hey, I just thought of
something...if you don’t have access
to the source code for a class but you
want to change the way a method
of that class works, could you use
subclassing to do that? To extend
the “bad” class and override the
method with your own better code?

Yep. That’s one cool feature
of OO, and sometimes it saves you
from having to rewrite the class
from scratch or track down the
programmer who hid the source code. 

Question 3 :  Can you extend any class? Or
is it like class members where if the
class is private you can’t inherit it..


Answer 3 :
There’s no such thing as a
private class, except in a very special
case called an inner class, which we
haven’t looked at yet. But there are
three things that can prevent a class
from being subclassed.
The first is access control. Even
though a class can’t be marked
private, a class can be non-public
(what you get if you don’t declare the
class as public). A non-public class
can be subclassed only by classes in
the same package as the class. Classes
in a different package won’t be able to
subclass (or even use, for that matter)
the non-public class.

The second thing that stops a class
from being subclassed is the keyword
modifier final. A final class means
that it’s the end of the inheritance
line. Nobody, ever, can extend a final
class.

The third issue is that if a class has
only private constructors (we’ll
look at constructors in Chapter 9), it
can’t be subclassed. 


Question 4 : Why would you ever want to
make a final class? What advantage
would there be in preventing a class
from being subclassed?

Answer 4 :
Typically, you won’t make
your classes final. **But if you need
security—the security of knowing
that the methods will always work the
way that you wrote them (because
they can’t be overridden),  a final class
will give you that.** A lot of classes in
the Java API are final for that reason.
The String class, for example, is final
because, well, imagine the havoc if
somebody came along and changed
the way Strings behave!

Question 5 :
Can you make a method final,
without making the whole class
final?

Answer 5 :
If you want to protect a specific
method from being overridden, mark
the method with the final modifier.
Mark the whole class as final if you
want to guarantee that none of the
methods in that class will ever be
overridden.
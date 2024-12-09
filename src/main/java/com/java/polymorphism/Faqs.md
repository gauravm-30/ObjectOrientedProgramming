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
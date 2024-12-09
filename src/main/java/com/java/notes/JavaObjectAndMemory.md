Each time an object is created
in Java, it goes into an area of
memory known as The Heap. All
objects—no matter when, where, or how
they’re created—live on the heap. But it’s
not just any old memory heap; the Java
heap is actually called the Garbage
Collectible Heap. When you create an
object, Java allocates memory space on
the heap according to how much that
particular object needs. An object with,
say, 15 instance variables, will probably
need more space than an object with
only two instance variables. But what
happens when you need to reclaim
that space? How do you get an object
out of the heap when you’re done with
it? Java manages that memory for you!
When the JVM can “see” that an object
can never be used again, that object
becomes eligible for garbage collection.
And if you’re running low on memory,
the Garbage Collector will run, throw out
the unreachable objects, and free up the
space so that the space can be reused. 
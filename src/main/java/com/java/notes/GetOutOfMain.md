As long as you’re in main(), you’re not really in Objectville. It’s fine for a test program
to run within the main method, but in a true OO application, you need objects talk
ing to other objects, as opposed to a static main() method creating and testing objects.
The two uses of main:
1. to test your real class
2. to launch/start your Java application

A real Java application is nothing but objects talking to other objects. In this case,
talking means objects calling methods on one another. 
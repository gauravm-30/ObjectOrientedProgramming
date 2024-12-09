
Plan your programs with the future in mind. 
**Means code in such a way that in future if something need to change
then it would have done very easily**

Means always try to make your code flexible.
What if you could write code that someone else could extend, easily?
And if you could write code
that was flexible, for those pesky last-minute spec changes, would that be something you’d
be interested in?
When you get on the Polymorphism Plan, you’ll learn the 5 steps to bet
ter class design, the 3 tricks to polymorphism, the 8 ways to make flexible code, and if you act
now—a bonus lesson on the 4 tips for exploiting inheritance.

Poly-many, morphic- forms
Polymorphism provides flexibility to our code.

Polymorphism requires you to understand inheritance first.


But with polymorphism, the
reference type and the object
type can be different.

With polymorphism, the reference
type can be a superclass of the
actual object type.

When you declare a reference variable, any
object that passes the IS-A test for the type
of the reference can be assigned to that
variable. In other words, anything that
extends the declared reference variable type
can be assigned to the reference variable.
**This lets you do things like make
polymorphic arrays.**

Declare an array of type Animal.
Animal[] animals = new Animal[5];

But look what you get to do...you can put ANY subclass
of Animal in the Animal array!
Means created the polymorphic array.
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();

for (Animal animal : animals) {
animal.eat();
animal.roam();
}

And here’s the best polymorphic part: you
get to loop through the array and call one
of the Animal-class methods, and every
object does the right thing.


But wait! There’s more!

**You can have polymorphic
arguments and return types.**
If you can declare a reference variable of a
supertype, say, Animal, and assign a subclass
object to it, say, Dog, think of how that might
work when the reference is an argument to a
method...

class Vet {

The ‘a’ parameter can take ANY Animal
type as the argument. And when the Vet
is done giving the shot, it tells the Animal
to makeNoise(), and whatever Animal is
really out there on the heap, that’s whose
makeNoise() method will run.

public void giveShot(Animal a) {
// do horrible things to the Animal at
// the other end of the ‘a’ parameter
a.makeNoise();
}

}

class PetOwner {
public void start() {
Vet vet = new Vet();
Dog dog = new Dog();
Hippo hippo = new Hippo();

The Vet’s giveShot() method can take any
Animal you give it. As long as the object
you pass in as the argument is a subclass of
Animal, it will work.
vet.giveShot(dog);   //Dog’s makeNoise() runs

vet.giveShot(hippo); //Hippo’s makeNoise() runs


}



Making coding flexible
NOW I get it! If I write
my code using polymorphic arguments,
where I declare the method parameter as a
superclass type, I can pass in any subclass object at
runtime. Cool. Because that also means I can write my
code, go on vacation, and someone else can add new
subclass types to the program and my methods will
still work.

With polymorphism, you can write code that doesn’t
have to change when you introduce new subclass
types into the program.
Remember that Vet class? If you write that Vet class using
arguments declared as type Animal, your code can handle any
Animal subclass. That means if others want to take advantage of
your Vet class, all they have to do is make sure their new Animal types
extend class Animal. The Vet methods will still work, even though
the Vet class was written without any knowledge of the new Animal
subtypes the Vet will be working on. 





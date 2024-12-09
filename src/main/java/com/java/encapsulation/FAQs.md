Question 1. So what does encapsulation protect you from?

Answer 1. Encapsulation puts a force-field(shield) around my instance variables, so nobody can set
them to, let’s say, something inappropriate. 
Example :  Happy to. Most instance variable values are coded with certain assumptions
about their boundaries. Like, think of all the things that would break if negative numbers
were allowed. Number of bathrooms in an office. Velocity of an airplane. Birthdays.
Barbell weight. Phone numbers. Microwave oven power.


Question 2.So how does encapsulation let you set boundaries?

Answer 2. By forcing other code to go through setter methods. That way, the setter method
can validate the parameter and decide if it’s doable. Maybe the method will reject it and
do nothing, or maybe it’ll throw an Exception (like if it’s a null Social Security number
for a credit card application), or maybe the method will round the parameter sent in to
the nearest acceptable value. The point is, you can do whatever you want in the setter
method, whereas you can’t do anything if your instance variables are public.

Question 3.  But sometimes I see setter methods that simply set the value without check
ing anything. If you have an instance variable that doesn’t have a boundary, doesn’t that
setter method create unnecessary overhead? A performance hit?

Answer 3. The point to setters (and getters, too) is that you can change your mind later,
without breaking anybody else’s code!(means no changes in other code) Imagine if half the people in your com
pany used your class with public instance variables, and one day you suddenly realized,
“Oops—there’s something I didn’t plan for with that value, I’m going to have to switch
to a setter method.” You break everyone’s code. The cool thing about encapsulation is
that you get to change your mind. And nobody gets hurt. The performance gain from using
variables directly is so miniscule and would rarely—if ever—be worth it.




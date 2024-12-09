Question 1. What happens if the argument you want to
pass is an object instead of a primitive?

Answer: You’ll learn more about this in later chapters,  
but you already know the answer. Java passes
everything by value. Everything. But...value means
bits inside the variable. And remember, you don’t
stuff objects into variables; the variable is a remote
control—a reference to an object. So if you pass a
reference to an object into a method, you’re passing
a copy of the remote control.  Stay tuned, though,
we’ll have lots more to say about this.
 
Question 2. Do I have to do something with the return
value of a method? Can I just ignore it?
Answer 2. Java doesn’t require you to acknowledge a
return value. You might want to call a method with
a non-void return type, even though you don’t care
about the return value.  In this case, you’re calling
the method for the work it does inside the method,
rather than for what the method gives returns. In
Java, you don’t have to assign or use the return value
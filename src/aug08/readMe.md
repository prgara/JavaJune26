static methods cannot be overrideen. if you do so then it is called method hiding.


Can we override constructors -> No.
super keyword -> if you want to access parent var, method. child constructor will have super() as the opening line always even if we dont write this.

Encapsulation -> bundling of data and methods in a single unit.
Why encapsulation -> security, control, validation

Access modifiers
- public --- accessible to anyone from anywhere
- default --- accessible to same package
- protected --- accessible to same package as well subclass in other package
- private --- accessible in the same class

how -> make the instance var as private and provide public getter setter to access these var.


class --- object ----- pass data to class via this keyword

class ---- object ---- take help of constructor to pas sthe values.

Object class is the parent class for each class.

If we call method it will always check in the subclass, if available it will execute
else will check in the parent class.

crate a class User (username, password). login method with validation. 


class a class employee(name, salary), salary should have no setter. 
instead you can have giveRaise method  that allow positive values
applydedeuction method to deduct anything


ways to do abstraction
- abstract classes -----  0-100%
abstract class may or may not have a abstract method.
abstract method acn only exist in abstract class.
abstract class cannot be instantiated means you cannot create an object of it.
you have to inherit the abstract class and then create the object of it.
It can have a constructor used to set values of instance variables.

- interface   ----- 100%

Composition --- 

JVM, JRE, JDK
Garbage Collection
Serailization/deserialization






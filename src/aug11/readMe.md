Can we ovevrride static methods ? 
method hiding ? 

Interface -> It is a contract which an implementing class has to follow.

By default, all the methods inside an interface are abstract and public.
You cannot create an object of it. But implement the interface by using implants keyword.
All the var are public, static and final by default.

Non-access modifier -> static, final, abstract

final var -> value cannot be changed
final method -> it cant be overridden
final class -> cannot be inherited.

class - class ---- extends
class - interface ----- implements
interface -- interface ---- extends

Multiple inheritance

what we do in abstraction ? --- override abstract methods.
Inheritance gives you ability to override
Abstract class/ interface gives you ability to enforce a contract.

Inheritance vs Composition
Dog is animal ----- inheritance ---- tight coupling
car has a engine ---- composition ----- loose coupling

-------------------------------------------------------------------------------


Exception -> which breaks the normal flow of execution of the program.

Exception handling -> It is to handle the exceptions gracefully to maintain the normal flow of the program

Error -> is a irreversible condition from which you cannot recover. stack overflow, memory out.
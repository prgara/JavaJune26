1. get will react if equals not overridden ???
2. Put will react if hash method is not overridden ???


Is hashmap thread-safe ??? No
ArrayList, linkedList,hashSet are not thread safe.

Vector --- thread safe version of arraylist but it is a legacy now.
Hashtable -- thread safe version of map. 

hashmap ---- concurrenthashmap
arrayList --- copyOnwriteArrayList



-------------------------------------------------------

JAVA 8 or 1.8
# Features of java 8
1. Functional interface
2. Default methods in interfaces
3. Lambdas
4. Stream API
5. Optional classes
6. Completable Future
7. Method reference
8. Date time API


Java 8, 11, 17, 21

17 --- records, sealed classes


# Functional interface (SAM)
- It have only one abstract method.
- It can have default methods which is a concrete method with default keyword.
default method was introduced to have backward compatability.
- It can also have static concrete method.
- 


Lambda is used to express the instance of functional interface.


() -> {}
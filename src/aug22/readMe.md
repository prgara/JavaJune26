O(1)   
O(n) 
o(log n)

Immutability ---> once defined it cannot be changed. String, Wrapper classes.

How to make a class as Immutable : 
- Mark class as final ----> 
- var as final & private 
- Remove the setters

Record is an immutable class which have no boilerplate code.


Collection framework

set of interfaces and classes which is used to manipulate and store the group of objects.

                            Iterable                                  Map 
                                |                                      |
                            Collection                            HashMap,TreeMap
                                |                                   LinkedHashMap
                                |
        List                   Set                   Queue
         |                      |                      | 
 ArrayList,LinkedList      HashSet,LinkedHashSet     Deque
                              TreeSet      



ArrayList is a dynamic array.
- Initially it will create a space to store 10 elements and 
as you use add method to add 11th element it will grow by the factor 1.5X.
- From java 8, new arraylist will have 0 cacpicity and moment you add 1 element it will expand to 10.
- All the elements are store in contiguous memory location.

 1     2   3    4    5    6      
1234 1235 1236 1237 1238 1239


1234 +3 = 1237

Arraylist is preffered for random access and 
not a good choice when you need to add element in the middle or start of the list

get in arrayList - O(1)
add ----> O(n)

Linkedlist ----> 
does not have any index. 
they are scattered in the memory noty stored in contiguous memory location.
It is a implementation of doubly linkedList.

Types
- singly linked list
- doubly linked list
- circular linked list

For frequent insertion and deletion, prefer linkedlist as it does not shift all the elements



Iterate over the list
- for each
- for loop
- iterator

While iterating overing the collection, if you try to modify the collection
it will throw ConcurrentModificationException.


















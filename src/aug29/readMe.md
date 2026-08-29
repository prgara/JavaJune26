LIFO --- Last In First out
FIFO --- First in first out

Queue follows FIFO
- peek --- check the first element
- offer --- add an element to last
- poll --- remove the first element


Stack follow LIFO   
- push --- add element to the top of the stack
- pop --- remove the top element
- peek --- check the top element


Maven --- build automation tool
Gradle 



Lombok --- it reduces the boilerplate code.

Map --- it is a key value pair data structure. no duplicates keys but you can have duplicate values
not part of collection interface but part of collection framework.
HashMap --- unordered, no duplicates keys but you can have duplicate values. one null key is allowed and multiple null values.
LinkedHashMap --- no duplicates keys but you can have duplicate values, maintains the insertion order
TreeMap -- no duplicates keys but you can have duplicate values, do natural sorting


arraylist of linkedlist of nodes.

default size is 16 means it will have 16 buckets at the start.
load factor of 0.75 and it will resize to double once it is 75% full.


< ? extends  >
< ? super  >


Hashcode & equals contract
- if 2 objects are equals their hashcode should be equals.
- if 2 objets hashcode is same then their may or may not be equals.

how put method works
marks.put("Nidhin",98);
1. get the hashcode of the key. ---- 12457
2. use modulo function to get the bucket num.-- 3
3. create a node and put hashcode there and put the key and value in the respective section.

marks.put("Nidhin",98);
1. get the hashcode of the key. ---- 12457
2. use modulo function to get the bucket num.-- 3
3. if there is a node it will check the key using equals method
- if key is same then it will put the value there.
- if key is not same
- - if next node is not there then will create a new node and dump everything there.
- - if there is next node then again it will check the key using equals and then repeat the process.


How get will work
marks.get("Ram")
1. get the hashcode of the key. ---- 12457
2. use modulo function to get the bucket num.-- 3
3. use equals to compare the key
4. if same return the value
5. if not same check the next node if there and repeat the process else return null






































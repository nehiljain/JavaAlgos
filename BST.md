#Regex
======

Reference Regex.

*   abc…    Letters
*   123…    Digits
*   \d  any Digit
*   .   any Character
*   \.  Period
*   [abc]   Only a, b, or c
*   [^abc]  Not a, b, nor c
*   [a-z]   Characters a to z
*   [0-9]   Numbers 0 to 9
*   {m} m Repetitions
*   {m,n}   m to n Repetitions
*   *   Zero or more repetitions
*   +   One or more repetitions
*   ?   Optional
*   \s  any Whitespace
*   ^…$ Starts and ends
*   ()  capture Group
*   (a(bc)) capture Sub group
*   (.*)    capture Variable content
*   (a|b)   Matchs a or b
*   \w  any Alphanumeric character
*   \W  any Non-alphanumeric character
*   \d  any Digit
*   \D  any Non-digit character
*   \s  any Whitespace
*   \S  any Non-whitespace character

[Learn Regex here](http://regexone.com/lesson/)

[8 Useful regex for Web Programming](http://code.tutsplus.com/tutorials/8-regular-expressions-you-should-know--net-6149)

[Internal Functioning of Regex](https://class.coursera.org/algs4partII-003/lecture/45)

[Data Science Regex in R](https://class.coursera.org/getdata-003/lecture/45)


ENUM
=======
[enum-in-java-example-tutorial](http://javarevisited.blogspot.ca/2011/08/enum-in-java-example-tutorial.html)

Uses:

* To write a *Singleton* in JAVA
* To represent constants with constatnt states

Advantages:

* Type safe
* can be usedin switch statements
* should have private construtor

Autoboxing
================
[Reference](http://algs4.cs.princeton.edu/13stacks/Autoboxing.java.html)

* Integer a = null; // runtime error primitive type cannot store *null*.
* the same immutable Integer objects (Java's implementation of valueOf() retrieves a cached values if the integer is between -128 and 127), while Java constructs new objects for each integer outside this range.[Here](http://algs4.cs.princeton.edu/13stacks/)


Cloning Objects - Java
==============================

* Default type cloning in Java is Shallow Cloning.
* Two types of cloning supported is Deep and Shallow Copy
* *Shallow Copy*
    - creates a new instance and returns Object type. you need to explicitly cast it. THis instance is of the same class and has copy of all the fields in it.
    - you need to implement cloneable to prevent CloneNotSupportedException

* *Deep Copy* - It recursively copies all teh objects from top to bottom.
* To implement deeo cloning one way is to use Java Object Serialization(JOS). Else do a manual copy which is tedious and difficult to maintain. 
* Java's default cloning is Shallow cloning. done with clone()
* Characteristics of Shallow Clone a = clone(b) mean
    - b.equals(a)
    - no method of a can modify the value of b
* disavantages of deep cloning
    - serilaization is more expensive
    - not all objects are serializable
    - Serilaisatrioni si not simple to implement for deep cloned object??
    - you might fall for cyclic dependencies if not using serialization


# Binary Search Tree
===========================


- Binary tree in symmetric order
- Possible cases of a node 
	- empty
	- has two disjoint trees
- The shape of the tree decides the number of compares
- The shape of the tree is dependent on the order of input of keys.
- BST is best for Randomly ordered keys
- Difference from heap  as in BST- every node has a value in between the values of the left sub-tree and the right sub-tree, whereas heap has a node with its value larger than the two sub-heaps
- A class Node to have 4 fields 
	- Key
	- Value
	- A ref. to left tree
    - A ref. to right tree
    - Count (for ranking and size!!)
- A class BST
    - has comparable keys
    - global field - root node of the tree
    - methods 
        - get
        - put
            - reset the value if it exists
            - create a node with the value if it does not
        - #Ordered Data Operations
            - min, max
            - floor and ceil (Think about the number of cases)
            - rank (think cases)
        - iterable
        - delete
- It corresponds Quick Sort partitioning!
- Analysis
    - AVG - 2 Ln N for search/insert
    - Worst Case - z


# Traversal
========================

- IN Order
    - Defn: begins at the left most node and ends at the right most node
    - USE: to retrieve the order in which the nodes were entered.
    - USE: Flatten the tree in the same way it was created

- PRE Order
    - Defn: begins at the root node and ends at the right most node
    - USE: if you want to explore the roots before the roots
- POST Order
    - Defn: begins at the left most node and ends at the root node
    - USE: if you want to explore the leaves before the any nodes.




=============================
Some Problems
=============================

- Question 1 
Red-black BST with no extra memory. Describe how to save the memory for storing the color information when implementing a red-black BST.

- Question 2
Document search. Design an algorithm that takes a sequence of N document words and a sequence of M query words and find the shortest interval in which the M query words appear in the document in the order given. The length of an interval is the number of words in that interval.

- Question 3
Generalized queue. Design a generalized queue data type that supports all of the following operations in logarithmic time (or better) in the worst case.
Create an empty data structure.
Append an item to the end of the queue.
Remove an item from the front of the queue.
Return the ith item in the queue.
Remove the ith item from the queue.

Binary Trees (NOT BST)
================
[Lowest Common Ancestor](http://leetcode.com/2011/07/lowest-common-ancestor-of-a-binary-tree-part-i.html)

This will also solve find the min path between two keys in Binary Tree.


Hashing
=============


Difference between hashmap and hashtable in java is that Hashmap is unsynchronised and permits nulls.


Hashmap does not guarantee that the order will remain smae over time.

2 params to create it - Initial capacity and load factor    



==========================
Red-Black trees
==========================

version: left-leaning red black tree - LLRB

* It represents a 2-3 tree in a BST. Hence *all red-black trees are BSTs*.
* *Search is the same as BST(ignore the color)*
* Change the node class to have a boolean color feature
* Insertions in a LLRB tree
* Always attach a new node with red color
* Insertion cases
    - Right child red and left child black : rotate left
    - Left Child, left left grand child red : rotate right
    - both children red : flip color






Linked List - 
[Linked-list implementations of collections](http://algs4.cs.princeton.edu/13stacks/) 
    
    - Implement Iterable
    - Use a static subclass Node
    - Use recursion to iterate forward and reverse

Generics - A way to create a name for a type param



Stacks
=========

[Java Interview Questions and Answers](http://java-success.blogspot.ca/2012/04/java-stack-data-structure-interview.html)

Java has Deque (pronouced deck) as a more efficient LIFO Data structure. Better than a stack. You can create a deque which stores the elements in a linkedlist or array internally using LinkedList or ArrayDeque, resp.

Important Points
-------------------------


To-do
--------------
 - http://algs4.cs.princeton.edu/13stacks/ how to implement listiterator and arrayiterator
 - Q + A
 - JUNIT example, simple intro
 - Cloning http://www.java-questions.com/Cloning_interview_questions.html, http://javapapers.com/core-java/java-clone-shallow-copy-and-deep-copy/
 - LCA, RMQ


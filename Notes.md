Regex
======

Reference Regex.

*   abc…    Letters
*   123…    Digits
*   \d  any Digit
*   .   any Character
*   \\.  Period
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


Static Methods
================

* Rule-of-thumb: ask yourself "does it make sense to call this method, even if no Obj has been constructed yet?" If so, it should definitely be static.
* Instance methods are associated with an object and use the instance variables of that object. This is the default.
* Static methods use no instance variables of any object of the class they are defined in. Static methods typically take all the data from parameters and compute something from those parameters, with no reference to variables. This is typical of methods which do some kind of generic calculation.

### How to call?

From inside the class

    > methodname()

From outside the class
    > Classname.methodname()


* Use <classname>.<staticmethod>
* Use <ObjectName>.<staticmethod> in which case the object is ignored instead the classname is used.


### Why Static?
[http://www.leepoint.net/notes-java/flow/methods/50static-methods.html](http://www.leepoint.net/notes-java/flow/methods/50static-methods.html)

* Makes it clear to programmer that it does use the object/instance variables
* It is more *efficient* as the compiler creates a code which does not have implicit object parameters
* Documenatation becomes cleaner.




Static Variables
==================

* static methods cannot access instance variables but can access static variables.
* static variables are used to define constants whichare associated with the class, Like Math.PI
* Any moethod can access static variables either static or instance method where as instance variables can only be accessed by instance methods()

Generics
========

[Brilliant Lesson at Oracle's site](http://docs.oracle.com/javase/tutorial/java/generics)

- generally classes or interfaces are call generics.
- A way to create a name for a type param
- WHy Use?
    - Stronger Compile check at compile time
    - Eliminates casts from the code
    - Enable generic algorithms
- Naming conventions
    - type parameter names are single, uppercase letters
    - most commonly used type parameter names are:
        *   E - Element (used extensively by the Java Collections Framework)
        *   K - Key
        *   N - Number
        *   T - Type
        *   V - Value
        *   S,U,V etc. - 2nd, 3rd, 4th types
- Type parameter and Type Arguments.  
    
```java

    public class BOX<T> {}
    //T is a type param

    BOX<Integer> obj;
    //Integer is a type argument

    List<String>; //is a parameterized type.
```
- Raw Types : Box<> is raw type. Stores objects and is pre-generics era. !!Avoid using Raw types

#### Generic methods

- Generic methods are methods that introduce their own type parameters.
- Static and non-static generic methods are allowed, as well as generic class constructors.
- syntax for defining and invoking

```java
public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2);

boolean same = Util.<Integer, String>compare(p1, p2);
```

- type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets. 

#### Bounded type parameters

[http://docs.oracle.com/javase/tutorial/java/generics/bounded.html](http://docs.oracle.com/javase/tutorial/java/generics/bounded.html)

This is used to restrict the types that can be used as type arguments in a parameterized type. Syntax

```java
    
    public class BST<K extends Integer>{}

    //multiple bounds
    public class BST<K extends Integer & Double & Char> {}
```

#### Multiple Bounds

```java
<T extends B1 & B2 & B3>
```

A type variable with multiple bounds is a subtype of all the types listed in the bound. If one of the bounds is a class, it must be specified first. For example:

```java
Class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

class D <T extends A & B & C> { /* ... */ }

//If bound A is not specified first, you get a compile-time error:

class D <T extends B & A & C> { /* ... */ }  // compile-time error
```


#### Generic Methods and Bounded Type Parameters

Bounded type parameters are key to the implementation of generic algorithms. Consider the following method that counts the number of elements in an array T[] that are greater than a specified element elem.
```java
public static <T> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e > elem)  // compiler error
            ++count;
    return count;
}
```
The implementation of the method is straightforward, but it does not compile because the greater than operator (>) applies only to primitive types such as short, int, double, long, float, byte, and char. You cannot use the > operator to compare objects. To fix the problem, use a type parameter bounded by the Comparable<T> interface:
```java
public interface Comparable<T> {
    public int compareTo(T o);
}
// The resulting code will be:

public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray)
        if (e.compareTo(elem) > 0)
            ++count;
    return count;
}
```


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


Binary Search Tree
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


Traversal
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

All these are DFS searches. The implementations use a stack or recursion(which uses function calls in memory stack)

DFS - recursion or iteration + stack

BFS - Queue [Read this leetcode Article](http://leetcode.com/2010/09/printing-binary-tree-in-level-order.html)


- Breadth First Search
    - 



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
 - LCA, RMQ


==================
Design Patterns
==================

- Decouple Processing Routines from the Data types. 
- Avoid Fat Interfaces.


# [Singleton Pattern](http://www.oodesign.com/singleton-pattern.html)

* Only One instance of the class
* Applications - Centralized Management of resources
* One instance can be accessed globally, everywhere

## Real Examples

> Logger Class. You do not create instances for every logging operation.
> Configuration Class. All modules of the application can use the instance.


## Intent
 
* Make sure only one instance can be created
* Provide a global point to object

## Implementation

* private constructor
* getInstance() - Static public method to get instance. This function creates the unique instance if it is not created yet. 


## Related Problems

* Thread safe implementation 
* Lazy Instantiation using double locking mechanism??
    > [Double Locking Mechanism in wikipedia](http://en.wikipedia.org/wiki/Double-checked_locking) !! ALARM !!
    > Early Instantiation
    > Protected COnstructor
> Multiple singleton instances if classes loaded by different classloaders access a singleton. !! ALARM!!
> worry about readResolve() in Serialization.


# [Factory Pattern](http://www.oodesign.com/factory-pattern.html)




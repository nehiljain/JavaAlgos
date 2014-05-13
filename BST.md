===========================
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

========================
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


=============
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


Autoboxing
================


* Integer a = null; // runtime error primitive type cannot store *null*.
* the same immutable Integer objects (Java's implementation of valueOf() retrieves a cached values if the integer is between -128 and 127), while Java constructs new objects for each integer outside this range.[Here](http://algs4.cs.princeton.edu/13stacks/)
* 

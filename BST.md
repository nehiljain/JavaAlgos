

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
=================================
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

package pkg.nehil.treesandgraphs;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class BinaryTree<Key, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value value;
		private Node left,right;

		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public void add(Key key, Value value) {
		
		root = new Node(key, value);
		
	}

	public void add(Key key1, Key key, Value value) {

		add(root, key1, key, value);
	}

	private void add(Node node, Key key1, Key key, Value value) {
		
		if (node == null) return;

		if (node.key == key1) {

			if (node.left == null) { 
				
				node.left = new Node(key, value); 
				return;
			} else {
				
				node.right = new Node(key, value);
				return;
			}
		} else {
			add(node.left, key1, key, value);
			add(node.right, key1, key, value);

		} 

	}

	public void printPaths() {

		List<Key> pathElements = new ArrayList<Key>();

		printPaths(root, pathElements, 0);
	}

	private void printPaths(Node node, List<Key> list, int pathLength) {

		if (node == null) return;
		
		list.add(pathLength, node.key);
		pathLength++;

		if (node.left == null &&
			node.right == null) {
			printList(list, pathLength);
		}
		else {
			printPaths(node.left, list, pathLength);
			printPaths(node.right, list, pathLength	);
		}

	}


	private void printList(List<Key> list, int pathLength) {
		Iterator it = list.iterator();

		while(it.hasNext() && pathLength-- >= 0) {
			System.out.print("-" + (Object) it.next());
		}
		System.out.println("");
	}


	public static void main(String args[]) {
		BinaryTree<Integer, String> obj = new BinaryTree<Integer, String>();


		obj.add(2, "Start");
		obj.add(2, 3, "left");
		obj.add(2, 4, "right");
		obj.add(3, 5, "right");
		obj.add(3, 6, "right");
		obj.printPaths();

	}
}
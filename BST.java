
import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value val;
		private Node left, right;


		public Node(Key key, Value val, int n) {
			this.key = key;
			this.val = val;

		}
	}
	//Client function to get value associated wit ha key
	public Value get(Key key) {
		return get(root, key);
	}

	private Value get(Node x, Key key) {

		if (x == null) {
			return null;
		}

		int cmpResult = key.compareTo(x.key);

		if (cmpResult < 0) {
			return get(x.left, key);
		}
		else if (cmpResult >0 ) {
			return get(x.right,key);
		}
		else return x.val;
	}


	//This is the function called by the client to insert a key-value pair
	public void put(Key key, Value val) {

		root = put(root, key, val);
		// assert check();

	}

	private Node put(Node x, Key key, Value val) {

		if (x == null) {
			return new Node(key, val);
		}

		int cmpResult = key.compareTo(x.key);
		// Incomplete
		if (cmpResult < 0) {
			x.left = put(x.left, key, val);
		}
		else if (cmpResult >0 ) {
			x.right = put(x.right, key, val);
		}
		else x.val = val;

		return x;
	}




/********************************************************
*Test Client
********************************************************/


	public static void main(String args[]) {
		System.out.print(" This is the test client for BST \n");

		BST<String, Integer> bstree = new BST<String, Integer>();


		bstree.put("A", 23);
		bstree.put("D", 30);
		bstree.put("E", 32);
		bstree.put("B", 12);
		bstree.put("I", 4);
		bstree.put("C", 0);

		System.out.print("Putting some pairs \n");
		




		System.out.print("get some pairs \n");

		System.out.print(Integer.toString(bstree.get("I")));
		System.out.print(Integer.toString(bstree.get("A")));
		System.out.print(Integer.toString(bstree.get("C")));
		System.out.print(Integer.toString(bstree.get("T")));

		//get some keys

	}







}




import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value val;
		private Node left, right;

		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
		}
	}

	public Value get(Node x, Key key) {

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
		assert check();

	}

	private Node put(Node x, Key key, Value val) {

		if (x == Null) {
			return new Node(key, val);
		}

		int cmpResult = key.compareTo(x.key);
		// Incomplete

	}




/********************************************************
Test Client
********************************************************/


	public static void main(String args[]) {
		System.out.print(" This is the test client for BST \n");

		BST<String, Integer> bstree = new BST<String, Integer>();

		System.out.print("Putting some pairs \n");
		




		System.out.print("get some pairs \n");



		//get some keys





	}







}



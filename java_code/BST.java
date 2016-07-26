
import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		private Key key;
		private Value val;
		private Node left, right;
		private int N;

		public Node(Key key, Value val, int n) {
			this.key = key;
			this.val = val;
			this.N = n;
		}
	}

	public boolean isEmpty() {
		if (size(root) == 0) return true;
		else return false;
	}

	public int size() {
		return size(root);
	}

	private int size(Node x) {
		if (x == null) {
			return 0;
		}
		else {
			return x.N;
		}
	}


	//Client function to get value associated with the key
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
			return new Node(key, val, 1);
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

		x.N = 1 + size(x.left) + size(x.right);

		return x;
	}

	public Key min() {
		if (this.isEmpty()) {
			return null;
		}

		return min(root).key;
	}

	private Node min(Node x) {
		if (x.left == null) return x;
		else return min(x.left);
	}

	public Key max() {
		if (this.isEmpty()) {
			return null;
		}

		return max(root).key;
	}

	private Node max(Node x) {
		if (x.right == null) return x;
		else return max(x.right);
	}



	public Key floor(Key key) {
		if (this.isEmpty ()) return null;
		else return floor(root, key).key;
	}

	private Node floor(Node x, Key key) {
		if (x == null)	return null;
		//If the client key is present in the tree then that is the floor of the key
		//If the client key is smaller than the key of the node then find the floor in the left subtree to the present node.
		//**@Tricky** If the client key is greater than the key of the node then find the floor int he right,
		//if it is a null then the present node is the floor 
		int cmpResult = key.compareTo(x.key);
		if (cmpResult == 0) {
			return x; 
		}
		else if (cmpResult < 0) {
			return floor(x.left, key);
		}
		else {
			Node t = floor(x.right, key);
			if (t == null) {
				return x;
			}
			else return t;
		}

	}


	// // rank and select operations
	// public int rank(Key key) {
	// 	if (this.isEmpty()) return null;
	// 	else return rank(Key key, Node root);
	// }

	// private int rank(Key key, Node x) {

	// 	if (x == null) {
	// 		return null;
	// 	}
	// 	int cmpResult = key.compareTo(x.key);
	// 	if (cmpResult > 0) {
	// 		//so the node itself (1) then its left subtree and the rank in  the right subtree
	// 		return 1 + size(x.left) + rank(key, x.right); 
	// 	}
	// 	else if (cmpResult < 0) {
	// 		return rank(key, x.left);
	// 	}
	// 	else {
	// 		return size(x.left);
	// 	}


	// }

/********************************************************
*Traversal
********************************************************/

	public void inOrder() {
		System.out.print("In Order Traversal begins: ");
		inOrder(root);
		
	}

	private void inOrder(Node node) {
		//traverses the tree in order.
		if (node == null) { 
			return;
		}
		inOrder(node.left);
		System.out.print(node.key +" : "+ node.val + ", ");
		inOrder(node.right);
	}

	public void postOrder() {
		System.out.print("\n\npostOrder Traversal begins : ");
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " : " + node.val + ", ");
	}

	public void preOrder() {
		System.out.print("\n\n preOrder Traversal starts");
		preOrder(root);
	}

	private void preOrder(Node node) {

		if (node == null) {
			return;
		}

		System.out.print(node.key +" : "+ node.val + ", ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void maxHeight() {
		System.out.print("\n\n maxHeight = " + Integer.toString(maxHeight(root, 0)));
	}

	private int maxHeight(Node node, int height) {
		if (node == null) return 0;

		int maxLeftHeight = maxHeight(node.left, 0);
		int maxRightHeight = maxHeight(node.right, 0);

		return Math.max(maxLeftHeight, maxRightHeight) + 1;

	}

	/*** 
	 Given a tree and a sum, returns true if there is a path from the root 
	 down to a leaf, such that adding up all the values along the path 
	 equals the given sum.
	 Strategy: subtract the node value from the sum when recurring down, 
	 and check to see if the sum is 0 when you run out of tree. 
	*/
	// public boolean hasPathSum(int sum) {
	// 	return hasPathSum(root, sum);
	// }

	// private boolean hasPathSum(Node node, int sum) {
	// 	if (node == null) return (sum == 0);

	// 	int remainingSum = sum - Integer.valueOf((String)node.val);
	// 	return (hasPathSum(node.left,remainingSum) || hasPathSum(node.right, remainingSum));
	// }


/********************************************************
*Lowest Common Ancestor	
*http://opensourceforgeeks.blogspot.in/2014/02/lowest-common-ancestor-in-binary-search.html
********************************************************/

public Key lowestCommonAncestor(Key key1, Key key2) {
	if (this.isEmpty()) return null;
	else return lowestCommonAncestor(root, key1, key2).key;
}

private Node lowestCommonAncestor(Node node, Key key1, Key key2) {

	if (node == null) {
		return null;
	}

	int cmpResult1 = key1.compareTo(node.key);
	int cmpResult2 = key2.compareTo(node.key);

	if (cmpResult1 < 0 && cmpResult2 < 0) {
		return lowestCommonAncestor(node.left, key1, key2);
	}
	else if (cmpResult2 > 0 && cmpResult1 > 0) {
		return lowestCommonAncestor(node.right, key1, key2);
	} 
	else {
		return node;
	}

}

/********************************************************
*Test Client
********************************************************/


	public static void main(String args[]) {
		System.out.print(" This is the test client for BST \n");

		BST<String, Integer> bstree = new BST<String, Integer>();



		System.out.print("Putting some pairs \n");

		bstree.put("K", 23);
		bstree.put("D", 30);
		bstree.put("E", 32);
		bstree.put("B", 12);
		bstree.put("I", 4);
		bstree.put("C", 0);

		System.out.print("get some pairs \n");

		System.out.print(Integer.toString(bstree.get("I")));
		System.out.print(Integer.toString(bstree.get("C")));
		System.out.print("\n\nSize () " + Integer.toString(bstree.size()));
		System.out.print("\n\nMin () " + bstree.min());


		bstree.put("F", 12);
		bstree.put("U", 4);
		bstree.put("A", 0);
		//get some keys
		System.out.print("\n\nSize () " + Integer.toString(bstree.size()));
		System.out.print("\n\nMin () " + bstree.min());
		System.out.print("\n\nMax () " + bstree.max() + "\n\n");
		System.out.print("\n\nFloor () " + bstree.floor("Q") + "\n\n");


		bstree.preOrder();
		bstree.inOrder();
		bstree.postOrder();


		BST<Integer, Integer> bstreeInt = new BST<Integer, Integer>();
		System.out.print("Putting some pairs \n");

		bstreeInt.put(20, 23);
		bstreeInt.put(8, 30);
		bstreeInt.put(22, 22);
		bstreeInt.put(4, 4);
		bstreeInt.put(10, 12);
		bstreeInt.put(12, 10);
		bstreeInt.put(13, 14);
		bstreeInt.put(14, 14);
		bstreeInt.put(16, 14);
		bstreeInt.put(17, 14);
		bstreeInt.put(18, 14);
		bstreeInt.put(19, 14);
		bstreeInt.put(28, 14);
		

		


		System.out.print("get some pairs \n");
		System.out.print(Integer.toString(bstreeInt.get(20)));
		System.out.print(Integer.toString(bstreeInt.get(8)));
		System.out.print(Integer.toString(bstreeInt.get(22)));

		System.out.print("\n\nLCA of 20 and 8 ::"+ bstreeInt.lowestCommonAncestor(20,8)+"\n");
		System.out.print("\n\nLCA of 4 and 12 ::"+ bstreeInt.lowestCommonAncestor(4,12)+"\n");
		System.out.print("\n\nLCA of 8 and 14 ::"+ bstreeInt.lowestCommonAncestor(8,14)+"\n");
		System.out.print("\n\nLCA of 10 and 14 ::"+ bstreeInt.lowestCommonAncestor(10,14)+"\n");

		System.out.print("get some pairs \n\n");
		bstreeInt.inOrder();

		bstreeInt.maxHeight();
	
	}







}



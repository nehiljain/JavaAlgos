

package pkg.nehil.chp4;

public class P6<Key, Value> {

	private Node root;

	public P6() {

		root = new Node()
	}

	private class Node {
		private Key key;
		private Value value;
		private Node left, right;


		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}

	private static int getMinDepth(Node node) {
		if (node == null) return 0;

		return 1 + Math.min(getMinDepth(node.left), getMinDepth(node.right));
	}

	private static int getMaxDepth(Node node) {
		if (node == null) return 0;

		return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
 	}

 	public boolean isBalanced() {
 		return (getMaxDepth(this.root) - getMinDepth(this.root) <= 1 );
  	}


  	public static void main(String args[]) {
  		P6<Integer, Integer> obj = new P6<Integer, Integer>();


  	}



}
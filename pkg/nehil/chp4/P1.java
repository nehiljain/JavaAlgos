

package pkg.nehil.chp4;

public class P6<Key, Value> {

	private Node root;

	private class Node {
		private Key key;
		private Value value;
		private Node left, right;


		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}





}
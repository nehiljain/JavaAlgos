
package pkg.nehil.treesandgraphs;

import java.util.Queue;
import java.util.LinkedList;
import pkg.nehil.treesandgraphs.BinaryTree;

public class LevelOrderSearch {
	

	public void breadthFirstSeach(BinaryTree<Key, Value> tree) {

		Queue<Key> currentLevel = new LinkedList<Key>();

	}

	public static void main(String args[]) {
		BinaryTree<Integer, String> obj = new BinaryTree<Integer, String>();
		obj.add(2, "Start");
		obj.add(2, 3, "left");
		obj.add(2, 4, "right");
		obj.add(3, 5, "right");
		obj.add(3, 6, "right");


	}
}
package pkg.nehil.chp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;


public class P3<Item> {
	
	private static int numberofItem = 0;
	private int threshold = 0;
	private List<Deque<Item>> stacksList = new ArrayList<Deque<Item>>();

	public P3(int n) {

		this.numberofItem = n;
	}

	public void push(Item item) {
		if (numberofItem == 0 ||
			numberofItem % threshold == 0) {
			Deque<Item> obj = new ArrayDeque<Item>(threshold);
			obj.push(item);
			stacksList.add(obj); 
		} else {
			Deque<Item> obj = stacksList.get((int) numberofItem /threshold);
			obj.push(item);
		}
	}


	public static void main(String args[]) {

		P3<Integer> obj = new P3<Integer>(20);

	}

}
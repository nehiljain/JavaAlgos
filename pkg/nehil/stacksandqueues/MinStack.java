package pkg.nehil.stacksandqueues;
/**
 * http://leetcode.com/2010/11/stack-that-supports-push-pop-and-getmin.html
 */


import java.util.Deque;
import java.util.ArrayDeque;

public class MinStack {
	private Deque<Integer> minStack = new ArrayDeque<Integer>();
	private Deque<Integer> regStack = new ArrayDeque<Integer>();
	
	public void push(int n) {

		regStack.push(n);
		
		if (minStack.isEmpty() ||
			minStack.peekFirst() >= n) {
			
			minStack.push(n);
		}
	}

	public boolean pop() {
		if (regStack.isEmpty()) return false;
		
		if (regStack.pop() == minStack.peekFirst()) {
			minStack.pop();
			return true;
		}
		return false;
	}

	public int getMin(){
		if (!minStack.isEmpty()) return minStack.peekFirst();

		return -1;
	}



	public static void main(String args[]) {

		System.out.println("begin Minstack");

		MinStack obj = new MinStack();

		obj.push(4);
		System.out.println("Min in stack" + obj.getMin());
		obj.push(5);
		obj.push(6);
		obj.push(3);
		System.out.println("Min in stack" + obj.getMin());
		obj.pop();
		obj.pop();
		System.out.println("Min in stack" + obj.getMin());
	}

}
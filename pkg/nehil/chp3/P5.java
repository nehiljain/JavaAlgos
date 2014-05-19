package pkg.nehil.chp3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;


public class P5<Item> {

	private Deque<Item> stack1 = new LinkedList<Item>();
	private Deque<Item> stack2 = new LinkedList<Item>();

	public void enQueue(Item item) {
		stack1.add(item);
	}

	public Item deQueue() {

		if (stack1.isEmpty() && stack2.isEmpty()) { 
			return null;
		}
		else if (stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.add(stack1.remove());
			}
		}

		return stack2.remove();
	}

	public static void main(String args[]) {

		P5<Integer> obj = new P5<Integer>();
		System.out.println("Problem 5 chapter 3 from cracking the coding interview");

		obj.enQueue(5);
		obj.enQueue(6);
		System.out.println("5, 6 goes in and comes out - >" + obj.deQueue() + " , "+ obj.deQueue());
		obj.enQueue(10);
		obj.enQueue(11);
		System.out.println("10, 11 goes in and comes out - >" + obj.deQueue() + " , "+ obj.deQueue());
		obj.enQueue(20);
		obj.enQueue(21);
		obj.enQueue(22);
		obj.enQueue(23);
		System.out.println("20, 21, 22, 23 goes in and comes out - >" + obj.deQueue() + " , "+ obj.deQueue());
		obj.enQueue(10);
		obj.enQueue(11);
		System.out.println("20, 21, 22, 23 goes in and comes out - >" + obj.deQueue() + " , "+ obj.deQueue() + " , "+ obj.deQueue()+ " , "+ obj.deQueue());
	}


}

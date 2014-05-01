package pkg.nehil.linkedlist;

import pkg.nehil.linkedlist.ListNode;

public class SingleLinkedList {
	
	private ListNode head;
	private int size;
	
	public SingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void insertFront(Object item) {
		head = new ListNode(item, head);
		size++;
	}
	
	
	
	public static void main(String args[]) {
		
		ListNode l1 = new ListNode(10, new ListNode(2));
	}
}

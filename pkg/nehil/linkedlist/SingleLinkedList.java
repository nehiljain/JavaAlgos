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
	
	public int getSize() {
		return this.size;
	}
	
	public void printList(ListNode head) {

		while( head != null) {
			System.out.println(head.item);
			head = head.next;
		}

	}
	
	public ListNode getHead() {
		return this.head;
	}
	
	public static void main(String args[]) {
		
		ListNode l1 = new ListNode(10, new ListNode(2));
	}
}

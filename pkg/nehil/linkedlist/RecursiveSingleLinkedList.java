package pkg.nehil.linkedlist;


public class RecursiveSingeLinkedList {

	private static class ListNode {
		public int item;
		public ListNode next;

		public ListNode(int i) {
			this.item = i;
			this.next = null;

		}

		public ListNode(int i, ListNode n) {
			this.item = i;
			this.next = n;
		} 

	}

	private static class SingleLinkedList {
		public ListNode head;

		public SingleLinkedList() {
			head = null;	
		}

		public ListNode getHead() {
			return this.head;
		}
	}






	public static void main(String args[]) {

		SingleLinkedList obj = new SingleLinkedList();


	}
}
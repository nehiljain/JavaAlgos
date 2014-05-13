package pkg.nehil.linkedlist;


public class RecursiveSingeLinkedList {
	private ListNode head;
	private int size;

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


	



	public static void main(String args[]) {

		SingleLinkedList obj = new SingleLinkedList();


	}
}
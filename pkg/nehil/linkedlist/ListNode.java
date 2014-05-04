package pkg.nehil.linkedlist;

public class ListNode {
	public int item;
	public ListNode next;
	
	public ListNode(int i, ListNode n) {
		this.item = i;
		this.next = n;
	}
	
	public ListNode(int i) {
		this.item = i;
		this.next = null;
	}
}

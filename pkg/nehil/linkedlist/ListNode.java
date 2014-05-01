package pkg.nehil.linkedlist;

public class ListNode {
	public Object item;
	public ListNode next;
	
	public ListNode(Object i, ListNode n) {
		this.item = i;
		this.next = n;
	}
	
	public ListNode(Object i) {
		this.item = i;
		this.next = null;
	}
}

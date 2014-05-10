package pkg.nehil.chp2;

import pkg.nehil.linkedlist.*;



public class P3 extends SingleLinkedList {


	public void removeNode(ListNode node){
		if(node == null) System.out.println("Failure");

		node.item = node.next.item;
		node.next = node.next.next;
	}


	public static void main(String args[])  {

		
		System.out.println("Problem 2 from cracking the coding interview");

		P3 obj = new P3();
		for (int i = 1; i <= 10; i++) {
			obj.insertFront(i);
		}

		ListNode curNode = obj.getHead();
		while (curNode.item != 4) {
			curNode = curNode.next;
		}

		obj.printList(obj.getHead());
		obj.removeNode(curNode);
		obj.printList(obj.getHead());
	}
}
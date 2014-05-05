package pkg.nehil.chp2;

import pkg.nehil.linkedlist.*;


public class P2 extends SingleLinkedList {


	public void printNthItemFromLast(SingleLinkedList singleList, int n) {

		ListNode currNode = singleList.getHead();
		ListNode nthNode = currNode;

		int count = 0;

		while (currNode != null) {
			if (count >= n) {
				nthNode = nthNode.next;
				currNode = currNode.next;
			}
			else {
				currNode = currNode.next;
				count++;
			}
		}
		System.out.println(nthNode.item);
	}


	public static void main(String args[]) {
		System.out.println("Problem 2 from cracking the coding interview");

		P2 obj = new P2();
		for (int i = 1; i <= 10; i++) {
			obj.insertFront(i);
		}

		obj.printList(obj.getHead());
		obj.printNthItemFromLast(obj, 4 );

	}
}





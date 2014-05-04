package pkg.nehil.chp2;

import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedList;
		    
		    
import pkg.nehil.linkedlist.*;

public class P1 extends SingleLinkedList {
	
	
	public void removeDuplicates(SingleLinkedList listName) {
		HashMap<Integer, Boolean> uniqueMap = new HashMap<Integer, Boolean>();
		
		ListNode curNode = listName.getHead();
		ListNode prevNode = listName.getHead();

		while (curNode != null) {
			System.out.println("item = " + curNode.item);

			if(uniqueMap.containsKey(curNode.item)) {
				prevNode.next = curNode.next;
			} else {
				uniqueMap.put(curNode.item, true);
				prevNode = curNode;
			}
			curNode = curNode.next;
		}		
	}



	public static void main(String argsp[]) {
		
		// Create a LinkedList and populate it with elements
	    P1 obj = new P1();
 		obj.insertFront(1);
 		obj.insertFront(2);
 		obj.insertFront(2);
 		obj.insertFront(2);
 		obj.insertFront(2);
 		obj.insertFront(2);

 		obj.printList(obj.getHead());
 		System.out.println("Size = " + Integer.toString(obj.getSize()));

 		obj.removeDuplicates(obj);
 		obj.printList(obj.getHead());
	}

}

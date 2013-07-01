import java.util.*;
import java.io.*;


class SObjectListNode{
	public Object item;
	public SObjectListNode next;
}

class SIntListNode{
	public int item;
	public SIntListNode next;
		
	public SIntListNode(int i){
		this.item = i;
		this.next = null;
	}
	public SIntListNode(int i, SIntListNode n){
		this.item = i;
		this.next = n;
	}
}

public class SList{
	public SIntListNode head;
	private SIntListNode tail;
	public int size;

	public SList(){
		System.out.println("\n--Single Linged List--\n");
		head = null;
		tail = null;
		size = 0;
	}

	public void insertFront(int n){
		
		head = new SIntListNode(n, head);
		if(tail == null){
			tail = head;
		}
		size++;
	}

	public void insertBehind(int n){
		
		SIntListNode temp;
		SIntListNode tmpTraverse = this.head;
		while(tmpTraverse.next != null){
			tmpTraverse = tmpTraverse.next;
		}
		tmpTraverse.next = new SIntListNode(n);
		size++;
	}

	public void printListHead(){
		
		if(this.head.next != null)
			System.out.println("Head item ==>" + this.head.item);		
	}

	public void printListTail(){
		
		System.out.println("Tail item ==>" + this.tail.item);		
	}

	public void printList(){
		System.out.println("Size of the List " + size);
		SIntListNode traversePointer = head;
		int count =1;
		
		while(traversePointer != null){
			
			System.out.println(count++ + " :: " + traversePointer.item);
			traversePointer = traversePointer.next;

		}		
	}

// This is a recurrentNodesive method to reverse a Singly LinkedList.
// Ref. ==> http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-linked-list/
// some problem with the head pointer
	public void recurrentNodesiveReverseList(SIntListNode head_ref){
		SIntListNode firstNode;
		SIntListNode restNodes;
		System.out.println("1st Head item ==>" + head_ref.item);
		if(head_ref == null) {
			System.out.println("if Head item is NULL");
			return;
		}
			
		firstNode = head_ref;
		System.out.println("init First item ==>" + firstNode.item);
		restNodes = firstNode.next;
		
		if(restNodes == null){
			System.out.println("List only has one item");
			return;
		} else {
			System.out.println("else restNodes item ==>" + restNodes.item);
		}
		System.out.println("Calling RecurrentNodesion");
		recurrentNodesiveReverseList(restNodes);
		System.out.println("Call returned with head ==>" + head_ref.item
				+ "first==>" + firstNode.item 
				 +" first next ==>" + firstNode.next.item
					+" restNode ==>" + restNodes.item + "\n");
		firstNode.next.next = firstNode;
		firstNode.next = null;
		System.out.println("after pointer swap First item ==>" + firstNode.item);
		
		head_ref = restNodes;
		this.head = head_ref;
		System.out.println("fix Head item ==>" + head_ref.item);
		System.out.println("----------Reverse Function ends-------");
	}
//Same complexity as recursive method. 
//Readable and easily understandable code.
//ref. http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-linked-list/
	public void iterateReverseList(){
		SIntListNode previousNode = this.head; //Java doesnot allow to have a null node.
		SIntListNode currentNode = this.head;
		SIntListNode nextNode;
		System.out.println("Call returned with previousNode ==>" + previousNode.item
				+ "currentNode==>" + currentNode.item );
		
		//to compensate for the previousNode not pointing to Null we do the first pass out of the loop
		nextNode = currentNode.next;
		currentNode.next = null;
		previousNode = currentNode;
		currentNode = nextNode;


		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}

		this.head = previousNode;

	}


}


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
	private SIntListNode head;
	private SIntListNode tail;
	private int size;

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


	public void printListHead(){
		
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
}


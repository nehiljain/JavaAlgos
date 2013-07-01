import java.util.*;

class Test{
	public static void main(String args[]){
		
		System.out.println("\n\n\n----------------------------Start TEST World!------------------------------"
			+"------------\n\n");
		// System.out.println(Arrays.toString(args));
		

		//Sieve of eratosthenes..takes input from args[0]
		/*
		SieveofEratosthenes obj = new SieveofEratosthenes(Integer.parseInt(args[0]));
		obj.markPrimes();
		obj.printPrimes();
		
		*/
		SList sListObj = new SList();
		sListObj.insertFront(512);
		sListObj.insertBehind(513);
		sListObj.insertBehind(514);
		sListObj.insertBehind(555);
		sListObj.insertBehind(565);
		sListObj.insertBehind(505);
		sListObj.insertBehind(515);
		sListObj.insertBehind(535);
		sListObj.insertBehind(545);
		sListObj.insertFront(52);
		sListObj.insertBehind(53);
		sListObj.insertBehind(54);
		sListObj.printListHead();
		sListObj.printList();
		sListObj.iterateReverseList();
		sListObj.printList();
		 sListObj.printListHead();
		// sListObj.printListTail();

		System.out.println("\n\n-----------------------------Ends TEST World!---------------------------"
			+"---------------\n\n\n");
	}
}
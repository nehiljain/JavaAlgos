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
		sListObj.insertFront(12);
		sListObj.insertFront(13);
		sListObj.printList();

		System.out.println("\n\n-----------------------------Ends TEST World!---------------------------"
			+"---------------\n\n\n");
	}
}
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


		//testing for Slist Class and its functions

		/*
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
		*/

		int aOrdered[] = { 1, 3, 5, 2, 4, 6};
		MergeSort mSortObj1 = new MergeSort(aOrdered);
		int count1 = mSortObj1.getInversionCount();

		int abOrdered[] = { 0, 0, 0, 2, 4, 6};
		MergeSort mSortObj2 = new MergeSort(abOrdered);
		int count2 = mSortObj2.getInversionCount();

		int abcOrdered[] = { 11, 9, 8, 7, 6, 5, 4};
		MergeSort mSortObj3 = new MergeSort(abcOrdered);
		int count3 = mSortObj3.getInversionCount();

		System.out.println("\n\n-----------------------------Ends TEST World!---------------------------"
			+"---------------\n\n\n");
	}
}
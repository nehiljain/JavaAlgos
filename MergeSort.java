import java.util.*;

public class MergeSort {

	private int[] inputArray;
	private int[] helperArray;
	private int lengthInput;
	private int inversionCount = 0;
	public MergeSort(int[] inpArr){
		inputArray = inpArr;
		lengthInput = inpArr.length;
		//initialise helperArray to an empty array
		this.helperArray = new int[lengthInput]; 
		System.out.println("/************* MergeSort Starting *********/");
		System.out.println("\n\ninputArray : " + Arrays.toString(inputArray) 
							+ "length : " + lengthInput);

		recursiveSort(0, lengthInput - 1);

		System.out.println(Arrays.toString(inputArray));
	}

	private void recursiveSort(int low, int high){
		int middle;
		if(low < high){
			middle = low + (high - low) / 2;
			// System.out.println("\n\nrecursiveSort : low = " + low +" middle = " + middle + " high = " + high);
			// System.out.println("recursiveSort : inputArray : " + Arrays.toString(inputArray) );		
			recursiveSort(low, middle);
			recursiveSort(middle+1, high);

			mergeStep(low, middle, high);

		} else{
			return;
		}

	}

	private void mergeStep(int low, int middle, int high){
		//copy the elements to helper array 
		//because elements of original array will change in sorting them
		for(int a = low; a <= high; a++) {

			helperArray[a] = inputArray[a];
		}

		int i = low;  //starting index of left half array
		int j = middle + 1; //starting index of right half array
		int k = low; //starting index for the whole array to be sorted.

		//merge step, copy the 
		// System.out.println("\n\nmergeStep : i = " + i +" j = " + j + " k = " + k);
		// System.out.println("mergeStep : BEFORE SWAP inputArray : " + Arrays.toString(inputArray) );
		// System.out.println("mergeStep : BEFORE SWAP helperArray : " + Arrays.toString(helperArray) );
		while(i <= middle && j <= high){

			if(helperArray[i] <= helperArray[j]){
				//copying from left half
				inputArray[k] = helperArray[i++];
			} else {
				//copying from right half;
				inputArray[k] = helperArray[j++];
				//these are precisely the inversions
				inversionCount += (middle - i + 1);
			}
			k++;
		}
		
		//copy rest of left array
		while( i <= middle) {
			inputArray[k++] = helperArray[i++];	
		}
		//copy rest of right array to the input array
		while( j <= high) {

			inputArray[k++] = helperArray[j++];	
		}
		// System.out.println("mergeStep : After inputArray : " + Arrays.toString(inputArray) );
	}

	public int getInversionCount(){
		System.out.println("InverionCount : " + inversionCount );
		return inversionCount;
	}


}
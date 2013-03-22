import java.io.*;


class BoyerMooreAlgo{
	private final int BASE = 256;
	private int occurences[];

	public void badCharHeuristic(String pattern){
		occurences = new int[BASE]; // array  to store occurence of all possible characters 

		for(int i = 0; i < BASE; i++)
		{
			occurences[i] = -1; // initialise all values of the available chars as -1 which means doesnt exist
		}
		 
		for(int i =0; i < pattern.length(); i++)
		{
			occurences[(int)pattern.charAt(i)] = i; // Store the last occurence of thechharacter in the pattern 
		} 
	}

	//returns the index+1 of the occurence of the pattern in the given text
	public int search(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		int skip;
		for( int i = 0; i < n - m + 1; i += skip){
			skip = 0;

			for(int j = m - 1; j >= 0; j--){

				if(pattern.charAt(j) != text.charAt(i+j)) {
					//calculate the skip by shifting the patttern to match the string of the text
				skip = Math.max(1, j - occurences[text.charAt(i+j)]);
				break;
				}		
			}
			if(skip == 0 ) return i;	
		}

		
		return -1;
	}
	
}

public class BoyerMoore{

	public static void main(String[] args) {
			String text = "AAAB AABBAABBAAB BABABA";
			String pattern = "BABA";
			BoyerMooreAlgo bm = new BoyerMooreAlgo();
			bm.badCharHeuristic(pattern);
			
			int first_occur_position = bm.search(text, pattern);
			System.out.println("The text '" + pattern + "' is first found after the " 
	                                    + first_occur_position + " position.");
	}

}
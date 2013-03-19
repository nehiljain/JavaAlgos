import java.io.*;

/**
 * @author nehiljain
 * 
 * Problem statement is 
 *
0,1 
2 - ABC 
3- DEF 
4- GHI 
5-JKL 
6-MNO 
7- PQR 
8- STU 
9- VWXYZ 

Each number represents the set of variables and When we input a number .
It should be replaced by all possible string values corresponding. eg : if we enter 27190000. 

It should output. 
APV 
APW 
APX 
APY 
APZ 
.
.
.
SMS synthesis in Mobile
 * 
 * 
 * 
 * 
 * 
 */

public class Mobpad{


	static String map[] = {"","","ABC","DEF","GHI","JKL","MNO","PQR","STU","VWXYZ"};
	static String output = "";
	
	public static void main(String args[])throws IOException{

					
		//string to store the input
		String inp;
		//int to store the length(# digits)
		int inpLength=0;
		System.out.println("Enter the number");

		//read and store the input till the user presses enter and starts a new line 
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		inp = b.readLine();

		//pre processing of removing the 0 and 1 becase they map to null
		inp = inp.replaceAll("0", "");
		inp = inp.replaceAll("1", "");
		//if its random we can run a loop over the whole string array and replace only if its null


		System.out.println("The possible words of the numbers "+inp+" are :");
		inpLength = inp.length();

		for(int i=0;i< inp.length();i++){

			//get the int value of the numbers to access the corresponding map[digit] characters
			int digit = inp.charAt(i) - '0';
			//System.out.println("The digits : "+digit);
			


		}

		generate(inp, 0, inpLength);
	}


	public static void generate(String s, int curPos, int inpSize){

		if(output.length() == inpSize)
		{
			System.out.println(output);
			return;

		}

		int digit = s.charAt(curPos) - '0';

		for(int i =0; i < map[digit].length(); i++){

			output += map[digit].charAt(i);
			//System.out.println("current value of output"+ output);	
			generate(s, curPos + 1, inpSize);

			output = output.substring(0, output.length()-1);
		}
	}






}
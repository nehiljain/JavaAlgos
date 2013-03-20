import java.io.*;

/**
 * @author nehiljain
 * 
 * Problem statement is 
 * Please write a function that accepts a floating 
 * number and returns its square-root. You may not use built-in square root function 
 * from your language. However, basic operators like addition, subtraction, 
 * multiplication are allowed. Please take into consideration the floating precision.
 * 
 * 
 * 
 * 
 * 
 */

public class NewtonRaphson{


	double output;
	
	public static void main(String args[])throws IOException{

		//string to store the input
		String inp;
		//int to store the length(# digits)
		int inpLength=0;

		System.out.println("Enter the number");

		//read and store the input till the user presses enter and starts a new line 
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		inp = b.readLine();
		double inpNum = Double.parseDouble(inp);

		System.out.println("The square root of "+inpNum+" is :" + sqrtFn(inpNum));

		}	

	public static double sqrtFn(double n){

		double x0 = n;
		double ans = 0;

		//newton raphson method
		ans = 0.5*(x0+n/x0); 
		while((x0-ans)!=0) 
		{ 
			x0=ans; 
			ans = 0.5*(x0+n/x0); 
		} 

		return ans;
	}		



}
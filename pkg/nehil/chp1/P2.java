package pkg.nehil.chp1;


/***
 * Problem Statement
 * Write code to reverse a C-Style String .
 * (C-String means that “abcd” is represented as five characters, 
 * including the null character )
 * @author nehiljain
 *
 */


public class P2 {
	
	private String reverseString(String s) {
		StringBuffer str =  new StringBuffer(s);
		int i = 0; 
		int j = str.length() - 2;
		
		while (i < j) {
			str.setCharAt(str.length() - 1 , str.charAt(i));
			str.setCharAt(i++, str.charAt(j));
			str.setCharAt(j--, str.charAt(str.length()-1));
		}
		str.setCharAt(str.length()-1, '\0');
		
		return str.toString();
		
	}

	public static void main(String args[]) {
		
		String testString1= "awerf\0";
		
		P2 obj = new P2();
		System.out.println(testString1);
		System.out.println(testString1.length());
		System.out.println(obj.reverseString(testString1));
	}
}

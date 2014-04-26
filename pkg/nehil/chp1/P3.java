package pkg.nehil.chp1;


/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer 
 * NOTE: One or two additional variables are fine An extra copy of the array is not 
 * 
 * FOLLOW UP : Write the test cases for this method
 * @author nehiljain
 *
 */



public class P3 {
	private StringBuffer str;
	
	private void markUniqueChar(String s) {
		int check = 0;
		str = new StringBuffer(s);
		
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if ((check & (1 << c)) > 0) {
				str.setCharAt(i, '\0');
				continue;
			}
			check = check | (1 << c);
		}
		
	}
	
	public String removeDulplicates(String s) {
		int pos = 0;
		this.markUniqueChar(s);
		
		
		//get position of the last non null string .
		int j = str.length()-1;
		while (j > 0) {
			if (str.charAt(j--) != '\0') {
				break;
			}
		}
		//just to check the last character
//		System.out.println(str.charAt(++j));
		
		for (int i = 0; i <= j; i++) {
			
			
			if (str.charAt(i) == '\0') continue;
			str.setCharAt(pos, str.charAt(i));
			
			if (str.charAt(pos) != '\0') {
				pos++;
				
			}
			
		}
		
		return str.toString().substring(0, pos);
	}
	
	
	
	public static void main(String args[]) {
		String testString1 = "awaaaerfawe";
		String testString2 = "awaaaerf";
		String testString3 = "awerfaaaaa";
		String testString4 = "faaaaa";
		String testString5 = "faaaaaww";
		String testString6 = "aaaaww";
		
		P3 obj = new P3();
		System.out.println(obj.removeDulplicates(testString1));
		System.out.println(obj.removeDulplicates(testString2));
		System.out.println(obj.removeDulplicates(testString3));
		System.out.println(obj.removeDulplicates(testString4));
		System.out.println(obj.removeDulplicates(testString5));
		System.out.println(obj.removeDulplicates(testString6));
	}
	
}

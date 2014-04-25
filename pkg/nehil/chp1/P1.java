package pkg.nehil.chp1;



public class P1 {
	
	private String testStringUnique = "Uniqe";
	private String testStringNotUnique = "@uniquasdfghjkl;@e";

	/**
	 * This assumes that the string is made of 256 ascii characters only
	 * 
	 * @return
	 */
	private boolean isUniqueCharAll(String str) {
		
		boolean b[] = new boolean[256];
		
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (b[c] == true) {
				return false;
			}
			b[c] = true;
		}
		return true;
	}
	
	private boolean isUniqueCharAll2(String str) {
		int check = 0;
		
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if ((check & (1 << c)) > 0) {
				return false;
			}
			check = check | (1 << c);
		}
		
		return true;
		
	}
	
	public static void main(String argsp[]) {
		P1 obj = new P1();
		System.out.println("Unique string == " + obj.isUniqueCharAll(obj.testStringUnique));
		System.out.println("Unique string == " + obj.isUniqueCharAll(obj.testStringNotUnique));
		System.out.println("Unique string == " + obj.isUniqueCharAll2(obj.testStringUnique));
		System.out.println("Unique string == " + obj.isUniqueCharAll2(obj.testStringNotUnique));
		
	}
}

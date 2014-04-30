package pkg.nehil.chp1;

public class P8 {

	public boolean isRotatetion(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		if (s1.length() > 0) {
			String s = s2 + s2;
			if (!s.contains(s1)) return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		String s1 = "abcd";
		String s2 = "dabc";
		P8 obj = new P8();
		System.out.print("THe output is " + obj.isRotatetion(s1, s2));
	}
}

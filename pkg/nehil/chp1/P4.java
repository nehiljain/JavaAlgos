package pkg.nehil.chp1;

import java.util.Arrays;

public class P4 {
	
	public boolean checkAnagram1(String s1, String s2) {
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		String sortedS1 = new String(str1);
		String sortedS2 = new String(str2);
		
		
		return sortedS1.equalsIgnoreCase(sortedS2);
		
	}
	
	
	
	public boolean checkAnagram2(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		
		int count1[] = new int[256]; //assuming its ASCII
		int count2[] = new int[256]; //assuming its ASCII
		
		for(int j = 0; j < 256; j++) {
			count1[j] = 0;
			count2[j] = 0;
		}
		
		for (int i = 0; i <= s1.length() - 1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			count1[c1]++; 
			count2[c2]++; 
			
		}
		
		for(int j = 0; j < 256; j++) {
			if (count1[j] != count2[j]) return false;
		}
		
		return true;
		
	}
	
	
	
	public static void main(String args[]) {
		
		String testString1 = "abcde";
		String testString2 = "acdeb";
		
		
		
		P4 obj = new P4();
		System.out.println(""+ obj.checkAnagram1(testString1, testString2));
		System.out.println(""+ obj.checkAnagram2(testString1, testString2));
	}

}

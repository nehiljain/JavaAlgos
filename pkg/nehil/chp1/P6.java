package pkg.nehil.chp1;

public class P6 {
	
	public void rotate90(String[][] s, int n) {
		System.out.println("\n\n");
		String temp1, temp2;
		int index = 0;
		while (index <= n/2) {
			for (int i = index; i <= n-2-index; i++) {
//				System.out.println(Integer.toString(i) + "th item:: " + s[index][i] + 
//						" - >" + s[i][n-1-index]  + 
//						" - >" + s[n-1-index][n-i-1] + 
//						" - >"  + s[n-i-1][index]);
				temp1 = s[i][n-1-index];
				s[i][n-index-1] = s[index][i];
				temp2 = s[n-1-index][n-i-1];
				s[n-1-index][n-i-1] = temp1;
				temp1 = s[n-i-1][index];
				s[n-i-1][index] = temp2;
				s[index][i] = temp1;
			}
			index++;
		}
		
	}
	
	private void printStringArray(String[][] s, int n) {

		
		for (int i = 0; i <= n-1; i++) {
			System.out.println("");
			for (int j = 0; j <= n-1; j++) {
				System.out.print(s[i][j]+"  ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]) {
		String test0[][] = {};
		String test1[][] = {{"1"}};
		String test2[][] = {
				{"1","2"},
				{"3","4"}
		};
		String test3[][] = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
		};
		String test4[][] = {
				{"1","2","3","4"},
				{"5","6","7","8"},
				{"9","10","11","12"},
				{"13","14","15","16"}
		};
		P6 obj = new P6();
		obj.printStringArray(test4, 4);
		obj.rotate90(test4, 4);
		obj.printStringArray(test4, 4);
	}
}

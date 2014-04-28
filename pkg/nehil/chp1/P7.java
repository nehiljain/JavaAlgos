package pkg.nehil.chp1;

public class P7 {
	
	
	public void setRowColZero(String[][] s, int m, int n) {
		
		boolean[] rowMarker = new boolean[m];
		boolean[] colMaker = new boolean[n];
		
		for (int i = 0; i <= m-1; i++) {
			for (int j = 0; j <= n-1; j++) {
				if (s[i][j].equals("0")) {
					rowMarker[i] = true;
					colMaker[j] = true;
				}
			}
		}
		for (int i = 0; i <= m-1; i++) {
			for (int j = 0; j <= n-1; j++) {
				if (rowMarker[i] || colMaker[j]) {
					s[i][j] = "0";
				}
			}
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
				{"5","6","0","8"},
				{"9","10","11","12"},
				{"13","14","15","0"}
		};
		P7 obj = new P7();
		obj.printStringArray(test4, 4);
		obj.setRowColZero(test4, 4, 4);
		obj.printStringArray(test4, 4);
	}
}

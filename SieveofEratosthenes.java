import java.io.*;




public class SieveofEratosthenes{

	private boolean[] isPrimes;
	private int n;

	public SieveofEratosthenes(int inp){
		// System.out.println("Inside SieveofEratosthenes constructor with inp::" + inp);
		this.n = inp ;
		isPrimes = new boolean[n + 1];
		for(int i = 0; i < n+1; i++){
			isPrimes[i] = true;
		}
	}

	public void markPrimes(){

		for(int divisor = 2; divisor * divisor <= n; divisor++){
			if(isPrimes[divisor]){
				for(int i = 2 * divisor; i <= n; i = i + divisor){
					isPrimes[i] = false;
				}
			}
		}

	}

	public void printPrimes(){

		for(int i = 2; i <= n; i++){
			if(isPrimes[i]){
				System.out.print("" + i + "  ");
			}
		}
	}



} 

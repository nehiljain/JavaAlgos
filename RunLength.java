import java.io.*;

class RunLengthAlgo{

	public void compress(int[] input, int len){
		int i = 0;
		//int len = input.length();
		int compressed[] = new int[len];
		int run, count, ci=0;
		while(i < len){
			run = input[i];
			count = 1;
			if(i+1 < len){
				while(run == input[ ++i ])	{
					count++;
				}
				compressed[ci] = run;
				compressed[++ci] = count;
			}
			
					
			}
			System.out.println(" The letter "+compressed[ci - 1]+"repeats itself"+compressed[ci]+"times");
		}		
	}

public class RunLength{

	public static void main(String[] args) {
			int a[] = {'1','1','2','1'};
			RunLengthAlgo rl = new RunLengthAlgo();
			rl.compress(a, 4);
	}

}



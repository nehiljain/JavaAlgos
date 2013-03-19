import java.io.*;

public class Permutations{
	public static void permute(String beginStr, String endStr){

		if(endStr.length() <= 1){
			System.out.println(beginStr + endStr);
		}else{
			for(int i = 0; i < endStr.length(); i++){
				try{
					//makes a new string without ith position character in endStr
					String newStr = endStr.substring(0,i) + endStr.substring(i+1);
					//appends the ith character to the beginStr and permutes over the newStr
					permute(beginStr+endStr.charAt(i), newStr);
				}catch(Exception e){
					e.printStackTrace();
				}
				

			}
		}

	}

	public static void main(String args[]) throws IOException{
        String str;
        System.out.println("Enter the initial string");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        System.out.println("Permutations are :");
        permute("", str);
    }
}
package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10872 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int input;
	
	public static void getInput() throws NumberFormatException, IOException {
		input = Integer.parseInt(br.readLine());
	}
	
	public static int factorial(int n) {
		if(n==1) return 1;
		return n * factorial(n-1);
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInput();
		if(input!=0) {
			bw.write(factorial(input)+"");
		}else bw.write("1");
		br.close();
		bw.close();
	}
}

package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10870 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int input;
	
	public static int fibonacci(int n) {
		
		if(n==1) return 1;
		if(n==0) return 0;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		input = Integer.parseInt(br.readLine());
		bw.write(fibonacci(input)+"");
		bw.close();
		br.close();
		
	}
}

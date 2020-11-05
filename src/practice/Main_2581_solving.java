package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2581_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int M, N, sum, min;
	static int[] numbers = new int[10001];
	
	
	
	public static void solve() {
		
	}
	
	public static void getNum() {
		int temp = M;
		for(int i = 0; i<=N-M; i++) {
			numbers[i]=temp++;
		}
	}
	
	
	public static void getInput() throws NumberFormatException, IOException {
		M = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInput();
		getNum();
		for(int i = 0; i<numbers.length; i++ ) {
			if(numbers[i]==0)break;
			System.out.println(numbers[i]);
		}
	}
}

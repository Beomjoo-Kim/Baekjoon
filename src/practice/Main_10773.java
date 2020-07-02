package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10773 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int K;
	static int[] input;
	static int[] forSum;
	
	public static void getInput() throws NumberFormatException, IOException {
		for(int i = 0; i<input.length; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
	}
	
	public static void zeroMethod() throws NumberFormatException, IOException {
		int cnt = 0;
		int put;
		for(int i = 0; i<K; i++) {
			put = Integer.parseInt(br.readLine());
			if(put!=0) {
				forSum[cnt++] = put;
			}else {
				forSum[--cnt] = 0;
			}
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		K = Integer.parseInt(br.readLine());
		
		input = new int[K];
		forSum = new int[K];
//		getInput();
		zeroMethod();
		int sum = 0;
		for(int i = 0; i<input.length; i++) {
			sum+=forSum[i];
		}
		System.out.println(sum);
		
	}
}

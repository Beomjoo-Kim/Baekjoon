package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10989 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] inputArr = new int[10001];
	static int n;
	
	public static void getInput() throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		for(int i =0 ; i < n ; i++) {
			int input = Integer.parseInt(br.readLine());
			inputArr[input]++;
		}
	}
	
	public static void printRes() throws IOException {
		for(int i = 0; i<inputArr.length; i++) {
			for(int j = 0; j<inputArr[i]; j++) {
				bw.write(i+"\n");
			}
		}
		bw.close();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInput();
		printRes();
	}
}

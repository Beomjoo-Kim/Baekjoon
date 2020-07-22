package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_5622 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String input;
	static char[] arr;
	static int[] intArr;
	
	
	public static void getNum() {
		
		for(int i = 0; i< arr.length; i++) {
			intArr[i] = (arr[i]-65);
			if(intArr[i]>=18) {//7일때 4개
				if(intArr[i]>=25)
					intArr[i]--; //9일때 4개
				intArr[i]--;
			}
			intArr[i]/=3;
			intArr[i]+=2;
		}
	}
	public static void calTime() {
		for(int i = 0; i<intArr.length; i++) {
			intArr[i] = (intArr[i]+1);
		}
	}
	
	public static int sum() {
		int sum = 0;
		for(int i = 0; i<intArr.length; i++) {
			sum+=intArr[i];
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		input = br.readLine();
		arr = input.toCharArray();
		intArr = new int[arr.length];
		getNum();
		calTime();
		bw.write(sum()+"");
		bw.flush();
		br.close();
	}
}

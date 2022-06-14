package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463_Solving {
//	1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
//	2. X가 2로 나누어 떨어지면, 2로 나눈다.
//	3. 1을 뺀다.
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, a;
	static int cnt = 0, result = 1000000;
	
	public static void sol() {
		for(int i = 0 ; i < N ; i++) {
			a = N;
			a -= i;
			
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		sol();
	}
}

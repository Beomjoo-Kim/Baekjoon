package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {
//	1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
//	2. X가 2로 나누어 떨어지면, 2로 나눈다.
//	3. 1을 뺀다.
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int[]dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		
		for(int i = 2 ; i < N+1; i++) {
			dp[i] = dp[i-1] + 1; // 먼저 -1 한 후 비교
			if(i%3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1); //+1은 dp[3]
			}
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);	//+1은 dp[2]
			}
		}
		System.out.println(dp[N]);
	}
}

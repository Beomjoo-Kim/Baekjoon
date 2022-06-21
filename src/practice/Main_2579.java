package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2579 {
	// 마지막계단은 무조건 포함
	// 바로 이전(i-1)을 밟았을 경우(i-2)는 밟을 수 없음 -> dp[i-3]
	// i-2를 밟았을 경우 dp[i-2]
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] stairs;
	static int n;
	static int[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		stairs = new int[n];
		for(int i = 0 ; i < n ; i ++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		dp = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			if(i == 0) dp[0] = stairs[0];
			else if(i == 1) dp[1] = stairs[0] + stairs[1];
			else if(i == 2) dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
			else dp[i] = Math.max(stairs[i] + stairs[i-1] + dp[i-3], stairs[i] + dp[i-2]);
		}
		
		System.out.println(dp[n-1]);
	}
}

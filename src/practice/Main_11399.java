package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11399 {
	// 배열 내부를 오름차순 정렬 후 i번째 요소는 그 앞까지의 값과 자신을 더한 값이 걸린 시간. 
	// 이것들의 총합
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] inputArr;
	static int[] dp;
	static int result = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		inputArr = new int[n];
		dp = new int[n];
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0 ; i < n ; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(inputArr);
		dp[0] = inputArr[0];
		for(int i = 1 ; i < n ; i++) {
			dp[i] = dp[i-1] + inputArr[i];
		}
		for(int i = 0 ; i < n ; i++) {
			result += dp[i];
		}
		System.out.println(result);
	}

}

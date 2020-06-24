package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11050 {
	static int N, K, result, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		result = 1;
		for (int i = N; i > 0; i--) {
			result *= i;
		}
		for (int i = 1; i <= K; i++) {
			result /= i;
		}
		for (int i = N - K; i > 0; i--) {
			result /= i;
		}
		System.out.println(result);
	}

}

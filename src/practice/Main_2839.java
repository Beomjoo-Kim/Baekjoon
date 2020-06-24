package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2839 {
	static int N, temp1, temp2, result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for (int i = N / 5; i >= 0; i--) {
			temp1 = N - (5 * i);
			temp2 = temp1 / 3;
			if (i * 5 + temp2 * 3 == N) {
				result = i + temp2;
				break;
			} else
				result = -1;
		}
		System.out.println(result);
	}

}

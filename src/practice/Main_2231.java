package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int a;
	static int length;
	static int i;
	static int result;
	static int temp;

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		a = Integer.parseInt(input);
		for (i = 0; i <= a; i++) {
			temp = sum(i);
			if (i + temp <= a) {
				if (i + temp == a) {
					break;
				}
			}
		}
		if(i>a) i=0;

		System.out.println(i);
	}

	public static int sum(int a) {
		result = 0;
		while (a > 0) {
			result += a % 10;
			a /= 10;
		}
		return result;
	}

}
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9012 {
	static int T, p, length, ans;
	static String input;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			input = br.readLine();
			p = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == '(') {
					p++;
				} else
					p--;
				if (p < 0) {
					p = -1;
					break;
				}
			}
			if (p == 0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}

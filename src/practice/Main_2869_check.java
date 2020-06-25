package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869_check {

	static int V, A, B;
	static long result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		result = (V - B) / (A - B);
		if ((V - B) % (A - B) != 0)
			result++;

		System.out.println(result);

	}

}

//v <= (a-b)x+a
//(v-a)(a-b) <= x
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2609 {
	static int i1, i2, max, min;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		i1 = Integer.parseInt(st.nextToken());
		i2 = Integer.parseInt(st.nextToken());
		for (int i = 1; i < Math.max(i1, i2); i++) {

			if (i1 == i2) {
				max = i1;
			} else if (i1 % i == 0 && i2 % i == 0) {
				max = i;
			}
			min = max * (i1 / max) * (i2 / max);

		}
		System.out.println(max);
		System.out.println(min);

	}

}

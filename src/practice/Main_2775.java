package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775 {

	static int T, k, n;
	static int input;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {

			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());

			int[][] array = new int[14][14];

			for (int x = 0; x < 14; x++) {
				array[0][x] = x;
			}

			for (int y = 1; y < 14; y++) {
				int sum = 0;
				for (int x = 0; x < 14; x++) {
					sum += array[y - 1][x];
					array[y][x] = sum;

				}
			}

			System.out.println(array[k][n]);

		}
	}

}

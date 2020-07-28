package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3009 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] location = new int[3][2];
	static int[][] lower = new int[2][2];
	static int[][] upper = new int[2][2];
	static int lowerNum, upperNum;

	public static void getInput() throws IOException {
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < location[i].length; j++) {
				location[i][j] = Integer.parseInt(st.nextToken());
			}

		}
	}

	public static void getLU() {
		for (int i = 0; i < location.length - 1; i++) {
			for (int j = i + 1; j < location.length; j++) {
				if (location[i][1] > location[j][1]) {
					upperNum = location[i][1];
					lowerNum = location[j][1];
					return;
				}
			}
		}
	}

	public static void setLU() {
		//check
		int u = 0;
		int l = 0;
		for (int i = 0; i < location.length; i++) {
			if (location[i][1] == lowerNum) {
				for (int j = 0; j < location[i].length; j++) {
					lower[l++][j] = location[i][j];
				}
			} else {
				for (int j = 0; j < location[i].length; j++) {
					upper[u++][j] = location[i][j];
				}
			}
		}
		Arrays.sort(lower);
		Arrays.sort(upper);
	}

	public static void sol() {
		if (lower[1][0] == 0) {
			int xGap = upper[1][1] - upper[0][1];
			System.out.println(lower[1][0] + (lower[1][1] + xGap));
		} else {
			int xGap = lower[1][1] - lower[0][1];
			System.out.println(upper[1][0] + (upper[1][1] + xGap));
		}
	}

	public static void main(String[] args) throws IOException {
		getInput();
		getLU();
		setLU();
		sol();

	}
}

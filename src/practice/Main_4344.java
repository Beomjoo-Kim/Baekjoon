package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_4344 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int C, N;
	static int[] arr;
	static double avg, cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			getAvg(arr);
			cnt(arr);
			System.out.printf("%.3f%%\n",cnt/N*100.0);

		}
	}

	public static void cnt(int[] arr) {
		cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				cnt++;
			}
		}
	}

	public static void getAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = (double) sum / arr.length;
	}

}

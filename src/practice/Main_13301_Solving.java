package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_13301_Solving {
	static int n;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long[] a = new long[81];
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a[0] = 1;
		a[1] = 1;
		for(int i = 2 ; i<=n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		long ans = (a[n]+a[n-1])*2;
		bw.write(ans+"");
		bw.close();
		br.close();
	}
}

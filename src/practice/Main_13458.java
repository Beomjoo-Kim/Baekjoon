package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_13458 {
	static long N,B,C,result;
	static long[] A;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void getInput() throws NumberFormatException, IOException {
		N = Long.parseLong(br.readLine());
		A = new long[1000002];
		String[] temp = br.readLine().split(" ");
		for(int i = 0 ; i<temp.length; i++) {
			A[i]=Long.parseLong(temp[i]);
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
	}
	
	static void sol() {
		result=N;
		for(int i = 0; i<N; i++) {
			A[i]-=B;
			if(A[i]<0)continue;
			result+=A[i]/C;
			if(A[i]%C!=0) result++;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInput();
		sol();
		bw.write(result+"");
		bw.close();
		br.close();
	}
}

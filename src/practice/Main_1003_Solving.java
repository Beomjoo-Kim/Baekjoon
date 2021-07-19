package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1003_Solving {
	static int t;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int get0(int n) {
		if(n==0) return 1;
		else if(n==1) return 0;
		else return get0(n-1)+get0(n-2);
	}
	static int get1(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else return get1(n-1)+get1(n-2);
	}
	
	static void sol() throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		bw.write(get0(n)+" "+get1(n)+"\n");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			sol();
		}
		br.close();
		bw.close();
	}
}

package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_9625 {
	static int k,cntA,cntB;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		cntA = 1;
		cntB = 0;
		k = Integer.parseInt(br.readLine());
		int tempA = 0;
		int tempB = 0;
		while(k>0) {
			tempA = cntB;
			tempB = cntB+cntA;
			cntA = tempA;
			cntB = tempB;
			
			k--;
		}
		bw.write(cntA+" "+cntB);
		br.close();
		bw.close();
	}
}

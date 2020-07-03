package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, M, minB = 100, minW = 100;
	static String[] chess;
	
	static void getSize() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	}
	
	static void getChess() throws IOException {
		chess = new String[N];
		for(int i = 0; i<N; i++) {
			chess[i] = br.readLine();
		}
	}
	
	static void checkBlack(int x, int y) {
		int cntB = 0;
		for(int i = x ; i<8+x; i++) {
			for(int j = y; j<8+y; j++) {
				if((i+j)%2 == 0) {
					if(chess[i].charAt(j)=='W') cntB++;
				}
				else {
					if(chess[i].charAt(j)=='B') cntB++;
				}
			}
		}
		minB = (minB>cntB?cntB:minB);
	}
	
	static void checkWhite(int x, int y) {
		int cntW = 0;
		for(int i = x ; i<8+x; i++) {
			for(int j = y; j<8+y; j++) {
				if((i+j)%2 == 0) {
					if(chess[i].charAt(j)=='B') cntW++;
				}
				else {
					if(chess[i].charAt(j)=='W') cntW++;
				}
			}
		}
		minW = (minW>cntW?cntW:minW);
	}
	
	static void divCheck() {
		for(int i = 0; i<=N-8; i++) {
			for(int j = 0; j<= M-8; j++) {
				checkBlack(i,j);
				checkWhite(i,j);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		getSize();
		getChess();
		divCheck();
		System.out.println((minB>minW?minW:minB));
	}
}

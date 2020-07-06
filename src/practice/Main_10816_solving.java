package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10816_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, M;
	static int[] get, target;
	
	public static void takeCard() throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0; i<N; i++) {
			get[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	public static void takeTarget() throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		for(int i = 0; i<M; i++) {
			target[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	public static void check() {
		int cnt;
		for(int i = 0; i<M; i++) {
			
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		get = new int[N];
		takeCard();
		M = Integer.parseInt(br.readLine());
		target = new int[M];
		takeTarget();
		
	}
}

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int T, N, M, K;
	static int[][] field;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		String temp = br.readLine();
		StringTokenizer st = new StringTokenizer(temp);
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		field = new int[M][N];
		
		int x, y;
		for(int i = 0 ; i < K ; i ++) {
			temp = br.readLine();
			st = new StringTokenizer(temp);
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			field[x][y] = 1 ;
		}
		
//		for(int i = 0 ; i < field.length; i++) {
//			for(int j = 0 ; j < field[i].length; j++) {
//				System.out.print(field[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}
}

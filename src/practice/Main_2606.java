package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2606 {
	// 컴퓨터 갯수, pair 수, 연결 관계
	// n*n 배열 만들고 1인 경우 재귀함수 호출?
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, p, result = 0;
	static int[][] pairs;
	static boolean[] isCounted;
	
	static void sol(int a) {
		for(int i = 0 ; i < n+1; i++) {
			if(pairs[a][i] == 1) {
				if(isCounted[i] == false) {
					isCounted[i] = true;
					result++;
					sol(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		p = Integer.parseInt(br.readLine());
		pairs = new int[n+1][n+1];
		isCounted = new boolean[n+1];
		int i1, i2;
		for(int i = 0 ; i < p ; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			i1 = Integer.parseInt(st.nextToken());
			i2 = Integer.parseInt(st.nextToken());
			// 연결은 양방향이므로 i1,i2  i2,i1 둘 다 1로 설정
			pairs[i1][i2] = 1;
			pairs[i2][i1] = 1;
		}
		// 1은 방문처리 하여 count 대상에서 제외
		isCounted[1] = true;
		for(int i = 1 ; i < n+1 ; i++) {
			// 1부터 시작 || x와1이 연결되어있는 경우
			if(i == 1 || pairs[i][1] == 1)
			sol(i);
		}
		System.out.println(result);
		
//		for(int i = 0 ; i < n+1; i++) {
//			for(int j = 0 ; j < n+1; j++) {
//				System.out.print(pairs[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for(int i = 2 ; i < n+1; i++)if(isCounted[i] == true)System.out.println(i);
		
	}
}

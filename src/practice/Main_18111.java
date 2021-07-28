package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18111 {
	static int m, n, b;
	static int[][] field;
	static int result = 0;
	static int minTime = Integer.MAX_VALUE;
	
	
	public static void sol(int min, int max, int block) {
		for(int test = min ; test <= max ; test++){
			int time = 0;
			int b = block;
			
			for(int i = 0; i < field.length ; i++) {
				for(int j = 0 ; j < field[i].length ; j++) {
					int temp = field[i][j];
					int t = Math.abs(temp-test);
						if(temp < test) {
							b-=t;
							time += t;
						}
						if(temp > test) {
							time += (2*t);
							temp-=t;
							b+=t;
						}
				}
			}
			
			if(time <= minTime && b >= 0) {
				result = test;
				minTime = time;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		field = new int[n][m];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < field.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < field[i].length; j++) {
				field[i][j] = Integer.parseInt(st.nextToken());
				if(max < field[i][j]) max = field[i][j];
				if(min > field[i][j]) min = field[i][j];
			}
		}
		sol(min, max, b);
		System.out.println(minTime + " " + result);
	}
}

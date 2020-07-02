package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_7568 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	static int[][] input;
	static int[] rank;
	static int N;
	
	static void getInput() throws IOException {
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			input[i][0] = Integer.parseInt(st.nextToken());
			input[i][1] = Integer.parseInt(st.nextToken());
		}
	}
	
	
	static void checkRank() {
		for(int i = 0; i<N; i++) {
			rank[i] = 1;
			for(int j = 0; j<N; j++) {
				if(input[i][0]<input[j][0] && input[i][1]<input[j][1]) rank[i]++;
			}
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		input = new int[N][2];
		rank = new int[N];
		getInput();
		checkRank();
		
		for(int i =0; i<N; i++) {
			System.out.println(rank[i]);
		}
		
	}

}

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10814_solvingMergesortNeeded {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N ;

	public static void disp(String[][] input) {
		for(int i = 0; i<input.length; i++) {
				System.out.printf("%s %s\n",input[i][0],input[i][1]);
		}
	}
	
	public static void sort(String[][] input) {
		int temp1, temp2;
		String t;
		for(int i = input.length-1; i>=0; i--) {
			for(int j = i-1; j>=0; j--) {
				temp1 = Integer.parseInt(input[i][0]);
				temp2 = Integer.parseInt(input[j][0]);
				if(temp1<temp2) {
					for(int k = 0; k<input[i].length; k++) {
						t = input[i][k];
						input[i][k] = input[j][k];
						input[j][k] = t;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		String[][] input = new String[N][2];

		for(int i = 0; i<input.length; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				input[i][0] = st.nextToken();
				input[i][1] = st.nextToken();
		}
		sort(input);
		disp(input);
		
	}
}

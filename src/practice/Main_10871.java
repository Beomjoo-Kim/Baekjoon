package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		String input2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(input2);
		
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(st2.nextToken());
			if(temp<X) {
				array[i] = temp;
			}
			temp=0;
		}
		
		for(int i=0; i<N; i++) {
			if(array[i]!=0) {
				System.out.print(array[i]+" ");}
		}

	}

}

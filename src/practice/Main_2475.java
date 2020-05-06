package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int[] array = new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			sum+=Math.pow(array[i], 2);	//sum에 제곱해서 더해넣기	
		}
		System.out.println(sum%10);
	}

}

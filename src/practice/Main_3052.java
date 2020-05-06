package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10];
		for(int i=0; i<10; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		int[] cal = new int[42];
		for(int i=0; i<10; i++) {
			int j = array[i]%42;
			cal[j]++;
		}
		
		int count = 0;
		for(int i=0; i<42; i++) {
			if(cal[i]!=0) count++;
		}
		System.out.println(count);
	}

}

package practice;

import java.io.IOException;
import java.util.Scanner;

public class Main_2750 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int temp =0;
		int index =0;
		for(int i=0; i<N; i++) {
			input[i] = sc.nextInt();
			//숫자 입력받기
		}
		for(int i=0; i<N; i++) {
			int min = 1001;
			for(int j=i; j<N;j++) {
				if(input[j]<min) {
					min = input[j];
					index = j;
				}
			}
			temp = input[i];
			input[i]=input[index];
			input[index]=temp;
		}
		for(int i=0; i<N; i++) {
			System.out.println(input[i]);
		}
		
	}

}

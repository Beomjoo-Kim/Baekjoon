package practice;


import java.util.Scanner;


public class Main_2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[3];
		int temp =0;
		int index =0;
		for(int i=0; i<3; i++) {
			input[i] = sc.nextInt();
			//숫자 입력받기
		}
		for(int i=0; i<3; i++) {
			int min = 1000001;
			for(int j=i; j<3;j++) {
				if(input[j]<min) {
					min = input[j];
					index = j;
				}
			}
			temp = input[i];
			input[i]=input[index];
			input[index]=temp;
		}
		for(int i=0; i<3; i++) {
			System.out.print(input[i]+" ");
		}
		
	}

}
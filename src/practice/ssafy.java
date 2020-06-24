package practice;

import java.util.Scanner;

public class ssafy {
	static int[] arr = new int[11];
	static int max = 0;
	static int sum = 0;
	static int temp = Integer.MAX_VALUE;
	
	public static int max(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			max = (arr[i]>max)?arr[i]:max;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 11; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i <= max(arr); i++) {
			sum = 0;
			for(int j = 0; j<arr.length; j++) {
				sum+=Math.abs(arr[j]-i);
			}
			if(sum<temp) temp = sum;
		}
		
		System.out.println(temp);
	}

}

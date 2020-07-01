package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2108 {
	static int[] countNum = new int[8001];
	static int[] input;
	static int[] sameCount = new int [8001];
	static int N, mid, most, range;
	static double avg;
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void getInput() {
		for(int i = 0; i<N; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
	}
	
	public static void getAvg() {
		double sum = 0;
		int count = 0;
		for(int i = 0; i<input.length; i++) {
			sum+=input[i];
			count++;
		}
//		System.out.println(sum);
//		System.out.println(count);
		avg = sum/count;
//		System.out.println(avg);
		if(avg>=0) {
			System.out.println((int)Math.round(avg));
		}
		else {
			avg = Math.abs(avg);
			System.out.println(-(int)Math.round(avg));
			
		}
	}
	
	public static void getMid() {
		int temp = input.length/2;
		System.out.println(input[temp]);
	}
	
	public static void getMost() {
		int max = -1;
		int index = 0;
		int temp = 0;
		for(int i = 0; i<input.length; i++) {
			countNum[input[i]+4000]++;
		}
		for(int i = 0; i<countNum.length; i++) {
			if(countNum[i]>max) {
				max = countNum[i];
				index = i;
			}
		}
		for(int i = 0; i<countNum.length; i++) {
			if(countNum[i]==max) {
				sameCount[temp++] = i-4000;
			}
		}
//		Arrays.sort(countNum);
		if(sameCount[1]!=0) {
			System.out.println(sameCount[1]);
		}
		else System.out.println(sameCount[0]);
	}
	
	
	public static void getRange() {
		Arrays.sort(input);
		range = input[0]-input[input.length-1];
		System.out.println(Math.abs(range));
	}
	
	public static void main(String[] args) {
		N = sc.nextInt();
		input = new int[N];
		getInput();
		getAvg();
		getMid();
		getMost();
		getRange();
		
		
	}
}

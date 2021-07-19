package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
		for(int i = 0; i<input.length; i++) {
			sum+=input[i];
		}
		avg = sum/input.length;
		System.out.printf("%.0f\n",avg);
	}
	
	public static void getMid() {
		int temp = input.length/2;
		System.out.println(input[temp]);
	}
	
	public static void getMost() {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int max = -1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i : input) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}else {
				m.put(i, 1);
			}
		}
		for(int i : m.keySet()) {
			if(max<m.get(i)) {
				max = m.get(i);
			}
		}
		for(int i : m.keySet()) {
			if(max == m.get(i)) {
				al.add(i);
			}
		}
		Object[] res = al.toArray();
		Arrays.sort(res);
		if(res.length>1) System.out.println(res[1]);
		else System.out.println(res[0]);
		
	}
	
	public static void getRange() {
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

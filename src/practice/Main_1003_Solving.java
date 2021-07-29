package practice;

import java.util.Scanner;

public class Main_1003_Solving {
	static int t, n;
	static int[] fib0 = new int[41];
	static int[] fib1 = new int[41];
	
	public static void getFib() {
		fib0[0] = 1;
		fib1[0] = 0;
		fib0[1] = 0;
		fib1[1] = 1;
		for(int i = 2 ; i < fib0.length ; i++) {
			fib0[i] = fib0[i-1] + fib0[i-2];
			fib1[i] = fib1[i-1] + fib1[i-2];
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		getFib();
		for(int i = 0 ; i < t ; i++) {
			n = sc.nextInt();
			System.out.println(fib0[n] + " " + fib1[n]);
		}
	}
}

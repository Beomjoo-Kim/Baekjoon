package practice;

import java.util.Scanner;

public class Main_1978 {
	static int N;
	static int cnt;
	static Scanner sc = new Scanner(System.in);
	public static void checkPrime(int n) {
		int check = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				check++;
			}
		}
		if(check==2)cnt++;
	}
	
	public static void disp() {
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
			N = sc.nextInt();
			for(int i = 0; i<N; i++) {
				checkPrime(sc.nextInt());
			}
			disp();
	}
}

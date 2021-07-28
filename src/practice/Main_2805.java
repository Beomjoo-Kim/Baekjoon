package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2805 {
	static int n,m;
	static long h;
	static int[] trees;
	
	public static void sol() {		
		long left = 0;
		long right = trees[n-1];
		while(left <= right) {
			long sum = 0;
			long mid = (left + right)/2; 
			for(int i : trees) {
				if(i > mid) {
					sum += i-mid;
				}
			}
			if(sum >= m) {
				h = mid;
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		trees = new int[n];
		for(int i = 0 ; i < n; i++) {
			trees[i] = sc.nextInt();
		}
		Arrays.sort(trees);
		sol();
		System.out.println(h);
	}
}

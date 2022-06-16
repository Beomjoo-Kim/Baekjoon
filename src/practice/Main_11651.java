package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_11651 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static class TestC implements Comparable<TestC>{
		int x, y;
		
		TestC(int x, int y){
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(TestC o) {
			if(this.y > o.y) return 1;	//오름차순
			else if(this.y == o.y) {
				if(this.x > o.x) return 1;	//오름차순
			}
			return -1;
		}

		@Override
		public String toString() {
			return x + " " + y;
		}
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		List<TestC> l = new ArrayList<>();
		String input;
		StringTokenizer st;
		int x, y;
		for(int i = 0 ; i < N ; i++) {
			input = br.readLine();
			st = new StringTokenizer(input);
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			l.add(new TestC(x, y));
		}
		
		Collections.sort(l);
		for(TestC t : l) System.out.println(t.toString());
	}
//	static int[][]sorted;
//	
//	
//	public static void mergeSort(int[][] a, int m, int n) {
//		if(m<n) {
//			int middle = (m+n)/2;
//			mergeSort(a, m, middle);
//			mergeSort(a, middle+1, n);
//			merge(a, m, middle, n);
//		}
//	}
//	
//	public static void merge(int[][] a, int m, int middle, int n) {
//		int i = m, j = middle+1, k =m;
//		
//		while(i<=middle && j<=n) {
//			if(a[i][1]<a[j][1]) {
//				for(int t = 0; t<2; t++) {
//					sorted[k][t] = a[i][t];
//				}
//				i++;
//			}else if(a[i][1]>a[j][1]) {
//				for(int t = 0; t<2; t++) {
//					sorted[k][t] = a[j][t];
//				}
//				j++;
//			}else if(a[i][1]==a[j][1]) {
//				if(a[i][0]<a[j][0]) {
//					for(int t = 0; t<2; t++) {
//						sorted[k][t] = a[i][t];
//					}
//					i++;
//				}else {
//					for(int t = 0; t<2; t++) {
//						sorted[k][t] = a[j][t];
//					}
//					j++;
//				}
//			}
//			k++;
//		}
//		if(i>middle) {
//			for(int t = j; t<=n; t++) {
//				for(int p = 0; p<2; p++) {
//					sorted[k][p] = a[t][p];
//				}
//				k++;
//			}
//		}
//		else {
//			for(int t = i; t<=middle; t++) {
//				for(int p = 0; p<2; p++) {
//					sorted[k][p] = a[t][p];
//				}
//				k++;
//			}
//		}
//		
//		for(int t = m; t<=n; t++) {
//			for(int p = 0; p<2; p++) {
//				a[t][p] = sorted[t][p];
//			}
//		}
//	}
//	
//	public static void disp(int[][] arr) {
//		for(int i = 0; i<arr.length; i++) {
//			System.out.printf("%d %d",arr[i][0], arr[i][1]);
//			System.out.println();
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int a[][] = new int [N][2];
//		sorted = new int[N][2];
//		for(int i = 0; i<N; i++) {
//			a[i][0] = sc.nextInt();
//			a[i][1] = sc.nextInt();
//		}
//		mergeSort(a, 0, N-1);
//		disp(a);
//		sc.close();
//	}
//	

}

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11650_Solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static String temp;
	
	//좌표 입력받아 String배열로
	public static String[] getLocation() throws IOException {
		String[] input = new String[n];
		for(int i = 0;i<input.length;i++) {
			input[i] = br.readLine();
		}
		return input;
	}

	
	//출력
	public static void printArr(String[] a) {
		for(String s:a) {
			System.out.println(s);
		}
	}
	
	
	public static void mergeSort(String[] a, int m, int n, String[] sorted,int x) {
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(a, m, middle, sorted, x);
			mergeSort(a, middle+1, n, sorted, x);
			merge(a, m, middle, n, sorted, x);
		}
	}
	
	public static void merge(String[] a, int m, int middle, int n, String[] sorted, int x) {
		int i = m, j= middle+1, k=m;
		while(i<=middle && j <= n) {
			if(a[i].charAt(x)<=a[j].charAt(x)&&a[i].charAt(x+2)<=a[j].charAt(x+2)) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
			
			if(i>middle) {
				for(int t = j; t<=n; t++) {
					sorted[k] = a[t];
					k++;
				}
			}
			
			else {
				for(int t = i; t<=middle; t++) {
					sorted[k] = a[t];
					k++;
				}
			}
			
			for(int t = m; t<=n; t++) {
				a[t] = sorted[t];
			}
		}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		n = Integer.parseInt(br.readLine());
		String[] sorted = new String[n];
		String[] arr = getLocation();
		
		
		mergeSort(arr, 0, n-1, sorted, 0);
//		for(int i = 0; i<n-1; i++) {
//			if(arr[i].charAt(0)==arr[i+1].charAt(0)) {
////				mergeSort(arr, i, i+1, sorted, 2);
//			}
//		}
		
		
//		sortByX(arr);
		printArr(arr);
	}

}



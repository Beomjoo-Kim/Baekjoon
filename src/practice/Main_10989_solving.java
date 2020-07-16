package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10989_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] input;
	static int[] sorted;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine());
		input = new int[t];
		sorted = new int[t];
		
		//입력받기
		for(int i = 0; i<t; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(input, 0, input.length-1);
		
	}
	
	
	static void merge(int[] a, int m, int middle, int n) {
			int i = m;
			int j = middle + 1;
			int k = m;
			
			while(i<=middle && j<=n) {
				if(a[i]>=a[j]) {
					sorted[k] = a[j];
					j++;
				}else {
					sorted[k] = a[i];
					i++;
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
		
	static void mergeSort(int[] a, int m, int n) {
			
		if(m<n) {
			int middle = (m+n)/2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
		
	}
	
}

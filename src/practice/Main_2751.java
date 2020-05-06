package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2751 {
	
	int number;
	static int[] data = new int[1000001];
	
	static void quickSort(int[] data, int start, int end) {
		if(start>=end) {
			return;
		}
		int key = start;
		int i = start +1;
		int j = end;
		int temp;
		while(i<=j) {
			while(i<=end && data[i] <= data[key]) {
				i++;
			}
			while(data[j]>=data[key] && j>start) {
				j--;
			}
			if(i>j) {
				temp = data[j];
				data[j]=data[key];
				data[key]=temp;
			}else {
				temp = data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
		quickSort(data, start, j-1); 
		quickSort(data, j+1, end);  
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 수의 개수 1,000,000에 제한시간 2초이므로 무조건 시간복잡도 O(N*logN)으로 풀어야 함
		// 퀵정렬 병합정렬 힙정렬 사용해야 함.
		// 퀵정렬의 경우 최악의 상황에서 N logN이 불가능함 (N*N으로 됨)
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		for(int i=0; i<number; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		quickSort(data,0,number-1);
		for(int i=0; i<number; i++) {
			System.out.println(data[i]);
		}
	}

}

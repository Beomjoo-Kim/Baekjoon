package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2751 {
	
	static int number;
	static int[] data = new int[1000001];
	static int[] sorted = new int[1000001];  // 정렬 배열은 반드시 전역 변수로 선언 (필요할 때마다 배열을 생성하게 되면 불필요한 메모리사용)
	
	static void merge(int[] a, int m, int middle, int n) {
		// 시작점 m, 끝점 n, 중간점 middle
		int i = m;
		int j = middle + 1;
		int k = m;
		// 작은 순서대로 배열에 삽입
		while(i<=middle && j<=n) {
			// i는 middle까지, j는 n까지
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
			// a배열에서 i자리와 j자리의 값을 비교하여 작은 쪽을 sorted 배열의 맨 처음자리(k부터 시작)에 삽입.
		}
		// 남은 데이터도 삽입
		if(i>middle) {
			//i가 먼저 끝난 경우
			for(int t=j; t<=n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}else {
			for(int t=i; t<=middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입 (sorted라는 배열은 정렬을 위한 배열. 이 배열을 실제 배열에 넣어야 함.)
		for(int t=m; t<=n; t++) {
			a[t] = sorted[t];
		}
	}
	
	static void mergeSort(int[] a, int m, int n) {
		// 두가지로 나뉜다는 점에서 재귀함수로 구현하는 것이 가장 좋다.
		// 크기가 1보다 큰 경우 에만 동작
		if(m<n) {
			int middle = (m + n) /2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
		
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
		mergeSort(data,0,number-1);
		for(int i=0; i<number; i++) {
			System.out.println(data[i]);
		}
	}

}

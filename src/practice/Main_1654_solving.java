package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1654_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int k,n;
	static int[] inputLan;
	
	public static void getData() throws IOException {
		//기본 조건들 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		inputLan = new int[k];
		for(int i = 0; i< k; i++) {
			inputLan[i] = Integer.parseInt(br.readLine());
		}
	}
	public static void binarySol() {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Arrays.sort(inputLan);
		int upper = inputLan[k-1];
		int lower = 1;
		while(lower<upper) {
			int temp = 0;
			int mid = (lower + upper)/2;
			if(mid<=0)break;
			for(int i = 0; i< inputLan.length; i++) {
				temp +=inputLan[i]/mid;
			}
			if(temp == n) {
				res.add(mid);
				lower++;
			}else if(temp < n) {
				upper = mid;
			}else if(temp>n) {
				lower = mid+1;
			}
		}
		
		Collections.sort(res);
		System.out.println(res.get(res.size()-1));
	}
	
	
	public static void main(String[] args)throws IOException {
		getData();
//		sol();
		binarySol();
	}
	
}


//public static void sol() {
//	Arrays.sort(inputLan);
//	int res = inputLan[k-1];
//	while(true) {
//		int temp = 0;
//		for(int i = 0; i<inputLan.length; i++) {
//			temp += inputLan[i]/res;
//		}
//		
//		
//		if(temp==n) {
//			System.out.println(res);
//			return;
//		}
//		res--;
//		if(res==0)break;
//	}
//}
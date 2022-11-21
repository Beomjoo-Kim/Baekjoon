package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_10845_solving {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int cnt, N;
	static int[] arr ;
	static String order;
	static String[] desc;

	static void sol() throws IOException {
		for(int i = 0; i<N; i++) {
			order = br.readLine();
			desc = order.split(" ");
			switch (desc[0]) {
				case ("push"):
					push();
					break;
				case ("pop"):
					pop();
					break;
				case ("size"):
					size();
					break;
				case ("empty"):
					empty();
					break;
				case ("front"):
					front();
					break;
				case ("back"):
					back();
					break;
			}
		}
		
	}
	
	static void push() {
		for(int i = cnt; i<N-1; i++) {
			arr[i+1]=arr[i];
		}
		arr[cnt++] = Integer.parseInt(desc[1]);
	}
	
	static void pop() {
		if(cnt==0)System.out.println(-1);
		else {
			System.out.println(arr[0]);
			for(int i = 0; i<N-1; i++) {
				arr[i] = arr[i+1];
			}
		}
		if(cnt <= 0) cnt = 0;
		else cnt--;
	}
	
	static void size() {
		System.out.println(cnt);
	}
	
	static void empty() {
		if(cnt==0)System.out.println("1");
		else System.out.println("0");
	}
	
	static void front() {
		if(cnt==0)System.out.println("-1");
		else System.out.println(arr[0]);
	}
	
	static void back() {
		if(cnt==0)System.out.println("-1");
		else System.out.println(arr[cnt-1]);
	}

	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		N = Integer.parseInt(s);
		arr = new int[N];
		sol();
	}
}

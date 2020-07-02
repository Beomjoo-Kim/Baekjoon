package practice;

import java.util.Scanner;

public class Main_10845_solving {
	static Scanner sc = new Scanner(System.in);
	static int cnt, N;
	static int[] arr ;
	static String order;

	static void sol() {
		for(int i = 0; i<N; i++) {
			order = sc.next();
			if (order.equals("push"))
				push();
			if (order.equals("pop"))
				pop();
			if(order.equals("size"))
				size();
			if (order.equals("empty"))
				empty();
			if (order.equals("front"))
				front();
			if (order.equals("back"))
				back();
		}
		
	}
	
	static void push() {
		for(int i = cnt; i<N-1; i++) {
			arr[i+1]=arr[i];
		}
		arr[cnt++] = sc.nextInt();
	}
	
	static void pop() {
		if(cnt==0)System.out.println(-1);
		else {
			System.out.println(arr[0]);
			for(int i = 0; i<N-1; i++) {
				arr[i] = arr[i+1];
			}
		}
		cnt--;
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
	
	public static void main(String[] args) {
		N = sc.nextInt();
		arr = new int[N];
		sol();
	}
}

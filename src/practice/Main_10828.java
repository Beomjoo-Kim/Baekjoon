package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10828 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, cnt;
	static int[] arr;
	static String order;
	static String[] desc;

	static void getOrder() {
		try {
			order = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		desc = order.split(" ");
	}

	static void sol() {

		getOrder();
		switch (desc[0]){
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
			case ("top"):
				top();
				break;
		}
	}

	static void push() {
		arr[cnt++] = Integer.parseInt(desc[1]);
	}

	static void pop() {
		if (cnt != 0) {
			System.out.println(arr[cnt-1]);
			arr[cnt--] = 0;
		} else
			System.out.println("-1");
	}

	static void size() {
		System.out.println(cnt);
	}

	static void empty() {
		if(cnt==0)System.out.println("1");
		else System.out.println("0");
	}

	static void top() {
		if(cnt!=0)System.out.println(arr[cnt-1]);
		else System.out.println("-1");
	}

	public static void main(String[] args) {
		String s;
		try {
			s = br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		N = Integer.parseInt(s);
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			sol();

		}
	}
}

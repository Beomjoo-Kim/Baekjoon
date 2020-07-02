package practice;

import java.util.Scanner;

public class Main_10828 {
	static Scanner sc = new Scanner(System.in);
	static int N, cnt;
	static int[] arr;
	static String order;

	static void getOrder() {
		order = sc.next();
	}

	static void sol() {

		getOrder();
		if (order.equals("push"))
			push();
		if (order.equals("pop"))
			pop();
		if(order.equals("size"))
			size();
		if (order.equals("empty"))
			empty();
		if (order.equals("top"))
			top();

	}

	static void push() {
		arr[cnt++] = sc.nextInt();
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
		N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			sol();

		}
	}
}

//	
//	
//	String input = sc.nextLine();
//	StringTokenizer st = new StringTokenizer(input);
//	String[] str = new String[2];
//	str[0] = st.nextToken();
//	str[1] = st.nextToken();
//	if(str[0].equals("push")) {
//		arr[cnt++] = Integer.parseInt(str[1]);
//	}
//	if(str[0].equals("top")) {
//		System.out.println(arr[cnt-1]);
//	}
//	if(str[0].equals("pop")) {
//		if(cnt==0) System.out.println(-1);
//		else System.out.println(arr[cnt]);
//	}
//	if(str[0].equals("size")) {
//		System.out.println(cnt);
//	}
//	if(str[0].equals("empty")) {
//		if(cnt == 0) System.out.println(1);
//		else System.out.println(0);
//	}
//}
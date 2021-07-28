package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
	//inputCnt 까지의 내림차순 stack을 쌓고 새로운 stack을 만들어서 solve
	static int inputCnt = 0;
	static int[] input;
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	static List<String> result = new ArrayList<String>();
	
	public static void sol() {
			for(int i : input) {
				if(i > stack2.peek()) {
					while(i > stack2.peek()) {
//						System.out.println("+");
						result.add("+");
						stack2.push(stack1.pop());
					}
				}
				
				if(stack2.peek().equals(i)) {
//					System.out.println("-");
					result.add("-");
					stack2.pop();
				}
				
				if(stack2.peek() > i) {
					System.out.println("NO");
					return;
				}
			}
		for(String s : result) {
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		inputCnt = Integer.parseInt(sc.nextLine());
		input = new int[inputCnt];
		//수열 입력
		for(int i = 0 ; i < inputCnt ; i++) {
			input[i] = sc.nextInt();
		}
		// 내림차순 순서대로 stack 생성
		for(int i = inputCnt ; i>0; i--) {
			stack1.push(i);
		}
		stack2.push(0);
		sol();
		
	}
}

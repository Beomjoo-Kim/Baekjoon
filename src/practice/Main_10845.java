package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_10845 {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static String input;
	
	static void getNumber() {
		N = sc.nextInt();
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		getNumber();
		int back = 0;
		for(int i = 0; i<N; i++) {
			input = sc.next();
			
			if(input.equals("push")) {
				int temp = sc.nextInt();
				q.add(temp);
				back = temp;	//back의 경우를 확인하기위해 마지막으로 넣은숫자 임시저장
			}
			
			if(input.equals("pop")) {
				if(q.peek()==null) {
					System.out.println(-1);
				}else System.out.println(q.poll());
			}
			if(input.equals("size")) {
				System.out.println(q.size());
			}
			if(input.equals("empty")) {
				if(q.isEmpty()) {
					System.out.println(1);
				}else System.out.println(0);
			}
			if(input.equals("front")) {
				if(q.isEmpty())System.out.println(-1);
				else System.out.println(q.peek());
			}
			if(input.equals("back")) {
				if(q.isEmpty())System.out.println(-1);
				else System.out.println(back);
			}
		}
		
	}
}

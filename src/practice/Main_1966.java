package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1966 {
	static int caseCnt;
	static Queue<Integer> input = new LinkedList<Integer>();
	static Queue<Integer> index = new LinkedList<Integer>();
	static int cnt = 0;
	static int docNum = 0;
	static int target = 0;
	static int max = 0;
	
	public static void sol() {
		//input 내에서 max값을 찾아서 peek과 비교?
		while(index.peek() != null) {
			//queue 내에서 최댓값 찾기
			for(int t : input) {
				if(t > max) {
					max = t;
				}
			}
			
			//해당 최댓값까지 이전것들 poll, add
			while(input.peek() != max) {
				input.add(input.poll());
				index.add(index.poll());
			}
			
			//이후 최댓값 pull한 후 cnt++
			cnt++;
			max=0;
			if(index.peek() == target) {
				System.out.println(cnt);
				cnt = 0;
				input.clear();
				index.clear();
				return;
			}else {
				input.poll();
				index.poll();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		caseCnt = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < caseCnt ; i++) {
			int temp = 0;
			int cnt = 0;
			docNum = sc.nextInt();
			target = sc.nextInt();
			
			//input 큐 입력
			while(docNum > 0) {
				input.offer(sc.nextInt());
				docNum--;
				index.offer(temp++);
			}
			
			sol();
		}
	}
}

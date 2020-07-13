package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_10866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> d = new ArrayDeque<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			if (input.equals("push_front") ) {
				d.addFirst(sc.nextInt());
			}
			if (input.equals("push_back") ) {
				d.addLast(sc.nextInt());
			}
			if (input.equals("pop_front")) {
				if (d.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(d.peekFirst());
					d.removeFirst();
				}
			}
			if (input.equals("pop_back")) {
				if (d.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(d.peekLast());
					d.removeLast();
				}
			}

			if (input.equals("size")) {
				System.out.println(d.size());
			}
			if (input.equals("empty")) {
				if(d.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}
			if (input.equals("front") ) {
				if(d.isEmpty())System.out.println(-1);
				else System.out.println(d.peekFirst());
			}
			if (input.equals("back") ) {
				if(d.isEmpty())System.out.println(-1);
				else System.out.println(d.peekLast());
			}

		}
		sc.close();

	}
}

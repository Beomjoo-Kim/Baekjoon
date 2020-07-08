package practice;

import java.util.Scanner;
import java.util.Stack;

public class Main_4949_check {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		char temp;
		while(true) {
			st.clear();
			String input = sc.nextLine();
			if(input.equals(".")) {
				break;
			}
			for(int i = 0; i<input.length(); i++) {
				temp = input.charAt(i);
				
				if(temp == '(' || temp == '[') {
					st.push(temp);
				}else if(temp ==')' || temp ==']') {
					if(st.isEmpty() || st.peek()!='(' && temp == ')' || st.peek() !='[' && temp == ']') {
						st.push(temp);
						break;
					}
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("yes");
			}else System.out.println("no");
		}
		
	}
}

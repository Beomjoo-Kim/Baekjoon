package practice;

import java.util.Scanner;
import java.util.Stack;

public class Main_2941_solving {
	static Scanner sc = new Scanner(System.in);
	static Stack<Character> st = new Stack<Character>();
	
	
	static public void sol(String str) {
		for(int i = 0; i<str.length(); i++) {
			char t = str.charAt(i);
			if(t=='c' || t=='d' || t=='l' || t=='n' || t=='s' || t=='z') {
				st.push(str.charAt(i));
			}else if(st.empty() || st.peek()=='c'&& (t=='='|| t=='-') || st.peek()=='d') {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		String input = sc.nextLine();
		
	}
}

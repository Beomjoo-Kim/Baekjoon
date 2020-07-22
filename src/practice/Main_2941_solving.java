package practice;

import java.util.Scanner;

public class Main_2941_solving {
	static Scanner sc = new Scanner(System.in);
	static char[] arr;
	static int cnt;
	
	public static void sol() {
		
	}
	
	public static void check(int index) {
		if(arr[index] == 'c' && arr.length>index+1) {
			if(arr[index+1] == '=' || arr[index+1] == '-') cnt--;
		}
		if(arr[index] == 'd' && arr.length>index+1) {
			if(arr[index] == '-') cnt--;
		}
		if(arr[index] == 'd' && arr.length>index+2) {
			if	(arr[index+1] == 'z') {
				cnt--;
				if(arr[index+2] == '=') {
					cnt--;
				}
			}
		}
		//dz= 과 z= 처리 필요
		
		if(arr[index] == 'l' && arr.length>index+1) {
			if(arr[index+1] == 'j') cnt--;
		}
		if(arr[index] == 'n' && arr.length>index+1) {
			if(arr[index+1] == 'j') cnt--;
		}
		if(arr[index] == 's' && arr.length>index+1) {
			if(arr[index+1] == '=') cnt--;
		}
		if(arr[index] == 'z' && arr.length>index+1) {
			if(arr[index+1] == '=')cnt--;
		}
//		if(arr[index] == 'z' && arr.length>index+1) {
//			if(arr[index+1] == '=' && index-1>0) {
//				if(arr[index-1]!='d')cnt--;
//			}
//		}
	}
	
	
	public static void main(String[] args) {
		String input = sc.nextLine();
		arr = input.toCharArray();
		cnt = arr.length;
		for(int i = 0; i<arr.length; i++) {
			check(i);
		}
		System.out.println(cnt);
		
		
	}
}

//	static Stack<Character> st = new Stack<Character>();
//	static public void sol(String str) {
//		for(int i = 0; i<str.length(); i++) {
//			char t = str.charAt(i);
//			if(t=='c' || t=='d' || t=='l' || t=='n' || t=='s' || t=='z') {
//				st.push(str.charAt(i));
//			}else if(st.empty() || st.peek()=='c'&& (t=='='|| t=='-') || st.peek()=='d' && (t=='z' || t =='-') || 
//					st.peek() == 'l' && t == 'j' || st.peek() == 'n' && t =='j' || st.peek() == 's' && t == '=' ||
//					st.peek() == 'z' && t == '=') {
//				st.push(str.charAt(i));
//			}else if(st.empty() || st.peek() == 'z' && st.peek() == 'd' && t =='=') {
//				st.push(str.charAt(i));
//			}
//			st.clear();
//			
//		}
//	}
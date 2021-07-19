package practice;

import java.util.Scanner;

public class Main_3447 {
	
	public static void sol(String input) {
		while(input.contains("BUG")) {
			input = input.replaceAll("BUG", "");
		}
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			sol(sc.nextLine());
		}
		if(sc!=null)sc.close();
	}
}

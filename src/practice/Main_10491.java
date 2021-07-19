package practice;

import java.util.Scanner;

public class Main_10491 {
	static Scanner sc = new Scanner(System.in);

	public static void sol(String input) {
		if(input.toLowerCase().matches("(.*)(problem)(.*)"))System.out.println("yes");
		else System.out.println("no");
	}
	
	public static void main(String[] args) {
		while(sc.hasNextLine()) {
			sol(sc.nextLine());
		}
	}
}

package practice;

import java.util.Scanner;

public class Main_8958 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();   //nextInt = 3 -> 나머지 \noxoxoxox\nxoxoox\n 
						 //nextline = 3\n -> 나머지 noxoxoxox\nxoxoox\n 
		int stack =0;
		int score =0;
		for (int i=0; i<T; i++) {
			String input = sc.nextLine();
			for(int j=0; j<input.length();j++) {
				if(input.charAt(j)=='O') {
					stack++;
					score+=stack;
				}else stack =0;
			}
			System.out.println(score);
			score=0;
			stack=0;
		}
		sc.close();
	}
}

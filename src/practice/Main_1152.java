package practice;

import java.util.Scanner;

public class Main_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();  //앞뒤 공백 제거
		String[] sep = input.split(" ");
		if(input.isEmpty()) {				//공백 입력경우
			System.out.println("0");
		}else System.out.println(sep.length);
		
		sc.close();
	}

}

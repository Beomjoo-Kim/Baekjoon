package practice;

import java.util.Scanner;

public class Main_1259 {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = " ";
		boolean check = true;
		while(true){
			input = sc.nextLine();
			if(input.equals("0")) break;
			check = true;
			//한번 false 된 후 다시 다음걸 true로 초기화해서 판단
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) != input.charAt(input.length()-i-1)) {
					check = false;
					break;		
				}
			}
			if(check) System.out.println("yes");
			else System.out.println("no");
		}

	}

}

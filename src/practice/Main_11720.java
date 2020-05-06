package practice;

import java.util.Scanner;

public class Main_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int sum=0;
		int temp=0;
		String sep[] = input.split("");
		for(int i=0; i<T; i++) {
			
			try{
				temp = Integer.parseInt(sep[i]);
				sum+=temp;
			}
			catch(NumberFormatException e) {
			
			}catch (Exception e) {
				
			}
		}
		System.out.println(sum);
		sc.close();
	}

}

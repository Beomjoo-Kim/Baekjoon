package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int A = Integer.parseInt(input);
		System.out.println(A);
		System.out.println(reverse(A));

	}

	public static int reverse (int num) {
		
		int result = 0;
		
		while(num!=0) {
			result = result*10 + num%10;
			num/=10;
		}		
		return result;
	}

}

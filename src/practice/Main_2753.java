package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int A = Integer.parseInt(input);
		int result = 0;
		if(A%4==0) {		//윤년 판별 (4의배수이면서 100의배수가아님, 4와100과400의배수)
			if(A%100==0) {
				if(A%400==0) {
					result = 1;
				}
			}else result =1;
		}
		System.out.println(result);

	}

}

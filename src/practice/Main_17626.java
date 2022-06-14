package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17626 {
	// 주어진 n에 가장 근접한 제곱수부터 빼는 방식? -> x
	// n부터 for를 통해 -- 하여 각 수 알아내기
	// 도중에 result 값이 더 큰 값으로 바뀌는 것 방지 필요했음 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void sol(int n) {
		int a,b,c;
		int result = 4;
		for(int i = (int)Math.sqrt(n) ; n >= i*i && i>=0 ; i--) {
			a = n-i*i;
			if(a == 0) {
				if(result > 1) result = 1;
			}
			for(int j = (int)Math.sqrt(a) ; a >= j*j && j>=0 ; j--) {
				b = a - j*j;
				if(b == 0) {
					if(result > 2) result = 2;
				}
				for(int k = (int)Math.sqrt(b) ; b >= k*k && k>=0 ; k--) {
					c = b - k*k;
					if(c == 0) {
						if(result > 3) result = 3;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		sol(n);
	}
}

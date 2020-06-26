package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15829 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int L, mod = 1234567891;;

	// 문자열 입력받아 배열에 한글자씩
	public static char[] getChar(int n) throws IOException {
		char[] arr = new char[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (char) br.read();
		}
		return arr;
	}

	// 배열에 들어있는 한글자씩 해시값계산
	// 모듈러 연산!!! (결과값이 mod 이상 넘으면 안됨)
//	1. (a + b) mod n = ((a mod n) + (b mod n)) mod n
//	2. (a - b) mod n = ((a mod n) - (b mod n)) mod n
//	** 알아두기 **
//		((a mod n) - (b mod n)) mod n에서 a = 3, b = 5, n = 6이면 -2 mod 6 = -2가 나온다.
//		이때 '-' 연산을 이용할 때 mod를 쓰는 일이 있다면 ((a mod n) - (b mod n)) mod n + n을통해 양수로 만들어 줄 수 있다.
//	3. (a * b) mod n = ((a mod n) * (b mod n)) mod n

	public static void calHash(char[] arr) {
		long temp = 0;
		long pow = 1;
		for (int i = 0; i < arr.length; i++) {
			temp += ((arr[i] - 96) * pow) ;
			pow*=31;
			pow%=mod;

		}
		System.out.println(temp%mod);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		L = Integer.parseInt(br.readLine());
		char[] arr = getChar(L);
		calHash(arr);

	}

}

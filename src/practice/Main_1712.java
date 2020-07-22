package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1712 {
	//while을 쓰면 21억번까지 돌아야 하므로 수학적으로 접근.
	//음수가 나올 경우 -1을 출력해야 함.
	//B=C 일 경우 0으로 나누기 때문에 런타임에러 발생.
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long A, B, C;
	
//	public static long getSum(int num) {
//		//num : 갯수
//		return A + (long)(num*B);
//	}
//	
//	public static long getSum2(int num) {
//		return (long)(num*C);
//	}
	
	
	public static void main(String[] args) throws IOException{
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
		if(B>=C) {
			System.out.println(-1);
			return;
		}
//		int i = 1;
//		while(true) {
//			if(getSum(i)<getSum2(i)) break;
//			i++;
//		}
//		System.out.println(i);
		Long res = A/(C-B)+1;
		System.out.println(res);
	}
}

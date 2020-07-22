package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, cnt;
	static String input;
	static char[] check = new char[100];
	
	
	public static boolean isGroup() {
		//배열에 같은문자가 있으면 return false.
		//char 배열에 빈칸이 있으면 break;(안하면 100번 돌아야함)
		if(check.length==1)return true;
		for(int i = 0; i<check.length; i++) {
			if(check[i]=='\u0000')break;
			for(int j=i+1; j<check.length; j++) {
				if(check[i]==check[j]) {
					return false;
				}
				if(check[j]=='\u0000')
					break;
			}
		}
		return true;
	}
	
	public static void sameDelete() {
		//연속한 같은문자들 삭제
		for(int i = 0; i<check.length-1; i++) {
			if(check[i]=='\u0000')break;
				if(check[i]==check[i+1]) {
					for(int j = i; j<check.length-1; j++) {
						check[j] = check[j+1];
						check[j+1] = '\u0000';
				}
					i--;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		for(int i = 0; i<N; i++) {
			input = br.readLine();
			check = input.toCharArray();
			sameDelete();
			if(isGroup())cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		br.close();
	}
}
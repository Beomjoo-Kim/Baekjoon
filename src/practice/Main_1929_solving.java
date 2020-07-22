package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1929_solving {
	//시간초과
	//에라토스테네스의 체 사용
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int M, N;
	
	public static void sol() {
		for(int i = M; i<=N; i++) {
			if(isPrime(i))System.out.println(i);
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i<num; i++) {
			if(num%i==0)return false; 
		}
		return true;
	}
	
	
	
	public static void main(String[] args) throws IOException{
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		sol();
		
	}
}

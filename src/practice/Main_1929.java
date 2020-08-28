package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1929 {
	//시간초과
	//에라토스테네스의 체 사용
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int M, N, end;
	static ArrayList<Integer> num = new ArrayList<Integer>();
	
//	public static void sol() {
//		for(int i = M; i<=N; i++) {
//			if(isPrime(i))System.out.println(i);
//		}
//	}
//	
//	public static boolean isPrime(int num) {
//		for(int i = 2; i<num; i++) {
//			if(num%i==0)return false; 
//		}
//		return true;
//	}
	public static void initArray() {
		if(M==1)M=2;
		if(N==1)N=2;
		for(int i = M; i<=N; i++) {
			num.add(i);
		}
	}
	
	public static void sol() {
		for(int i = 0; i<=N-M; i++) {
			for(int j = 2; j<=end; j++) {
				if(num.get(i)!=j && num.get(i)%j==0) {
					num.set(i, 0);
				}
			}
		}
	}
	
	public static void disp() {
		for(int i = 0; i<num.size(); i++) {
			try {
				if(num.get(i)!=0)bw.write(num.get(i)+"\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
				
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		end = (int) Math.sqrt(N);
		//에라토스테네스의 체는 최대값의 제곱근까지만 구현하면 된다.
		initArray();
		sol();
		disp();
		
		br.close();
		bw.close();
	}
}

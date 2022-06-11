package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11047 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N,K;
	static ArrayList<Integer> tokenValue = new ArrayList<Integer>();
	static int cnt = 0;
	
	
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < N ; i++) {
			tokenValue.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = tokenValue.size()-1 ; i >= 0; i--) {
			cnt += K/tokenValue.get(i);
			K %= tokenValue.get(i);
		}
		
		System.out.println(cnt);
	}
}

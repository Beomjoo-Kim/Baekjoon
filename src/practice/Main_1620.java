package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_1620 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, M;
	static Map<String, String> map = new HashMap<>();
	
	static void getPokemon() throws IOException {
		for(int i = 1; i<N+1; i++) {
			String names = br.readLine();
			String num = Integer.toString(i);
			map.put(names, num);
			map.put(num, names);
		}
	}
	
	static void sol() throws IOException {
		String str;
		for(int i = 0; i<M; i++) {
			str = br.readLine();
			System.out.println(map.get(str));
		}
	}
	
	
	//숫자인지
	public static boolean isNumeric(String s) {
		  try {
		      Double.parseDouble(s);
		      return true;
		  } catch(NumberFormatException e) {
		      return false;
		  }
		}
	
	static void printName(int i) {
	}
	
	static void printNum(String str) {
	}
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		getPokemon();
		sol();
	}
}

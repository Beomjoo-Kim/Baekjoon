package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_1436 {
	static int N;
	static int cnt;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		int i = 666;
		String target;
		while(true) {
			target = i+"";
			if(target.contains("666"))cnt++;
			
			
			
			if(cnt==N) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}

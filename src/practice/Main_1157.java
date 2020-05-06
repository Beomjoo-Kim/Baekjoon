package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] c = input.toCharArray();
		int[] count = new int[26];
		int MAX =-1;
		char maxAddress = 0;
		
		//알파벳마다 갯수 분석
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<count.length;j++) {
				if(c[i]=='a'+j||c[i]=='A'+j) {
					count[j]++;
				}
			}			
		}
		
		//갯수분석 후 가장 많이 쓰인것 찾기
		for(int i=0; i<count.length;i++) {
			if(MAX<count[i]) {
				MAX = count[i];
				maxAddress = (char)(i+65);
			}else if(MAX==count[i]) {
				maxAddress = '?';
			}
		}
		
		
		System.out.println(maxAddress);
	}

}

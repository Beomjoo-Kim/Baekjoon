package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(char c = 'a'; c<='z'; c++) {
			System.out.print(input.indexOf(c)+" ");   //indexof 사용!
		}
	}

}
		
//		char[] c = input.toCharArray();
//		int[] count = new int[24];
//		for(int i=0; i<count.length;i++) {
//			count[i]=-1;
//		}
//		for (int i=0; i<c.length; i++) {
//			for(int j=0; j<24;j++) {
//				if(c[i]==(char)(97+j)) {				
//					count[j]=i;
//				}
//			}
//		}
//		for(int i=0; i<count.length;i++) {
//			System.out.print(count[i]+" ");
//		} 				이 코드 문제점 : 중복해서 나올경우 뒤의 순번이 저장됨

//i=1, len3

//a=97
//z=122
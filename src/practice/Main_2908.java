package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		String[] A = st.nextToken().split("");
		String[] B = st.nextToken().split("");
		String A_Result="";
		String B_Result="";
		
		for(int i=A.length-1; i>=0; i--) {
			A_Result = A_Result+A[i];
		}
		for(int i=B.length-1; i>=0; i--) {
			B_Result = B_Result+B[i];
		}
		int a = Integer.parseInt(A_Result);
		int b = Integer.parseInt(B_Result);
		if(a>b) {
			System.out.println(a);
		}else { 
			System.out.println(b);
		}

	}

}

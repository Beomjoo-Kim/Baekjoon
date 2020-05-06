package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int T = Integer.parseInt(input);
		int H_count=0;
		int W_count=0;
		String[] result = new String[T];
		for(int i=0; i<T; i++) {
			input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			H_count = (N%H==0)?H:N%H;                              //
			W_count = (N%H==0)?N/H:N/H+1;						   //이 두부분 중요
			if(W_count<10) {
				result[i] = H_count+"0"+W_count;
			}else result[i] = Integer.toString(H_count)+Integer.toString(W_count);
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(result[i]);
		}
	}

}
